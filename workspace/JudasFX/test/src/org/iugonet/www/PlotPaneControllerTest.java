package org.iugonet.www;


import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class PlotPaneControllerTest extends GuiTest {

	PlotPaneController plotPaneController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		plotPaneController = new PlotPaneController();


	}

	@After
	public void tearDown() throws Exception {
		plotPaneController = null;
		System.gc();
	}

	@Test
	public void test() {
		assertEquals(1,1);	
	}

}
