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
 *  
 *  
 * Collection 
 *     ----| list
 *    		    ----| ArrayList
 * 
 * ArrayList 查询效率高，增删慢 内部维护了一个Object数组 初始大小10  为什么查询快，因为数组的所以连续移动索引就可以找到，
 * 增删慢是因为，当添加的时候会去判断数组是否满了，如果没满如果在0位置添加其余的位置都要向后移动，
 * 如果满了就需要新建一个原来数组容量+容量/2的大小数组，然后在拷贝。
 * 为什么数组的查询速度快？
 * 数组的内存空间地址是连续的。
 * 可以通过ArrayList的构造，去初始化默认的Object [] 的值
 * 例如
 * new ArrayList(20) 默认的大小为20.
 * 
 * LinkedList 插入快，查询慢。 底层采用了双链表实现的。
 * 链表，内存地址不是连续的，虽然他也有下标，但是他们的结构是前一个记住后一个的位置，查询的时候需要遍历所有的，如果要查找的在最后一个，那就要
 * 遍历所有的链表，相反如果插入很快，只要插入记住前一个和后一个位置就搞定。
 * 特有的方法：
 * void
 * addFirst(E e)
 * addLast(E e)
 * E e
 * getFirst(E e)
 * getLast(E e)
 * removeFirst(E e)
 * removeLast(E e)
 * 如果集合中没有元素删除和获取都将抛出NoSuchElementException
 * 数据结构
 * 栈
 * void 
 * push 
 * E e
 * pop 
 * 队列
 * void
 * offer 
 * E e
 * poll	
 * 返回逆序迭代器
 * descencodingIterator()
 * E e
 * element 返回但不删除头元素
 * 
 * 栈先进后出
 * push pop
 * 
 * 队列先进先出
 * offer poll
 * 
 * 队列
 * ---------------------
 * offer -> -> ->      poll
 * ---------------------
 * 
 * 栈
 * -------
 * |push<-
 * |->pop
 * -------
 * 
 * peekFirst  peek 获取对头元素但不删除
 * peekLast 获取队尾元素但不删除。
 * 
 * ArrayList 对比 LinkedList 
 * 如果添加多选后者，如果查询多选前者。
 * 
 * Vector
 * 这个和ArrayList实现原理一样，只不过他是线程安全的。 它所有的方法都带element
 * void addElement(E e);
 * E elementAt(int index); 返回指定下标的元素。
 * Enumeration elements(); 返回所有的元素，封装到Enumeration对象中
 * 
 * Enumeration 接口：
 * boolean hasMoreElements()
 * 测试此枚举是否包含更多元素。
 * E nextElement()
 * 返回元素角标下移。
 * 
 * 
 * 
 * 迭代器
 * Iterator
 * 为了方便处理集合中的元素，java提供了一个迭代器，所有实现Collection的类都实现了Iterator功能通过实现类内部的一个iterator方法得到了Iterator的实现
 * 类，内部类完成的。
 * 方法
 * hasNext()判断下一个是否可以遍历
 * next()返回当前元素指针向下
 * remove是删除当前指针的上一个元素
 * public boolean hasNext() {
     return cursor != size;//cursor 当前游标  size集合长度
   }
   
   public E next() {
            checkForComodification();
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = ArrayList.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) elementData[lastRet = i];
        }
        
  public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();
            checkForComodification();

            try {
                ArrayList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }
        
        
    ListIterator
    		//add() 使用当前游标 添加然后游标加1
			//hasNext 当前游标是不是处于最大 
			//hasPrevious 当前游标不等于0可以向上
			//next返回当前指针元素然后指针向下
			//nextIndex() 返回当前游标
			
			//li.remove();//游标减一在删除元素
			//li.previous();//先将游标减一在返回元素
			//previousIndex() 将当前游标减一在返回
			//set 当 next 或preiouse 之后就是将当前的替换
 * 当集合被迭代器操作，不能直接通过集合的方法影响到集合的个数否则报错。
 * 
 * * 细节
 * 1.如果next()已经指向末尾在调用抛出 NoSuchElementException 或者如果集合是空的调用也抛错误.
 * 2.如果remove之前没有调用  next() 或者previous() 抛出 IllegalStateException
 * 3.迭代器原理 看源码
 * 4.当对集合进行迭代的时候不允许使用集合的方法对集合个数进行操作，否则抛出ConcurrentModificationException.
 * 5.list接口特有的迭代器是ListIterator. ListIterator extends Iterator
 * ListIterator
 * 		----| add(E e)
 * 		----| set(E e)
 * 		----| hasprevious()
 * 		----| previous()
 * 
 * for的增强版foreach 
 * jdk1.5 后出了一个Iterable 接口，当你实现了它就可以使用foreach
 * Collection 的符结构Iterable
 * 这个接口只有一个方法 iterator
 * iterator 需要实现 hasNext next (remove 可以实现也可以不实现)
 * 
 * 使用for遍历iterator比while节省内存
 * for(Interator it = it.iterator();it.next();){}
 * 
 * 
 * 
 */
