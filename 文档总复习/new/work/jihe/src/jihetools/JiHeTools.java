/**
 * 集合工具类
 * Collections  --java.util 包
 * Collection 是单例集合的根接口
 * Collections 操作集合对象的工具类
 * 
 * 方法
 * 1.sort 排序 return void
 * 2.Collections.binarySearch     二分法查找，先排序在查找  return 找到返回所在的下表索引 没有找到是负数
 * 3.max 
 * 4.min
 * 5.reverse
 * 
 * 6.如果集合需要达到线程安全的目的使用如下
 * Set 的 synchronizedSet(Set<T> s) 单例
 * Map 的 synchronizedMap(Map<T> s) 单例
 * List的 synchronizedList(List<T> s) 双例
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
		//排序 sort   如果排序的时候如果这个元素不具备自然顺序需要实现Comparable comparaTo 或者创建比较器实现Comparator compare
		Collections.sort(al);
		ArrayList<cp> al2 = new ArrayList<cp>();
		al2.add(new cp("aaa9"));
		al2.add(new cp("aaa2"));
		al2.add(new cp("aaa3"));
		//元素不具备自然顺序，这里可以使用这两种 针对list的
		Collections.sort(al2);
		Collections.sort(al2,new Comparator1());
		//第一个参数排好序的集合，第二个参数要查找的key，这里也是两种形态，如果元素不具备自然顺序那么需要传入一个比较器或者让元素本身类实现Comparable 针对list
		System.out.println(Collections.binarySearch(al2, new cp("aaa2"), new Comparator1()));
		System.out.println(Collections.binarySearch(al2, new cp("aaa2")));
		System.out.println(al2);
		
		
		//最大值 -- list 如果元素不具备自然顺序那么需要传入一个比较器或者让元素本身类实现Comparable
		System.out.println(Collections.max(al2,new Comparator1()));
		System.out.println(Collections.max(al2));
		//最小值 -- list 如果元素不具备自然顺序那么需要传入一个比较器或者让元素本身类实现Comparable
		System.out.println(Collections.min(al2,new Comparator1()));
		System.out.println(Collections.min(al2));
		
		//翻转 -- list 这个就不需要Comparable或是Comparator了 很简单就在数组中换换位置
		Collections.reverse(al2);
		System.out.println(al2);
		
		//将三种集合变为线程安全的方法
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
