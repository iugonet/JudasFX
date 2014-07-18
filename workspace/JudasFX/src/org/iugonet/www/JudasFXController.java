package org.iugonet.www;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.print.Printer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import lombok.Data;

@Data
public class JudasFXController implements Initializable {
	public EventHandler<ActionEvent> actionEventHandler;
	
	//
	// File
	//
	@FXML private MenuItem itemOpenThemisDocument;
	@FXML private void handleOpenThemisDocument(ActionEvent event){
		System.out.println("OpenThemisDocument");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("OpenThemisDocument");

		Stage stage = new Stage();
		// favicon
		stage.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
		fileChooser.showOpenDialog(stage);
	}
	
	@FXML private MenuItem itemSaveThemisDocument;
	@FXML private void handleSaveThemisDocument(ActionEvent event){
		System.out.println("SaveThemisDocument");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("SaveThemisDocument");
		Stage stage = new Stage();
		// favicon
		stage.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
		fileChooser.showOpenDialog(stage);
	}
	
	@FXML private MenuItem itemSaveThemisDocumentAs;
	@FXML private void handleSaveThemisDocumentAs(ActionEvent event){
		System.out.println("SaveThemisDocumentAs");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("SaveThemisDocumentAs");
		Stage stage = new Stage();
		// favicon
		stage.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
		fileChooser.showOpenDialog(stage);
	}
	//
	@FXML private MenuItem itemOpenTemplate;
	@FXML private void handleOpenTemplate(ActionEvent event){
		System.out.println("OpenTemplate");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("OpenTemplate");
		Stage stage = new Stage();
		// favicon
		stage.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
		fileChooser.showOpenDialog(stage);
	}
	
	@FXML private MenuItem itemSaveTemplate;
	@FXML private void handleSaveTemplate(ActionEvent event){
		System.out.println("SaveTemplate");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("SaveTemplate");
		Stage stage = new Stage();
		// favicon
		stage.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
		fileChooser.showOpenDialog(stage);
	}
	
	@FXML private MenuItem itemSaveTemplateAs;
	@FXML private void handleSaveTemplateAs(ActionEvent event){
		System.out.println("SaveTemplateAs");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("SaveTemplateAs");
		Stage stage = new Stage();
		// favicon
		stage.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
		fileChooser.showOpenDialog(stage);
	}
	//
	@FXML private MenuItem itemResetPageTemplate;
	@FXML private void handleResetPageTemplate(ActionEvent event){
		System.out.println("ResetPageTemplate");
	}
	
	@FXML private MenuItem itemResetPanelTemplate;
	@FXML private void handleResetPanelTemplate(ActionEvent event){
		System.out.println("ResetPanelTemplate");
	}
	
	@FXML private MenuItem itemResetLegendTemplate;
	@FXML private void handleResetLegendTemplate(ActionEvent event){
		System.out.println("ResetLegendTemplate");
	}
	
	@FXML private MenuItem itemResetXAxisTemplate;
	@FXML private void handleResetXAxisTemplate(ActionEvent event){
		System.out.println("ResetXAxisTemplate");
	}
	
	@FXML private MenuItem itemResetYAxisTemplate;
	@FXML private void handleResetYAxisTemplate(ActionEvent event){
		System.out.println("ResetYAxisTemplate");
	}
	
	@FXML private MenuItem itemResetZAxisTemplate;
	@FXML private void handleResetZAxisTemplate(ActionEvent event){
		System.out.println("ResetZAxisTemplate");
	}
	
	@FXML private MenuItem itemResetLineTemplate;
	@FXML private void handleResetLineTemplate(ActionEvent event){
		System.out.println("ResetLineTemplate");
	}
	@FXML private MenuItem itemResetVariableTemplate;
	@FXML private void handleResetVariableTemplate(ActionEvent event){
		System.out.println("ResetVariableTemplate");
	}
	//
	@FXML private MenuItem itemCloseWindow;
	@FXML private void handleCloseWindow(ActionEvent event){
		System.out.println("CloseWindow");
	}

