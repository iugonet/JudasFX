package org.iugonet.www;

import java.net.URI;
import java.net.URL;

import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import lombok.Data;

import org.iugonet.www.Aplot;

@Data
abstract public class XYplot <X, Y> extends Tplot {

	<X, Y> XYplot() {
	}
}
