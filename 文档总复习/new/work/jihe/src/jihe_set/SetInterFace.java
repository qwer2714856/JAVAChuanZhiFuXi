/**
 * Collection
 *     set  ���򣬲����ظ�
 *         ʵ����
 *         AbstractSet, ConcurrentSkipListSet, CopyOnWriteArraySet, EnumSet, HashSet, JobStateReasons, LinkedHashSet, TreeSet
 * ��������������Ԫ�ص�˳��ͳ�����˳���ǲ�һ�µġ�
 * �����ظ��������õ�key value���Բ����ظ���key    
 * 
 * ���еķ���
 * û�ж���Collection
 * 
 * ��ҪҪѧ����ʵ����
 * HashSet
 * TreeSet
 * 
 */
package jihe_set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author www.23.com
 *
 */
public class SetInterFace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ĺ���ӵ�˳��һ�� 
		//Ԫ�ز������ظ�������ظ�������ʱ��add���صľ��Ǹ�false
		Set set = new HashSet();
		set.add("����1");
		set.add("����2");
		set.add("����3");
		set.add("����4");
		set.add("����4");
		System.out.print(set.add("����4"));
		System.out.print(set);
		
		
	}

}
