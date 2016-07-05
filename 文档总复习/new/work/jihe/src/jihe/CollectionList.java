/**
 * Collection
 * List 接口
 * 实现了List接口，集合类
 * 特点有序可重复
 * 所有已知实现类：
 * AbstractList, 
 * AbstractSequentialList, 
 * ArrayList, 
 * AttributeList, 
 * CopyOnWriteArrayList, 
 * LinkedList, 
 * RoleList, 
 * RoleUnresolvedList, 
 * Stack, 
 * Vector
 * 
 * //先来看一下有序，是什么意思？
 * //不是指自然循序，而是指添加的顺序和出来顺序是一直的，这个顺序是队列先进先出的原则。
 * //可以重复
 * 
 * List 接口中特有的拓展方法
 * 添加
 * add(int index, E element) 
 * addAll(int index, Collection<? extends E> c) 
 * 
 * 获取
 * get(int index) 
 * lastIndexOf(Object o) 
 * indexOf(Object o) 
 * subList(int fromIndex, int toIndex) 
 * 
 * 迭代
 * listIterator() 
 * listIterator(int index) 
 * toArray(T[] a) 暂时学不了
 * 修改
 * set(int index, E element) 
 * 
 * 
 * ListIterator
 * 特有方法
 * add
 * hasPrevious
 * nextIndex(); 返回当前指针的索引值
 * previous
 * previousIndex(); 返回上个索引值
 * set
 * 
 * List方法具备的特点，操作的方法都有索引值。（只有list接口下面的实现集合类才具备索引值，其它接口下面的集合类都没有索引值概念的）
 */
package jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author www.23.com
 *
 */
public class CollectionList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//添加
		//Collection 的add,addAll方法是默认把元素 ， 集合 添加到末尾处。
		//list的add添加到指定索引的位置上。
		list.add(1,"admin");
		//addAll 这个一样添加到指定的索引位置
		list.addAll(1,list);
		
		//获取
		//list.get(1);根据索引值获取集合中的元素 -- 遍历集合元素可以使用get了
		//list.indexOf("") 返回对象在集合中的位置下表，注意如果自定义类也需要重写equals因为默认内部也用的是Object的equals 没找到-1
		//list.lastIndexOf("") 最后一次出现  没找到-1
		//subList(from, to) 返回的仍然是list  从1开始获取1+2个
		//list = list.subList(1, 3);
		 
		
		//修改 使用指定的元素，替换索引值位置的元素。
		//list.set(1, "ding");
		
		//迭代 List接口特有的迭代器ListIterator
		//listItorator的特有方法
		//lt.hasPrevious() 上一个元素有值吗
		//如果有返回true没有就false 	
		//lt.previous() 返回上一个元素值
		//没有非要获取就抛出java.util.NoSuchElementException 异常
		//prev原来当前指针先向上移动在取或判断，而next先取当前位置在向下移动  prev先移在取，next先取在移
		ListIterator lt = list.listIterator();
		
		//add 将指定的元素，插入到当前指针指向的位置上。 lt.add("aaa"); 默认指针在0号位置  lt.next() 将元素插到1号位置，lt.previous()将元素在插到0号位置
		
		//set 替换迭代器最后一次返回的元素 java.lang.IllegalStateException 如果没有迭代器返回元素直接报错lt.set("");
		
		System.out.println(lt.previous());
		
	}

}
