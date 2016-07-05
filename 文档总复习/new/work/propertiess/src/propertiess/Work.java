/**
 * Properties ģ��һ����������½��������ɾ����
 */
package propertiess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author www.23.com
 * 
 */
public class Work {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub

		File fl = new File("d:/del.txt");
		int flg = 0;

		if (fl.exists() && fl.isFile()) {
			// read
			Properties pt = new Properties();

			pt.load(new FileReader(fl));
			//�����и���㷽��ʹ��getProperties
			//pt.getProperty("keyname");
			//pt.getProperty("keyname"); ������keyֵ�����ڽ����ص�ֵ��null ����ж����ͬ��key��ȡ�������һ����
			Set<Map.Entry<Object, Object>> et = pt.entrySet();
			for (Map.Entry<Object, Object> s1 : et) {

				flg = Integer.parseInt((String) s1.getValue());
				if (flg < 3) {
					flg++;
					save(flg+"");
				} else {
					System.out.println("three");
					System.exit(0);
				}

			}
		} else {
			save("1");
		}
		
	 
	}

	public static void save(String flg) throws IOException {
		Properties pt = new Properties();
		pt.setProperty("flg", flg);
		pt.store(new FileWriter("d:/del.txt"), "flg");
	}

}
