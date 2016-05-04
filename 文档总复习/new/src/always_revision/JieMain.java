/**
 * 图形化编程
 * 事件 和 android很像
 * 两个包
 * java图形类主要在这下面两个包里面。
 * java.awt（不删除它，因为swing只是图形类扩展了，还有些事件什么的swing在这里面，所以不删除）
 * javax.swing （用这个）跨平台性好 只是控件用这个而已。除图形，比如事件还是用awt的。
 * javax x是扩展的。
 * 这两都有图形类 awt Button swing JButton 在awt基础上加个J
 * 为什么要有两个相同类名的包？
 * awt swing 区别
 * awt 使用的图形类依赖于系统图形库的。
 * swing 使用的图形类都是sun自己实现的，不需要依赖系统图形库。			
 * 系统图形库就是（linux 有 linux windows 有 windows 的图形库） 跨平台不好！！！不同系统的图形库不同。
 * 
 * 
 * java中所有图形类都被称为组件
 * 按钮组件
 * 窗体组件
 * 
 * 组件分为
 * 容器组件
 * 
 * 
 * 非容器组件
 * 
 * 
 * 组件的学习体系
 * Component
 * 容器组件
 * 1 Container -> window-> frame
 * 						-> dialog->filedialog
 * 			   -> panel
 * 非容器组件
 * 2 Button
 * 3 Label
 * 4 Checkbox
 * 5 TextComponet -> TextArea
 * 				  -> TextField
 * 
 * 
 * 容器组件
 * window 没有边界所以不会用
 * frame  有边界所以用frame
 * 
 * 
 * 
 * Toolkit 工具类awt包里面 抽象类 获取一些系统数据的屏幕尺寸等等
 * Toolkit.getDefaultToolkit(); 获取系统相关的工具类对象
 * 
 */
package always_revision;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 * @author www.23.com
 *
 */
