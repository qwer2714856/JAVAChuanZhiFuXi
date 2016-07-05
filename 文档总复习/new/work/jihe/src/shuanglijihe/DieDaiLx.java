package shuanglijihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DieDaiLx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String>mp = new HashMap<String, String>();
		mp.put("name7", "chao7");
		mp.put("name6", "chao6");
		mp.put("name5", "chao5");
		mp.put("name4", "chao4");
		mp.put("name3", "chao3");
		mp.put("name2", "chao2");
		mp.put("name1", "chao1");
		
		//keySet 缺点只能返回键值没有value 返回类型是单例的Set
		/*Set<String> st = mp.keySet();
		Iterator<String> it = st.iterator();
		while(it.hasNext()){
			String stdata = it.next();
			System.out.println(stdata);
		}*/
		
		//values 缺点只能返回值不能返回键  返回值类型单例的Collection
		/*Collection<String> con = mp.values();
		Iterator<String> it = con.iterator();
		while(it.hasNext()){
			String its = it.next();
			System.out.println(its);
		}*/
		
		//ArrayList 需要一个泛型 类里面也定义了泛型应该怎么做？
		/*ArrayList<Cc<String, String, String, String>> ay = new ArrayList<Cc<String, String, String, String>>();
		ay.add(new Cc());
		Cc<String, String, String, String> l = ay.get(0);*/
		
		//双例的Map 推荐使用entrySet Entry这个类是Map的静态内部类
		/*Set<Map.Entry<String,String>> et =  mp.entrySet();
		Iterator<Entry<String, String>>  it = et.iterator();
		while(it.hasNext()){
			Entry<String,String> ets = it.next();
			System.out.println("key="+ets.getKey()+"--values="+ets.getValue());
		}*/
		
	}

}

interface Cx<A,B>{
	public void say(A a, B b);
}
class Cc<A,B,C,X> implements Cx<A,B>{
	public void say(A a, B b){
		
	}
}
