package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class cp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("D:\\java\\day10\\day20\\视频\\4.FileOutStream写数据.wmv");
		File outFile = new File("D:\\java\\day10\\day20\\视频\\tmp\\cp.wmv");
		
		//管道
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		//读取
		try {
			//读取管道
			fi = new FileInputStream(inFile);
			
			//我这里为什么不没有加true解释一下
			//FileOutputStream 工作原理
			/**
			 * 内部也是维护着一个指针的
			 * 每新创建一个新的FileOutputStream实例，默认情况都会重新创建一个指针，然后清空输出文件的内容，指向了开始位置。
			 * 每写出一次指针都会做出相应移动，当程序实例了一次FileOutputStream后可以拿着这个资源不停的写入，也不会清空文件，但是如果重新实例FileOutputStream，
			 * 指针就会从开始位置，然后清空内容，所以如果想让FileOutputStream实例每次都可以追加需要FileOutputStream的第二个参数。
			 * 
			 * 结论就是
			 * 1.FileOutputStream实例后默认清空文件指针指向开头，除非用第二个参数true,也就说第二个参数就在实例化的时候有作用。
			 * 2.FileOutputStream实例后只要没有释放资源就可以不停追加，如果再次FileOutputStream实例没有第二个参数就会清空目标文件。
			 */
			//写入管道
			fo = new FileOutputStream(outFile);
			
			//缓冲区读取
			byte []buf = new byte[1024];
			int len = 0;
			try {
				while((len = fi.read(buf)) != -1){
					//读取在写入
					fo.write(buf, 0, len);//这是个坑 别看接收个int就能写入一个字节，其它全扔值写低八位的东西。
					System.out.println("writing====");
				}
				System.out.println("writed done");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally{
			try {
				//关闭管道先开的后关，后开的先关
				if(fo != null){
					fo.close();
				}
				if(fi != null){
					fi.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
		
	}

}
