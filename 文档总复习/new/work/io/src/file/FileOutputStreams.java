/**
 * OutputStream 输出字节流 抽象类
 * 抽象类是表示输出字节流的所有类的超类。输出流接受输出字节并将这些字节发送到某个接收器。
 * 需要定义 OutputStream 子类的应用程序必须始终提供至少一种可写入一个输出字节的方法。
 *     |----FileOutputStream 参照程序输出流
 * 如何使用？
 * 1.创建文件描述 File的实例输出目标文件
 * 2.建立输出的通道
 * 3.写数据
 * 4.关闭资源
 * 
 * 
 * 读取和写入的时候都是按一个字节进行的。
 * 读取的是int 小转大
 * 写入的时候但是是大转小，所以如果传入write是int除低八位都扔了。
 * 
 * 
 * 字节流都是按照但字节进行的，单字节，字节数组也是按照单字节来的每个单字节写入或读出。
 * 
 * 
 * 
 * 
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class FileOutputStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File flout = new File("D:\\java\\day10\\day20\\视频\\tmp\\tmp.txt");
		FileOutputStream fo = null;
		
		try {
			fo = new FileOutputStream(flout);
			
			try {
				//每次写入一个int数据，这里可以写入一个字符char自动转int，为什么记事本打开不是二进制是因为记事本本身给转码了。
				//也可以使用字节数组，把字符串转字节数组。
				//注意细节
				//1.没有目标文件会自动创建，FileOutputStream(flout)当文件不存在它创建的文件,如果存在了写入数据会先清空原文件内容，但是目录错了不行。
				/*String str = "hello worldsss";
				fo.write(str.getBytes());*/
				
				//2.FileOutputStream构造是有个波尔值得 第二参数，如果true将从文件末尾写入fo = new FileOutputStream(flout,true); 使用这个构造方法
				//这个时候就是追加数据 如果想换行就\r\n就行了
				/*String str = "hello worldsss\r\n";
				fo.write(str.getBytes());*/
				
				//3.使用FileOutputStream write 写数据，虽然接收的是一个int类型数据，真正写出只是一个字节数据，只是把低八位写出，其它24位全部丢弃。换言之
				//如果输入的这个int无法用8二进制位表示其它的全部丢弃。
				//输入5111但是打开发现不是5111结论除了低八位全扔掉。
				//写入的只有1个字节其它的字节都扔了。
				fo.write(5111);
				
				//fo.write(byte [], 0, 2); 从字节数组中取出两个写入。
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
