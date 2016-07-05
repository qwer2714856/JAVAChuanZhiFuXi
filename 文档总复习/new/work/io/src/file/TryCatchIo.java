/**
 * io 里面的异常处理 
 * 1.关闭文件必须放到finally 块里面 而且必须保证关闭被执行到，也就说如果两个close并排，需要使用两个try catch 第二个放到第一个的finally里面去防止第一个挂了第二个没办法执行到。
 * 2.读文件的时候出现IOException 如何处理 ?
 *   1. 如果错了直接抛异常 throw new RuntimeException(e); 谁掉用抛给谁
 *   2. 抛出运行时异常不需要调用者必须处理 
 *   为了让使用者使用更加灵活，这样处理很灵活想处理就处理想不处理就拉倒。
 *   总的来讲就是用Runtime...来做壳子，让调用者少些代码，又可以阻止因异而不必执行下面的代码了。
 * 3.在关闭资源的时候判断一下管道是否建立成功如果没成功关闭也就没意义了。
 * if (fi != null) {
	fi.close();
    }
    4.io管道的关闭顺序，先开后关，后开先关
    5.FileOutputStream 关于第二个参数只有刚被实例化有用，如果实例化完毕就，在不重新new的情况下一只保持追加
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.management.RuntimeErrorException;

/**
 * @author www.23.com
 * 
 */
public class TryCatchIo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("d:\\b.txt");
		FileInputStream fi = null;

		try {
			fi = new FileInputStream(fl);
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fi.read(buf)) != -1) {
				System.out.print(new String(buf, 0, len));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			try {
				if (fi != null) {
					fi.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
