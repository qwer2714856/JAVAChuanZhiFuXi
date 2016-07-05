/**
 * װ����ģʽ��һ�ּ̳С�
 * �ŵ㣺ʹ�ü򵥣��ṹ����
 * ȱ�㣺���ܹ��໥��ʹ�á�
 * 
 * ����ʹ�ü̳еķ�ʽȥ��չһ����Ĺ���
 * ��չBufferedReader��readLine���ܼ��к�
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
	//��дBufferedReader��readLine����
	public String readLine() throws IOException{
		String str = super.readLine();//ʹ�õĻ��Ǹ����readLineֻ������չһ��
		
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
