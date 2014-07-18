package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class DialogControllerTest extends GuiTest {

	DialogController dialog;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		dialog = new DialogController();
	}

	@After
	public void tearDown() throws Exception {
		dialog = null;
		System.gc();
	}

	@Test
	public void test_01(){
		assertEquals(1,1);	
	}

	@Test
	public void test_02() {
		assertEquals(1,1);	
	}

}
