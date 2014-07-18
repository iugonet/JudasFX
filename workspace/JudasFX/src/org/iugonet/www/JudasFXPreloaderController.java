package org.iugonet.www;

import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import lombok.Data;

@Data
public class JudasFXPreloaderController extends Preloader {
	public EventHandler<ActionEvent> actionEventHandler;
	
	@FXML private ProgressBar progressBar;
	Stage stage;
	
	JudasFXPreloaderController(){
		super();
		// TODO Auto-generated constructor stub
		actionEventHandler = new EventHandler<ActionEvent>(){

			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
			}};
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			this.stage = primaryStage;
			
			// 画面のタイトルを設定
			stage.setTitle("JudasFXPreloader");
			// 

			Parent root = FXMLLoader.load(getClass().getResource("JudasFXPreloader.fxml"));
			
			// 表示内容を設定
			Scene scene = new Scene(root);
			stage.setScene(scene);

			// 画面表示
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public void handleProgressNotification(ProgressNotification pn) {
		progressBar.setProgress(pn.getProgress());
	}
	
	@Override
	public void handleStateChangeNotification(StateChangeNotification evt) {
		if (evt.getType() == StateChangeNotification.Type.BEFORE_START) {
			stage.hide();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
