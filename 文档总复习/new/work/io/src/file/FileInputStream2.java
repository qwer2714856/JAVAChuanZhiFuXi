/**
 * 
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class FileInputStream2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("D:/java/day10/day20/��Ƶ/2FileInputStream��ȡ�ļ���ʽ��ѡ��.wmv");
		//�ȽϷ����л������ѹû�л����
		//noBufRead(fl);
		//bufRead(fl);
	}
	public static void noBufRead(File fl){
		long startTime = System.currentTimeMillis();
		//���ĸ��ļ������ܵ�
		FileInputStream fs = null;
		
		try {
			fs = new FileInputStream(fl);
			//�ӹܵ���ȡ����
			int binnary = 0;
			
			try {
				while((binnary = fs.read())!=-1){
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//�رչܵ�
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time is :" + (endTime - startTime));
	}
	public static void bufRead(File fl){
		long startTime = System.currentTimeMillis();
		FileInputStream fs = null;
		StringBuilder sb = null;
		try {
			fs = new FileInputStream(fl);
			
			//����������
			byte []by = new byte[1024];
			//�����ַ���������
			sb = new StringBuilder();
			
			//��ȡ����
			int len = 0;
			try {
				while((len = fs.read(by)) != -1){
					sb.append(new String(by, 0, len));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		//System.out.println(sb);
		System.out.println("time is :" + (endTime - startTime));
	}

}
