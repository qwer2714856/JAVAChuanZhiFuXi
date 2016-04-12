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
 * Map
 * 		|----双列集合
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
 * 
 * Set 存储无序，插入不可重复（注重独一无二的本质，不可以重复）
 * 引用到堆上同一个对象的两个引用是否相同。
 * 比较
 * 首先调用两个对象的hashCode方法如果相同，在比较两个对象的equals 如果在相同视为重复将拒绝插入。
 * 如果自定义对象需要重写hashCode和equals方法，hashCode返回内存地址，然后通过移位得到存储位置，在比较equals是否相同，才能决定是否存储。
 * 该集合没有特殊方法继承Collection方法 
 * Set 接口下的只能使用迭代器了iterator遍历
 * 
 * HashSet 线程不安全，存取速度按快，底层是用的hash表。
 * 哈希表存放的是哈希值，存储无序是根据哈希值来决定存在哪的，HashSet不重复是根据HashCode 和 equals决定的。
 * 元素的哈希值是通过对象的hashCode 移位取得的 查看这个哈希值是否有存储元素有比较两个对象的equals.都相同视为重复。如果同样哈希值有元素，
 * 但是equals不同可以理解为木桶相同哈希值下的元素顺延。
 * ！！！一个哈希值可以存放多个元素！！！
 * hashCode和equals的顺序，hashCode先调用如果不同equals直接就不调用了。
 * 
 * 
 * ArrayList HashSet 都有contains 他们是如何工作的？
 * ArrayList 使用的是equals 
 * HashSet   使用的是hashCode 先相同在用equals
 *
 * 当需要元素排序且不重复那么可以使用TreeSet
 * TreeSet底部用的是红黑树，默认对元素进行自然排序，如果比较的时候对象返回0那么元素重复。红黑树左小又大。 （红黑树是一种特定的二叉树）
 * 既然TreeSet 有排序，那么就有排序规则。
 * 1.让存入的元素自定义比较规则
	 * 1.如果一个对象元素需要具备比较性，那么它要实现Comparable 接口，重写CompareTo 方法
	 * 2.自定义一套比较规则结构传给TreeSet构造 用这个通用性好 自定义类实现接口Comparator 重写 Compare 方法
	 * 3.当Comparable和Comparator 同时存在以Comparator为准。
	 * 4.重写compare 和 compareTo 的时候返回 0 代表 相同 -1 位于比较元素左边，1位于比较元素右边
 * 
 * Comparable				元素本身实现  字符串了实现了Comparable 并且可以直接调用CompareTo 返回比较大小值
 *     ----| compareTo 
 *     
 * Comparator				自定义比较类通过TreeSet构造传入
 *     ----| compare
 * 
 * 
 * 
 * LinkedHashSet 会保存插入顺序
 * 
 * 
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
 * 集合的口诀
 * 看到Array想到 角标
 * 看到Link 想到 first last
 * 看到HashSet 想到 hashCode equals
 * 看到TreeSet 想到 【Comparator compare 自定义筛选器TreeSet构造传入】 【Comparable compareTo 让元素本身实现】
 * 
 * 
 * 
 * 双列结合
 * Map
 * 使用的是键值对的形式存储的。
 * Map中其实是两个对象，一个作为键，一个作为值，键不可重复，值可以重复。
 * 1.Collection 和 Map 属于并列的他们没有从属关系 
 * 	Collection 单列
 * 	Map 是双列
 * 集合
 *     |----单列集合 只有一个对象
 *     |----双列集合 两个对象，一个key对象一个value对象，key不可以重复
 * 2.Map存储的是键值对
 * 3.Map 使用put添加元素
 * 4.Map没有直接取出需要转Set在读取。
 * 5.Map键唯一
 * 
 * Map 一次存一对，Collection一次存一个。
 * 双列的体系
 * Map
 * 	|---- HashMap 采用哈希表，无序 可以存入key null value null 为了确保key的唯一需要覆盖key对象的 hashCode equals
 *  |---- TreeMap 采用红黑树，有序 可以对map中的键进行排序使用comparator compare comparable compareTo
 *  |---- HashTable 和HashMap一样只不过它是线程安全的。 不可以存入null key null value
 *  |---- LinkedHashMap 融入了链表存入有序可以提高增删效率。
 *  
 *  Map 集合的常见方法
 *  增
 *  V put(K key, V val) 当出现重复的key 新的会把旧的值替换掉，替换的值返回，如果没有可替换的就返回null,判断key是否重复的依据是
 *  利用key对象的hashCode计算出哈希值然后根据哈希值存这个key对象这个key对象就关联着它的value。
 *  putAll(Map<? extends K, ? extends V> m) 集合添加集合 没有返回值 如果是相同的集合只是更新值
 *  删
 *  1.remove() 删除关联对象传入key 返回被删元素的值
 *  2.clear()	清空集合 没有返回值
 *  查
 *  get()  传入key获取value没有值就返回null
 *  size() 返回长度
 *  遍历需要借助Set
 *  判断
 *  boolean isEmpty() 长度0返回 true 否则 false
 *  boolean containsKey() 是否包含指定的key
 *  boolean containsValue() 是否包含指定的值
 *  
 *  
 *  如果key 没有对应的值就是null
 *  
 *  
 *  
 *  遍历Map集合遍历需要借助于单列的Set
 *  有三种遍历方式
 *  1.Set<Key>
 *  	HashMap<String,Integer> hs = new HashMap<String, Integer>();
		hs.put("a", 1);
		Set<String> s = hs.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			System.out.println(hs.get(it.next()));
		}
 *  2.values();
 *  	HashMap<String,Integer> hs = new HashMap<String, Integer>();
		hs.put("a", 1);
		Collection<Integer> c = hs.values();//不能获取到key
 *  3.Map.Entry();
 * 		HashMap<String,Integer> hs = new HashMap<String, Integer>();
		hs.put("a", 1);
		Set<Map.Entry<String, Integer>> et = hs.entrySet();
		Iterator<Map.Entry<String, Integer>> it = et.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> mp = it.next();
			mp.getKey();
			mp.getValue();
		}
		for(Map.Entry<String, Integer> mps : hs.entrySet()){
			
		}
		
		
 * HashMap --底部是哈希表，非线程安全，可以存入null key null value,要确保key的唯一就必须重写key的 hashCode和 equals方法。
 * TreeMap --底部是维护红黑树，可以使用Comparator compare Comparable compareTo 来对key排序
 * 
 * 注意 Set 集合如果遇到重复值add的时候将不做出返回false
 *    Map 集合如果遇到重复的值put的时候将原来的干掉放上新值，返回被替换的值，如果没有值返回null
 *    
 * Collections and Arrays 集合工具和数组工具
 * 集合框架中的工具，方法都是静态的。
 * 1.int binarySearch(list, key, Comparator) 前提集合有序，采用二分法查找到对应对象的位置，可以传入排序器 找不到返回-1
 * 		ArrayList<Integer> ay = new ArrayList<Integer>();
		ay.add(1);
		ay.add(2);
		ay.add(9);
		ay.add(4);
		System.out.println(Collections.binarySearch(ay, 3));
 * 注意这里只能传入list不能传入其它的。 Comparator 查找比较器
 * 
 * 2. void sort list用的 
 * 		ArrayList<Integer> ay = new ArrayList<Integer>();
		ay.add(1);
		ay.add(2);
		ay.add(9);
		ay.add(4);
		Collections.sort(ay,new IntegerComparator());//需要一个排序comparator
		System.out.println(ay);
		
 * 3. 最大最小值
 * 	  Collections.max(Collection,Comparator);
 * 	  Collections.min(Collection,Comparator);
 * 
 * 4.Collections.reverse(list);
 * 
 * 5.Collections.reverseOrder(); 自然顺序从小到大，它强制修改从大到小
 * 	  list.add(-28);  
      list.add(20);  
      list.add(-12);  
      list.add(8);
      Comparator cmp = Collections.reverseOrder();  
      Collections.sort(list, cmp);  
 * 6.swap(list,x,y); 对list的元素进行换位 将对应角标的元素换位置
 * 		ArrayList<Integer> ay = new ArrayList<Integer>();
		ay.add(1);
		ay.add(2);
		ay.add(9);
		ay.add(4);
		Collections.swap(ay, 1, 0);
		System.out.println(ay);
 * 7.replaceAll(list, old, new); 替换集合中的元素如果原来的不存在集合不变
 * 		ArrayList<Integer> ay = new ArrayList<Integer>();
		ay.add(1);
		ay.add(1);
		ay.add(9);
		ay.add(4);
		Collections.replaceAll(ay, 1, 99);
		System.out.println(ay);
 * 8.将不同的变为同步
 * Set  synchronizedSet(Set<T> s);
 * Map  synchronizedMap(Map<k,v> mp);
 * List synchronizedList(List<T> list);
 * 		ArrayList<Integer> ay = new ArrayList<Integer>();
		List<Integer> ls = Collections.synchronizedList(ay);
		
		HashSet<String> hs = new HashSet<String>();
		Set<String> s = Collections.synchronizedSet(hs);
		
		HashMap<String,String> hm = new HashMap<String, String>();
		Map<String,String> m = Collections.synchronizedMap(hm);
 * 9.collection to array 用的是 Collection实例的方法 toArray() 找到相应类型数组接行了
 * 		ArrayList<Integer> ay = new ArrayList<Integer>();
		Object [] it = ay.toArray();
 * 10.Collections.fill(list, obj) 使用obj 替换集合中所有的元素	
   11.数组转集合 List<Integer> li = Arrays.asList(new Integer[]{1,3,4})
 * Arrays 工具集
 * 1.二分查找数组有序 Arrays.binarySearch(Object [],key) 没找到返回-1找到返回对应下标 支持所有类型数组
 * 2.所有类型数组排序 Arrays.sort(Object []);
 * 3.toString(Object []) 将数组以 [a,b,c,d]字符串形式展示出来
 * 4.copyOf(); 将一个数组复制到另外一个指定长度的数组。当新数组的大小小于旧数组，旧数组的内容将被截掉。
 * 		int [] a = {1,2,3,4,5};
		int [] b = Arrays.copyOf(a, 50);
		System.out.println(Arrays.toString(b));
 * 5.copyOfRange();
 * 		int [] a = {1,2,3,4,5};
		int [] b = Arrays.copyOfRange(a, 1, 3);
		System.out.println(Arrays.toString(b));
 * 将a数组截取n-(m-1)个后赋值给新数组返回
 * 6.比较两个数组是否相等
 * 		int [] a = {1,2,3,4,5};
		int [] b = {1,2,3,4,5};
		System.out.println(Arrays.equals(a, b));
 * 7.Arrays.asList(Object [])
 * 	 注意List<Integer> li = Arrays.asList(new Integer[]{1,3,4})
 *  通过数组转的集合不可以对转的这个集合使用修改集合个数的函数否则抛出异常，因为数组是固定的。java.lang.UnsupportedOperationException
 *  如果使用的是基本数据类型 int [] a = {1,2,3,4} 这样如果转成集合接收是  List<int []> 所以基本数据类型转集合需要使用它们的包装类。
 *  例如
 *  Byte Boolean Short Character Integer Long Float Double
 *  
 */
