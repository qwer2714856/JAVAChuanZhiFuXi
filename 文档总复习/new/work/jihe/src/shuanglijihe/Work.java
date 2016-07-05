package shuanglijihe;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

//����һ��TreeMap ���洢����һ����Ķ��� ֵ���ַ�����ţ� ������ĳ�����������


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
		//����ǿת�Ƕ�ʧ���ȵ�������Ҫ��Ľ������,���Ե������ڵ�CompareTo�������Ƚϡ��ַ���Ҳ��CompareTo,ǧ��Ҫʹ��(int)(o1.date.getTime()-o2.date.getTime())�������ھ��ȶ�ʧ�����⡣
		return o1.date.compareTo(o2.date);
	}
 
 
}