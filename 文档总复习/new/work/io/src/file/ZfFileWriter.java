/**
 * 输出字符流
 * Writer 基类 抽象类
 * ----| FileWriter
 * 和FileOutputStream 一样概念。除了一个是字符一个是字节，还有写入的区分。
 * 
 * 
 * 字节流和字符流的输出区别！！！
 * 字节流在输出的时候不关闭资源是可以写到硬盘的。
 * 字符流在输出的时候不关闭资源是无法写到硬盘的。
 * 为什么是无法写入内容？
 * 因为他内部也维护了一个字符数组，继承自Writer 字符数组大小是1024. 它虽然不是缓冲类但是它也维护了一个数组。 和缓冲类一样，如果想立即刷入硬盘flush
 * 其它的方式就是缓冲数组满了，或者关闭资源。
 * 
 * 使用FileWriter 如果目标文件不存在会自动创建目标文件，如果目标存在且有内容如果不用true就删了在插入，如果有true就在末尾搞。
 */
package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author www.23.com
 * 
 */
public class ZfFileWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("d:/cc.txt");
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(f, true);
			char [] str = {'a','d','m','i','n'};
			fw.write(str);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {	
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				}
			}
		}
	}

}