public class JieMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		// TODO Auto-generated method stub
		//JFrame(String title) 创建一个新的、初始不可见的、具有指定标题的 Frame。
		/*JFrame jf = new JFrame("窗体的标题");
		int frameW = 600;
		int frameH = 600;
		//从类 java.awt.Window 继承的方法 setVisible 设置窗体的可见性
		jf.setVisible(true);
		//java.awt.Window 继承的方法 setSize 设置窗体的大小
		//jf.setSize(600, 600);//单位是像素
		//居中显示 得到屏幕的坐标然后计算
		//java.awt.Toolkit.getDefaultToolkit().getScreenSize().width getScreenSize() 返回的对象是Dimension 
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height / 2;
		int w = screenWidth - (frameW / 2);
		int h = screenHeight - (frameH / 2);
		//设置位置加尺寸 java.awt.Window 继承的方法 setBounds 设置窗体位置+大小
		jf.setBounds(w, h, 600, 600);
		
		//关闭按钮后，程序默认没有退出，所以设置窗体关闭的事件
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//窗体的工具类 作用设置其尺寸让其居中显示
		JFrameTools.autoJFframe(jf, 600, 600);
		jf.setVisible(true);
		*/
		
		//对话框 dialog
		//JFrame jf = new JFrame("dialog");
		//Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		//int width = 600;
		//int height = 600;
		//int x = (int) ((di.getWidth() - width) / 2);
		//int y = (int) ((di.getHeight() - height) / 2);
		//jf.setBounds(x, y, width, height);
		
		//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.setVisible(true);
		
		//第一参数是所有者，它属于哪个JFrame 第二个参数dialog的名字，第三个 boolean模式 模式是什么？ 当弹出窗体不能操作后面的内容就为true,false可以操作
		//JDialog dg = new JDialog(jf,"JDialog",true);
		//dg.setBounds(x, y, width, height);
		//dg.setVisible(true);//初始不可见，所以需要设置。
		
		//第二种对话框 JOptionPane
		//分为：消息对话框，警告对话框，错误对话框，输入对话框，确认对话框
		//第一个参数所有者jframe 	第二个：消息主体  	第三个 ：消息标题 	第四个：要把它显示什么类型对话框，【警告，消息等】。
		//JOptionPane.showMessageDialog(jf, "信息对话框","title", JOptionPane.INFORMATION_MESSAGE);//不需要setVisible了， 不管什么对话框就是JOptionPane.INFORMATION_MESSAGE这个不同
		//JOptionPane.showMessageDialog(jf, "信息对话框","title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(jf, "信息对话框","title", JOptionPane.ERROR_MESSAGE);
		//输入对话框 这个和上面一样也有4个参数作用一样，也可以搞警告 提示 错误等等 返回string
		//System.out.println(JOptionPane.showInputDialog(jf,"请输入金额","title",JOptionPane.WARNING_MESSAGE));
		//确认框 0 确认 1 否 2 取消 返回int
		//System.out.println(JOptionPane.showConfirmDialog(jf, "确认","title",JOptionPane.INFORMATION_MESSAGE));
		
		
		
		
		//总结 JOptionPane.showMessageDialog;   JOptionPane.showConfirmDialog;   JOptionPane.showInputDialog; 它们三个
		//都可以设置JOptionPane.INFORMATION_MESSAGE 显示他们的不同类型
		
		//文件对话框，在java.awt包里面
		/*JFrame jf = new JFrame();
		FileDialog fd = new FileDialog(jf,"title",FileDialog.SAVE);//最后一个参数 load(打开)和save(保存)两种状态
		fd.setBounds(0, 0, 300, 300);
		fd.setVisible(true);
		File []fl = fd.getFiles();
		for(File f:fl){
			System.out.println(f.getAbsolutePath());
		}
		System.out.println(fd.getDirectory());
		System.out.println(fd.getFile());*/
		
		//Panel 面板
		/*JFrame jf = new JFrame("panel");
		jf.setBounds(0, 0, 100, 100);
		JPanel jp = new JPanel();
		jp.setBackground(Color.RED);
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);*/
		
		
		
		
		
		
		//非容器组件
		/*JFrame jf = new JFrame("非容器组件");
		jf.setBounds(0, 0, 500, 500);
		JPanel jp = new JPanel();
		jp.setBackground(Color.BLUE);
		FlowLayout flt = new FlowLayout(FlowLayout.LEFT,5,10);
		jp.setLayout(flt);
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//添加非容器组件
		JLabel jl = new JLabel("用户名：");
		JTextField jfd = new JTextField("please write user name",35);//这里的是列宽，不是像素
		
		JLabel jpwd = new JLabel("密    码：");
		JPasswordField pwd = new JPasswordField("输入密码",35);
		
		//单选必须要进行分组，同一组单选框只能选择其中一个
		JRadioButton jb = new JRadioButton("男",true);// 如果都加true bg.add(jb);bg.add(jb2);会以这个为顺序，谁在前谁选中。
		JRadioButton jb2 = new JRadioButton("女");
		//建立一个组
		ButtonGroup bg=  new ButtonGroup();
		bg.add(jb);
		bg.add(jb2);
		
		//复选框
		JCheckBox jc = new JCheckBox("足球",true);
		
		//下拉框
		JComboBox<String> jcbox = new JComboBox<>(new String[]{"a1","q2"});
		
		//文本域
		JTextArea ja = new JTextArea("aaa",20,20);
		//ja.setLineWrap(true); //文字自动换行
		JScrollPane jsp = new JScrollPane();
		jsp.setAutoscrolls(true);//自动加滚动条
		jsp.setViewportView(ja);//把需要滚动的扔到这里面来
		
		
		
		jp.add(jl);
		jp.add(jfd);
		jp.add(jpwd);
		jp.add(pwd);
		jp.add(jb);
		jp.add(jb2);
		jp.add(jc);
		jp.add(jcbox);
		jp.add(jsp);
	 
		jf.setVisible(true);*/
		
		//菜单组件
		/*JFrame jf = new JFrame("非容器组件");
		jf.setBounds(0, 0, 500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea jt = new JTextArea(20,20);
		jt.setLineWrap(true);
		JScrollPane jsp = new JScrollPane();
		jsp.setAutoscrolls(true);
		jsp.setViewportView(jt);
		
		JMenuBar jmb = new JMenuBar();//菜单条
		JMenu jm = new JMenu("文件");//菜单
		JMenu jm2 = new JMenu("编辑");
		
		JMenuItem jmt = new JMenuItem("打开");
		jm.add(jmt);
		jmb.add(jm);
		//复选菜单
		//菜单添加菜单，菜单添加菜单项
		JMenu jm2qh = new JMenu("复选菜单");
		JMenuItem jmt2qh = new JMenuItem("子项");
		jm2qh.add(jmt2qh);
		jm2.add(jm2qh);
		jmb.add(jm2);
		
		jf.add(jmb,BorderLayout.NORTH);
		jf.add(jsp);
		
		
		
		
		jf.setVisible(true);*/
		
		
		//事件
		//1 事件源 2 监听器 3 处理方案 4 事件
		
		JFrame jf = new JFrame("非容器组件");
		jf.setBounds(0, 0, 500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JButton jmt = new JButton("点我");
		jf.add(jmt);
		//事件event
		
		//事件源
		
		//监听者
		//addActionListener 动作监听器 只要是鼠标和空格都是有反应的
		//addMouseListener
		//适配器 Adapter 鼠标的是MouseAdapter 键盘的是KeyAdapter
		
		//事件
		
		//处理过程
		
		//keyTyped keyPressed 会在某些键上有区别  keyTyped（有字符的起作用） keyPressed（全部起作用）
		jmt.addKeyListener(new KeyListener(){

			@Override
			//键入某个键
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("键入某个键"+e.getKeyCode());
			}

			@Override
			//按下
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("按下"+e.getKeyCode());//获取码值
				System.out.println("按下"+e.getKeyChar());//获取字符
			}

			@Override
			//松开
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("松开");
			}
			
		});
		
		jmt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//需要实现所有的，很不爽如何只实现点击的其它不实现，空实现就行了。
		jmt.addMouseListener(new MouseListener(){

			@Override
			//点击
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getClickCount());//获取点击次数 如果==2就是双击 如果不连续会从1算，如果连续才会累加
			}

			@Override
			//按下
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("pass");
			}

			@Override
			//松开
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("release");
			}

			@Override
			//鼠标进入
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("in");
			}

			@Override
			//鼠标移除
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("out");
			}
			
			
			
		});
		//也可以用适配器
		jmt.addMouseListener(new MouseAdapter() {
			//这样用到哪个就重写哪个因为MouseAdapter已经空实现了MouseListener的方法。
			//鼠标移除
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("out");
			}
		});
		
		
		
		jmt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {//对应的事件传给ActionEvent e e就是事件
				// TODO Auto-generated method stub
			JButton jb	= (JButton)e.getSource();//获取事件源
			jb.setText("aaa");
			}
			
		});
		 
		
		jf.setVisible(true);
		
	}

}
