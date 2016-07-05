/**
 * io ������쳣���� 
 * 1.�ر��ļ�����ŵ�finally ������ ���ұ��뱣֤�رձ�ִ�е���Ҳ��˵�������close���ţ���Ҫʹ������try catch �ڶ����ŵ���һ����finally����ȥ��ֹ��һ�����˵ڶ���û�취ִ�е���
 * 2.���ļ���ʱ�����IOException ��δ��� ?
 *   1. �������ֱ�����쳣 throw new RuntimeException(e); ˭�����׸�˭
 *   2. �׳�����ʱ�쳣����Ҫ�����߱��봦�� 
 *   Ϊ����ʹ����ʹ�ø������������������봦��ʹ����벻�����������
 *   �ܵ�����������Runtime...�������ӣ��õ�������Щ���룬�ֿ�����ֹ���������ִ������Ĵ����ˡ�
 * 3.�ڹر���Դ��ʱ���ж�һ�¹ܵ��Ƿ����ɹ����û�ɹ��ر�Ҳ��û�����ˡ�
 * if (fi != null) {
	fi.close();
    }
    4.io�ܵ��Ĺر�˳���ȿ���أ����ȹ�
    5.FileOutputStream ���ڵڶ�������ֻ�иձ�ʵ�������ã����ʵ������Ͼͣ��ڲ�����new�������һֻ����׷��
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
