/**
 * 集合
 * Object 类型的数组可以存储任意引用的数据类型
 * 为什么要学集合
 * 例如搜索公司人爱好
 * 用数组比较麻烦，因为人数是不固定的。人数是可变的，动态的东西数组解决不了
 * 集合（容器）
 * 集合是存储对象数据的集合容器。
 * 
 * 对象比数组 
 * 优势
 * 1集合可以存储任意类型对象数据
 * 数组只能存储同一种数据类型的数据。Object数组除外
 * 2集合的长度是发生变化的
 * 数组的长度是固定的
 * 集合用的比较多
 * 
 * 集合在java.util包里面
 * Collection 【单例接口的根接口，层次结构 中的根接口】。Collection 表示一组对象，这些对象也称为 collection 的元素。一些 collection 允许有重复的元素，而另一些则不允许。一些 collection 是有序的，而另一些则是无序的。JDK 不提供此接口的任何直接 实现：它提供更具体的子接口（如 Set 和 List）实现。此接口通常用来传递 collection，并在需要最大普遍性的地方操作这些 collection
 * 集合分为
 * Collection -|根接口 容器最基本规范
 *             list  拓展的子接口   如果继承了list 可存有序可重复
 *             set   拓展的子接口   如果继承了set  可存无序不可重复
 * Collection 接口不能new 可以用实现类操作
 * Collection a = new ArrayList()
 * 所有已知实现类：
 * AbstractCollection, AbstractList, AbstractQueue, AbstractSequentialList, AbstractSet, ArrayBlockingQueue, ArrayDeque, ArrayList, AttributeList, BeanContextServicesSupport, BeanContextSupport, ConcurrentLinkedQueue, ConcurrentSkipListSet, CopyOnWriteArrayList, CopyOnWriteArraySet, DelayQueue, EnumSet, HashSet, JobStateReasons, LinkedBlockingDeque, LinkedBlockingQueue, LinkedHashSet, LinkedList, PriorityBlockingQueue, PriorityQueue, RoleList, RoleUnresolvedList, Stack, SynchronousQueue, TreeSet, Vector 
 * Collection
 * 
 * 容器是管理对象的
 * 而像int, char这样的是基本数据类型，并不是对象
 * 对于基本数据类型你想保存可以用数组
 * 
 * 增
 * add
 * addAll
 * 删
 * clear
 * remove
 * removeAll
 * retainAll
 * 改
 * 
 * 查
 * size
 * 
 * 迭代
 * iterator
 * toArray
 * 判断
 * contains
 * containsAll
 * equals
 * isEmpty
 * 
 */
package jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
class p{
	String name;
	int age;
	int id;
	public p(String name, int age, int id){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	public boolean equals(Object str) {
		// TODO Auto-generated method stub
		int id = 0;
		if(str instanceof p){
			id = ((p) str).id;
		}
		return this.id == id;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
/**
 * @author www.23.com
 *
 */
public class Jihe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Object[] arr = new Object[10];*/
		Collection c = new ArrayList();
		//添加
		c.add("1.1d");//添加数据，只能是引用类型 return boolean
		c.addAll(c);//把一个集合添加都另一个集合中去，像是集合合并 return boolean
		
		//删除
		//c.clear();//清空集合中的元素 return void
		//c.remove("1.1d");//删除指定的对象 return boolean 如果没有删除就返回false
		//c.removeAll(c);//从一个集合里面删除另外一个集合（删除两个集合的交集元素--删的是调用者的） return boolean 如果没有删除就返回false
		//c.retainAll(c);//保留交集元素，其它非交集元素删掉。如果没有删除就返回false return boolean
		
		//查看
		//c.size();//查看元素个数
		
		//判断
		//isEmpty() 判断集合是否为空元素 return boolean
		//contains() 判断一个集合是否包含一个对象 return boolean 自定义类的要重写equals 因为ArrayList内部在使用equals
		//containsAll()  判断一个集合是否包另一个集合的所有元素 少一个都为false
		/*c.add(new p("aa",18,1001));
		System.out.println(c.contains(new p("aa",18,1002))); //contains 内部依赖equals比较的是内存地址所以要重写
		
		
		
		 * 
		 *比较此 collection 与指定对象是否相等。
当 Collection 接口没有对 Object.equals 的常规协定添加任何约定时，“直接”实现该 Collection 接口（换句话说，创建一个 Collection，但它不是 Set 或 List 的类）的程序员选择重写 Object.equals 方法时必须小心。没必要这样做，最简单的方案是依靠 Object 的实现，然而实现者可能希望实现“值比较”，而不是默认的“引用比较”。（List 和 Set 接口要求进行这样的值比较。）

Object.equals 方法的常规协定声称相等必须是对称的（换句话说，当且仅当存在 b.equals(a) 时，才存在 a.equals(b)）。List.equals 和 Set.equals 的协定声称列表只能与列表相等，set 只能与 set 相等。因此，对于一个既不实现 List 又不实现 Set 接口的 collection 类，当将此 collection 与任何列表或 set 进行比较时，常规的 equals 方法必须返回 false。（按照相同的逻辑，不可能编写一个同时正确实现 Set 和 List 接口的类。）

覆盖：
类 Object 中的 equals
参数：
o - 要与此 collection 进行相等性比较的对象。
返回：
如果指定对象与此 collection 相等，则返回 true
另请参见：
Object.equals(Object), Set.equals(Object), List.equals(Object) 
		 * 
		 *
		System.out.println(c.equals(new p("",1,1))); //
		
*/		
		
		//迭代 toArray();
		/*Object[] a = c.toArray();//注意返回的是object的数组，因为里面的对象不定，所以需要Object来接受。
		System.out.println(Arrays.toString(a));*/
	    
		 
	}

}
