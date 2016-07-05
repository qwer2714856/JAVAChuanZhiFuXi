import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ַ���ÿ�ζ��Ƕ�ȡһ���������ַ��ģ�����
 * 
 * ����Ϊʲô���ַ����������ַ����ļ���������ֽڣ������޷��򿪡�����Ϊʲô�ᶪʧ������
 * System.out.println("��ǰJVM�ַ�����" + System.getProperty("file.encoding"));
 * 
 * ����Ҫ������������
 * 
 * JVM �ļ� ��� 
 * 
 * JVMĬ���õ���GBK�������ʹ��System.out.println("��ǰJVM�ַ�����" + System.getProperty("file.encoding"));���뵱ǰ�ַ���
 * 
 * A:�����ļ�
 * B:�����
 * C:JVM
 * 
 * C                     B                           A
 * 1.��C��ʼ��ȡ����A
 * 2.A�д�ŵĶ���һ�Ѷ���������
 * 3.��ȡA�е��ַ���B���������Ӧ�Ķ�Ӧֵ���������ַ��ҵ���Ӧ��ֵ�������������ֵ��Ȼ���������Щ�ǿյģ�Ҳ������ַ��޷��ҵ���Ӧ��ֵ ��Щδ֪���ַ�Ĭ��ռ
 * һ���ֽڣ�����ֵ����-12��ԭ����ֵ�����仯����ԭ��С�ˣ�������д���ʱ��ͳ��������ˣ���ԭ��С�ˡ�
 * 
 * 
 * 
 * 
 * ��ʱʹ���ַ�������ʱʹ���ֽ�����������ʲô��
 * ʹ���ַ�����Ӧ�ó���
 * �߱�����ͽ��������
 * �����д�ַ����ݵ�ʱ���ʹ���ַ������ܿ��ĵ�����ʶ�ġ�
 * ��ȡ��ʱ�򶼲�ѧҪת�����ַ���ʱ������ֽ�����
 * 
 * 
 * @author www.23.com
 * 
 */

public class ZfCpImgFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		File fi = new File("D:/java/day10/day21/��Ƶ/1.�����ַ���.wmv");
		File fo = new File("D:/java/day10/day21/��Ƶ/tmp/1.�����ַ���.wmv");

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(fi);
			fw = new FileWriter(fo);

			char[] buf = new char[1024];
			int len = 0;

			while ((len = fr.read(buf)) != -1) {
				fw.write(buf, 0, len);
			}
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				} finally {
					if (fr != null) {
						try {
							fr.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							throw new RuntimeException(e);
						}
					}
				}
			}
		}

	}

}
