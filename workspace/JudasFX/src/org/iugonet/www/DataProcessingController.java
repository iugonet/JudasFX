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
public class DataProcessingController implements Initializable {
	public EventHandler<ActionEvent> actionEventHandler;
	
	@FXML private Button btnDone;
	@FXML private void handleDone(ActionEvent event) {
		btnDone.getScene().getWindow().hide();
	}

	@FXML private Button btnClearActive;
	@FXML private void handleClearActive(ActionEvent event) {
		btnClearActive.getScene().getWindow().hide();
	}
	
	@FXML private Button btnSubtractAverage;
	@FXML private void handleSubtractAverage(ActionEvent event) {
		btnSubtractAverage.getScene().getWindow().hide();
	}
	
	@FXML private Button btnSubtractMedian;
	@FXML private void handleSubtractMedian(ActionEvent event) {
		btnSubtractMedian.getScene().getWindow().hide();
	}
	
	@FXML private Button btnSmoothData;
	@FXML private void handleSmoothData(ActionEvent event) {
		btnSmoothData.getScene().getWindow().hide();
	}
	
	@FXML private Button btnHighPassFilter;
	@FXML private void handleHighPassFilter(ActionEvent event) {
		btnHighPassFilter.getScene().getWindow().hide();
	}
	
	@FXML private Button btnBlockAverage;
	@FXML private void handleBlockAverage(ActionEvent event) {
		btnBlockAverage.getScene().getWindow().hide();
	}
	
	@FXML private Button btnClip;
	@FXML private void handleClip(ActionEvent event) {
		btnClip.getScene().getWindow().hide();
	}
	
	@FXML private Button btnDeflag;
	@FXML private void handleDeflag(ActionEvent event) {
		btnDeflag.getScene().getWindow().hide();
	}
	
	@FXML private Button btnDegap;
	@FXML private void handleDegap(ActionEvent event) {
		btnDegap.getScene().getWindow().hide();
	}
	
	@FXML private Button btnInterpolate;
	@FXML private void handleInterpolate(ActionEvent event) {
		btnInterpolate.getScene().getWindow().hide();
	}
	
	@FXML private Button btnCleanSpikes;
	@FXML private void handleCleanSpikes(ActionEvent event) {
		btnCleanSpikes.getScene().getWindow().hide();
	}
	
	@FXML private Button btnTimeDerivative;
	@FXML private void handleTimeDerivative(ActionEvent event) {
		btnTimeDerivative.getScene().getWindow().hide();
	}
	
	@FXML private Button btnWaveletTransform;
	@FXML private void handleWaveletTransform(ActionEvent event) {
		btnDone.getScene().getWindow().hide();
	}
	
	@FXML private Button btnPowerSpectrum;
	@FXML private void handlePowerSpectrum(ActionEvent event) {
		btnDone.getScene().getWindow().hide();
	}
	
	@FXML private Button btnCoordinateTransform;
	@FXML private void handleCoordinateTransform(ActionEvent event) {
		btnDone.getScene().getWindow().hide();
	}
	
	@FXML private Button btnSplitVariables;
	@FXML private void handleSplitVariables(ActionEvent event) {
		btnSplitVariables.getScene().getWindow().hide();
	}
	
	@FXML private Button btnJoinVariables;
	@FXML private void handleJoinVariables(ActionEvent event) {
		btnJoinVariables.getScene().getWindow().hide();
	}
	
	@FXML private Button btnRightArrow;
	@FXML private void handleRightArrow(ActionEvent event) {
		btnRightArrow.getScene().getWindow().hide();
	}
	
	@FXML private Button btnLeftArrow;
	@FXML private void handleLeftArrow(ActionEvent event) {
		btnLeftArrow.getScene().getWindow().hide();
	}
	
	@FXML private Button btnTrash;
	@FXML private void handleTrash(ActionEvent event) {
		btnTrash.getScene().getWindow().hide();
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
