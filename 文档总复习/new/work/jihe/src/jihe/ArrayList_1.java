/**
 * ArrayList
 * Collection
 *     list---下面的实现类
 * 	       ArrayList ！！
 * 		   LinkedList！！
 * 		   Vector(了解即可)
 *  
 *  ArrayList 的一些方法
 *  	ensureCapacity(int minCapacity)  了解就行，基本不会用
 *  	trimToSize()  了解就行
 *  主要学ArrayList 实现原理和特点
 *  （特点）
 *  查询速度快，增删慢。
 *  为什么查询快，因为内部维护着一个Object数组，数组的内存地址是连续的所以在查询的时候游标可以加减移动到指定的位置（数组的特点）。
 *  为什么增加慢 因为每次都要检查数组长度是否够用，当容量不够 要创建新容量，还要创建一个新的数组将旧的数组拷贝过来。 当数组的容量非长大再拷贝的时候比较麻烦。所以添加不要用它。
 *  为什么删除慢 因为需要把删除后面的往前移动
 *  
 *  
 *  构造方法
 *  ArrayList() 构造一个初始容量为 10 的空列表。
 *  
 *  
 *  什么时候使用ArrayList 如果是查询比较多，增删少就使用ArrayList存储这批数据。 比如说学校图书馆
 *  
 */
package jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author www.23.com
 *
 */
public class ArrayList_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); //内部维护了一个Object的数组 长度默认是空的0  jdk 7.0 为0 以前的都为10，如果不够长度增长到原来的0.5倍
		list.ensureCapacity(100);//修改Object数组默认长度  构造方法就能实现所以一般不用
		list.trimToSize();//假如Object数组默认是10个如果只是用了3个使用这个将数组调增，一般不用。
		
		System.out.print(list.size());
		
		
		
		//book 类
		ArrayList bookList = new ArrayList();
		bookList.add(new Book("java编程思想"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("java编程思想"));
		bookList.add(new Book("java编程思想"));
		bookList.add(new Book("java编程思想"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("深入java web"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("java核心技术"));
		bookList.add(new Book("java编程思想"));
		bookList.add(new Book("java编程思想"));
		bookList.add(new Book("java编程思想"));
		
		
		/*for(int i = 0; i < bookList.size(); i++){
			Book a = (Book)bookList.get(i);
			for(int j = i+1; j < bookList.size(); ){
				Book b = (Book)bookList.get(j);
				if(a.name.equals(b.name)){
					bookList.remove(j);
					System.out.println(j);
				}else{
					j++;
				}
			}
		}*/
		
		//迭代器方法
		//List bklist = bookList;
		ListIterator it = bookList.listIterator();
		while(it.hasNext()){
			int idx = it.nextIndex();
			Book a = (Book) it.next();	
			if(idx != bookList.lastIndexOf(a)){
				it.remove();
			}
		}
		System.out.print("len" + bookList.size());
	}

}


class Book{
	int id = 0;
	String name;
	public Book(String name){
		this.id++;
		this.name = name;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return name == ((Book)obj).name;
	}
	
	
}
