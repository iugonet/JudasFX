package org.iugonet.www;

import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacpp.opencv_highgui;
import org.bytedeco.javacpp.opencv_imgproc;
import org.bytedeco.javacv.CanvasFrame;

abstract public class Iplot extends Aplot {

	Iplot(){
		IplImage src = opencv_highgui.cvLoadImage("/tmp/photo.png");
		IplImage dst = IplImage.create(src.width(), src.height(), src.depth(), src.nChannels());
			
//		opencv_imgproc.cvSmooth(src, dst, opencv_imgproc.CV_GAUSSIAN, 3);
		opencv_imgproc.cvSmooth(src, dst);
//		opencv_imgproc.cvSmooth(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
			
		final CanvasFrame srcframe = new CanvasFrame("src");
		final CanvasFrame dstframe = new CanvasFrame("dst");
		srcframe.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		dstframe.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		srcframe.showImage(src);
		dstframe.showImage(dst);
	}
}
