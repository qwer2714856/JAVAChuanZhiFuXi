/**
 * 什么是转换流？
 * 所谓的转换流就是字节流变为字符流的桥梁。
 * 
 * 为什么要学转换流？
 * 其原因有2
 * 1.字节流想使用字符流的一些方法。
 * 2.转换流可以在转换字节流的时候指定编码表。
 * 
 * System.in是什么？
 * 它是一个标准的字节输入流，它的源是控制台，从控制台输入。返回 InputStream
 * 
 * InputStreamReader 输入 字节流转字符流
 * 
 * OutputStreamWriter 输出 字节流转字符流
 * 
 * 字符流 转字节流不可以
 * 
 * 这个东西什么时候用，在你无法左右字节流或字符流的时候，例如是别人给你的流，但是你又想修改编码表，和想使用字符流的方法时候使用。
 * 
 * 
 * 
 */
package base;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author www.23.com
 *
 */
public class ZHFX {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//以前的获取控制台数据
		/*Scanner sc = new Scanner(System.in);
		sc.next();*/
		
		//System.in 是一个标准的输入字节流，返回的是一个InputStream
		//需求一行行读取字符串
		//字节流转字符流
		/*InputStreamReader isr = new InputStreamReader(System.in);
		//创建缓冲字符流
		BufferedReader fr = new BufferedReader(isr);
		String str = "";
		while((str = fr.readLine()) != null){
			System.out.println(str);
		}*/
		
		FileOutputStream fo = new FileOutputStream("d:/a.txt");
		OutputStreamWriter fw = new OutputStreamWriter(fo,"UTF-8");
		fw.write("定");
		fw.close();
		
		FileInputStream fi = new FileInputStream("d:/a.txt");
		InputStreamReader isr = new InputStreamReader(fi,"GBK");
		BufferedReader br = new BufferedReader(isr);
		String d = "";
		while((d = br.readLine()) != null){
			System.out.println(d);
		}
		
	}

}
