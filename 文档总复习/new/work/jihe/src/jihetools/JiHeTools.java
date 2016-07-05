/**
 * ���Ϲ�����
 * Collections  --java.util ��
 * Collection �ǵ������ϵĸ��ӿ�
 * Collections �������϶���Ĺ�����
 * 
 * ����
 * 1.sort ���� return void
 * 2.Collections.binarySearch     ���ַ����ң��������ڲ���  return �ҵ��������ڵ��±����� û���ҵ��Ǹ���
 * 3.max 
 * 4.min
 * 5.reverse
 * 
 * 6.���������Ҫ�ﵽ�̰߳�ȫ��Ŀ��ʹ������
 * Set �� synchronizedSet(Set<T> s) ����
 * Map �� synchronizedMap(Map<T> s) ����
 * List�� synchronizedList(List<T> s) ˫��
 */
package jihetools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author www.23.com
 *
 */
public class JiHeTools {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		//���� sort   ��������ʱ��������Ԫ�ز��߱���Ȼ˳����Ҫʵ��Comparable comparaTo ���ߴ����Ƚ���ʵ��Comparator compare
		Collections.sort(al);
		ArrayList<cp> al2 = new ArrayList<cp>();
		al2.add(new cp("aaa9"));
		al2.add(new cp("aaa2"));
		al2.add(new cp("aaa3"));
		//Ԫ�ز��߱���Ȼ˳���������ʹ�������� ���list��
		Collections.sort(al2);
		Collections.sort(al2,new Comparator1());
		//��һ�������ź���ļ��ϣ��ڶ�������Ҫ���ҵ�key������Ҳ��������̬�����Ԫ�ز��߱���Ȼ˳����ô��Ҫ����һ���Ƚ���������Ԫ�ر�����ʵ��Comparable ���list
		System.out.println(Collections.binarySearch(al2, new cp("aaa2"), new Comparator1()));
		System.out.println(Collections.binarySearch(al2, new cp("aaa2")));
		System.out.println(al2);
		
		
		//���ֵ -- list ���Ԫ�ز��߱���Ȼ˳����ô��Ҫ����һ���Ƚ���������Ԫ�ر�����ʵ��Comparable
		System.out.println(Collections.max(al2,new Comparator1()));
		System.out.println(Collections.max(al2));
		//��Сֵ -- list ���Ԫ�ز��߱���Ȼ˳����ô��Ҫ����һ���Ƚ���������Ԫ�ر�����ʵ��Comparable
		System.out.println(Collections.min(al2,new Comparator1()));
		System.out.println(Collections.min(al2));
		
		//��ת -- list ����Ͳ���ҪComparable����Comparator�� �ܼ򵥾��������л���λ��
		Collections.reverse(al2);
		System.out.println(al2);
		
		//�����ּ��ϱ�Ϊ�̰߳�ȫ�ķ���
		//ArrayList ay = (ArrayList) Collections.synchronizedList(new ArrayList<String>());
		/*HashSet<String> hs = (HashSet)Collections.synchronizedSet(new HashSet<String>());
		TreeMap<String,String> tm = (TreeMap)Collections.synchronizedMap(new TreeMap<String,String>());*/
		
	}

}

class cp implements Comparable<cp>{
	String name;
	public cp(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public int compareTo(cp o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}
class Comparator1 implements Comparator<cp>{

	public int compare(cp o1, cp o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}	
}
