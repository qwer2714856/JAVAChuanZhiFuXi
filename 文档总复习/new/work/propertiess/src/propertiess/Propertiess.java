/**
 * Properties �����ļ��� --�������ݼ�����ϵ������map��ϵ�е�,���̳���HashTable ������ʹ��put ����ʹ��setProperties��
 * ��Ҫ�����������ļ������ȡ�����ļ���Ϣ�ġ�
 * 
 * Ҫע���ϸ��
 * 1.��������ļ�һ��ʹ�������ģ���ֻ��store�������������ļ���ʱ��ֻ��ʹ���ַ�������� �ֽ����õ���iso8859-1�洢�ģ���ʱ���������
 * 2.�������޸ĺ���Ҫ��д��ȥ������Ч�ġ�
 * 3.��Ϊʲô��ʹ��put��Ϊput�����������ͣ���д��ʱ�������������ǿת�����������������ת�ַ��������Ի�����setProperties�Ƚ��׵�����ֵ��ֻ�����ַ����ġ�
 * 
 * 
 * ����ֵ
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
		pt.setProperty("��", "haha1");
		pt.setProperty("admin2", "haha2");
		pt.setProperty("admin3", "haha3");
		
		/*Set<Map.Entry<Object,Object>> s = pt.entrySet();
		Iterator<Entry<Object, Object>> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getKey());
		}*/
		
		//ʹ��Properties���������ļ�
		//store
		//out - �������
		//comments - �����б������ �����е�˵�����������ļ���[option]�����������
		
		//pt.store(new FileOutputStream(new File("d:/needDelete.txt")), "test");
		//pt.store(new FileWriter("d:/needDeletesd.txt"), "��");//�ڴ������ĵ�ʱ���������ע��ڶ�������Ҫ��Ӣ�ĵ�����������
		
		// ��ȡ�����ļ���Ϣ --load �ֽ������ַ���
		Properties read  = new Properties();
		read.load(new FileReader("d:/needDeletesd.txt"));
		
		Set<Map.Entry<Object,Object>> s = read.entrySet();
		for(Map.Entry<Object, Object> s1 : s){
			read.replace(s1.getKey(), s1.getKey()+"admin");
			System.out.println(s1.getValue());
			
		}
		
		//�޸���Ϣ
		//�޸ĵĺ�Ȼ����д��ȥ�� ��store��д��ȥ�������޷����޸�
		
	}

}