package always_revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

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
		
		
		
		//Set
		/*Set<Person> st = new HashSet<Person>();
		System.out.println(st.add(new Person("a",1)));
		System.out.println(st.add(new Person("a2",1)));
		System.out.println(st.add(new Person("a",1)));
		System.out.println(st);*/
		
		
		//TreeSet
		/*TreeSet<String> ts = new TreeSet<String>();
		ts.add("z");
		ts.add("y");
		ts.add("x");
		System.out.println(ts);*/
		
		//自定义排序 元素本身实现Comparable compareTo
		/*TreeSet<ComparableXs> ts = new TreeSet<ComparableXs>();
		ts.add(new ComparableXs("zaaa",9));
		ts.add(new ComparableXs("daaa",2));
		ts.add(new ComparableXs("xaaa",10));
		ts.add(new ComparableXs("saaa",1));
		System.out.println(ts);*/
		//自定义排序类  定义一个排序类实现Comparator 重写compare
		/*TreeSet<ComparableXs> ts = new TreeSet<ComparableXs>(new Sort());
		ts.add(new ComparableXs("zaaa",9));
		ts.add(new ComparableXs("daaa",2));
		ts.add(new ComparableXs("xaaa",10));
		ts.add(new ComparableXs("saaa",1));
		System.out.println(ts);*/
		
		//Map
		/*Map<Maps,String> mps = new HashMap<Maps,String>();
		System.out.println(mps.put(new Maps("a",1),"hi"));
		System.out.println(mps.put(new Maps("a",1),"his"));
		System.out.println(mps.put(new Maps("a",1),"hisw"));
		mps.putAll(mps);
		System.out.println(mps.size());
		System.out.println(mps.remove(new Maps("a",1)));
		mps.clear();
		System.out.println(mps.get(new Maps("a",1)));
		System.out.println(mps.isEmpty());
		System.out.println(mps.containsKey(new Maps("a",1)));
		System.out.println(mps.containsValue(new Maps("a",1)));*/
		/*HashMap<String,String> hs = new HashMap<String, String>();
		hs.put("a", "value");
		HashMap<String,String> hs2 = new HashMap<String, String>();
		hs2.put("a", "value2");
		hs.putAll(hs2);
		System.out.println(hs);*/
		
		//Map遍历
		/*HashMap<String,Integer> hs = new HashMap<String, Integer>();
		hs.put("a", 1);
		Set<String> s = hs.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			System.out.println(hs.get(it.next()));
		}*/
		/*HashMap<String,Integer> hs = new HashMap<String, Integer>();
		hs.put("a", 1);
		Collection<Integer> c = hs.values();//不能获取到key
*/	
		/*HashMap<String,Integer> hs = new HashMap<String, Integer>();
		hs.put("a", 1);
		Set<Map.Entry<String, Integer>> et = hs.entrySet();
		Iterator<Map.Entry<String, Integer>> it = et.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> mp = it.next();
			mp.getKey();
			mp.getValue();
		}
		for(Map.Entry<String, Integer> mps : hs.entrySet()){
			
		}*/
		
		/*HashMap<String,Integer> hs = new HashMap<String, Integer>();
		hs.put("a", 1);
		Set<Map.Entry<String, Integer>> s = hs.entrySet();
		Iterator<Map.Entry<String, Integer>> it = s.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> ms = it.next();
			System.out.println(ms.getValue());
		}*/
		
		
		/*TreeMap<MapComparatorClass,String> tm = new TreeMap<MapComparatorClass, String>(new MapCompatatorFilter());
		tm.put(new MapComparatorClass("z",4), "hi");
		tm.put(new MapComparatorClass("z",3), "hi1");
		tm.put(new MapComparatorClass("z",2), "hi2");
		tm.put(new MapComparatorClass("z",1), "hi3");
		
		Set<Map.Entry<MapComparatorClass, String>> et = tm.entrySet();
		Iterator<Map.Entry<MapComparatorClass, String>> it = et.iterator();
		while(it.hasNext()){
			Map.Entry<MapComparatorClass, String> me = it.next();
			System.out.println("key="+me.getKey()+",value="+me.getValue());
		}*/
		
		/*ArrayList<Integer> ay = new ArrayList<Integer>();
		ay.add(1);
		ay.add(2);
		ay.add(9);
		ay.add(4);
		System.out.println(Collections.binarySearch(ay, 3));*/
		
		/*ArrayList<Integer> ay = new ArrayList<Integer>();
		ay.add(1);
		ay.add(2);
		ay.add(9);
		ay.add(4);
		Collections.sort(ay,new IntegerComparator());//需要一个排序comparator
		System.out.println(ay);*/
		
		/*ArrayList<Integer> ay = new ArrayList<Integer>();
		ay.add(1);
		ay.add(2);
		ay.add(9);
		ay.add(4);
		Collections.swap(ay, 1, 0);
		System.out.println(ay);*/
		
		/*ArrayList<Integer> ay = new ArrayList<Integer>();
		ay.add(1);
		ay.add(1);
		ay.add(9);
		ay.add(4);
		Collections.replaceAll(ay, 1, 99);
		System.out.println(ay);*/
		
		/*ArrayList<Integer> ay = new ArrayList<Integer>();
		List<Integer> ls = Collections.synchronizedList(ay);
		
		HashSet<String> hs = new HashSet<String>();
		Set<String> s = Collections.synchronizedSet(hs);
		
		HashMap<String,String> hm = new HashMap<String, String>();
		Map<String,String> m = Collections.synchronizedMap(hm);*/
		
		/*ArrayList<Integer> ay = new ArrayList<Integer>();
		Object [] it = ay.toArray();*/
		
		/*int [] a = {1,2,3,4,5};
		System.out.println(Arrays.binarySearch(a, 2));*/
		 
		/*int [] a = {1,2,3,4,5};
		int [] b = Arrays.copyOf(a, 50);
		System.out.println(Arrays.toString(b));*/
		/*int [] a = {1,2,3,4,5};
		int [] b = Arrays.copyOfRange(a, 1, 3);
		System.out.println(Arrays.toString(b));*/
		
		/*int [] a = {1,2,3,4,5};
		int [] b = {1,2,3,4,5};
		System.out.println(Arrays.equals(a, b));*/
		
		/*Integer []it = {1,2,3,4};
		List<Integer> li = Arrays.asList(it);
		li.add(9);*/
		
	
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