	Stage stageLoadData = new Stage();
	@FXML private MenuItem itemLoadData;
	@FXML private void handleLoadData(ActionEvent event){
		System.out.println("JudasFX - LoadData");
		
		// favicon
		stageLoadData.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
		stageLoadData.setTitle("JudasFX - LoadData");
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("LoadData.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageLoadData.close();
					}
				}
			});
			stageLoadData.setScene(scene);
			if( stageLoadData == null ){
				stageLoadData.setX(Math.random()*200);
				stageLoadData.setY(Math.random()*200);
			}
			// 画面表示
			stageLoadData.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML private MenuItem itemLoadThemisCdf;
	@FXML private void handleLoadThemisCdf(ActionEvent event){
		System.out.println("LoadThemisCdf");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("LoadThemisCdf");
		Stage stage = new Stage();
		// favicon
		stage.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
		fileChooser.showOpenDialog(stage);
	}

	Stage stageGenerateThemisOverviewPlot = new Stage();
	@FXML private MenuItem itemGenerateThemisOverviewPlot;
	@FXML private void handleGenerateThemisOverviewPlot(ActionEvent event){
		System.out.println("JudasFX - GenerateThemisOverviewPlot");
		
		stageGenerateThemisOverviewPlot.setTitle("JudasFX - GenerateThemisOverviewPlot");
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("GenerateThemisOverviewPlot.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageGenerateThemisOverviewPlot.close();
					}
				}
			});
			stageGenerateThemisOverviewPlot.setScene(scene);
			if( stageGenerateThemisOverviewPlot == null ){
				stageGenerateThemisOverviewPlot.setX(Math.random()*200);
				stageGenerateThemisOverviewPlot.setY(Math.random()*200);
			}
			// 画面表示
			stageGenerateThemisOverviewPlot.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML private MenuItem itemSaveDataAs;
	@FXML private void handleSaveDataAs(ActionEvent event){
		System.out.println("SaveDataAs");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("SaveDataAs");
		Stage stage = new Stage();
		fileChooser.showOpenDialog(stage);
	}
	
	@FXML private MenuItem itemManageDataAndImportExportTplotVariables;
	@FXML private void handleManageDataAndImportExportTplotVariables(ActionEvent event){		
		System.out.println("JudasFX - ManageDataAndImportExportTplotVariables");
		
		stageManageDataAndImportExportTplotVariables.setTitle("JudasFX - ManageDataAndImportExportTplotVariables");
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("ManageDataAndImportExportTplotVariables.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageManageDataAndImportExportTplotVariables.close();
					}
				}
			});
			
			stageManageDataAndImportExportTplotVariables.setScene(scene);
			stageManageDataAndImportExportTplotVariables.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));
			// 画面表示
			stageManageDataAndImportExportTplotVariables.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML private MenuItem itemExportToImageFile;
	@FXML private void handleExportToImageFile(ActionEvent event){
		System.out.println("ExportToImageFile");
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("ExportToImageFile");
		Stage stage = new Stage();
		fileChooser.showOpenDialog(stage);
	}
	
	Stage stageManageDataAndImportExportTplotVariables = new Stage();
	
	//
	@FXML private MenuItem itemPrint;
	@FXML private void handlePrint(ActionEvent event){
		System.out.println("Print");
		Printer printer = Printer.getDefaultPrinter();
		
	}
	@FXML private MenuItem itemPrintSetUp;
	@FXML private void handlePrintSetup(ActionEvent event){
		System.out.println("PrintSetup");
	}
	//
	Stage stageConfigurationSettings = new Stage();		
	@FXML private MenuItem itemConfigurationSettings;
	@FXML private void handleConfigurationSettings(ActionEvent event){		
		System.out.println("JudasFX - ConfigurationSettings");
		
		stageConfigurationSettings.setTitle("JudasFX - ConfigurationSettings");
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("ConfigurationSettings.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageConfigurationSettings.close();
					}
				}
			});
			stageConfigurationSettings.setScene(scene);
			if( stageConfigurationSettings == null ){
				stageConfigurationSettings.setX(Math.random()*200);
				stageConfigurationSettings.setY(Math.random()*200);
			}
			// 画面表示
			stageConfigurationSettings.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//
	@FXML private MenuItem itemExit;
	@FXML private void handleExit(ActionEvent event){
		javafx.application.Platform.exit();
	}
	//
	// Edit
	//
	@FXML private MenuItem itemCopy;
	@FXML private void handleCopy(ActionEvent event){
		System.out.println("Copy");
	}
	
	@FXML private MenuItem itemDeleteMarker;
	@FXML private void handleDeleteMarker(ActionEvent event){
		System.out.println("DeleteMarker");
	}
	//
	@FXML private MenuItem itemPage;
	@FXML private void handlePage(ActionEvent event){
		System.out.println("Page");
	}
	
	@FXML private MenuItem itemMarkerSinglePanel;
	@FXML private void handleMarkerSinglePanel(ActionEvent event){
		System.out.println("MarkerSinglePanel");
	}
	
	@FXML private MenuItem itemMarkerAllPanels;
	@FXML private void handleMarkerAllPanels(ActionEvent event){
		System.out.println("MarkerAllPanels");
	}
	//
	// View
	//
	@FXML private MenuItem itemReflesh;
	@FXML private void handleReflesh(ActionEvent event){
		System.out.println("Reflesh");
	}
	//
	@FXML private MenuItem itemScrollForward;
	@FXML private void handleScrollForward(ActionEvent event){
		System.out.println("ScrollForward");
	}
	
	@FXML private MenuItem itemScrollBackward;
	@FXML private void handleScrollBackward(ActionEvent event){
		System.out.println("ScrollBackward");
	}
	//
	@FXML private MenuItem itemExpand;
	@FXML private void handleExpand(ActionEvent event){
		System.out.println("Expand");
	}
	
	@FXML private MenuItem itemReduce;
	@FXML private void handleReduce(ActionEvent event){
		System.out.println("Reduce");
	}
	//
