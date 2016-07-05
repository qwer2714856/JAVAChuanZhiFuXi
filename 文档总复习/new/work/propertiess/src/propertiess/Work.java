/**
 * Properties 模拟一个软件如果登陆超过三次删除它
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
			//这里有个简便方法使用getProperties
			//pt.getProperty("keyname");
			//pt.getProperty("keyname"); 如果这个key值不存在将返回的值是null 如果有多个相同的key获取的是最后一个的
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
