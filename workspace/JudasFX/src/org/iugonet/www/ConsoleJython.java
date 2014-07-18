package org.iugonet.www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.Data;

import com.artenum.jyconsole.JyConsole;

@Data
public class ConsoleJython extends Application {
	public void start(Stage primaryStage) throws Exception {

		try {
			
			// 画面のタイトルを設定
			primaryStage.setTitle("ConsoleJython");
			// favicon
			primaryStage.getIcons().add(new Image(ConsoleJythonController.class.getResourceAsStream("icons/favicon.ico")));
			// 

			JyConsole jyConsole = new JyConsole();
			jyConsole.show();
			
            AnchorPane root = new AnchorPane();
			
			// 表示内容を設定
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);

			// 画面表示
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
