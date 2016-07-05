import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * װ���� ���ģʽ
 * 
 * ����
 * ��дһ����չBufferedReader���࣬��չ����readLine������Ҫ�����к�.
 * 
 * ����һ����Ĺ��ܵ�ʱ�����ѡ��̳С�ͨ���̳�ʵ�����ӹ��ܵ��ŵ㣬����򵥡�ȱ���� ����������������Ҫ���������չ����ͺܶ�ܶࡣ
 * ��Ϊ�̳���ϵ̫�Ӵ����Գ�����װ����ʵ��ģʽ����ǿһ����Ĺ��ܡ�
 * 
 * 
 * �ܽ᣺��ǿһ����Ĺ���1�̳�2װ�������ģʽ
 * 1�̳У�����ṹ������ʵ�ּ򵥡�ȱ�㵼�¼̳���ϵ̫�Ӵ󣬲����໥װ�Ρ�
 * 2װ�������ģʽ�������໥װ�Σ�ȱ��ͨ����̬��ά��ʵ����
 * 
 * 
 */

/**
 * @author www.23.com
 *
 */
public class ZSmodel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DingBuffered db = new DingBuffered(new FileReader(new File("d:/users.txt")));
			String str = "";
			while((str = db.readLine()) != null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
/**
 * ͨ����ȥ��ǿ����
 * �ŵ㣺�������
 * ȱ�������Ҫ��ͬһ������ʵ�ֲ�ͬ����ǿ���������ܶ���ô��ǿ����ͺܶࡣ�ܷ�����,ʹ�ò����̳е���ϵ�����Ӵ�
 * class DingBuffered1 extends BufferedReader{}
 * class DingBuffered2 extends BufferedReader{}
 * class DingBuffered3 extends BufferedReader{}
 * class DingBuffered4 extends BufferedReader{}
 * ....�ͺܷ�����
 * @author www.23.com
 *
 */
class DingBuffered extends BufferedReader{
	private int step = 0;
	public DingBuffered(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public String readLine() throws IOException{
		String str = super.readLine();
		if(str != null){
			str = (++step) + str;
		}
		return str;
	}
	
	 public void close() throws IOException{
		 super.close();
		 step = 0;
	 }
	
}



/**
 * װ�������ģʽ����
 * 1.��װ������ڲ�ά��һ����װ��������á�
 * 2.���캯��ʵ������װ���ࡣ
 * A+B��������?
 * 3.�����Ƕ���һ����ͬ�ĸ���BufferedReader
 * 4.���ʱ����ΪAB����BufferedReader����������A B �Ĺ��췽�������໥���ݡ�
 */
//װ����
//A
class ZSClass extends BufferedReader{
	BufferedReader bf = null;
	public ZSClass(BufferedReader bf){
		super(bf); //�����û���κ�������Ϊ���ô��벻����
		this.bf = bf;
	}
	public String readLine() throws IOException{
		String str = bf.readLine();
		if(str != null){
			str += "hi";
		}
		return str;
	}
	public void close() throws IOException{
		bf.close();
	}
}

//B
class ZSClassWorld extends BufferedReader{
	BufferedReader bf = null;
	public ZSClassWorld(BufferedReader bf){
		super(bf);//�����û���κ�������Ϊ���ô��벻����
		this.bf = bf;
	}
	public String readLine() throws IOException{
		String str = bf.readLine();
		if(str != null){
			str += " world";
		}
		return str;
	}
	public void close() throws IOException{
		bf.close();
	}
}