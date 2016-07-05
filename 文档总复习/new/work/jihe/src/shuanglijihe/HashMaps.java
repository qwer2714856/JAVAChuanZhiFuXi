/**
 * HashMap
 */
package shuanglijihe;

import java.util.HashMap;

/**
 * ���ǻ���hash��ʵ�ֵ�
 * ����ʵ��ԭ��
 * ��hashmap ������ݵ�ʱ�����ü���hashCode Ȼ����λ�����λ��...ʣ�µĺ�HashSetһ��   ����ǵ��ü��ġ� hashCode �� equals �����ã����ֻ�ǵ�����key
 * //����ע��һ���ӣ������put �� HashSet���Ǹ�add��һ�������Ǻ���Ŀ��Լ���ǰ�棬��add���Ǹ�������ظ�ֱ�ӼӲ���ȥ����false,put�Ǽ����Ǹ�ԭ�еĲ����� ������ֵ���ˡ�
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
		//����ע��һ���ӣ������put �� HashSet���Ǹ�add��һ�������Ǻ���Ŀ��Լ���ǰ�棬���ҷ���ǰ��ģ�������ֵ���ˡ�
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
