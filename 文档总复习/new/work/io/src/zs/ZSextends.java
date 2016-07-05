/**
 * 装饰者模式第一种继承。
 * 优点：使用简单，结构清晰
 * 缺点：不能够相互的使用。
 * 
 * 任务使用继承的方式去扩展一个类的功能
 * 扩展BufferedReader的readLine功能加行号
 */
package zs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class ZSextends {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl = new File("d:/users.txt");
		
		FileReader fr = null;
		MyBufferedReader mb = null;
		try {
			fr = new FileReader(fl);
			mb = new MyBufferedReader(fr);
			String str = "";
			while((str = mb.readLine()) != null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				mb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
class MyBufferedReader extends BufferedReader{
	private int l = 0;
	public MyBufferedReader(FileReader fr) {
		super(fr);
	}
	//重写BufferedReader的readLine方法
	public String readLine() throws IOException{
		String str = super.readLine();//使用的还是父类的readLine只不过扩展一下
		
		if(str != null){
			str = (l++)+str;
		}
		return str;
	}
	public void close() throws IOException{
		super.close();
		l = 0;
	}
}
