/**
 * TreeSet 红黑树（二叉树结构）
 * 对键进行排序的其它和TreeSet一样
 * 注意
 * 1.和TreeSet一样 只是TreeSet是按照值，这个是按照键。
 */
package shuanglijihe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author www.23.com
 *
 */
public class TreeMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//非自然顺序的
		TreeMap<Persons, String> tm = new TreeMap<Persons, String>(new Comparators());
		tm.put(new Persons("aaa",1),"v1");
		tm.put(new Persons("aaa",2),"v2");
		tm.put(new Persons("aaa",3),"v3");
		tm.put(new Persons("aaa",4),"v4");
		tm.put(new Persons("aaax",4),"v5");
		tm.put(new Persons("aaaee",4),"v6");
		System.out.println(tm);
		
		//自然顺序的
		TreeMap<Character, Integer> tmi = new TreeMap<Character, Integer>();
		tmi.put('a', 1);
		tmi.put('b', 1);
		tmi.put('c', 1);
		tmi.put('d', 1);
		tmi.put('e', 1);
		System.out.println(tmi);
	}
}
class Persons implements Comparable<Persons>{
	int id;
	String name;
	public Persons(String name,int id){
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	 
	public int compareTo(Persons o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
}
class Comparators implements Comparator<Persons>{

	public int compare(Persons o1, Persons o2) {
		Persons a1 = o1;
		Persons a2 = o2;
		return a1.id - a2.id;
	}	
}