//	@FXML private CheckMenuItem itemLegend;
	Stage stageHistoryWindow = new Stage();	
	@FXML private MenuItem itemHistoryWindow;
	@FXML private void handleHistoryWindow(ActionEvent event){
		System.out.println("JudasFX - HistoryWindow");
		
		stageHistoryWindow.setTitle("JudasFX - HistoryWindow");
		// favicon
		stageHistoryWindow.getIcons().add(new Image(HistoryWindowController.class.getResourceAsStream("icons/favicon.ico")));
 
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("HistoryWindow.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageHistoryWindow.close();
					}
				}
			});
			stageHistoryWindow.setScene(scene);
			if( stageHistoryWindow == null ){
				stageHistoryWindow.setX(Math.random()*200);
				stageHistoryWindow.setY(Math.random()*200);
			}
			// 画面表示
			stageHistoryWindow.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//
	// Graph
	//
	Stage stagePanelTracking = new Stage();
	@FXML private MenuItem itemPanelTracking;
	@FXML private void handlePanelTracking(ActionEvent event){
		System.out.println("JudasFX - PanelTracking");
		
		stagePanelTracking.setTitle("JudasFX - PanelTracking");
		// favicon
		stagePanelTracking.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("PanelTracking.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stagePanelTracking.close();
					}
				}
			});
			stagePanelTracking.setScene(scene);
			if( stagePanelTracking == null ){
				stagePanelTracking.setX(Math.random()*200);
				stagePanelTracking.setY(Math.random()*200);
			}
			// 画面表示
			stagePanelTracking.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Stage stageTrackOnePanel = new Stage();		
	@FXML private MenuItem itemTrackOnePanel;
	@FXML private void handleTrackOnePanel(ActionEvent event){
		System.out.println("JudasFX - TrackOnePanel");

		stageTrackOnePanel.setTitle("JudasFX - TrackOnePanel");
		// favicon
		stageTrackOnePanel.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("TrackOnePanel.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageTrackOnePanel.close();
					}
				}
			});
			stageTrackOnePanel.setScene(scene);
			if( stageTrackOnePanel == null ){
				stageTrackOnePanel.setX(Math.random()*200);
				stageTrackOnePanel.setY(Math.random()*200);
			}
			// 画面表示
			stageTrackOnePanel.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageTrackAll = new Stage();
	@FXML private MenuItem itemTrackAll;
	@FXML private void handleTrackAll(ActionEvent event){
		System.out.println("JudasFX - TrackAll");
		
		stageTrackAll.setTitle("JudasFX - TrachAll");
		// favicon
		stageTrackAll.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("TrackAll.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageTrackAll.close();
					}
				}
			});
			stageTrackAll.setScene(scene);
			if( stageTrackAll == null ){
				stageTrackAll.setX(Math.random()*200);
				stageTrackAll.setY(Math.random()*200);
			}
			// 画面表示
			stageTrackAll.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//
	Stage stageShowHorizontalTracking = new Stage();
	@FXML private MenuItem itemShowHorizontalTracking;
	@FXML private void handleShowHorizontalTracking(ActionEvent event){
		System.out.println("JudasFX - ShowHorizontalTracking");
		
		stageShowHorizontalTracking.setTitle("JudasFX - ShowHorizontalTracking");
		// favicon
		stageShowHorizontalTracking.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("ShowHorizontalTracking.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageShowHorizontalTracking.close();
					}
				}
			});
			stageShowHorizontalTracking.setScene(scene);
			if( stageShowHorizontalTracking == null ){
				stageShowHorizontalTracking.setX(Math.random()*200);
				stageShowHorizontalTracking.setY(Math.random()*200);
			}
			// 画面表示
			stageShowHorizontalTracking.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Stage stageShowVerticalTracking = new Stage();	
	@FXML private MenuItem itemShowVerticalTracking;
	@FXML private void handleShowVerticalTracking(ActionEvent event){
		System.out.println("JudasFX - ShowVerticalTracking");
		
		stageShowVerticalTracking.setTitle("JudasFX - ShowVerticalTracking");
		// favicon
		stageShowVerticalTracking.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("ShowVerticalTracking.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageShowVerticalTracking.close();
					}
				}
			});
			stageShowVerticalTracking.setScene(scene);
			if( stageShowVerticalTracking == null ){
				stageShowVerticalTracking.setX(Math.random()*200);
				stageShowVerticalTracking.setY(Math.random()*200);
			}
			// 画面表示
			stageShowVerticalTracking.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Stage stageRubberBandForXOnly = new Stage();
	@FXML private MenuItem itemRubberBandForXOnly;
	@FXML private void handleRubberBandForXOnly(ActionEvent event){
		System.out.println("JudasFX - RubberBandForXOnly");
		
		stageRubberBandForXOnly.setTitle("JudasFX - RubberBandForXOnly");
		// favicon
		stageRubberBandForXOnly.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("RubberBandForXOnly.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageRubberBandForXOnly.close();
					}
				}
			});
			stageRubberBandForXOnly.setScene(scene);
			if( stageRubberBandForXOnly == null ){
				stageRubberBandForXOnly.setX(Math.random()*200);
				stageRubberBandForXOnly.setY(Math.random()*200);
			}
			// 画面表示
			stageRubberBandForXOnly.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//
	Stage stageQueryForMarkerTitle = new Stage();
	@FXML private MenuItem itemQueryForMarkerTitle;
	@FXML private void handleQueryForMarkerTitle(ActionEvent event){
		System.out.println("JudasFX - QueryForMarkerTitle");
		
		stageQueryForMarkerTitle.setTitle("JudasFX - QueryForMarkerTitle");
		// favicon
		stageQueryForMarkerTitle.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("QueryForMarkerTitle.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageQueryForMarkerTitle.close();
					}
				}
			});
			stageQueryForMarkerTitle.setScene(scene);
			if( stageQueryForMarkerTitle == null ){
				stageQueryForMarkerTitle.setX(Math.random()*200);
				stageQueryForMarkerTitle.setY(Math.random()*200);
			}
			// 画面表示
			stageQueryForMarkerTitle.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//
	Stage stagePlotLayoutOptions = new Stage();	
	@FXML private MenuItem itemPlotLayoutOptions;
	@FXML private void handlePlotLayoutOptions(ActionEvent event){
		System.out.println("JudasFX - PlotLayoutOptions");
		
		stagePlotLayoutOptions.setTitle("JudasFX - PlotLayoutOptions");
		// favicon
		stagePlotLayoutOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("PlotLayoutOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stagePlotLayoutOptions.close();
					}
				}
			});
			stagePlotLayoutOptions.setScene(scene);
			if( stagePlotLayoutOptions == null ){
				stagePlotLayoutOptions.setX(Math.random()*200);
				stagePlotLayoutOptions.setY(Math.random()*200);
			}
			// 画面表示
			stagePlotLayoutOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stagePageOptions = new Stage();	
	@FXML private MenuItem itemPageOptions;
	@FXML private void handlePageOptions(ActionEvent event){
		System.out.println("JudasFX - PageOptions");
		
		stagePageOptions.setTitle("JudasFX - PageOptions");
		// favicon
		stagePageOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("PageOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stagePageOptions.close();
					}
				}
			});
			stagePageOptions.setScene(scene);
			if( stagePageOptions == null ){
				stagePageOptions.setX(Math.random()*200);
				stagePageOptions.setY(Math.random()*200);
			}
			// 画面表示
			stagePageOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stagePanelOptions = new Stage();	
	@FXML private MenuItem itemPanelOptions;
	@FXML private void handlePanelOptions(ActionEvent event){
		System.out.println("JudasFX - PanelOptions");
		
		stagePanelOptions.setTitle("JudasFX - PanelOptions");
		// favicon
		stagePanelOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("PanelOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stagePanelOptions.close();
					}
				}
			});
			stagePanelOptions.setScene(scene);
			if( stagePanelOptions == null ){
				stagePanelOptions.setX(Math.random()*200);
				stagePanelOptions.setY(Math.random()*200);
			}
			// 画面表示
			stagePanelOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageLineOptions = new Stage();
	@FXML private MenuItem itemLineOptions;
	@FXML private void handleLineOptions(ActionEvent event){
		System.out.println("JudasFX - LineOptions");
		
		stageLineOptions.setTitle("JudasFX - LineOptions");
		// favicon
		stageLineOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("LineOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageLineOptions.close();
					}
				}
			});
			stageLineOptions.setScene(scene);
			if( stageLineOptions == null ){
				stageLineOptions.setX(Math.random()*200);
				stageLineOptions.setY(Math.random()*200);
			}
			// 画面表示
			stageLineOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageLegendOptions = new Stage();	
	@FXML private MenuItem itemLegendOptions;
	@FXML private void handleLegendOptions(ActionEvent event){
		System.out.println("JudasFX - LegendOptions");
		
		stageLegendOptions.setTitle("JudasFX - LegendOptions");
		// favicon
		stageLegendOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("LegendOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageLegendOptions.close();
					}
				}
			});
			stageLegendOptions.setScene(scene);
			if( stageLegendOptions == null ){
				stageLegendOptions.setX(Math.random()*200);
				stageLegendOptions.setY(Math.random()*200);
			}
			// 画面表示
			stageLegendOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageXAxisOptions = new Stage();		
	@FXML private MenuItem itemXAxisOptions;
	@FXML private void handleXAxisOptions(ActionEvent event){
		System.out.println("JudasFX - XAxisOptions");
		
		stageXAxisOptions.setTitle("JudasFX - XAxisOptions");
		// favicon
		stageXAxisOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("XAxisOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageXAxisOptions.close();
					}
				}
			});
			stageXAxisOptions.setScene(scene);
			if( stageXAxisOptions == null ){
				stageXAxisOptions.setX(Math.random()*200);
				stageXAxisOptions.setY(Math.random()*200);
			}
			// 画面表示
			stageXAxisOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageYAxisOptions = new Stage();
	@FXML private MenuItem itemYAxisOptions;
	@FXML private void handleYAxisOptions(ActionEvent event){
		System.out.println("JudasFX - YAxisOptions");
		
		stageYAxisOptions.setTitle("JudasFX - YAxisOptions");
		// favicon
		stageYAxisOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("YAxisOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageYAxisOptions.close();
					}
				}
			});
			stageYAxisOptions.setScene(scene);
			if( stageYAxisOptions == null ){
				stageYAxisOptions.setX(Math.random()*200);
				stageYAxisOptions.setY(Math.random()*200);
			}
			// 画面表示
			stageYAxisOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageZAxisOptions = new Stage();
	@FXML private MenuItem itemZAxisOptions;
	@FXML private void handleZAxisOptions(ActionEvent event){
		System.out.println("JudasFX - ZAxisOptions");
		
		stageZAxisOptions.setTitle("JudasFX - ZAxisOptions");
		// favicon
		stageZAxisOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("ZAxisOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageZAxisOptions.close();
					}
				}
			});
			stageZAxisOptions.setScene(scene);
			if( stageZAxisOptions == null ){
				stageZAxisOptions.setX(Math.random()*200);
				stageZAxisOptions.setY(Math.random()*200);
			}
			// 画面表示
			stageZAxisOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageVariableOptions = new Stage();	
	@FXML private MenuItem itemVariableOptions;
	@FXML private void handleVariableOptions(ActionEvent event){
		System.out.println("JudasFX - VariableOptions");
		
		stageVariableOptions.setTitle("JudasFX - VariableOptions");
		// favicon
		stageVariableOptions.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("VariableOptions.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageVariableOptions.close();
					}
				}
			});
			stageVariableOptions.setScene(scene);
			if( stageVariableOptions == null ){
				stageVariableOptions.setX(Math.random()*200);
				stageVariableOptions.setY(Math.random()*200);
			}
			// 画面表示
			stageVariableOptions.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// @FXML private RadioMenuItem
	// @FXML private CheckMenuItem

	//
	// Analysis
	//
	Stage stageCalculate = new Stage();	
	@FXML private MenuItem itemCalculate;
	@FXML private void handleCalculate(ActionEvent event){
		System.out.println("JudasFX - Calculate");

		stageCalculate.setTitle("JudasFX - Calculate");
		// favicon
		stageCalculate.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("Calculate.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageCalculate.close();
					}
				}
			});
			stageCalculate.setScene(scene);
			if( stageCalculate == null ){
				stageCalculate.setX(Math.random()*200);
				stageCalculate.setY(Math.random()*200);
			}
			// 画面表示
			stageCalculate.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageNudgeTraces = new Stage();
	@FXML private MenuItem itemNudgeTraces;
	@FXML private void handleNudgeTraces(ActionEvent event){
		System.out.println("JudasFX - NudgeTraces");

		stageNudgeTraces.setTitle("JudasFX - NudgeTraces");
		//H favicon
		stageNudgeTraces.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("NudgeTraces.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageNudgeTraces.close();
					}
				}
			});
			stageNudgeTraces.setScene(scene);
			if( stageNudgeTraces == null ){
				stageNudgeTraces.setX(Math.random()*200);
				stageNudgeTraces.setY(Math.random()*200);
			}
			// 画面表示
			stageNudgeTraces.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageDataProcessing = new Stage();
	@FXML private MenuItem itemDataProcessing;
	@FXML private void handleDataProcessing(ActionEvent event){
		System.out.println("JudasFX - DataProcessing");

		stageDataProcessing.setTitle("JudasFX - DataProcessing");
		// favicon
		stageDataProcessing.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("DataProcessing.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageDataProcessing.close();
					}
				}
			});
			stageDataProcessing.setScene(scene);
			if( stageDataProcessing == null ){
				stageDataProcessing.setX(Math.random()*200);
				stageDataProcessing.setY(Math.random()*200);
			}
			// 画面表示
			stageDataProcessing.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Stage stageVelocitySlices = new Stage();
	@FXML private MenuItem itemVelocitySlices;
	@FXML private void handleVelocitySlices(ActionEvent event){
		System.out.println("JudasFX - VelocitySlices");

		stageVelocitySlices.setTitle("JudasFX - VelocitySlices");
		// favicon
		stageVelocitySlices.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("VelocitySlices.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageVelocitySlices.close();
					}
				}
			});
			stageVelocitySlices.setScene(scene);
			if( stageVelocitySlices == null ){
				stageVelocitySlices.setX(Math.random()*200);
				stageVelocitySlices.setY(Math.random()*200);
			}
			// 画面表示
			stageVelocitySlices.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//
	// Pages
	//
	@FXML private MenuItem itemNew;
	@FXML private void handleNew(ActionEvent event){
		System.out.println("New");
	}
	@FXML private MenuItem itemClose;
	@FXML private void handleClose(ActionEvent event){
		System.out.println("Close");
	}

	//
	// Help
	//
	Stage stageHelpWindow = new Stage();
	@FXML private MenuItem itemHelpWindow;
	@FXML private void handleHelpWindow(ActionEvent event){
		System.out.println("JudasFX - stageHelpWindow");
		URL url = null;
		try {
			url = new URL("http://www.iugonet.org/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleBrowser simpleBrowser = new SimpleBrowser(url);
		try {
			if( stageHelpWindow == null ){
				stageHelpWindow.setX(Math.random()*200);
				stageHelpWindow.setY(Math.random()*200);
			}
			simpleBrowser.start(stageHelpWindow);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		System.out.println("JudasFX - HelpWindow");

		stageHelpWindow.setTitle("JudasFX - HelpWindow");
		// favicon
		stageHelpWindow.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("HelpWindow.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageHelpWindow.close();
					}
				}
			});
			stageHelpWindow.setScene(scene);
			if( stageHelpWindow == null ){
				stageHelpWindow.setX(Math.random()*200);
				stageHelpWindow.setY(Math.random()*200);
			}
			// 画面表示
			stageHelpWindow.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	
	@FXML private MenuItem itemHelpRequestForm;
	@FXML private void handleHelpRequestForm(ActionEvent event){
		System.out.println("HelpRequestForm");
	}

	Stage stageOverviewPlotKey = new Stage();
	@FXML private MenuItem itemOverviewPlotKey;
	@FXML private void handleOverviewPlotKey(ActionEvent event){
		System.out.println("JudasFX - OverviewPlotKey");

		stageOverviewPlotKey.setTitle("JudasFX - OverviewPlotKey");
		// favicon
		stageOverviewPlotKey.getIcons().add(new Image(JudasFXController.class.getResourceAsStream("icons/favicon.ico")));

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("OverviewPlotKey.fxml"));

			Scene scene = new Scene(root);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>
			(){
				@Override
				public void handle(KeyEvent t) {
					if(t.getCode()==KeyCode.ESCAPE){
						System.out.println("click on escape");
						stageOverviewPlotKey.close();
					}
				}
			});
			stageOverviewPlotKey.setScene(scene);
			if( stageOverviewPlotKey == null ){
				stageOverviewPlotKey.setX(Math.random()*200);
				stageOverviewPlotKey.setY(Math.random()*200);
			}
			// 画面表示
			stageOverviewPlotKey.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML private MenuItem itemAbout;
	@FXML private void handleAbout(ActionEvent event){
		System.out.println("About");
	}	
	//
	//
	//
	@FXML private Button btn0;
	@FXML private void handleBtn0(ActionEvent event){
		System.out.println("Btn0");
	}
	
	@FXML private Button btn1;
	@FXML private void handleBtn1(ActionEvent event){
		System.out.println("Btn1");
	}
	
	@FXML private Button btn2;
	@FXML private void handleBtn2(ActionEvent event){
		System.out.println("Btn2");
	}
	
	@FXML private Button btn3;
	@FXML private void handleBtn3(ActionEvent event){
		System.out.println("Btn3");
	}
	
	@FXML private Button btn4;
	@FXML private void handleBtn4(ActionEvent event){
		System.out.println("Btn4");
	}
	
	@FXML private Button btn5;
	@FXML private void handleBtn5(ActionEvent event){
		System.out.println("Btn5");
	}
	
	@FXML private Button btn6;
	@FXML private void handleBtn6(ActionEvent event){
		System.out.println("Btn6");
	}
	
	@FXML private Button btn7;
	@FXML private void handleBtn7(ActionEvent event){
		System.out.println("Btn7");
	}
	
	@FXML private Button btn8;
	@FXML private void handleBtn8(ActionEvent event){
		System.out.println("Btn8");
	}
	
	@FXML private Button btn9;
	@FXML private void handleBtn9(ActionEvent event){
		System.out.println("Btn9");
	}
	
	LoadDataController loadData = new LoadDataController();
	@FXML private Button btnLoadData;
	@FXML private Button btnHelpWindow;

	
	@FXML private Button btnConsoleJython;
	@FXML private void handleConsoleJython(ActionEvent event){
		System.out.println("ConsoleJython");
		ConsoleJython consoleJython = new ConsoleJython();
	}
	
	@FXML private Button btnConsoleJRuby;
	@FXML private void handleConsoleJRuby(ActionEvent event){
		System.out.println("ConsoleJRuby");
		ConsoleJRuby consoleJRuby = new ConsoleJRuby();
	}
	
	@FXML private Button btnConsoleGroovy;
	@FXML private void handleConsoleGroovy(ActionEvent event){
		System.out.println("ConsoleGroovy");
		ConsoleGroovy consoleGroovy = new ConsoleGroovy();
	}

	Stage stageConsoleScala = new Stage();
	@FXML private Button btnConsoleScala;
	@FXML private void handleConsoleScala(ActionEvent event){
		System.out.println("ConsoleScala");
		ConsoleScala consoleScala = new ConsoleScala();
	}

	Stage stageSimpleBrowser = new Stage();
	@FXML private Button btnSimpleBrowser;
	@FXML private void handleSimpleBrowser(ActionEvent event){
		System.out.println("JudasFX - SimpleBrowser");
		URL url = null;
		try {
			url = new URL("http://search.iugonet.org/");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SimpleBrowser simpleBrowser = new SimpleBrowser(url);
		try {
			if( stageSimpleBrowser == null ){
				stageSimpleBrowser.setX(Math.random()*200);
				stageSimpleBrowser.setY(Math.random()*200);
			}
			simpleBrowser.start(stageSimpleBrowser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Stage stageYoutubeBrowser = new Stage();
	@FXML private Button btnYoutubeBrowser;
	@FXML private void handleYoutubeBrowser(ActionEvent event){
		System.out.println("JudasFX - YoutubeBrowser");
		URL url = null;
		try {
			url = new URL("https://www.youtube.com/user/iugonet2009");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleBrowser simpleBrowser = new SimpleBrowser(url);
		try {
			if( stageYoutubeBrowser == null ){
				stageYoutubeBrowser.setX(Math.random()*200);
				stageYoutubeBrowser.setY(Math.random()*200);
			}
			simpleBrowser.start(stageYoutubeBrowser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Stage stageFacebookBrowser = new Stage();
	@FXML private Button btnFacebookBrowser;
	@FXML private void handleFacebookBrowser(ActionEvent event){
		System.out.println("JudasFX - FacebookBrowser");
		URL url = null;
		try {
			url = new URL("https://www.facebook.com/iugo.net");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleBrowser simpleBrowser = new SimpleBrowser(url);
		try {
			if( stageFacebookBrowser == null ){
				stageFacebookBrowser.setX(Math.random()*200);
				stageFacebookBrowser.setY(Math.random()*200);
			}
			simpleBrowser.start(stageFacebookBrowser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Stage stageTwitterBrowser = new Stage();
	@FXML private Button btnTwitterBrowser;
	@FXML private void handleTwitterBrowser(ActionEvent event){
		System.out.println("JudasFX - TwitterBrowser");
		URL url = null;
		try {
			url = new URL("https://twitter.com/iugonet");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleBrowser simpleBrowser = new SimpleBrowser(url);
		try {
			if( stageTwitterBrowser == null ){
				stageTwitterBrowser.setX(Math.random()*200);
				stageTwitterBrowser.setY(Math.random()*200);
			}
			simpleBrowser.start(stageTwitterBrowser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//
	
	@FXML private Button btnUp;
	@FXML private void handleUp(ActionEvent event){
		System.out.println("Up");
	}
	
	@FXML private Button btnDown;
	@FXML private void handleDown(ActionEvent event){
		System.out.println("Down");
	}

	@FXML private CategoryAxis categoryAxis = new CategoryAxis();
	@FXML private NumberAxis numberAxis = new NumberAxis();
	
	@FXML private LineChart lineChart = new LineChart(categoryAxis, numberAxis);
	@FXML private void handleLineChart(ActionEvent event){
		System.out.println("JudasFX - LineChart");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		actionEventHandler = new EventHandler<ActionEvent>(){

			public void handle(ActionEvent event) {
				System.out.println("Hello");
				// TODO Auto-generated method stub
			}};		
	}
}
