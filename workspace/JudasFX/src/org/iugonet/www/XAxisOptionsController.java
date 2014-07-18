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
public class XAxisOptionsController implements Initializable {
	public EventHandler<ActionEvent> actionEventHandler;
	
	@FXML private Button btnOK;
	@FXML private void handleOK(ActionEvent event) {
		btnOK.getScene().getWindow().hide();
	}
	
	@FXML private Button btnApply;
	@FXML private void handleApply(ActionEvent event) {
		btnApply.getScene().getWindow().hide();
	}
	
	@FXML private Button btnApplyToAllPanels;
	@FXML private void handleApplyToAllPanels(ActionEvent event) {
		btnApplyToAllPanels.getScene().getWindow().hide();
	}
	
	@FXML private Button btnCancel;
	@FXML private void handleCancel(ActionEvent event) {
		btnCancel.getScene().getWindow().hide();
	}
	
	@FXML private Button btnSaveAsDefault;
	@FXML private void handleSaveAsDefault(ActionEvent event) {
		btnSaveAsDefault.getScene().getWindow().hide();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		actionEventHandler = new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
			}};
	}
}
