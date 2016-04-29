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

import java.awt.Toolkit;

import javax.swing.JFrame;

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
		JFrame jf = new JFrame("窗体的标题");
		/*int frameW = 600;
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
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		
		//窗体的工具类 作用设置其尺寸让其居中显示
		JFrameTools.autoJFframe(jf, 600, 600);
		jf.setVisible(true);
	}

}
