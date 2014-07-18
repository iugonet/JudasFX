package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class HelpWindowControllerTest extends GuiTest {

	HelpWindowController helpWindowController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		helpWindowController = new HelpWindowController();
	}

	@After
	public void tearDown() throws Exception {
		helpWindowController = null;
		System.gc();
	}

	@Test
	public void test() {
		assertEquals(1,1);	
	}

}
