package jihe;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 集合的迭代器
 * @author www.23.com
 *
 */
public class Iterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("a");
		c.add("a1");
		c.add("a2");
		c.add("a3");
		c.add("a4");
		c.add("a5");
		c.add("a6");
		c.add("a7");
		System.out.println(c);
		
		//使用iterator遍历
		//返回的的是Iterator的实现类对象
		java.util.Iterator it = c.iterator();
		//迭代器用于抓取集合中的数据。
		/*
		 *  boolean	hasNext()  问是否有下一个元素如果有true否则false
		    next() 			       取出元素
		 	void	remove()   返回迭代器最后一次返回的元素 也就说必须next完了以后再删除 如果没有使用next直接抛异常
    
		 */
		//java.util.NoSuchElementException 迭代器没有可以抓取的代码了
		while(it.hasNext()){
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(c);
		
		
		//hasNext,next工作原理
		//hasNext 问当前指针是否有指向元素，如果有返回true否则返回false
		//next方法是返回当前指针指向元素指针下移动。
	}

}
