package test;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

class JFToolses {
	public static void createJF(JFrame jf, int w, int h){
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((d.getWidth() - w) / 2);
		int y = (int) ((d.getHeight() - h) / 2);
		
		jf.setBounds(x, y, w, h);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
