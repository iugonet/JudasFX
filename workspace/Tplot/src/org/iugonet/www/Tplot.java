package org.iugonet.www;

import java.net.URI;
import java.net.URL;

import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import lombok.Data;

import org.iugonet.www.Aplot;

@Data
abstract public class Tplot<X, Y> extends Aplot {

	private Series series;

	<X, Y> Tplot() {
		series = new Series();
	}

	public <X, Y>int add(X arg1, Y arg2) {
		series.getData().add(new XYChart.Data(arg1, arg2));
		return 0;
	}

	abstract public <X, Y> Series load(URL url);

	public <X, Y> Series load(URI uri) {
		return this.load(this.resolve(uri));
	}

}
