/**
 * HashSet
 * 特点
 * 无序，不可重复，重复 add返回false
 * HashSet原理
 * HashSet添加元素的时候，HashSet会先调用元素的HashCode方法得到哈希值，然后通过元素哈希值经过移位等运算就算出这个元素在哈希表的位置。
 * 计算出位置以后
 * 1.如果该位置上没有值就直接存储
 * 2.如果该位置上有值，将使用插入元素的equals方法和存在的元素进行对比。 如果在相同就视为重复元素不允许添加，如果不同就可以添加。
 * 底层使用了哈希表，存取速度快。  通过内存地址算出来的，不管谁进来都可以通过一地址个值算出来。存取都这样获取地址找到位置存获取。	
 * 
 * 由哈希表管理的
 * 什么事哈希表
 * 一张普通的表，桶式结构，一个表有多个坑，一个坑有多个萝卜。也就说一个表格可以有多个数据这就明白上面同哈希值不同equals可以存一个格子了。
 * 
 */
/*String a = "b";
		String b = new String("b");
		a == b false
		a.hashCode() == b.hashCode();
		hashCode 在Object中存储的是对象的内存地址
		然而String类应经重写了这个方法
		原理是将字符串打散为字符然后逐为算出哈希值来
		所以两个相同的字符串哈希码是相同的*/
package jihe_set;



import java.util.HashSet;

/**
 * @author www.23.com
 *
 */
public class HashSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new p("d",1));
		hs.add(new p("d",11));
		hs.add(new p("d",11));
		hs.add(new p("d",11));
		hs.add(new p("d1",12));
		hs.add(new p("d2",13));
		hs.add(new p("d3",14));
		hs.add(new p("d4",15));
		System.out.println(hs);
		
	}

}


class p{
	String name;
	int id;
	public p(String name,int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name.equals(((p)obj).name);
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
}
