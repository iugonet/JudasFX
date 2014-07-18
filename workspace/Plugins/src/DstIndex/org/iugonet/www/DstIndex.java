package org.iugonet.www;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;

import javafx.scene.chart.XYChart.Series;
import lombok.Data;

@Data
public class DstIndex extends Tplot {

	private BufferedReader bufferedReader;
//	private URL url = new URL("http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
	
	public DstIndex() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void storeInTplot(URL url) {
		this.download(url);
		
		String line;

		try {
			FileReader fileReader = new FileReader("/tmp" + url.getPath());
			// FileReader fileReader = new
			// FileReader("/tmp/data/hour/index/dst/1984/dst8410");
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				// System.out.print(line.substring(1-1,3));
				String yy_tail = line.substring(4 - 1, 5);
				int yyyy = 1900 + Integer.parseInt(yy_tail);
				String mm_s = line.substring(6 - 1, 7);
				int mm = Integer.parseInt(mm_s);
				// System.out.print(line.substring(8-1,8));
				String dd_s = line.substring(9 - 1, 10);
				int dd = Integer.parseInt(dd_s);
				// System.out.print(line.substring(11-1,12));
				// System.out.print(line.substring(13-1,13));
				// System.out.print(line.substring(14-1,14));
				// String yy_head = line.substring(15 - 1, 16);
				String dst_base = line.substring(17 - 1, 20).replace(" ", "");

				int j = 0;

				for (int i = 21 - 1; i < 116; i = i + 4) {
					String dst_offset = line.substring(i, i + 4).replace(" ",
							"");
					double dst = (double) (Integer.parseInt(dst_base) * 100. + Integer
							.parseInt(dst_offset));

					//
					// Calendar calendar = Calendar.getInstance();
					// int offset = calendar.get(Calendar.DST_OFFSET) +
					// calendar.get(Calendar.ZONE_OFFSET);
					//

//					Second second = new Second(0, 0, j++, dd, mm, yyyy);

//					this.add(second, dst, 0);
				}
				// System.out.print(line.substring(117-1,120));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Series load(URL url) {
		// TODO Auto-generated method stub

		this.download(url);
		this.read(url);
		return null;
	}

	@Override
	void read(URL url) {
		// TODO Auto-generated method stub
		this.add(1, 2);
	}
	
	public void plot() {
		
	}
}
