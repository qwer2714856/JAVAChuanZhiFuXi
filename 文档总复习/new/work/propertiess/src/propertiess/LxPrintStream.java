/**
 * ��ӡ��
 * PrintStream
 * 
 * Ϊʲô�����������Ϊ���������е�
 * ��ͨ�� FileOutputStream �������ʱ��������������һ��������ô�ᵱ�������ƴ���Ȼ����±��򿪵�ʱ��ᷢ�²��ԣ������Ҫ�����ַ���ôֻ��"97".getBytes()�ſ���
 * 
 * �ŵ�
 * 1.���Դ�ӡ�κ��������ͣ��ڴ�ӡ��ʱ��ע��һ����������е���������ת��Ϊ�ַ�����
 * 2.�����Ҫ׷�ӵĻ�����Ҫ������FileOutputStream
 * 3.�ı�Ĭ��System.out����������
 * 4.��������־������ļ�
 */
package propertiess;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author www.23.com
 *
 */
public class LxPrintStream {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream(new FileOutputStream("d:/a.txt",true));
		
		ps.print("admin");
		ps.println(false);
		ps.println(3.14);
		
		System.setOut(ps);
		System.out.println("this is test");
		
		try{
			int i =  4 / 0;
		} catch(Exception e){
			e.printStackTrace(ps);
		}
	}

}
