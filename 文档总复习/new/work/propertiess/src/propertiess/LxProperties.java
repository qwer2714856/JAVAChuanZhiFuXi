package propertiess;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class LxProperties {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties pt = new Properties();
		
		pt.setProperty("admin1", "1");
		pt.setProperty("admin2", "2");
		pt.setProperty("admin3", "3");
		pt.setProperty("admin4", "4");
		pt.setProperty("中文", "4");
		
		//将双例集合变为单例集合
		Set<Map.Entry<Object,Object>> s = pt.entrySet();
		//打印出键值对
		//使用foeach
		for(Map.Entry<Object,Object> m : s){
			System.out.println(m.getKey());
		}
		//使用iterator
		Iterator<Entry<Object, Object>> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getKey());
		}
		
		System.out.println("writing now ......");
		
		//字节流方式写入
		pt.store(new FileOutputStream("d:/del1.txt"), "test");
		
		//字符流方式写入
		pt.store(new FileWriter("d:/del2.txt"), "test");
		
		//读取出来
		Properties read = new Properties();
		read.load(new FileReader("d:/del2.txt"));
		
		//采用foreach遍历
		Set<Map.Entry<Object,Object>> rd = read.entrySet();
		for(Map.Entry<Object,Object> s1 : rd){
			System.out.println(s1.getKey());
		}
	}

}
