package always_revision;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameTools {
	public static void autoJFframe(JFrame jf, int width, int height){
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((d.getWidth() - width) / 2);
		int y = (int) ((d.getHeight() - height) / 2);
		jf.setBounds(x, y, width, height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
