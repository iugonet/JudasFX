package org.iugonet.www;

import static org.junit.Assert.*;
import javafx.scene.Parent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class IonElectronVelocitySlicesRotationsLegendControllerTest extends GuiTest {

	ParticleDistributionSlicesController ionElectronVelocitySlicesRotationsLegendController;

	@Override
	protected Parent getRootNode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Before
	public void setUp() throws Exception {
		ionElectronVelocitySlicesRotationsLegendController = new ParticleDistributionSlicesController();
	}

	@After
	public void tearDown() throws Exception{
		ionElectronVelocitySlicesRotationsLegendController = null;
		System.gc();		
	}

	@Test
	public void test() {
		assertEquals(1,1);	
	}

}
