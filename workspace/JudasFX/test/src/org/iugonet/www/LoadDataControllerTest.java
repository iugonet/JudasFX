package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class LoadDataControllerTest extends GuiTest {

	LoadDataController loadDataController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		loadDataController = new LoadDataController();
	}

	@After
	public void tearDown() throws Exception {
		loadDataController = null;
		System.gc();
	}

	@Test
	public void test() {
		assertEquals(1,1);
	}

}
