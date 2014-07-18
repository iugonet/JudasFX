package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class JudasFXMapViewerTest extends GuiTest {

	MplotViewerController judasFXMapViewer;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		judasFXMapViewer = new MplotViewerController();
	}

	@After
	public void tearDown() throws Exception {
		judasFXMapViewer = null;
		System.gc();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
