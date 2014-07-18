package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class ConsoleJRubyControllerTest extends GuiTest {

	ConsoleJRubyController consoleJRubyController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		consoleJRubyController = new ConsoleJRubyController();
		
	}

	@After
	public void tearDown() throws Exception {
		consoleJRubyController = null;
		System.gc();
	}

	@Test
	public void test_01() {
		assertEquals(1,1);	
	}
	
}
