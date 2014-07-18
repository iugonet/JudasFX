package org.iugonet.www;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.net.URI;
import java.net.URL;

import javafx.scene.chart.XYChart.Series;
import lombok.Data;

import org.iugonet.www.XYplot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XYplotTest {

	@Data
	class Sample extends XYplot {
		Sample(){
			super();
		}

		Sample(int dimension) {
//			super(dimension);
			super();
		}

		void file_http_copy(String start, String end) {
		}
		
		@Override
		public Series load(URI uri) {
			return null;
		}
		
		@Override
		void read(URL url) {
		}

		@Override
		public void read(URI uri) {
		}

		@Override
		public Series load(URL url) {
			// TODO Auto-generated method stub
			return null;
		}
	}

	Sample sample;
	
	@Before
	public void setUp() throws Exception {
		sample = new Sample();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		sample.add(1, 0);
		sample.add(2, 1);
		sample.add(3, 0);
		System.out.println(sample.getSeries().getData().toString());

		assertThat(1,is(1));
	}

}