class ComparableXs implements Comparable<ComparableXs>{
	String name;
	int age;
	
	public ComparableXs(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(ComparableXs o) {
		// TODO Auto-generated method stub
		int it = 0;
		if(name.equals(o.name) && age == o.age){
			
		}else{
			it = age-o.age;
		}
		return it;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
 


class Sort implements Comparator<ComparableXs>{

	@Override
	public int compare(ComparableXs o1, ComparableXs o2) {
		// TODO Auto-generated method stub
		int it = 0;
		if(o1.equals(o2.name) && o1.age == o2.age){
			
		}else{
			it = o1.age - o2.age;
		}
		return it;
	}
}

class Maps{
	String name;
	int age;
	public Maps(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode()+this.age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Maps mp = null;
		boolean b = false;
		if(obj instanceof Maps){
			mp = (Maps)obj;
			if(name.equals(mp.name)){
				b = true;
			}
		}
		return b;
	}
}

class MapComparatorClass{
	String name;
	int age;
	public MapComparatorClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
class MapCompatatorFilter implements Comparator<MapComparatorClass>{

	@Override
	public int compare(MapComparatorClass o1, MapComparatorClass o2) {
		// TODO Auto-generated method stub
		int rt = 0;
		if(o1.name != o2.name || o1.age != o2.age){
			if(o1.name != o2.name){
				rt = o1.name.compareTo(o2.name);
			}else{
				rt = o1.age - o2.age;
			}
		}
		return rt;
	}	
}

class IntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1-o2;
	}
	
}
