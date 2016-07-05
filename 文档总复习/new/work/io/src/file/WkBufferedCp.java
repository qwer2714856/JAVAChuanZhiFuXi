/**
 * 【关于一个比较重要的概念】
 * read 如果里面传入的是 byte 数组 那么真实的内容将读入到字节数组中去，然后返回值值是读取的实际长度。
 * 然而
 * read 里面如果什么都没有传入那么返回时读取的实际内容。
 * 
 * 
 */
package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class WkBufferedCp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedCp();
	}
	
	public static void BufferedCp(){
		File in = new File("D:\\java\\day10\\day20\\视频\\7.缓冲输出字节流.wmv");
		File ot = new File("D:\\java\\day10\\day20\\视频\\tmp\\7.缓冲输出字节流.wmv");
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		
		try {
			fin = new FileInputStream(in);
			fout = new FileOutputStream(ot);
			
			bin = new BufferedInputStream(fin);
			bout = new BufferedOutputStream(fout);
			
			byte []by = new byte[8192];
			int len = 0;
			try {
				while((len = bin.read(by)) != -1){
					bout.write(by, 0, len);
					//bout.flush(); 这里不刷，自动满了就填充，然后关闭也会写一遍
				}
				System.out.println("ok");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {

			try {
				if (bout != null) {
					bout.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			} finally{
				if(bin != null){
					try {
						bin.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						throw new RuntimeException(e);
					}
				}
			}

		}
		
		
	}

}
