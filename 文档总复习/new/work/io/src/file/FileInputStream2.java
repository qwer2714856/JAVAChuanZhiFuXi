/**
 * 
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class FileInputStream2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("D:/java/day10/day20/视频/2FileInputStream读取文件方式的选择.wmv");
		//比较发现有缓冲的碾压没有缓冲的
		//noBufRead(fl);
		//bufRead(fl);
	}
	public static void noBufRead(File fl){
		long startTime = System.currentTimeMillis();
		//和哪个文件建立管道
		FileInputStream fs = null;
		
		try {
			fs = new FileInputStream(fl);
			//从管道读取数据
			int binnary = 0;
			
			try {
				while((binnary = fs.read())!=-1){
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//关闭管道
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time is :" + (endTime - startTime));
	}
	public static void bufRead(File fl){
		long startTime = System.currentTimeMillis();
		FileInputStream fs = null;
		StringBuilder sb = null;
		try {
			fs = new FileInputStream(fl);
			
			//建立缓冲区
			byte []by = new byte[1024];
			//建立字符串缓冲区
			sb = new StringBuilder();
			
			//读取数据
			int len = 0;
			try {
				while((len = fs.read(by)) != -1){
					sb.append(new String(by, 0, len));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		//System.out.println(sb);
		System.out.println("time is :" + (endTime - startTime));
	}

}
