/**
 * 转换流 字节通向字符的桥梁
 * 
 * 为什么学转换流。
 * 
 * System.in 是什么？
 * 标准的输入流，读取控制台的。
 * 返回的是一个InputStream
 * 
 * 字节流转换为字符流
 * 这里就需要使用转换流
 * 输入字节流的转换流
 * 输入字节变为输入字符流
 * InputStreamReader
 * 
 * 优点
 * 1.如果目前所获取的是字节流，如果需要字符流的方法，可以使用这个转换
 * 2.使用转换流可以指定编码表，进行读写文件，它的构造方法可以指定码表的。OutputStreamWriter fw = new OutputStreamWriter(fo,"iso8859-1");
 * 
 * 字符流转字节流,答案是没有的。 就好比 屌丝想变高富帅，而高富帅想变屌丝那个是不可能的。	
 * 
 * 因为
 * 字节流是最基本的（屌丝） 字符流它可以转码高级一些（高富帅）
 * 
 * 输出字节流的转换流
 * OutputStreamWriter
 * 什么时候用？
 * 比如讲socket 这个类它返回的是是一个输出字节流，如果想使用一下输出字符流的方法就必须要用到这个方法转换一下。
 * 
 */
package base;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author www.23.com
 *
 */
public class ZH {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//以前的接收键盘方式
		/*Scanner s = new Scanner(System.in);
		s.next();*/
		
		//返回的是一个标准输入流  默认从控制台读入
		/*InputStream is = System.in;
		byte []by = new byte[1024];
		int len = 0;
		
		while((len = is.read(by)) != -1){
			System.out.println(new String(by,0,len));
		}*/
		
		InputStream is = System.in;//这是个字节流
		//当调用read的时候会卡在控制台上等待用户输入。不输入不行。但是没有调用读取不会。
		//如何和BufferedReader 一样一行行的读取。
		//这里就需要把字节流转换为字符流
		InputStreamReader isr = new InputStreamReader(is);
		//使用字符流的缓冲类
		BufferedReader rd = new BufferedReader(isr);
		
		String str = "";
		/*while((str = rd.readLine()) != null){
			System.out.println(str);
		}*/
		
		
		
		//输出字节流，转输出字符流
		FileOutputStream fo = new FileOutputStream("d:/txt.txt");
		OutputStreamWriter fw = new OutputStreamWriter(fo,"iso8859-1");
		fw.write("定");
		fw.close();
	}

}
