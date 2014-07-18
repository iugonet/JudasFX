package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class GenerateThemisOverviewPlotControllerTest extends GuiTest {

	GenerateThemisOverviewPlotController generateThemisOverviewPlotController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		generateThemisOverviewPlotController = new GenerateThemisOverviewPlotController();
	}

	@After
	public void tearDown() throws Exception {
		generateThemisOverviewPlotController = null;
		System.gc();
	}

	@Test
	public void test_01() {
		assertEquals(1,1);			
	}

	@Test
	public void test_02() {
		assertEquals(1,1);	
	}

}
