/**
 * Ϊʲô��˫�����ϣ�
 * ��ʵ������ʲô�����ǳɶԳ��ֵģ����ޡ�һ��Կ�׶�Ӧһ������
 * �ɶԵ���ӳ���ϵ
 * һ��key��Ӧ��һ��value --��ֵ��
 * 
 * ���ӿ�Map
 * ����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ��
 * 		
 * -------------------MAP ���ʵ����MAP�ӿڵ�ʵ���� �ص�洢���ص㶼�Ѽ�ֵ�Դ��ڵġ������ظ�ֵ�����ظ�
 * 					  | HashMap
 * 					  | TreeMap
 * 					  | HashTable
 * ѧ������ʵ����   �㶨��Щ�����͸㶨MAP��
 * MAP
 * �ķ���
 * 
 * ��
 * put(K key, V value) ��ָ����ֵ���ӳ���е�ָ������������ѡ��������
 * putAll(Map<? extends K,? extends V> m) ��ָ��ӳ���н�����ӳ���ϵ���Ƶ���ӳ���У���ѡ������
 * ɾ
 * clear() �Ӵ�ӳ�����Ƴ�����ӳ���ϵ����ѡ��������
 * remove(Object key) �������һ������ӳ���ϵ������Ӵ�ӳ�����Ƴ�����ѡ��������
 * ��
 * 
 * ��
 * get(Object key)  ����ָ������ӳ���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null��
 * size() ���ش�ӳ���еļ�-ֵӳ���ϵ����
 *
 *
 * �ж�
 * containsKey(Object key)  �����ӳ�����ָ������ӳ���ϵ���򷵻� true��
 * containsValue(Object value)  �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true��
 * equals(Object o)  �Ƚ�ָ���Ķ������ӳ���Ƿ���ȡ�
 * isEmpty()  �����ӳ��δ������-ֵӳ���ϵ���򷵻� true��
 * 
 * 
 * �ӵ��ܽ�
 * ע��˫����put �� ���� Set��add add�ظ��޷���ӷ���false,˫����put����ظ�ֱ�Ӹ��߸��ǣ����ߵķ��� ע����Ǳ�����ֻ��ֵ���ˡ�
 * 
 * 
 * put !!һ��ע�������滻ǰ���ֻ��ֵ�������䣡���� HashMap �� TreeMap����ע�� �Զ�����key����ظ�ֻ�ǻ�ֵ����ԭ����key
 */
package shuanglijihe;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author www.23.com
 *
 */
public class ShuangLie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,String>mp = new HashMap<String,String>();
		
		 
		
		////////////////////////////////////����//////////////////////////////////////////////////
	
		//���һkey һ��value,����ֵ�Ǽ����洢��ֵ���������һ������ô���ص���null������ǵڶ������Ǿͷ����ϴδ��ֵ 
		//mp.put("userName", "ding.luchao");
		//����һ����null
		//System.out.println(mp.put("userNames", "ding.luchao"));
		//���ڶ����÷��ص�һ�δ��ֵ�Դ����ƣ������η��صڶ��Σ�˭����˭����
		//System.out.print(mp.put("userName", "aaa"));
		
		/*
		 * putAll û�з���ֵ�����ý�һ��MAP����ϲ�����һ��MAP������ȥ ��������ظ�keyԪ�غ���ϲ�ǰ���
		 * mp.put("user", "d");
		Map<String,String>l = new HashMap<String,String>();
		l.put("a", "b");
		mp.putAll(l);//û�з���ֵ
		System.out.print(mp);*/
		
		////////////////////////////////////ɾ��//////////////////////////////////////////////////
		
		//���ݼ�ɾ��map�е����ݷ��ر�ɾ���Ե�ֵ,��������ڸü����صľ��Ǹ�null
		/*mp.put("ddd", "ll");
		System.out.println(mp.remove("ddds"));*/
		
		//clear() ����������� �޷���ֵ
		
		////////////////////////////////////��ȡ//////////////////////////////////////////////////
		/*
		 * ����������ڷ���null
		 * mp.put("ddd", "ll");
		System.out.println(mp.get("ddds"));*/
		
		/* ��ȡmap�����ֵ�Եĸ���
		 * mp.put("ddd", "ll");
		System.out.println(mp.size());*/
		
		////////////////////////////////////�ж�//////////////////////////////////////////////////
		/* �жϼ������Ƿ����ָ����key
		 * mp.put("ddd", "ll");
		System.out.println(mp.containsKey("ddd"));*/
		
		/* �ж�map�������Ƿ����ָ����ֵ
		 * mp.put("ddd", "ll");
		System.out.println(mp.containsValue("ddd"));*/
		
		/*
		 * �ж�map�Ƿ�Ϊ�� ��true ����false
		 * System.out.println(mp.isEmpty());*/
		/*mp.put(null, null); ���ǲ��յ�null null Ҳ����Ϊ��ֵ
		System.out.println(mp.isEmpty());*/
		
		//equals(Object o)  �Ƚ�ָ���Ķ������ӳ���Ƿ���ȡ�
		
		
		
	}

}
