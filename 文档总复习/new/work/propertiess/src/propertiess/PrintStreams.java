/**
 * 打印流
 * PrintStream
 * 为什么会有这个，因为在普通的FileOutputStream write写出的时候会有一定的麻烦，比如讲我如果想写出数字97 那么我就要 "97".getBytes()
 * 
 * 打印流可以打印任意类型的数据，而且打印数据之前都会先把数据转化字符串在打印。
 * 
 * 
 * 作用
 * 1.帮我们把这些数据转换成字符串在打印。
 * 2.收集日志信息
 * 3.改变默认的控制台打印
 */
package propertiess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author www.23.com
 *
 */
public class PrintStreams {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//打印流可以打印任何数据类型 任何数据都是转字符串在打印。
		File file = new File("d:/a.txt");
		PrintStream ps = new PrintStream(file);//如果需要追加的话，这时候用FileOutputStream.这时候采用用追加
		ps.print(false);
		ps.print(97);
		ps.print("大哥");
		ps.print(new PrintStreams());
		
		// 默认标准输出流是像控制台输出的。 System.out  控制台的输出是有限的会丢失一部分
		System.setOut(ps);//修改数据输出流向 重新设置标准输出流对象。 重新分配
		System.out.println("niubi"); //这时候因为改变了流向所以去file了 。
		
		//收集日志信息
		while (true) {
			try {
				int c = 4 / 0;
			} catch (Exception e) {
				e.printStackTrace(ps);
			}
		}
		
	}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return "aaa";
}
}
