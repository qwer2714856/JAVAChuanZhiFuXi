/**
 * 界面布局
 * 布局管理器 --java.awt 包
 * 用于指定组件的摆放位置的
 * 
 * 
 */
package always_revision;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author www.23.com
 *
 */
public class JieMainBuJu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("边框布局管理器");
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int width = 600;
		int height = 600;
		int x = (int) ((d.getWidth() - width) / 2);
		int y = (int) ((d.getHeight() - height) / 2);
		jf.setBounds(x, y, width, height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JOptionPane.showMessageDialog(jf,"body","title",JOptionPane.INFORMATION_MESSAGE);
		//布局管理器  边框管理器
		/*BorderLayout by = new BorderLayout();
		jf.setLayout(by);//默认用的是边框布局管理器，这里设置不设置都无所谓。
		jf.add(new JButton("北"),BorderLayout.NORTH);
		jf.add(new JButton("南"),BorderLayout.SOUTH);
		jf.add(new JButton("西"),BorderLayout.WEST);
		//jf.add(new JButton("东"),BorderLayout.EAST); 如果缺少任意一边在BorderLayout中都会被中间所沾满,中间少就留出来了，没有占的。
		jf.add(new JButton("中"));//不写默认就等于 BorderLayout.CENTER 如果都在一个位置，最后一个覆盖前一个。
		 */ 	
		//流式布局管理器 FlowLayout 流式布局管理器 一排排摆放，摆不下就换行
		/*FlowLayout fl = new FlowLayout(FlowLayout.LEFT,5,10);//构造指定对齐方式,其它参数可以指定行高和水平间隙 像素为单位
		
	
		JPanel jp = new JPanel();//JPanel默认是流式管理	
		jp.setLayout(fl);
		jp.add(new JButton("1"));
		jp.add(new JButton("2"));
		jp.add(new JButton("3"));
		jp.add(new JButton("4"));
		jp.add(new JButton("5"));
		jp.add(new JButton("6"));
		jp.add(new JButton("1"));
		jp.add(new JButton("2"));
		jp.add(new JButton("3"));
		jp.add(new JButton("4"));
		jp.add(new JButton("5"));
		jp.add(new JButton("6"));
		jp.add(new JButton("1"));
		jp.add(new JButton("2"));
		jp.add(new JButton("3"));
		jp.add(new JButton("4"));
		jp.add(new JButton("5"));
		jp.add(new JButton("6"));
		jf.add(jp);*/
		
		//表格布局管理器 GridLayout
		/*GridLayout gd = new GridLayout(4,4,5,5);//四行四列  不够4行4列会有排版问题，会自动加一列然后调整他们的位置。也可以调整间隙。
		jf.setLayout(gd);
		for(int i = 0; i <= 9; i++){
			jf.add(new JButton(i+""));
		}
		jf.add(new JButton("+"));
		jf.add(new JButton("-"));
		jf.add(new JButton("*"));
		jf.add(new JButton("/"));
		jf.add(new JButton("%"));
		jf.add(new JButton("="));*/
		
		//卡片布局管理器  //它能实现点一下就翻转
		final CardLayout cd = new CardLayout(5,5);
		final JPanel jp = new JPanel();
		jp.setLayout(cd);
		JButton ck = new JButton("ck");
		jp.add(ck);
		jp.add(new JButton("admin1"));
		jp.add(new JButton("admin2"));
		jf.add(jp);
		
		ck.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cd.next(jp);//切换到cd的下一个
				cd.previous(jp);//上一张
			}
			
		});
		
		
		jf.setVisible(true);
		
	}

}
