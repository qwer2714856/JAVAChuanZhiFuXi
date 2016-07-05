/**
 * �ֽ�����д���ıȽ��鷳����ʹ���ַ���
 * �ֽ����Ƕ����Ƶ��ֽڣ�������롣
 * 
 * �ַ��� --�ַ�����Ѷ����� ���н������롣
 * �����ַ��� 
 * ����Reader ������
 *     |----FileReader ��ȡ�ļ��������ַ���
 * FileReader�÷���FileInputStreamһ��
 * 
 * �����
 * ����Ϊ���У�һ���ַ�����ֵ
 * a        97
 * b        98
 * ����������
 * 
 * ascii ��  
 * ʹ��һ���ֽڱ�ʾ�� һ���ֽڣ�7λ��  һ�����ԷŶ������� 2^8 ������ -128~127�����������˵��ַ�256�ò��꣬����ֻ����8λ�е�7λ2^7 �����˵ı�
 * ascii ��256�����ӣ����кܶ�ո��ӣ���Щ��û�ж�Ӧ�ַ��ģ���Ϊ�����ò��ˡ�
 * 
 * ����ŷ���ֳ����� iso8859-1 ������� Ҳ��ʹ��һ���ֽڵ�
 * iso8859-1 ��� ���ascii���ʣ��ĸ��ӽ��в��䣬�����������Ҫ��һЩ��һЩ������š�
 * 
 * �й������GB2312Ӣ�Ļ���ռ1���ֽڣ�����ռ�����ֽڡ�
 * ������������Ϊ��������������޷���ʾ�������������Ƨ�֡�GBK Ӣ�Ļ���һ�����Ļ���2���ֽڣ����ǻ�û���꣬���кö�ո�
 * 
 * ����Ϊ��ͳһ��������������UTF-8 �����ֽڱ�ʾ�������������ַ������⡣Ӣ�Ļ���1��������3��
 * 
 * ���е����Ӣ�Ķ�ռһ���ֽڣ�Ӣ���������ֶ���ͨ�õġ�
 * ���Ĳ��ǵ�ͳһ�ģ�������GBK2������UTF-8���������޷�����
 * 
 * 
 * ���ֽ�����ȡ������һ���ֽ��ֽڶ���Ĭ����GBK����2���ֽ����Զ�һ���޷�������ʾ����������
 * 
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class ZfDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("d:/c.txt");

		FileReader fr = null;

		try {
			fr = new FileReader(fl);
			int l = 0;
			char [] c = new char[1024];//�����ַ�����
			while ((l = fr.read(c)) != -1) {
				System.out.println(new String(c,0,l));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		//readChina();
	}
	/**
	 * ���ֽ��������� ���string���ԣ�д��������ַ�����getbyteҲ���ԣ��������������Ӣ��Ͼ��������е�1���ֽ��е�2��
	 * ����ʵ���Ƕ�û�취ֱ�Ӷ�ȡ���ǽ�����string �� string�ķ��� getbytes GBK����2�ֽ� UTF-8 �����ֽ�
	 * 
	 * 
	 * �ַ� -> �ֽ�  �Ǳ���Ĺ���
	 * �ֽ� -> �ַ�  ����
	 * 
	 * ���ļ���ʱ����һ�Ѷ�������Ӧ�ó���Ĺ��ܣ���������롣
	 * 
	 * �ֽ������ܲ������ġ�
	 */
	public static void readChina(){
		File fl = new File("d:/c.txt");
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(fl);
			
			byte [] by = new byte[1024];//���ֻ��ȡһ����Ҫ�� byte [] by = new byte[2] ������Ҫ��ȡ2���ֽڲ��ܶ�ȡ��ȷ���ģ���Ϊ������GBK��2���ֽ�
			int len = 0;
			try {
				while((len = fin.read(by)) != -1){
					//�ֽ�ֱ��ת�ַ�����������û������ġ�
					System.out.println(new String(by,0,len));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			} 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally{
			if(fin != null){
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				}
			}
		}
		 
	}
}
