package org.iugonet.www;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import lombok.Data;

@Data
public abstract class UndoableJMenuItemController implements Initializable  {
	public EventHandler<ActionEvent> actionEventHandler;
	
	@FXML private Button btnDone;
	@FXML private void handleDone(ActionEvent event) {
		btnDone.getScene().getWindow().hide();
	}
	
	public UndoableJMenuItemController() {
		super();
		// TODO Auto-generated constructor stub
		actionEventHandler = new EventHandler<ActionEvent>(){

			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
			}};
	}
}
