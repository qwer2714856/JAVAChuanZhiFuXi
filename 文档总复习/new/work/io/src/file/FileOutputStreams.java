/**
 * OutputStream ����ֽ��� ������
 * �������Ǳ�ʾ����ֽ�����������ĳ��ࡣ�������������ֽڲ�����Щ�ֽڷ��͵�ĳ����������
 * ��Ҫ���� OutputStream �����Ӧ�ó������ʼ���ṩ����һ�ֿ�д��һ������ֽڵķ�����
 *     |----FileOutputStream ���ճ��������
 * ���ʹ�ã�
 * 1.�����ļ����� File��ʵ�����Ŀ���ļ�
 * 2.���������ͨ��
 * 3.д����
 * 4.�ر���Դ
 * 
 * 
 * ��ȡ��д���ʱ���ǰ�һ���ֽڽ��еġ�
 * ��ȡ����int Сת��
 * д���ʱ�����Ǵ�תС�������������write��int���Ͱ�λ�����ˡ�
 * 
 * 
 * �ֽ������ǰ��յ��ֽڽ��еģ����ֽڣ��ֽ�����Ҳ�ǰ��յ��ֽ�����ÿ�����ֽ�д��������
 * 
 * 
 * 
 * 
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class FileOutputStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File flout = new File("D:\\java\\day10\\day20\\��Ƶ\\tmp\\tmp.txt");
		FileOutputStream fo = null;
		
		try {
			fo = new FileOutputStream(flout);
			
			try {
				//ÿ��д��һ��int���ݣ��������д��һ���ַ�char�Զ�תint��Ϊʲô���±��򿪲��Ƕ���������Ϊ���±������ת���ˡ�
				//Ҳ����ʹ���ֽ����飬���ַ���ת�ֽ����顣
				//ע��ϸ��
				//1.û��Ŀ���ļ����Զ�������FileOutputStream(flout)���ļ����������������ļ�,���������д�����ݻ������ԭ�ļ����ݣ�����Ŀ¼���˲��С�
				/*String str = "hello worldsss";
				fo.write(str.getBytes());*/
				
				//2.FileOutputStream�������и�����ֵ�� �ڶ����������true�����ļ�ĩβд��fo = new FileOutputStream(flout,true); ʹ��������췽��
				//���ʱ�����׷������ ����뻻�о�\r\n������
				/*String str = "hello worldsss\r\n";
				fo.write(str.getBytes());*/
				
				//3.ʹ��FileOutputStream write д���ݣ���Ȼ���յ���һ��int�������ݣ�����д��ֻ��һ���ֽ����ݣ�ֻ�ǰѵͰ�λд��������24λȫ������������֮
				//�����������int�޷���8������λ��ʾ������ȫ��������
				//����5111���Ǵ򿪷��ֲ���5111���۳��˵Ͱ�λȫ�ӵ���
				//д���ֻ��1���ֽ��������ֽڶ����ˡ�
				fo.write(5111);
				
				//fo.write(byte [], 0, 2); ���ֽ�������ȡ������д�롣
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
