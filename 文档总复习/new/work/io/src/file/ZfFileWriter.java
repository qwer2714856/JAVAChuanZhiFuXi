/**
 * ����ַ���
 * Writer ���� ������
 * ----| FileWriter
 * ��FileOutputStream һ���������һ�����ַ�һ�����ֽڣ�����д������֡�
 * 
 * 
 * �ֽ������ַ�����������𣡣���
 * �ֽ����������ʱ�򲻹ر���Դ�ǿ���д��Ӳ�̵ġ�
 * �ַ����������ʱ�򲻹ر���Դ���޷�д��Ӳ�̵ġ�
 * Ϊʲô���޷�д�����ݣ�
 * ��Ϊ���ڲ�Ҳά����һ���ַ����飬�̳���Writer �ַ������С��1024. ����Ȼ���ǻ����൫����Ҳά����һ�����顣 �ͻ�����һ�������������ˢ��Ӳ��flush
 * �����ķ�ʽ���ǻ����������ˣ����߹ر���Դ��
 * 
 * ʹ��FileWriter ���Ŀ���ļ������ڻ��Զ�����Ŀ���ļ������Ŀ��������������������true��ɾ���ڲ��룬�����true����ĩβ�㡣
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
