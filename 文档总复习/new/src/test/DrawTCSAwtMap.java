/**
 * 
 */
package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

interface Setting{
	int FW = 800;
	int FH = 350;
	Color c = Color.RED;
}

/**
 * 画图只能在panel上画
 * @author www.23.com
 *
 */
public class DrawTCSAwtMap extends JPanel {//DrawTCSAwtMap 也是个面板了
	Color c = Color.RED;	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//刷新是repaint
		
		
		JFrame jf = new JFrame("Graphics");
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		jf.setBounds((int)(d.getWidth() - Setting.FW) / 2, (int)(d.getHeight() - 400) / 2, Setting.FW, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawTCSAwtMap ds = new DrawTCSAwtMap();
		jf.add(ds);

		jf.setVisible(true);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ds.c = Color.BLUE;
		ds.repaint();
	}

	@Override
	/**
	 * Graphics g 
	 * 这就是个画笔 使用该画笔画任何东西
	 */
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		//设置画笔颜色
	
		
		// 第四个参数是是不是有立体感 //这个只是描边
		// g.draw3DRect(0, 0, 10, 10, true);
		//填充是fill
		for(int i = 0; i <= Setting.FH; i+=10){
			for(int j = 0; j <= Setting.FW; j+=10){
				if(i == 0 || i == Setting.FH){
					g.setColor(c);
					g.fill3DRect(j, i, 10, 10, true);
				}else{
					g.setColor(Color.GRAY);
					g.fill3DRect(j, i, 10, 10, true);
				}
			}
		}
		
		//写字的
		g.setFont(new Font("宋体",Font.BOLD,30));
		g.drawString("Game Over", 100, 100);
		
		
		
	}
	

}
