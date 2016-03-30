/**
 * 面向对象
 * 本期介绍java的面向对象概念
 * 
 * 万物皆对象
 * 类和对象的关系
 * 程序中，类是对象抽象出来的，而对象又是类实例化而来的，两者相辅相成。
 * 
 * 面向对象的特征
 * 1.多态   
 * 2.继承
 * 3.封装
 * 开发过程要把自己想成 上帝，在程序中你主宰一切，控制对象之间的调度。
 * 设计的过程就维护对象之间的关系。
 * 
 * 开发过程，以及设计过程
 * 
 * 对象中成员属性的默认值
 * byte 0
 * short 0
 * int 0
 * long 0
 * char \u0000
 * boolean false
 * double 0.0d
 * float 0.0f
 * 
 * 引用数据类型的都是null
 * 例如
 * String str; 默认null
 * Car c; null
 * int []a;null
 * 
 * 但是局部变量必须赋初值才能使用，成员不需要赋初值就可以用例如
 * int a;
 * 
 * a += 1;报错
 * 
 * Car a = new Car();
 * a.a+=1;不报错
 * 
 * 
 * 匿名对象
 * 主要用于
 * 1.只调用一次方法。
 * 2.作为实参的传递
 * 
 * new Car().run();
 * 
 * new Factory(new Car());
 * Factory(Car car);
 * 
 * 封装
 * 好处 
 * 1.对象细节的隐藏 
 * 2.使用方便
 * 3.对数据的保护性
 * 
 * 构造函数
 * 如果一个类，没有自定义构造函数，那么jvm会自动的添加一个无参构造函数。
 * 如果一个类,定义了构造函数那么jvm就不会自动添加这个无参的构造函数。
 * 
 * 构造函数和一般函数的区别
 * 1.函数是对象的方法，构造函数是对象初始化用的。
 * 2.函数是对象调用的，构造函数是JVM调用的对象一产生自动调用。
 * 3.函数可以调用多次，构造函数只有创建对象时候才调用。
 * 4.构造函数命名和类名同，函数只要符合命名规则即可。
 * 5.构造函数没有返回值。
 * 
 * 构造函数的注意细节
 * 1.当类没有定义构造函数，jvm自动建一个无参空的构造方法，有就不建了。（通过javap可以验证）
 * 2.构造方法可以重载。
 * 
 * 构造代码块
 * class A{
 * 	int a = 1;
 * 	{
 * 		System.out.println(a); //如果a放到构造代码块下面就无法读取a的值
 * 		say();
 * 	}
 * }
 * 代码只要实例化就会自动调用say这个方法，不必再每个构造方法中加入。
 * 
 * 构造代码块作用
 * 1.对象创建调用，优先级高于构造函数。
 * 2.与构造函数区别，构造代码块是给所有对象初始化，构造函数是为每个对象初始化。
 * 3.它就是将所有的构造方法要做的事情提取出来放到这。
 * 
 * this 关键字
 * 作用就是当局部变量和成员变量重名用this可以引用成员变量。
 * 用this 调用构造方法this(a) this(a,b) 可以这么调用构造方法。
 * 构造方法相互调用会造成编译错误。
 * this 只用在非静态里面。
 * 构造函数相互调用，this()必须放在第一句否则编译报错。
 * 
 * 
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class ClassDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Car("",1));
	}
	public static void say(){}

}

class Car{

	private String color;
	public char c;
	int a ;
	private int Lt = 2;
	public Car(String color, int lt) {
		super();
		this.color = color;
		Lt = lt;
	}
	void run(){
		System.out.println("the car run");
	}
	{
		System.out.println(this.Lt);
	}
}
