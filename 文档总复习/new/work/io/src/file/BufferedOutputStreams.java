/**
 * BufferedOutputStream 
 * 内部维护了一个8KB的字节数组
 * ----------------|OutputStream
 * ---------------------|BufferedOputputStream
 * 出现的目的是为了提高写数据的目的。
 * 注意细节
 * 1。是用BufferedOutputStream 写数据write 方法先把数据写到内部维护8kb数组中。
 * 2。如果把需要把数据真正写到硬盘需要调用flush() 刷新缓冲数据流，将内存数据刷到硬盘上。
 * 3.BufferedOutputStream 的 close方法也会执行flush的操作 和 close方法 或者 内部的数组满了也会刷出去到硬盘
 * 
 * 三种情况可以写到硬盘
 * 1.flush
 * 2.close
 * 3.内部维护的缓冲数组满了
 */
package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class BufferedOutputStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("d:/b.txt");
		FileOutputStream fo = null;
		BufferedOutputStream bo = null;
		try {
			fo = new FileOutputStream(fl);
			bo = new BufferedOutputStream(fo);
			 
			bo.write("aadmins".getBytes());
			//bo.flush();
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		finally{
			try {
				bo.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e1);
			}
		}
		
	}

}
