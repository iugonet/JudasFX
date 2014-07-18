package org.iugonet.www;

import java.beans.*;

import java.io.*;
import java.net.URI;
import java.net.URL;

import lombok.Data;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AplotTest {

	@Data
	class Sample extends Aplot {
		Sample() {
			super();
		}

		@Override
		void read(URL url) {
			// System.out.println(url);
		}
	}

	Sample sample;

	@Before
	public void setUp() throws Exception {
		sample = new Sample();
	}

	@After
	public void tearDown() throws Exception {
		sample = null;
		System.gc();
	}

	@Test
	public void getRootDataDir01() {
		String expected = "/tmp/data";
		String actual = sample.getRootDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void setRootDataDir01() {
		String expected = "/tmp/hoge";
		sample.setRootDataDir(expected);
		String actual = sample.getRootDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void getThemisDataDir01() {
		String expected = "/tmp/themis";
		String actual = sample.getThemisDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void setThemisDataDir01() {
		String expected = "/tmp/hoge";
		sample.setThemisDataDir(expected);
		String actual = sample.getThemisDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void getThemisRemoteDataDir01() {
		String actual = sample.getThemisRemoteDataDir();
		String expected = "http://themis.stp.isas.jaxa.jp/data/themis/";
		assertEquals(expected, actual);
	}

	@Test
	public void setThemisRemoteDataDir01() {
		String expected = "http://www.kyoto-u.ac.jp/";
		sample.setThemisRemoteDataDir(expected);
		String actual = sample.getThemisRemoteDataDir();
		assertEquals(expected, actual);
	}

	@Test
	public void resolve01() throws Exception {
		URL expected = new URL(
				"http://radio.gp.tohoku.ac.jp/db/IPRT-SUN/DATA2/2010/20101225_IPRT.fits");
		URI uri = new URI(
				"spase://IUGONET/Granule/TohokuU/radio_obs/iit/iprt/20101225_IPRT.fits");
		URL actual = sample.resolve(uri);

		assertThat(actual, is(expected));
	}

	@Test
	public void resolve02() throws Exception {
		URL expected = new URL(
				"http://iugonet0.nipr.ac.jp/data/fmag/tjo/2sec/1988/nipr_2sec_fmag_tjo_19880529_v02.cdf");
		URI uri = new URI(
				"spase://IUGONET/Granule/NIPR/Iceland/TJO/fluxgate/PT2S_cdf/nipr_2sec_fmag_tjo_19880529_cdf");
		URL actual = sample.resolve(uri);
		
		assertThat(actual, is(expected));
	}

	@Test
	public void resolve03() throws Exception {
		URL expected = new URL(
				"http://gemsissc.stelab.nagoya-u.ac.jp/data/ergsc/ground/geomag/stel/induction/msr/2011/06/stel_induction_msr_2011060520_v01.cdf");
		URI uri = new URI(
				"spase://IUGONET/Granule/STEL/Induction/MSR/induction/64hz_ergsc_cdf/stel_induction_msr_2011060520_cdf");
		URL actual = sample.resolve(uri);
	
		assertThat(actual, is(expected));
	}

	@Test
	public void resolve04() throws Exception {
		URL expected = new URL(
				"http://www.hida.kyoto-u.ac.jp/DST/his/20010119/jpeg/0119062233FBin3Bit10p000.jpg");
		URI uri = new URI(
				"spase://IUGONET/Granule/KwasanHidaObs/dst_his/2001/01/19/0119062233FBin3Bit10p000jpg");
		URL actual = sample.resolve(uri);
		
		assertThat(actual, is(expected));
	}

	@Test
	public void resolve05() throws Exception {
		URL expected = new URL(
				"http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		URI uri = new URI(
				"spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc");
		URL actual = sample.resolve(uri);
		
		assertThat(actual, is(expected));
	}

	@Test
	public void resolve06() throws Exception {
		URL expected = new URL(
				"http://www.rish.kyoto-u.ac.jp/mu/ceilometer/gif/199809/19980912.gif");
		URI uri = new URI(
				"spase://IUGONET/Granule/RISH/misc/SGK/Ceilometer/ceilometer_sgk_gif/19980912_gif");
		URL actual = sample.resolve(uri);
		
		assertThat(actual, is(expected));
	}

	@Test
	public void resolve07() throws Exception {
		URL expected = new URL("http://www.serc.kyushu-u.ac.jp/data/");
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		URL actual = sample.resolve(uri);
		
		assertThat(actual, is(expected));
	}

	@Test
	public void file_http_copy_1_01() throws Exception {
		URL url = new URL("http://radio.gp.tohoku.ac.jp/db/IPRT-SUN/DATA2/2010/20101225_IPRT.fits");
		sample.file_http_copy(url);
		File file = new File(sample.getRootDataDir()+url.getPath());

		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_1_02() throws Exception {
		URL url = new URL(
				"http://iugonet0.nipr.ac.jp/data/fmag/tjo/2sec/1988/nipr_2sec_fmag_tjo_19880529_v02.cdf");
		sample.file_http_copy(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_1_03() throws Exception {
		URL url = new URL(
				"http://gemsissc.stelab.nagoya-u.ac.jp/data/ergsc/ground/geomag/stel/induction/msr/2011/06/stel_induction_msr_2011060520_v01.cdf");
		sample.file_http_copy(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_1_04() throws Exception {
		URL url = new URL(
				"http://www.hida.kyoto-u.ac.jp/DST/his/20010119/jpeg/0119062233FBin3Bit10p000.jpg");
		sample.file_http_copy(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_1_05() throws Exception {
		URL url = new URL(
				"http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		sample.file_http_copy(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_1_06() throws Exception {
		URL url = new URL(
				"http://www.rish.kyoto-u.ac.jp/mu/ceilometer/gif/199809/19980912.gif");
		sample.file_http_copy(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_1_07() throws Exception {
		URL url = new URL("http://www.serc.kyushu-u.ac.jp/data/");
		sample.file_http_copy(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_2_01() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/TohokuU/radio_obs/iit/iprt/20101225_IPRT.fits");
		sample.file_http_copy(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		System.out.println(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_2_02() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/NIPR/Iceland/TJO/fluxgate/PT2S_cdf/nipr_2sec_fmag_tjo_19880529_cdf");
		sample.file_http_copy(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_2_03() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/STEL/Induction/MSR/induction/64hz_ergsc_cdf/stel_induction_msr_2011060520_cdf");
		sample.file_http_copy(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_2_04() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/KwasanHidaObs/dst_his/2001/01/19/0119062233FBin3Bit10p000jpg");
		sample.file_http_copy(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_2_05() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc");
		sample.file_http_copy(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_2_06() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/RISH/misc/SGK/Ceilometer/ceilometer_sgk_gif/19980912_gif");
		sample.file_http_copy(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void file_http_copy_2_07() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.file_http_copy(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_1_01() throws Exception {
		URL url = new URL(
				"http://radio.gp.tohoku.ac.jp/db/IPRT-SUN/DATA2/2010/20101225_IPRT.fits");
		sample.download(url);		
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_1_02() throws Exception {
		URL url = new URL(
				"http://iugonet0.nipr.ac.jp/data/fmag/tjo/2sec/1988/nipr_2sec_fmag_tjo_19880529_v02.cdf");
		sample.download(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_1_03() throws Exception {
		URL url = new URL(
				"http://gemsissc.stelab.nagoya-u.ac.jp/data/ergsc/ground/geomag/stel/induction/msr/2011/06/stel_induction_msr_2011060520_v01.cdf");
		sample.download(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_1_04() throws Exception {
		URL url = new URL(
				"http://www.hida.kyoto-u.ac.jp/DST/his/20010119/jpeg/0119062233FBin3Bit10p000.jpg");
		sample.download(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_1_05() throws Exception {
		URL url = new URL(
				"http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		sample.download(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_1_06() throws Exception {
		URL url = new URL(
				"http://www.rish.kyoto-u.ac.jp/mu/ceilometer/gif/199809/19980912.gif");
		sample.download(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_1_07() throws Exception {
		URL url = new URL("http://www.serc.kyushu-u.ac.jp/data/");
		sample.download(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_2_01() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/TohokuU/radio_obs/iit/iprt/20101225_IPRT.fits");
		sample.download(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_2_02() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/NIPR/Iceland/TJO/fluxgate/PT2S_cdf/nipr_2sec_fmag_tjo_19880529_cdf");
		sample.download(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_2_03() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/STEL/Induction/MSR/induction/64hz_ergsc_cdf/stel_induction_msr_2011060520_cdf");
		sample.download(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_2_04() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/KwasanHidaObs/dst_his/2001/01/19/0119062233FBin3Bit10p000jpg");
		sample.download(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_2_05() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc");
		sample.download(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_2_06() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/RISH/misc/SGK/Ceilometer/ceilometer_sgk_gif/19980912_gif");
		sample.download(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void download_2_07() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.download(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_1_01() throws Exception {
		URL url = new URL(
				"http://radio.gp.tohoku.ac.jp/db/IPRT-SUN/DATA2/2010/20101225_IPRT.fits");
		sample.read(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_1_02() throws Exception {
		URL url = new URL(
				"http://iugonet0.nipr.ac.jp/data/fmag/tjo/2sec/1988/nipr_2sec_fmag_tjo_19880529_v02.cdf");
		sample.read(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_1_03() throws Exception {
		URL url = new URL(
				"http://gemsissc.stelab.nagoya-u.ac.jp/data/ergsc/ground/geomag/stel/induction/msr/2011/06/stel_induction_msr_2011060520_v01.cdf");
		sample.read(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_1_04() throws Exception {
		URL url = new URL(
				"http://www.hida.kyoto-u.ac.jp/DST/his/20010119/jpeg/0119062233FBin3Bit10p000.jpg");
		sample.read(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_1_05() throws Exception {
		URL url = new URL(
				"http://wdc-data.iugonet.org/data/hour/index/dst/1984/dst8410");
		sample.read(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_1_06() throws Exception {
		URL url = new URL(
				"http://www.rish.kyoto-u.ac.jp/mu/ceilometer/gif/199809/19980912.gif");
		sample.read(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_1_07() throws Exception {
		URL url = new URL("http://www.serc.kyushu-u.ac.jp/data/");
		sample.read(url);
		File file = new File(sample.getRootDataDir()+url.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_2_01() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/TohokuU/radio_obs/iit/iprt/20101225_IPRT.fits");
		sample.read(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_2_02() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/NIPR/Iceland/TJO/fluxgate/PT2S_cdf/nipr_2sec_fmag_tjo_19880529_cdf");
		sample.read(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_2_03() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/STEL/Induction/MSR/induction/64hz_ergsc_cdf/stel_induction_msr_2011060520_cdf");
		sample.read(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_2_04() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/KwasanHidaObs/dst_his/2001/01/19/0119062233FBin3Bit10p000jpg");
		sample.read(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_2_05() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc");
		sample.read(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_2_06() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/RISH/misc/SGK/Ceilometer/ceilometer_sgk_gif/19980912_gif");
		sample.read(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void read_2_07() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.read(uri);
		File file = new File(sample.getRootDataDir()+uri.getPath());
		
		assertTrue(file.exists());
		file = null;
	}

	@Test
	public void xmlEncoderTest() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.read(uri);

		try {
			XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
					new FileOutputStream("goods.xml")));
			xmlEncoder.writeObject(sample);
			xmlEncoder.close();
		} catch (FileNotFoundException ex) {
			System.err.println(ex);
		}
	}

	@Test
	public void xmlDecoderTest() throws Exception {
		URI uri = new URI(
				"spase://IUGONET/Granule/ICSWSE/MAGDAS/AAB/fluxgate/PT1S_ICSWSE_storage/AAB_SEC_200811010000_mgd");
		sample.read(uri);

		try {
			XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(
					new FileInputStream("goods.xml")));
			sample = (Sample) xmlDecoder.readObject();
			xmlDecoder.close();
		} catch (FileNotFoundException ex) {
			System.err.println(ex);
			return;
		}
	}
}
