package org.iugonet.www;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lombok.Data;

@Data
public class ThemisDerivedSpectra extends Application {
	public void start(Stage primaryStage) throws Exception {
		try {
			
			// 画面のタイトルを設定
			primaryStage.setTitle("ThemisDerivedSpectra");
			// favicon
			primaryStage.getIcons().add(new Image(ThemisDerivedSpectraController.class.getResourceAsStream("icons/favicon.ico")));
			// FXMLファイルをロード
			Parent root = FXMLLoader.load(getClass().getResource("ThemisDerivedSpectra.fxml"));
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
