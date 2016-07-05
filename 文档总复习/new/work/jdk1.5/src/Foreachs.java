import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * jdk1.5 Collection 的父接口 Iterable
 * Iterable 实现这个接口的可以使用foreach
 * 
 * 增强for循环
 * foreach
 * 简化迭代器的书写格式
 * for(变量类型 变量名:遍历目标){   底层还是使用迭代器做的,jvm 获取的迭代器，所以使用for遍历的时候不准使用对象对集合元素个数进行修改。
 * 
 * }
 * 
 * 只能作用于单例集合和数组
 * 双例如果想用可以通过Collection的集合来实现。
 * 
 * for 增强和迭代器的区别是什么？
 * 迭代器能做的for能做吗？
 *   不能！
 *   for增强不能使用迭代器的一些方法。
 *   例如迭代器的remove for增强就没法使用。
 * 普通for循环能做的增强for不一定能做，例如打印五局hello world for增强就不大好搞，但是可以做搞个数组。
 * 普通可以没有遍历的目标，而for增强要有的。
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
		
		//使用foreach遍历 -- for 的特殊写法
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
