package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class HelpRequestFormControllerTest extends GuiTest {

	HelpRequestFormController helpRequestFormController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		helpRequestFormController = new HelpRequestFormController();
	}

	@After
	public void tearDown() throws Exception {
		helpRequestFormController = null;
		System.gc();
	}

	@Test
	public void test() {
		assertEquals(1,1);	
	}

}
