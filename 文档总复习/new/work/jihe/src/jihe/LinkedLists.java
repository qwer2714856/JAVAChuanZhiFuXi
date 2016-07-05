/**
 * Collection   
 *     list  
 *         LinkedList
 *         
 *  
 * 
 * LinkedList
 * 特点
 * 底层使用了双向链表数据结构实现的，查询慢，插入块
 * 实现原理
 * 
 * 为什么查询慢？
 * 因为使用的是链表，不是数组实现，内存地址不连续，它只能一个个移动游标，无法像数组那样直接移动100个内存地址因为数组地址连续，而链表不连续所以一个个找。
 * 增删速度非常快的
 * 张三李四加入一个元素（个哇）只需要将张三和李四连线砍断，然后张三和个哇链接，个哇和李四链接就行了，不需要调整大的集合。
 * 
 * 
 * LinkedList的特有方法
 * addFirst
 * addLast
 * getFirst
 * getLast
 * removeFirst
 * removeLast
 * 
 * 1.栈
 * push
 * pop
 * 先进后出
 * 队列
 * offer
 * poll
 * 先进先出
 * 
 * 返回逆序的迭代对象
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
		
		//删除的都把删除的那个弹回来。
		ll.add("ccc");
		ll.add("ccc");
		ll.addFirst("dlc");//添加到头结点
		ll.addLast("last");//添加到尾结点
		ll.getFirst();//获取头结点
		ll.getLast();//获取尾结点
		ll.removeLast();//删除尾结点 返回删除的那个尾结点
		ll.removeFirst();//删除头结点 返回删除的那个头结点
		
		//使用LinkedList模拟栈的数据结构
		ll.push("add1");//进栈
		ll.push("add2");
		ll.push("add3");
		ll.push("add4");
		ll.pop();//出栈，栈顶弹出元素
		//使用LinkedList模拟队列的数据结构
		ll.offer("offer1");//进队 从栈的尾部进去
		ll.offer("offer2");
		ll.offer("offer3");
		ll.offer("offer4");
		System.out.println(ll.poll());//出队 栈头出去
		
		//逆向迭代
		java.util.Iterator it = ll.descendingIterator();//从集合尾部向上遍历
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ArrayList al = new ArrayList(ll);
		System.out.println(al);
	}
	

}
