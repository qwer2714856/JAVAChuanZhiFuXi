/**
 * Map 迭代
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
		//Map 集合中所有键保存到set集合类型中保存 -- 缺点，只返回了键没有返回值
		/*Set<String> s = mp.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//Map values 返回所有的值保存到Collection中去 缺点只能取到值没有键
		/*Collection<String> str = mp.values();
		Iterator<String> it = str.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//Map entrySet Entry是Map的静态内部类
		/*Set<Map.Entry<String, String>> st  = mp.entrySet();
		Iterator<Map.Entry<String, String>> it = st.iterator();
		while(it.hasNext()){
			Map.Entry<String,String> ets = it.next();
			System.out.println(ets.getValue());
		}*/
	    
	    //测试泛型组合
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
