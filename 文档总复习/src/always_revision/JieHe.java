/**
 * 集合
 * 什么是集合
 * 存储对象的容器，面向对象语言操作的都是对象，所以为了操作多个对象，存储对象出现了集合。	
 * 集合的出现是为了存储对象，集合可以存储任意对象，长度不固定。 数组必须存储指定类型和固定长度。当存储基本数据类型用的是装箱。
 * 
 * 集合和数组的区别
 * 相同点：集合和数组都是容器
 * 不同点：数组是固定长度的，数组的存储单位是唯一，数组可以存基本数据类型。
 * 		  集合的长度不固定，集合的存储单位可任意，集合存储基本类型是以基本类型所存在的对象存储的（基本数据类型的装箱）。
 * 
 * 数组缺点：
 * 类型固定，长度固定 都是在声明固定，不可变。
 * 
 * 
 * 集合做什么
 * 1.添加对象到集合
 * 2.删除集合中的对象
 * 3.在集合和中查询对象
 * 4.更新集合中对象
 * 
 * 不过是数组也好集合也好，如果存储对象都是存储的是对象引用地址。
 * 
 * 集合体系
 * Collection 顶层
 *     |----单列集合
 *         |----list 存储有序，可以重复。
 *             |----ArrayList 查询快，存储慢（实现原理，内部维护了一个Object数组，当数据达到满值会变为原来的长度+原来长度/2 默认是10个 所以添加慢因为如果满了还要创建数组
 *             						            创建完了还要在拷贝就的数组时间消耗，如果是查询是按照索引下面进行查询的所以快）
 *             |----LinkedList 查询慢，存储快（底层是用链表实现的，增加的话，只需要记住前一个和后一个位置集合，插叙需要遍历所有的链表所以效率低）
 *             |----Vector 这个和ArrayList 实现原理一样但是这个是线程安全的比起ArrayList 效率慢。
 *         |----set  存储无序，不可重复。
 *             |----HashSet
 *             |----TreeSet
 *             |----LinkedHashSet
 *     |----双列集合
 *         |----Map：键值对
 *         |----HashMap
 *         |----TreeMap
 *         |----HashTable
 *         |----LinkedHashMap
 * 
 * 
 * 为什么会出现这么多的存储容器，因为每一种的容器存储方式是不同的，我们称之为数据结构。
 * 
 * 什么时候该用什么样的集合
 * 如果需要保存对象 使用Collection 这个是个接口
 * 如果需要 保留 存储有序，可以重复 使用list
 * 							查询多用ArrayList
 * 							增删多用LinkedList
 * 							线程安全用Vector
 * 如果需要保留 存储无序，不可以重复使用set
 * 					需要自然排序的使用 TreeSet
 *					如果不排序HashSet效率高于TreeSet 
 * 					如果需要保留存储顺序 且过滤重复元素需要用LinkedHashSet
 *  
 * Collection 接口 java.util包里面
 * Collection
 * 		单例
 * 			|----List 存储有序，可重复（链表|线性表）
 * 			|----Set 存储无序，不可重复（集）
 * Collection 描述了集合共有的方法。
 * 
 * 
 * Collection 的方法
 * boolean 增加的方法 true 添加成功 false 添加失败
 * add() 				添加对象到容器
 * addAll()				添加一个容器到另一个容器
 * boolean 删
 * remove()				删除指定对象
 * removeAll()			删除指定集合的元素
 * void 改
 * clear()				清空集合
 * int 查
 * size()				返回集合长度
 * boolean 判断
 * isEmpty()			判断集合是不是空的
 * contains()			判断一个集合是否包含指定对象
 * containsAll()		判断一个集合是否包含另一个集合
 * 转数组
 * toArray()			集合转数组
 * 
 * 
 * Iterable 接口
 * 			Iterator iterator 定义在Collection内部 
 * 		--| Collection 接口
 * 			--| List 	接口特点存储有序，元素可以重复,允许在指定位置插入，并且通过索引返回。
 * List 方法
 * 增
 * 	void add(int index, E element)指定位置添加元素
 *  boolean addAll(int index, Collection c) 指定位置添加集合
 * 删
 * 	E remove(int index) 删除指定位置元素 ， 返回被删的元素。
 * 改
 * 	E set(int index, E element) 替换指定位置元素，返回被替换的元素。
 * 查
 *  E get(int index) 指定位置元素返回。 和数组一样当大于范围会有越界
 *  int indexOf(Object o) 查找指定的对象所在的索引
 *  int lastIndexOf(Objec o) 从后向前找
 * 
 * 求子集合
 *  List<E> SubList(int fromIndex, int toIndex)//不包含toIndex
 */
package always_revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author www.23.com
 * 
 */
public class JieHe {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Collection co = new ArrayList(); Person p1 = new Person("a1",1);
		 * Person p2 = new Person("a1",2); Person p3 = new Person("a3",3);
		 * Person p4 = new Person("a4",4); co.add(p1);
		 * 
		 * System.out.println(co);
		 */
	 
		/* List list = new ArrayList();
		 Person p1 = new Person("a1",1);
		 Person p2 = new Person("a2",2);
		 //add void add(int index, E element);
		 list.add(0,p1);
		 list.add(0,p2);
		 System.out.println(list);
		 //add boolean add(int index, Collection co) 添加 成功返回true
		 System.out.println(list.addAll(0, list));
		 // E remove(int index); 返回的删除指定位置的元素
		 System.out.println(list.remove(0));
		 // 改 E set(int index, E element); 返回被替换的元素
		 System.out.println(list.set(0, p2));
		 // 查 E get(int index)
		 System.out.println(list.get(0));
		 // 查 对象的位置
		 System.out.println(list.indexOf(p1));
		 // 查 返回最后的位置
		 System.out.println(list.lastIndexOf(p1));
		 // List subList(int fromIndex,int toIndex) 返回从哪个位置截取的哪个位置。
		 List l = list.subList(0, 1);*/
		
		
	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean rt = false;
		Person p = null;
		if (obj instanceof Person) {
			p = (Person) obj;
			if (name.equals(p.name)) {
				rt = true;
			}
		}
		return rt;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + age;
	}
}