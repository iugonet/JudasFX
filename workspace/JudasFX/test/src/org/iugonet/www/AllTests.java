package org.iugonet.www;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculateControllerTest.class,
		ConfigurationSettingsControllerTest.class, ConsoleJythonControllerTest.class,
		DataProcessingControllerTest.class, DialogControllerTest.class,
		GenerateThemisOverviewPlotControllerTest.class,
		HelpRequestFormControllerTest.class, HelpWindowControllerTest.class,
		HistoryWindowControllerTest.class,
		IonElectronVelocitySlicesRotationsLegendControllerTest.class, 
		JudasFXControllerTest.class, LineOptionsControllerTest.class, LoadDataControllerTest.class,
		ManageDataAndImportExportTplotControllerTest.class, 
		NudgeTracesControllerTest.class, OverviewPlotKeyControllerTest.class,
		PageOptionsControllerTest.class, PanelOptionsControllerTest.class,
		PlotLayoutOptionsControllerTest.class, PlotPaneControllerTest.class, 
		ThemisDerivedSpectraControllerTest.class, 
		VariableOptionsControllerTest.class, VelocitySlicesControllerTest.class,
		XAxisOptionsControllerTest.class })
public class AllTests {

}
