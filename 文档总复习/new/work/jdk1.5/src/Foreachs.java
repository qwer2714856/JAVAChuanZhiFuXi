import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * jdk1.5 Collection �ĸ��ӿ� Iterable
 * Iterable ʵ������ӿڵĿ���ʹ��foreach
 * 
 * ��ǿforѭ��
 * foreach
 * �򻯵���������д��ʽ
 * for(�������� ������:����Ŀ��){   �ײ㻹��ʹ�õ���������,jvm ��ȡ�ĵ�����������ʹ��for������ʱ��׼ʹ�ö���Լ���Ԫ�ظ��������޸ġ�
 * 
 * }
 * 
 * ֻ�������ڵ������Ϻ�����
 * ˫��������ÿ���ͨ��Collection�ļ�����ʵ�֡�
 * 
 * for ��ǿ�͵�������������ʲô��
 * ������������for������
 *   ���ܣ�
 *   for��ǿ����ʹ�õ�������һЩ������
 *   �����������remove for��ǿ��û��ʹ�á�
 * ��ͨforѭ����������ǿfor��һ�������������ӡ���hello world for��ǿ�Ͳ���ø㣬���ǿ�����������顣
 * ��ͨ����û�б�����Ŀ�꣬��for��ǿҪ�еġ�
 * 
 * 
 */

/**
 * @author www.23.com
 *
 */
public class Foreachs {
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		System.out.println(hs);
		/*Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//ʹ��foreach���� -- for ������д��
		/*for (String str : hs) {
			System.out.print(str);
		}*/

		
		/*int [] a = {1,2,3,4};
		for (int i : a) {
			System.out.println(i);
		}*/
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("a", "b");
		
		Set<Map.Entry<String, String>> et = hm.entrySet();
		for(Map.Entry<String, String> e:et){
			System.out.println(e.getValue());
		}
		
	}

}