package always_revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;

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
		
		//删除重复元素
		/*ArrayList<String> ay = new ArrayList<String>();
		ay.add("admin");
		ay.add("admin");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin2");
		ay.add("admin");
		ay.add("admin");
		ay.add("admin");
		ay.add("admin");

		
		
		for(int i = ay.size() - 1; i>=0;i--){
			for(int j = i - 1; j >= 0; j--){
				if(ay.get(i).equals(ay.get(j))){
					ay.remove(i);
					break;
				}
			}
		}
		System.out.println(ay);*/
		
		
		//LinkedList
		/*LinkedList<String> ll = new LinkedList<String>();
		ll.addFirst("a");
		ll.addLast("b");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeLast());
		System.out.println(ll.removeFirst());
		ll.push("admin");
		System.out.println(ll.pop());
		ll.offer("jindui");
		System.out.println(ll.poll());
		ll.addFirst("ding");
		ll.addLast("lu");
		ll.addFirst(null);
		Iterator<String> it = ll.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(ll.element());*/
		
		/*LinkedList<String> ll = new LinkedList<String>();
		ll.offer("a");
		ll.offer("a1");
		ll.offer("a2");
		ll.offer("a3");
		ll.offer("a4");
		System.out.println(ll.poll());*/
		
		/*Vector<String> vctor = new Vector<String>();
		vctor.addElement("admin");
		//System.out.println(vctor.elementAt(0));
		Enumeration<String> en = vctor.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}*/
		
		/*Vector<String> vc = new Vector<>();
		vc.addElement("administrator");
		//System.out.println(vc.elementAt(0));
		Enumeration<String> en = vc.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}*/
		
		/*ArrayList<String> ay = new ArrayList<String>();
		ay.add("");
		ay.set(0,"aaa");
		ListIterator<String> li = ay.listIterator();
	
		while(li.hasNext()){
			li.next();
			li.set("qqq");
		}
		System.out.println(ay);
		//逆向回来
		while(li.hasPrevious()){//当前游标和0比较
			//add() 使用当前游标 添加然后游标加1
			//hasNext 当前游标是不是处于最大 
			//hasPrevious 当前游标不等于0可以向上
			//next返回当前指针元素然后指针向下
			//nextIndex() 返回当前游标
			
			//li.remove();//游标减一在删除元素
			//li.previous();//先将游标减一在返回元素
			//previousIndex() 将当前游标减一在返回
			//set 当 next 或preiouse 之后就是将当前的替换
			
		}*/
		
		/*MyselfItems<String> mys = new MyselfItems<String>();
		mys.add("admin");
		mys.add("admin");
		mys.add("admin");
		mys.add("admin");
		
		for(String str : mys){
			System.out.println(str);
		}*/
		
		/*ArrayList<String> ay = new ArrayList<String>();
		ay.add("bbb");
		
		for(ListIterator<String> li = ay.listIterator();li.hasNext();){
			System.out.println(li.next());
			li.add("ccc");
		}
		System.out.println(ay);*/
	}

}

class MyselfItems<T> implements Iterable<T>{
	Object [] elementData = new Object[100];
	int size = 100;
	int cursor = 0;
	public void add(T str){
		size = cursor;
		elementData[cursor++] = str;
	}
	private class Itr implements Iterator<T>{
		int cursor = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return cursor != size;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return (T)elementData[cursor++];
		}

		 
		
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Itr();
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


 