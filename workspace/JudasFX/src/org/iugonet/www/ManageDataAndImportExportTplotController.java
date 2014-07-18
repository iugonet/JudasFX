package org.iugonet.www;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import lombok.Data;

@Data
public class ManageDataAndImportExportTplotController implements Initializable {
	public EventHandler<ActionEvent> actionEventHandler;
	
	@FXML private Button btnOK;
	@FXML private void handleOK(ActionEvent event) {
		btnOK.getScene().getWindow().hide();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		actionEventHandler = new EventHandler<ActionEvent>(){

			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
			}};		
	}
}
