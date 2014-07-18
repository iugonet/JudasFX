package org.iugonet.www;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.net.URI;
import java.net.URL;

import javafx.scene.chart.XYChart.Series;
import lombok.Data;

import org.iugonet.www.Tplot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TplotTest<X, Y> {

	@Data
	class Sample extends Tplot {
		Sample(){
			super();
		}

		void file_http_copy(String start, String end) {
		}

		@Override
		void read(URL url) {
		}

		@Override
		public void read(URI uri) {
		}

		@Override
		public Series<X, Y> load(URL url) {
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
	public void test_01() {
		sample.add(1, 0);
		sample.add(1, 0);
		assertEquals(2, sample.getSeries().getData().size());
		
		assertThat(sample.getSeries().getData().size(),is(2));
	}

	@Test
	public void test_02() {
		sample.add(1, 0);
		sample.add(2, 0);
	}
}
