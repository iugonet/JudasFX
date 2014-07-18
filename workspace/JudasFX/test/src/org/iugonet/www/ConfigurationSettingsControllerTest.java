package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class ConfigurationSettingsControllerTest extends GuiTest {

	ConfigurationSettingsController configurationSettingsController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		configurationSettingsController = new ConfigurationSettingsController();
	}

	@After
	public void tearDown() throws Exception {
		configurationSettingsController = null;
		System.gc();
	}

	@Test
	public void test_01() {
		click("#btnSave");
		assertEquals(1,1);	
	}

	@Test
	public void test_02() {		
		assertEquals(1,1);	
	}

	@Test
	public void test_03() {
		assertEquals(1,1);	
	}

	@Test
	public void test_04() {
		assertEquals(1,1);	
	}

}
