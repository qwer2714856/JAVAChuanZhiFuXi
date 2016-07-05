/**
 * Java 找适合对象干适合的事情
 * 对象 2种 1.自定义，2.sun提供的类库（只要知道知道有什么类行了，强行记忆的很多）
 * 所有的类都继承与Object（包括自定义的） 可以用instanceof 测试
 * 学习类一般从顶层类开始学。Object是顶层
 * 包名+类名 详细类名
 * java 的所有源代码都在jdk下面的src.zip里面
 * 通过eclipse 的快捷键查看元代吗的方式，2个快捷键，1按住ctrl+鼠标滑到那个方法上左键 2 选中那个方法然后F3 或者去src.zip源文件里面找去
 * 设置字体搜索的那个地方将text换成keys就可以设置快捷键
 * java 重写了一个equals要在重写一个hashCode方法 因为hashCode 存的就是个地址所以要重写成和equals比较一样的
 * Object
 * toString() 
 * equals()
 * hashCode()
 * 当一个对象要被回收的时候会先调用 Object类的finalize() ，其他对象集成它有这个方法
 * 配合System.gc()使用
 */
package com.ersan.object;

class Person{
	String name = "aaa";	
	
	public String toString() {
		return "name=" + this.name;
	}
	
	public boolean equals(Object obj) {
		return this.name == ((Person)obj).name;
	}
	public int hashCode(){
		return 0;
	}
}

/**
 * @author www.23.com
 *
 */
public class Objects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objects a = new Objects();
		//toString
		/*toString

		public String toString()
		返回该对象的字符串表示。通常， toString 方法会返回一个“以文本方式表示”此对象的字符串。结果应是一个简明但易于读懂的信息表达式。建议所有子类都重写此方法。
		Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、at 标记符“@”和此对象哈希码的无符号十六进制表示组成。换句话说，该方法返回一个字符串，它的值等于：

		getClass().getName() + '@' + Integer.toHexString(hashCode())这个是对象的内存地址
		 
		返回：
		该对象的字符串表示形式。
		toString 作用
		直接输出一个对象和一个对象的toString方法返回值一样。
		为什么？
		System.out.println(a)看源代码就知道
		toString()的作用 ？
		将父类Object重写可以得到一个完整对象信息例如Person的重写
		*/
		//System.out.println(a.toString());
		//System.out.println(new Person());
		
		
		
		
		
		//equals
		/*equals

		public boolean equals(Object obj) 
		！！！《默认比较内存地址》！！！
		字符串不是比的就是值
		和toString()一样和现实中不一样就重写他
		
		指示其他某个对象是否与此对象“相等”。
		equals 方法在非空对象引用上实现相等关系：

		自反性：对于任何非空引用值 x，x.equals(x) 都应返回 true。
		对称性：对于任何非空引用值 x 和 y，当且仅当 y.equals(x) 返回 true 时，x.equals(y) 才应返回 true。
		传递性：对于任何非空引用值 x、y 和 z，如果 x.equals(y) 返回 true，并且 y.equals(z) 返回 true，那么 x.equals(z) 应返回 true。
		一致性：对于任何非空引用值 x 和 y，多次调用 x.equals(y) 始终返回 true 或始终返回 false，前提是对象上 equals 比较中所用的信息没有被修改。
		对于任何非空引用值 x，x.equals(null) 都应返回 false。
		Object 类的 equals 方法实现对象上差别可能性最大的相等关系；即，对于任何非空引用值 x 和 y，当且仅当 x 和 y 引用同一个对象时，此方法才返回 true（x == y 具有值 true）。

		注意：当此方法被重写时，通常有必要重写 hashCode 方法，以维护 hashCode 方法的常规协定，该协定声明相等对象必须具有相等的哈希码。

		参数：
		obj - 要与之比较的引用对象。
		返回：
		如果此对象与 obj 参数相同，则返回 true；否则返回 false。*/
		
		/*Person a1 = new Person();
		Person a2 = new Person();
		System.out.println(a1.equals(a2));*/
		 
		
		//hashCode
		Person hashcode = new Person();//hashCode是一个对象的内存地址
		System.out.println(hashcode.hashCode());//内存地址
		Person hashcode2 = new Person();//hashCode是一个对象的内存地址
		System.out.println(hashcode2.hashCode());//内存地址
	}

}
