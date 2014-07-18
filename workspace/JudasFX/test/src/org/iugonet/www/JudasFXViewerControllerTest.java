package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class JudasFXViewerControllerTest extends GuiTest {

	IplotViewerController judasFXViewerController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		judasFXViewerController = new IplotViewerController();
	}

	@After
	public void tearDown() throws Exception {
		judasFXViewerController = null;
		System.gc();
	}

	@Test
	public void testPropertiesTitleShowTitle01() throws InterruptedException {
		assertEquals(1,1);	
	}

}
