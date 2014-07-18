package org.iugonet.www;

import java.net.MalformedURLException;
import java.net.URL;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import lombok.Data;

@Data
public class SimpleBrowser extends Application {
	private URL url;
	
	SimpleBrowser(){
		URL url;
		try {
			url = new URL("http://www.iugonet.org/");
			this.url = url;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	SimpleBrowser(URL url){
		this.url = url;
	}
	
	public void start(final Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
        BorderPane root = new BorderPane();
        
        // WebViewオブジェクトを生成し、シーングラフに追加
        WebView view = new WebView();
        root.setCenter(view);
        
        // WebEngineオブジェクトはWebViewオブジェクトから取得
        WebEngine engine = view.getEngine();
        
        // 
        engine.load(url.toString());
        
        Scene scene = new Scene(root, 800, 600);
		scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
		(){
			@Override
			public void handle(KeyEvent t) {
				if(t.getCode()==KeyCode.ESCAPE){
					System.out.println("click on escape");
					primaryStage.close();
				}
			}
		});
		
		// favicon
		primaryStage.getIcons().add(new Image(SimpleBrowserController.class.getResourceAsStream("icons/favicon.ico")));
		//
        primaryStage.setTitle("JudasFX - Simple Browser");
        primaryStage.setScene(scene);
        primaryStage.show();		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
