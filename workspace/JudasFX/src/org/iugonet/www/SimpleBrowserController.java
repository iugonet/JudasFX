package org.iugonet.www;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import lombok.Data;

@Data
public class SimpleBrowserController implements Initializable {
	public EventHandler<ActionEvent> actionEventHandler;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		actionEventHandler = new EventHandler<ActionEvent>(){

			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub

			}
		};
	}
}