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
		
		//keySet ȱ��ֻ�ܷ��ؼ�ֵû��value ���������ǵ�����Set
		/*Set<String> st = mp.keySet();
		Iterator<String> it = st.iterator();
		while(it.hasNext()){
			String stdata = it.next();
			System.out.println(stdata);
		}*/
		
		//values ȱ��ֻ�ܷ���ֵ���ܷ��ؼ�  ����ֵ���͵�����Collection
		/*Collection<String> con = mp.values();
		Iterator<String> it = con.iterator();
		while(it.hasNext()){
			String its = it.next();
			System.out.println(its);
		}*/
		
		//ArrayList ��Ҫһ������ ������Ҳ�����˷���Ӧ����ô����
		/*ArrayList<Cc<String, String, String, String>> ay = new ArrayList<Cc<String, String, String, String>>();
		ay.add(new Cc());
		Cc<String, String, String, String> l = ay.get(0);*/
		
		//˫����Map �Ƽ�ʹ��entrySet Entry�������Map�ľ�̬�ڲ���
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
