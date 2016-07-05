/**
 * Collection   
 *     list  
 *         LinkedList
 *         
 *  
 * 
 * LinkedList
 * �ص�
 * �ײ�ʹ����˫���������ݽṹʵ�ֵģ���ѯ���������
 * ʵ��ԭ��
 * 
 * Ϊʲô��ѯ����
 * ��Ϊʹ�õ���������������ʵ�֣��ڴ��ַ����������ֻ��һ�����ƶ��α꣬�޷�����������ֱ���ƶ�100���ڴ��ַ��Ϊ�����ַ��������������������һ�����ҡ�
 * ��ɾ�ٶȷǳ����
 * �������ļ���һ��Ԫ�أ����ۣ�ֻ��Ҫ���������������߿��ϣ�Ȼ�������͸������ӣ����ۺ��������Ӿ����ˣ�����Ҫ������ļ��ϡ�
 * 
 * 
 * LinkedList�����з���
 * addFirst
 * addLast
 * getFirst
 * getLast
 * removeFirst
 * removeLast
 * 
 * 1.ջ
 * push
 * pop
 * �Ƚ����
 * ����
 * offer
 * poll
 * �Ƚ��ȳ�
 * 
 * ��������ĵ�������
 * descendingIterator
 * 
 * 
 */
package jihe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author www.23.com
 *
 */
public class LinkedLists {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		
		//ɾ���Ķ���ɾ�����Ǹ���������
		ll.add("ccc");
		ll.add("ccc");
		ll.addFirst("dlc");//��ӵ�ͷ���
		ll.addLast("last");//��ӵ�β���
		ll.getFirst();//��ȡͷ���
		ll.getLast();//��ȡβ���
		ll.removeLast();//ɾ��β��� ����ɾ�����Ǹ�β���
		ll.removeFirst();//ɾ��ͷ��� ����ɾ�����Ǹ�ͷ���
		
		//ʹ��LinkedListģ��ջ�����ݽṹ
		ll.push("add1");//��ջ
		ll.push("add2");
		ll.push("add3");
		ll.push("add4");
		ll.pop();//��ջ��ջ������Ԫ��
		//ʹ��LinkedListģ����е����ݽṹ
		ll.offer("offer1");//���� ��ջ��β����ȥ
		ll.offer("offer2");
		ll.offer("offer3");
		ll.offer("offer4");
		System.out.println(ll.poll());//���� ջͷ��ȥ
		
		//�������
		java.util.Iterator it = ll.descendingIterator();//�Ӽ���β�����ϱ���
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ArrayList al = new ArrayList(ll);
		System.out.println(al);
	}
	

}
