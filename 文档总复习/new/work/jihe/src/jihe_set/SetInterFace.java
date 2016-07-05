/**
 * Collection
 *     set  无序，不可重复
 *         实现类
 *         AbstractSet, ConcurrentSkipListSet, CopyOnWriteArraySet, EnumSet, HashSet, JobStateReasons, LinkedHashSet, TreeSet
 * 这里的无序是添加元素的顺序和出来的顺序是不一致的。
 * 不可重复是由于用的key value所以不能重复的key    
 * 
 * 特有的方法
 * 没有都在Collection
 * 
 * 主要要学两个实现类
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
		//输出的和添加的顺序不一致 
		//元素不可以重复，如果重复添加这个时候add返回的就是个false
		Set set = new HashSet();
		set.add("张三1");
		set.add("张三2");
		set.add("张三3");
		set.add("张三4");
		set.add("张三4");
		System.out.print(set.add("张三4"));
		System.out.print(set);
		
		
	}

}
