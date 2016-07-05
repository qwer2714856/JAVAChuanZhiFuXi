/**
 * HashMap
 */
package shuanglijihe;

import java.util.HashMap;

/**
 * 它是基于hash表实现的
 * 它的实现原理
 * 往hashmap 添加数据的时候会调用键的hashCode 然后移位计算出位置...剩下的和HashSet一样   这个是调用键的。 hashCode 和 equals 都调用，这个只是调的是key
 * //这里注意一个坑，这里的put 和 HashSet的那个add不一样，这是后面的可以挤掉前面，而add的那个是如果重复直接加不进去返回false,put是挤掉那个原有的并返回 键不变值变了。
 * @author www.23.com
 *
 */
public class HashMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Person, String> hm = new HashMap<Person,String>();
		//这里注意一个坑，这里的put 和 HashSet的那个add不一样，这是后面的可以挤掉前面，并且返回前面的，键不变值变了。
		hm.put(new Person("aaa1",1), "aaa1");
		hm.put(new Person("aaa2",1), "aaa2");
		hm.put(new Person("aaa1",1123), "aaa3");
		System.out.println(hm);
	}

}

class Person{
	int id;
	String name;
	public Person(String name,int id){
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return name.equals(((Person)obj).name);
	}
	
}
