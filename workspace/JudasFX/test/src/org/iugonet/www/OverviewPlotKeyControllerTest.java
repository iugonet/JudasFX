package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class OverviewPlotKeyControllerTest extends GuiTest {

	OverviewPlotKeyController overviewPlotKeyController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		overviewPlotKeyController = new OverviewPlotKeyController();

	}

	@After
	public void tearDown() throws Exception {
		overviewPlotKeyController = null;
		System.gc();
	}

	@Test
	public void test() {
		assertEquals(1,1);	
	}

}
