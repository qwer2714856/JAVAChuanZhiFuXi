/**
 * ��������Ҫע�������
 * 1.���� List����Ҫ��������util�������
 * 2.����������Ԫ�صĹ��̲�����ʹ�ü��϶���ı伯���е�Ԫ�ظ����������Ҫ���ӻ�ɾ��ֻ��ʹ�õ������ķ������в�������������
 * 3.�����������Ǹ�ʲô��
 * next previous�����ڵ�����������
 * ���ǵ����е�next previous ���������ʹ�ü��ϵķ�����û������ģ�����ŵ���Щ����֮ǰ�Ǳ���ġ�
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
		 * �ⲻ�Ǹ���ѭ��
		 * �����һ��Ԫ�ص�ʱ��ָ���Ǹ��������ߵģ�����ָ��ڶ���λ�ã��������һ�������ʱ��ָ���Զ����ǵ�����λ����
		 * while(it.hasNext()){
			 it.next();
			 it.add("aa");
		 }*/
		
		/* ��ѭ��
		 * while(lt.hasPrevious()){
			System.out.println(lt.previous());
			lt.add("aaa");
		}*/
		
		/**
		 * ����� ����ڵ���Ԫ�ص�ʱ��ʹ���˼��Ϸ������˼��ϸ�����ֱ�����쳣��
		 * java.util.ConcurrentModificationException
		 * ���������ѭ��
		 */
		/*while(lt.hasNext()){
			lt.next();
			list.add("admin");
		}*/
		//ͬ������
		 /*while(lt.hasNext()){
			 lt.next();
		 }
		 while(lt.hasPrevious()){
				lt.previous();
				list.add("admin");
		  }*/
	 
	}

}
