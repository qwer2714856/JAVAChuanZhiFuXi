/**
 * Map ����
 * keySet
 * values
 * entrySet
 * 
 */
package shuanglijihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author www.23.com
 *
 */
public class DieDai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("name", "luchao");
		mp.put("age", "18");
		//Map ���������м����浽set���������б��� -- ȱ�㣬ֻ�����˼�û�з���ֵ
		/*Set<String> s = mp.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//Map values �������е�ֵ���浽Collection��ȥ ȱ��ֻ��ȡ��ֵû�м�
		/*Collection<String> str = mp.values();
		Iterator<String> it = str.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//Map entrySet Entry��Map�ľ�̬�ڲ���
		/*Set<Map.Entry<String, String>> st  = mp.entrySet();
		Iterator<Map.Entry<String, String>> it = st.iterator();
		while(it.hasNext()){
			Map.Entry<String,String> ets = it.next();
			System.out.println(ets.getValue());
		}*/
	    
	    //���Է������
	    ArrayList<MapReduce<String, String, String, String, String>> s = new ArrayList<MapReduce<String, String, String, String, String>>();
	    
	}

}
interface ll<K,V>{
	public void mml(K s, V y);
}
class MapReduce<L,M,Y,K,V> implements ll <K,V>{
	K key;
	V value;
	public void mml(K s, V y) {
		// TODO Auto-generated method stub
		
	}
}
