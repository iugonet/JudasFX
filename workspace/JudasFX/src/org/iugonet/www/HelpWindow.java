package org.iugonet.www;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lombok.Data;

@Data
public class HelpWindow extends Application {
	public void start(Stage primaryStage) throws Exception {
		// favicon
		primaryStage.getIcons().add(new Image(HelpWindowController.class.getResourceAsStream("icons/favicon.ico")));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
