import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 提高了效率和拓展了FileWriter的功能
 * --------------------
 * Writer 
 *     |----FileWriter
 *     |----BufferedWriter
 * 
 * 拓展了FileWriter的功能
 * newLine()
 * bw.write("admin");
   bw.newLine();
   bw.write("admin");
   这个功能说白了就是在行行之间加了换行符
 向文件输出/r/n而已
 *     
 * 所有的缓冲流内部都为维护了一个8192字节的数组，字符的是字符数组，字节的是字节数组,并且可以通过构造方法指定初始缓冲大小。
 * 
 * 而只有一个特例，那就是FileWriter 它虽然不是缓冲流，但是内部维护这一个1024字节的字符数组，继承自Writer 基类。
 * 
 * 
 * 只要带有缓冲数组的输出流，有一个共同特点，就是在使用write后不能马上写入，必须使用flush 或者缓冲数组满了，或者是关闭。
 * 
 * 练习例子，做用户登录注册
 */

/**
 * @author www.23.com
 * 
 */
public class ZxBufferedWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("d:/ding.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(fl);
			bw = new BufferedWriter(fw);
			 
			bw.write("admin");
			bw.newLine();
			bw.write("admin");
			
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
