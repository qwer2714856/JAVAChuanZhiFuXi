/**
 * ���������ֽ������� ����Ч�ʶ�ȡ�ļ�
 * InputStream �����ֽ����Ļ���
 *     |---- FileInputStream �ļ�������
 *     |---- ֻҪ�ǻ���Ķ�����Buffer��ͷ�� ���������ֽ�����  BufferInputStream Ϊ����߶�ȡ�ļ���Ч�ʣ��ڲ�ά����һ���ֽ����飬Ĭ����8K��
 * ע��
 * 1.Buffer ���յ���һ��InputStream
 * 2.����ʹ����Buffer�����������߱���д������ 
 * ���ʣ�
 * 	1.ΪʲôҪ����InputStream ��Ϊbuffer�����߱���д������������Ҫ�����ж�ȡ�����Ķ���(InputStream)��
 * 	2.�����ڹرյ�ʱ��رյ��� InputStream
 * 	3.Ч�ʸߴ��ĸߣ�  �ڲ�ά����һ�����飬�����Ƚ�һ���ֵ��ڴ棬���Զ�ȡ��ʱ���Ƕ��ڴ�Ĳ���������Ч�ʸߡ����ڴ����鲻����ʱ��Ż�ȥӲ���ڶ�һ���֡������൱�ڶ��ڴ�ֱ�Ӷ�ȡ�����ľ�����8K���ֽ����顣
 * 
 * 3.ʵ����bf��close�õ���InputStream
 * ����Ҳ����bf.close()ʵ���Ϲص���InputStream
 * 
 * ������Լ������Ļ����ֽ�����ʹ���ĸ���
 * ʹ���Լ��������Ǹ���Ч�ʸߡ�
 * ��Ϊʹ��java��Buffer�����ڶ���ʱ��ÿ�ζ�Ҫ�жϡ�����Ч�ʵ͡�
 * 
 * 
 * ����
 * 1.�ҵ���Դ�ļ�
 * 2.����ͨ��
 * 3.��������
 * 4.��ȡ����
 * 5.�ر�
 */
package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 * 
 */
public class BufSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cp();
		
		//read data
		readData();
	}

	public static void cp() {

		File finput = new File("D:/java/day10/day20/��Ƶ/6.�� �����ֽ���.wmv");
		File op = new File("D:/java/day10/day20/��Ƶ/tmp/6.�� �����ֽ���.wmv");

		FileInputStream is = null;
		FileOutputStream os = null;

		try {
			is = new FileInputStream(finput);
			os = new FileOutputStream(op);

			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = is.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			System.out.println("writed");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			} finally {
				try {
					if (is != null) {
						is.close();
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}

	}
	public static void readData(){
		File fi = new File("d:/cc.txt");
		BufferedInputStream bf = null;
		
		try {
			
			bf = new BufferedInputStream(new FileInputStream(fi));
			
			int content = 0;
			while((content = bf.read()) != -1){
				System.out.print((char)content);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
