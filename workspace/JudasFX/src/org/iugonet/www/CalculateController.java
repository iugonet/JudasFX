package org.iugonet.www;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import lombok.Data;

@Data
public class CalculateController implements Initializable {
	public EventHandler<ActionEvent> actionEventHandler;

	@FXML private ListView<String> listInsertFunction;
	private ObservableList<String> listRecordsInsertFunction = FXCollections.observableArrayList();
	
	@FXML private Button btnDone;
	@FXML private void handleDone(ActionEvent event) {
		System.out.println(event.getTarget().toString());
		btnDone.getScene().getWindow().hide();
	}
	
	@FXML private Button btnHelp;
	@FXML private void handleHelp(ActionEvent event) {
		btnHelp.getScene().getWindow().hide();
	}
	//
	
	@FXML private Button btnSave;
	@FXML private void handleSave(ActionEvent event) {
		btnSave.getScene().getWindow().hide();
	}
	@FXML private Button btnClear;
	@FXML private void handleClear(ActionEvent event) {
		btnClear.getScene().getWindow().hide();
	}
	@FXML private Button btnOpen;
	@FXML private void handleOpen(ActionEvent event) {
		btnOpen.getScene().getWindow().hide();
	}
	@FXML private Button btnRun;
	@FXML private void handleRun(ActionEvent event) {
		btnRun.getScene().getWindow().hide();
	}
	//
	@FXML private ComboBox<?> comboConstant;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		listRecordsInsertFunction.add("HOGE");
	}
		
}
