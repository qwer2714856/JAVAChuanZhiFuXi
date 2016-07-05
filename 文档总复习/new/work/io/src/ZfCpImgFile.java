import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流每次都是读取一个完整的字符的！！！
 * 
 * 考虑为什么用字符流拷贝非字符的文件会出现少字节，导致无法打开。数据为什么会丢失？？？
 * System.out.println("当前JVM字符集：" + System.getProperty("file.encoding"));
 * 
 * 首先要理清楚三方概念。
 * 
 * JVM 文件 码表 
 * 
 * JVM默认用的是GBK码表，可以使用System.out.println("当前JVM字符集：" + System.getProperty("file.encoding"));输入当前字符集
 * 
 * A:本地文件
 * B:编码表
 * C:JVM
 * 
 * C                     B                           A
 * 1.从C开始读取数据A
 * 2.A中存放的都是一堆二进制数据
 * 3.读取A中的字符到B里面查找相应的对应值，如果这个字符找到对应的值返回这个整数的值，然而编码表有些是空的，也就这个字符无法找到对应的值 这些未知的字符默认占
 * 一个字节，它的值就是-12和原来的值发生变化，比原来小了，所以在写入的时候就出现问题了，比原来小了。
 * 
 * 
 * 
 * 
 * 何时使用字符流，何时使用字节流，依据是什么。
 * 使用字符流的应用场景
 * 具备编码和解码的能力
 * 如果读写字符数据的时候就使用字符流。能看的到的认识的。
 * 读取的时候都不学要转换成字符的时候就用字节流。
 * 
 * 
 * @author www.23.com
 * 
 */

public class ZfCpImgFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		File fi = new File("D:/java/day10/day21/视频/1.输入字符流.wmv");
		File fo = new File("D:/java/day10/day21/视频/tmp/1.输入字符流.wmv");

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(fi);
			fw = new FileWriter(fo);

			char[] buf = new char[1024];
			int len = 0;

			while ((len = fr.read(buf)) != -1) {
				fw.write(buf, 0, len);
			}
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				} finally {
					if (fr != null) {
						try {
							fr.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							throw new RuntimeException(e);
						}
					}
				}
			}
		}

	}

}
