/**
 * Properties 配置文件类 --它是数据集合体系的类是map体系中的,它继承自HashTable 不建议使用put 建议使用setProperties。
 * 主要用生成配置文件，与读取配置文件信息的。
 * 
 * 要注意的细节
 * 1.如果配置文件一旦使用了中文，就只能store方法生成配置文件的时候只能使用字符流解决。 字节流用的是iso8859-1存储的，这时候会有乱码
 * 2.读出来修改后，需要在写回去否则不生效的。
 * 3.问为什么不使用put因为put可以任意类型，在写的时候会有问题类型强转错误。它会把所有数据转字符串。所以还是用setProperties比较妥当。键值都只能是字符串的。
 * 
 * 
 * 设置值
 * setProperty("key","value");
 * getProperty("key");
 */
package propertiess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Propertiess {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties pt = new Properties();
		pt.setProperty("大", "haha1");
		pt.setProperty("admin2", "haha2");
		pt.setProperty("admin3", "haha3");
		
		/*Set<Map.Entry<Object,Object>> s = pt.entrySet();
		Iterator<Entry<Object, Object>> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getKey());
		}*/
		
		//使用Properties生成配置文件
		//store
		//out - 输出流。
		//comments - 属性列表的描述 就是列的说明例如配置文件中[option]就是这块内容
		
		//pt.store(new FileOutputStream(new File("d:/needDelete.txt")), "test");
		//pt.store(new FileWriter("d:/needDeletesd.txt"), "老");//在处理中文的时候用这个，注意第二个参数要是英文的中文有问题
		
		// 读取配置文件信息 --load 字节流和字符流
		Properties read  = new Properties();
		read.load(new FileReader("d:/needDeletesd.txt"));
		
		Set<Map.Entry<Object,Object>> s = read.entrySet();
		for(Map.Entry<Object, Object> s1 : s){
			read.replace(s1.getKey(), s1.getKey()+"admin");
			System.out.println(s1.getValue());
			
		}
		
		//修改信息
		//修改的后然后在写回去。 用store在写回去。否则无法起到修改
		
	}

}
