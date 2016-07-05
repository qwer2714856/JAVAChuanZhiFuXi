/**
 * 缓冲输入字节流对象。 更高效率读取文件
 * InputStream 输入字节流的基类
 *     |---- FileInputStream 文件输入流
 *     |---- 只要是缓冲的都是以Buffer开头的 缓冲输入字节流类  BufferInputStream 为了提高读取文件的效率，内部维护了一个字节数组，默认是8K。
 * 注意
 * 1.Buffer 接收的是一个InputStream
 * 2.凡是使用了Buffer缓冲区都不具备读写的能力 
 * 疑问？
 * 	1.为什么要传递InputStream 因为buffer本身不具备读写的能力，它需要借助有读取能力的对象(InputStream)。
 * 	2.所以在关闭的时候关闭的是 InputStream
 * 	3.效率高从哪高？  内部维护了一个数组，数据先进一部分到内存，所以读取的时候是对内存的操作。所以效率高。当内存数组不够的时候才会去硬盘在读一部分。所以相当于对内存直接读取，核心就是那8K的字节数组。
 * 
 * 3.实际上bf的close用的是InputStream
 * 所以也可用bf.close()实际上关的是InputStream
 * 
 * 这个和自己创建的缓冲字节数组使用哪个？
 * 使用自己创建的那个，效率高。
 * 因为使用java的Buffer的它在读的时候每次都要判断。所以效率低。
 * 
 * 
 * 流程
 * 1.找到资源文件
 * 2.建立通道
 * 3.建立缓冲
 * 4.读取数据
 * 5.关闭
 */
package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 * 
 */
public class BufSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cp();
		
		//read data
		readData();
	}

	public static void cp() {

		File finput = new File("D:/java/day10/day20/视频/6.缓 输入字节流.wmv");
		File op = new File("D:/java/day10/day20/视频/tmp/6.缓 输入字节流.wmv");

		FileInputStream is = null;
		FileOutputStream os = null;

		try {
			is = new FileInputStream(finput);
			os = new FileOutputStream(op);

			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = is.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			System.out.println("writed");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			} finally {
				try {
					if (is != null) {
						is.close();
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}

	}
	public static void readData(){
		File fi = new File("d:/cc.txt");
		BufferedInputStream bf = null;
		
		try {
			
			bf = new BufferedInputStream(new FileInputStream(fi));
			
			int content = 0;
			while((content = bf.read()) != -1){
				System.out.print((char)content);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
