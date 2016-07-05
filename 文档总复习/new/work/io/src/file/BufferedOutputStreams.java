/**
 * BufferedOutputStream 
 * �ڲ�ά����һ��8KB���ֽ�����
 * ----------------|OutputStream
 * ---------------------|BufferedOputputStream
 * ���ֵ�Ŀ����Ϊ�����д���ݵ�Ŀ�ġ�
 * ע��ϸ��
 * 1������BufferedOutputStream д����write �����Ȱ�����д���ڲ�ά��8kb�����С�
 * 2���������Ҫ����������д��Ӳ����Ҫ����flush() ˢ�»��������������ڴ�����ˢ��Ӳ���ϡ�
 * 3.BufferedOutputStream �� close����Ҳ��ִ��flush�Ĳ��� �� close���� ���� �ڲ�����������Ҳ��ˢ��ȥ��Ӳ��
 * 
 * �����������д��Ӳ��
 * 1.flush
 * 2.close
 * 3.�ڲ�ά���Ļ�����������
 */
package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class BufferedOutputStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("d:/b.txt");
		FileOutputStream fo = null;
		BufferedOutputStream bo = null;
		try {
			fo = new FileOutputStream(fl);
			bo = new BufferedOutputStream(fo);
			 
			bo.write("aadmins".getBytes());
			//bo.flush();
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		finally{
			try {
				bo.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e1);
			}
		}
		
	}

}
