package org.iugonet.www;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import lombok.Data;

@Data
public class ConfigurationSettingsController implements Initializable {
	public EventHandler<ActionEvent> actionEventHandler;
	
	@FXML private Button btnDone;
	@FXML private void handleDone(ActionEvent event) {
		btnDone.getScene().getWindow().hide();
	}
	
	@FXML private Button btnSave;
	@FXML private void handleSave(ActionEvent event) {
		btnSave.getScene().getWindow().hide();
	}
	
	@FXML private Button btnReset;
	@FXML private void handleReset(ActionEvent event) {
		btnReset.getScene().getWindow().hide();
	}
	
	@FXML private Button btnReset2Default;
	@FXML private void handleReset2Default(ActionEvent event) {
		btnReset2Default.getScene().getWindow().hide();
	}
	
	@FXML private Button btnClose;
	@FXML private void handleClose(ActionEvent event) {
		btnClose.getScene().getWindow().hide();
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
