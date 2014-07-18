package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import javafx.scene.chart.XYChart.Series;
import lombok.Data;

@Data
public class AceSwepam extends Tplot {

	private BufferedReader bufferedReader;

	public AceSwepam() {
		super();
		//timeSeries[0].setKey("ACE Solar Wind Electron Proton Alpha Monitor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void read(URL url) {

		String line;

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				if (!line.substring(0, 1).equals(":")
						&& !line.substring(0, 1).equals("#")) { // skip header
					int yyyy = Integer.parseInt(line.substring(0, 4));
					int month = Integer.parseInt(line.substring(5, 7));
					int day = Integer.parseInt(line.substring(8, 10));
					int hour = Integer.parseInt(line.substring(12, 14));
					int min = Integer.parseInt(line.substring(14, 16));
					int stat = Integer.parseInt(line.substring(36, 37));

					double den = Double.parseDouble(line.substring(37, 48)); // proton
																				// density
																				// [p/cc]
					double vsw = Double.parseDouble(line.substring(48, 59)); // bulk
																				// speed
																				// [km/s]
					double ti = Double.parseDouble(line.substring(59, 72)); // ion
																			// temperature
																			// [K]

					if (stat == 0) {
						Minute minute = new Minute(0, hour, day, month, yyyy);

						this.add(minute, ti, 0);
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Series load(URL url) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void plot() {
		
	}

}
