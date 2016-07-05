/**
 * 打印流
 * PrintStream
 * 
 * 为什么会有这个是因为它有三个有点
 * 普通的 FileOutputStream 在输出的时候如果你输入的是一个数字那么会当做二进制处理然后记事本打开的时候会发下不对，如果非要输入字符那么只有"97".getBytes()才可以
 * 
 * 优点
 * 1.可以打印任何数据类型，在打印的时候注意一下他会把所有的数据类型转换为字符串。
 * 2.如果需要追加的话，需要借助于FileOutputStream
 * 3.改变默认System.out的数据流向
 * 4.将错误日志输出到文件
 */
package propertiess;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author www.23.com
 *
 */
public class LxPrintStream {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream(new FileOutputStream("d:/a.txt",true));
		
		ps.print("admin");
		ps.println(false);
		ps.println(3.14);
		
		System.setOut(ps);
		System.out.println("this is test");
		
		try{
			int i =  4 / 0;
		} catch(Exception e){
			e.printStackTrace(ps);
		}
	}

}
