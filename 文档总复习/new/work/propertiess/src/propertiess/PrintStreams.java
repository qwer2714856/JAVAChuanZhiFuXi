/**
 * ��ӡ��
 * PrintStream
 * Ϊʲô�����������Ϊ����ͨ��FileOutputStream writeд����ʱ�����һ�����鷳�����署�������д������97 ��ô�Ҿ�Ҫ "97".getBytes()
 * 
 * ��ӡ�����Դ�ӡ�������͵����ݣ����Ҵ�ӡ����֮ǰ�����Ȱ�����ת���ַ����ڴ�ӡ��
 * 
 * 
 * ����
 * 1.�����ǰ���Щ����ת�����ַ����ڴ�ӡ��
 * 2.�ռ���־��Ϣ
 * 3.�ı�Ĭ�ϵĿ���̨��ӡ
 */
package propertiess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author www.23.com
 *
 */
public class PrintStreams {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//��ӡ�����Դ�ӡ�κ��������� �κ����ݶ���ת�ַ����ڴ�ӡ��
		File file = new File("d:/a.txt");
		PrintStream ps = new PrintStream(file);//�����Ҫ׷�ӵĻ�����ʱ����FileOutputStream.��ʱ�������׷��
		ps.print(false);
		ps.print(97);
		ps.print("���");
		ps.print(new PrintStreams());
		
		// Ĭ�ϱ�׼������������̨����ġ� System.out  ����̨����������޵Ļᶪʧһ����
		System.setOut(ps);//�޸������������ �������ñ�׼��������� ���·���
		System.out.println("niubi"); //��ʱ����Ϊ�ı�����������ȥfile�� ��
		
		//�ռ���־��Ϣ
		while (true) {
			try {
				int c = 4 / 0;
			} catch (Exception e) {
				e.printStackTrace(ps);
			}
		}
		
	}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return "aaa";
}
}
