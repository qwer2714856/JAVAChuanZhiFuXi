/**
 * ArrayList
 * Collection
 *     list---�����ʵ����
 * 	       ArrayList ����
 * 		   LinkedList����
 * 		   Vector(�˽⼴��)
 *  
 *  ArrayList ��һЩ����
 *  	ensureCapacity(int minCapacity)  �˽���У�����������
 *  	trimToSize()  �˽����
 *  ��ҪѧArrayList ʵ��ԭ����ص�
 *  ���ص㣩
 *  ��ѯ�ٶȿ죬��ɾ����
 *  Ϊʲô��ѯ�죬��Ϊ�ڲ�ά����һ��Object���飬������ڴ��ַ�������������ڲ�ѯ��ʱ���α���ԼӼ��ƶ���ָ����λ�ã�������ص㣩��
 *  Ϊʲô������ ��Ϊÿ�ζ�Ҫ������鳤���Ƿ��ã����������� Ҫ��������������Ҫ����һ���µ����齫�ɵ����鿽�������� ������������ǳ����ٿ�����ʱ��Ƚ��鷳��������Ӳ�Ҫ������
 *  Ϊʲôɾ���� ��Ϊ��Ҫ��ɾ���������ǰ�ƶ�
 *  
 *  
 *  ���췽��
 *  ArrayList() ����һ����ʼ����Ϊ 10 �Ŀ��б�
 *  
 *  
 *  ʲôʱ��ʹ��ArrayList ����ǲ�ѯ�Ƚ϶࣬��ɾ�پ�ʹ��ArrayList�洢�������ݡ� ����˵ѧУͼ���
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
		ArrayList list = new ArrayList(); //�ڲ�ά����һ��Object������ ����Ĭ���ǿյ�0  jdk 7.0 Ϊ0 ��ǰ�Ķ�Ϊ10�������������������ԭ����0.5��
		list.ensureCapacity(100);//�޸�Object����Ĭ�ϳ���  ���췽������ʵ������һ�㲻��
		list.trimToSize();//����Object����Ĭ����10�����ֻ������3��ʹ����������������һ�㲻�á�
		
		System.out.print(list.size());
		
		
		
		//book ��
		ArrayList bookList = new ArrayList();
		bookList.add(new Book("java���˼��"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("java���˼��"));
		bookList.add(new Book("java���˼��"));
		bookList.add(new Book("java���˼��"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("����java web"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("java���ļ���"));
		bookList.add(new Book("java���˼��"));
		bookList.add(new Book("java���˼��"));
		bookList.add(new Book("java���˼��"));
		
		
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
		
		//����������
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
