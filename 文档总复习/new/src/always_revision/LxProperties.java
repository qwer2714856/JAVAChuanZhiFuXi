/**
 * 练习Properties
 */
package always_revision;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author www.23.com
 *
 */
public class LxProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		try {
			p.load(new FileReader("d:/a.txt"));
				
			/*Set<String> s = p.stringPropertyNames();
			Iterator<String> it = s.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}*/
			
			/*Set<Map.Entry<Object, Object>> e = p.entrySet();
			for(Map.Entry<Object, Object> ei : e){
				System.out.println(ei.getKey()+"="+ei.getValue());
			}*/
			
			p.store(new FileWriter("d:/a.txt"), "ding");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
