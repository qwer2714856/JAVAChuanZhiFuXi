/**
 * 复习
 *
 */
package test;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author www.23.com
 *
 */
public class AWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("窗体");
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		int width = 600;
		int height = 600;
		int x = (int) ((di.getWidth() - width)/2);
		int y = (int) ((di.getHeight() - height) / 2);
		
		jf.setBounds(x, y, width, height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		/*JDialog jd = new JDialog(jf,"digbox",true);
		jd.setBounds(x, y, width, height);
		jd.setVisible(true);*/
		
		/*JOptionPane.showMessageDialog(jf, "body","tith",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(jf, "body","tith",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(jf, "body","tith",JOptionPane.ERROR_MESSAGE);*/
		
		/*JOptionPane.showInputDialog(jf,"body","tith",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInputDialog(jf,"body","tith",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showInputDialog(jf,"body","tith",JOptionPane.ERROR_MESSAGE);*/
		
		/*JOptionPane.showConfirmDialog(jf, "body", "tith",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showConfirmDialog(jf, "body","tith",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showConfirmDialog(jf, "body","tith",JOptionPane.WARNING_MESSAGE);*/
	}

}
