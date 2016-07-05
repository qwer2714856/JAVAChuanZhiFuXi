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
		pt.setProperty("����", "4");
		
		//��˫�����ϱ�Ϊ��������
		Set<Map.Entry<Object,Object>> s = pt.entrySet();
		//��ӡ����ֵ��
		//ʹ��foeach
		for(Map.Entry<Object,Object> m : s){
			System.out.println(m.getKey());
		}
		//ʹ��iterator
		Iterator<Entry<Object, Object>> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getKey());
		}
		
		System.out.println("writing now ......");
		
		//�ֽ�����ʽд��
		pt.store(new FileOutputStream("d:/del1.txt"), "test");
		
		//�ַ�����ʽд��
		pt.store(new FileWriter("d:/del2.txt"), "test");
		
		//��ȡ����
		Properties read = new Properties();
		read.load(new FileReader("d:/del2.txt"));
		
		//����foreach����
		Set<Map.Entry<Object,Object>> rd = read.entrySet();
		for(Map.Entry<Object,Object> s1 : rd){
			System.out.println(s1.getKey());
		}
	}

}
