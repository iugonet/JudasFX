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
public class GenerateThemisOverviewPlotController implements Initializable {
	public EventHandler<ActionEvent> actionEventHandler;
	
	@FXML private Button btnApply;
	@FXML private void handleApply(ActionEvent event) {
		btnApply.getScene().getWindow().hide();
	}
	
	@FXML private Button btnCancel;
	@FXML private void handleCancel(ActionEvent event) {
		btnCancel.getScene().getWindow().hide();
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
