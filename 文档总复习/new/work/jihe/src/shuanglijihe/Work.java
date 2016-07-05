package shuanglijihe;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

//定义一个TreeMap 键存储的是一本书的对象 值是字符串书号， 根据书的出版日期排序


public class Work {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Book, String> tm = new TreeMap<Book, String>(new Comparatorses());
		tm.put(new Book("a",new Date()),"001");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tm.put(new Book("b",new Date()),"002");
		tm.put(new Book("c",new Date()),"003");
		tm.put(new Book("d",new Date()),"004");
		tm.put(new Book("e",new Date()),"005");
		
		System.out.println(tm);
	}

}

class Book{
	String name;
	Date date;
	public Book(String name, Date date){
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
class Comparatorses implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		//这样强转是丢失精度的所以需要别的解决方案,可以调用日期的CompareTo方法来比较。字符串也有CompareTo,千万不要使用(int)(o1.date.getTime()-o2.date.getTime())这样存在精度丢失有问题。
		return o1.date.compareTo(o2.date);
	}
 
 
}