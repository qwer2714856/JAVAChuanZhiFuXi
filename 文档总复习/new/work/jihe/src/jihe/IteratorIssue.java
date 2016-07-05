/**
 * 迭代器需要注意的事项
 * 1.导入 List包不要导错了是util包里面的
 * 2.迭代器迭代元素的过程不允许使用集合对象改变集合中的元素个数，如果需要增加或删除只能使用迭代器的方法进行操作。！！！！
 * 3.迭代过程中是个什么？
 * next previous就是在迭代代码上面
 * 就是迭代中的next previous 在这个后面使用集合的方法是没有问题的，如果放到这些方法之前是报错的。
 * 
 */
package jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 * @author www.23.com
 *
 */
public class IteratorIssue {

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
		ListIterator lt = list.listIterator();
		/* ListIterator lt = list.listIterator();
		 * 这不是个死循环
		 * 当添加一个元素的时候，指针是跟着往下走的，例如指向第二个位置，如果加入一个，这个时候指针自动就是第三个位置上
		 * while(it.hasNext()){
			 it.next();
			 it.add("aa");
		 }*/
		
		/* 死循环
		 * while(lt.hasPrevious()){
			System.out.println(lt.previous());
			lt.add("aaa");
		}*/
		
		/**
		 * 报错的 如果在迭代元素的时候使用了集合方法该了集合个数就直接抛异常。
		 * java.util.ConcurrentModificationException
		 * 这个不是死循环
		 */
		/*while(lt.hasNext()){
			lt.next();
			list.add("admin");
		}*/
		//同样报错
		 /*while(lt.hasNext()){
			 lt.next();
		 }
		 while(lt.hasPrevious()){
				lt.previous();
				list.add("admin");
		  }*/
	 
	}

}
