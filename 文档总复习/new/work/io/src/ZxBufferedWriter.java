import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �����Ч�ʺ���չ��FileWriter�Ĺ���
 * --------------------
 * Writer 
 *     |----FileWriter
 *     |----BufferedWriter
 * 
 * ��չ��FileWriter�Ĺ���
 * newLine()
 * bw.write("admin");
   bw.newLine();
   bw.write("admin");
   �������˵���˾���������֮����˻��з�
 ���ļ����/r/n����
 *     
 * ���еĻ������ڲ���Ϊά����һ��8192�ֽڵ����飬�ַ������ַ����飬�ֽڵ����ֽ�����,���ҿ���ͨ�����췽��ָ����ʼ�����С��
 * 
 * ��ֻ��һ���������Ǿ���FileWriter ����Ȼ���ǻ������������ڲ�ά����һ��1024�ֽڵ��ַ����飬�̳���Writer ���ࡣ
 * 
 * 
 * ֻҪ���л�����������������һ����ͬ�ص㣬������ʹ��write��������д�룬����ʹ��flush ���߻����������ˣ������ǹرա�
 * 
 * ��ϰ���ӣ����û���¼ע��
 */

/**
 * @author www.23.com
 * 
 */
public class ZxBufferedWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("d:/ding.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(fl);
			bw = new BufferedWriter(fw);
			 
			bw.write("admin");
			bw.newLine();
			bw.write("admin");
			
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
