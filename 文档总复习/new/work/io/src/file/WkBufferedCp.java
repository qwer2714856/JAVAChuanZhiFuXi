/**
 * ������һ���Ƚ���Ҫ�ĸ��
 * read ������洫����� byte ���� ��ô��ʵ�����ݽ����뵽�ֽ�������ȥ��Ȼ�󷵻�ֵֵ�Ƕ�ȡ��ʵ�ʳ��ȡ�
 * Ȼ��
 * read �������ʲô��û�д�����ô����ʱ��ȡ��ʵ�����ݡ�
 * 
 * 
 */
package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class WkBufferedCp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedCp();
	}
	
	public static void BufferedCp(){
		File in = new File("D:\\java\\day10\\day20\\��Ƶ\\7.��������ֽ���.wmv");
		File ot = new File("D:\\java\\day10\\day20\\��Ƶ\\tmp\\7.��������ֽ���.wmv");
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		
		try {
			fin = new FileInputStream(in);
			fout = new FileOutputStream(ot);
			
			bin = new BufferedInputStream(fin);
			bout = new BufferedOutputStream(fout);
			
			byte []by = new byte[8192];
			int len = 0;
			try {
				while((len = bin.read(by)) != -1){
					bout.write(by, 0, len);
					//bout.flush(); ���ﲻˢ���Զ����˾���䣬Ȼ��ر�Ҳ��дһ��
				}
				System.out.println("ok");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {

			try {
				if (bout != null) {
					bout.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			} finally{
				if(bin != null){
					try {
						bin.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						throw new RuntimeException(e);
					}
				}
			}

		}
		
		
	}

}
