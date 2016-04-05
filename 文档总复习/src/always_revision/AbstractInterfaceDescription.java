/**
 * 
 */
package always_revision;

import java.util.Scanner;

/**
 * @author www.23.com 抽象类和接口
 * 
 *         抽象类 当描述一个类的时候里面有不确定的方法，需要子类去实现可以用抽象类，不确定的方法 是抽象方法。 有抽象方法的类是抽象类。
 *         比如讲有个动物类，动物都会叫，狗继承动物，猫继承动物，然而动物类的叫无法适应所有的类 所以可以将叫定义抽象方法。
 * 
 *         抽象类的特点 1.有抽象方法的类一定是抽象类。 2.抽象类不一定有抽象方法。
 *         3.抽象类不能被实例化（因为里面可能有抽象方法，抽象方法没有方法体无法调用所以不能实例化）。
 *         4.抽象类是为了提高代码复用性，让子类继承使用的。
 *         5.编译器强制让子类去实现父类没有实现的抽象方法，如果子类不想实现，那么子类声明为抽象的。
 * 
 *         抽象类的优点 1.提高代码复用性。 2.强制子类实现父类的方法。 3.提高代码的扩展性，提高后期维护。
 * 
 *         抽象类是否有构造函数？ 为了初始化，抽象类中的成员变量。
 * 
 *         final 不能和abstract一起修饰 因为abstract 的目的是让子类重写，而final是禁止重写，矛盾。
 * 
 *         abstract 只能用户方法和类
 * 	
 * 			
 * 		   	抽象类的注意细节
 * 			1.抽象类可以没有抽象放。
 * 			2.抽象类是可以继承普通类的。
 * 			3.抽象类不能实例化，但可以有构造方法 而且是一定有的。
 * 			4.abstract 与其它关键符的关系。
 * 				final 不能与 abstract共存
 * 				static 不能和abstract共存，原因用static修饰的可以使用类名调用，当abstract修饰方法方法没有方法体所以报错。
 * 				private 不能和abstract共存，原因子类无法重写。
 * 
 * 
 * 
 * 值交换
 * 值交换 注意作用域，出了作用域就废了。
 * 引用交换换的是地址。
 * 
 * 值交换的内存图
 * 当main 被jvm调用会在栈区开辟一个空间，数据main自己的空间，当main调用其它函数other,会在栈区开辟另一个空间other当other结束里面
 * 的所有局部变量都将随着other的执行结束而销毁
 * 
 * main int a int b;
 * other(a,b);
 * a ^=b;
 * b ^= a;
 * a ^=b;
 * 这个时候ab是数据other空间的 所以other结束被回收后main的ab没有变化。
 * 
 * 引用交换
 * main 
 * int []a = {1,2,3,4} 现在a存放的是一个地址
 * other(a) 这里传入的是一个 引用交换是地址交换。
 * 
 * Interface 接口
 * 接口的概述
 * java 可以使用接口来克服单继承的缺陷，接口可以用作对类进行功能扩展。
 * 例如
 * 一个圆继承了图形类，但是平面图形只有求周长和面，这个时候想让这个圆把体积求出来，可以创建一个接口增强体积让这个圆去实现。
 * 格式：
 * interface it{} 注意接口也会生成一个class文件
 * 一个类可以实现多个接口用, implements a,b
 * 
 * 接口可以实现的功能
 * 1.增加类的功能，类没有通过类实现接口可以让类增强。
 * 2.定义规范
 * 3.解耦
 * 4.多态
 * 
 * 接口的注意
 * 1.如果定义成员变量修饰符是 
 * public static final
 * 2.成员方法是
 * public abstract 
 * 注意这两个如果没有名写是jvm自动加上去的。
 * 3.有抽象函数的不一定抽象类，也可能是接口 。
 * 4.接口的方法都是抽象的不能实例化
 * 5.接口没有构造
 * 6.子类不能使用super 因为接口和类没有继承关系，而且在说了结构的成员变量是静态的，方法是抽象的。
 * 7.接口接口之间叫继承，接口和类之间实现关系。
 * 8.class a implements b,c,d{}
 * 9.interface x extends m,q{}  接口在继承接口的可以多继承。类在实现接口可以多实现。
 * 
 * 多态
 * 什么是多态，简单的讲就是一个对象多种形态。
 * 多态是，父类的引用指向子类对象实例。
 * class Fu{}
 * class Zi extends Fu{}
 * Fu fu = new Zi();
 * 父类引用指向子类的实例对象
 * 总结：
 * 多态下
 * 1.当父类具有和子类相同的成员变量（不管是否静态）调用的都是父类的成员变量。
 * 2.子类重写父类的成员方法（非静态），默认调用的是子类的。
 * 3.子类重写父类的成员方法（静态的），默认调用的是父类的。
 * 4.如果想调用子类的非静态方法父类必须要有，否则无法调用。关系就是父类的方法一定是被子类重写的，调用父类方法才是调用子类的。
 * 总结其实就是当父类引用指向子类对象实例，调用的时候只有非静态方法调用的是子类的。其余都是调用父类的。
 * 多态的前提
 * 父类和子类是有继承或者是实现关系的。
 * 多态的弊端
 * 就是只能使用父类有的成员，而子类特定的成员是不能再多态上使用的。
 * 
 * 多态的一些特点
 * 1.编译时期查看多态的引用类是否具有该成员，没有报错。
 * 2.运行期间查看子类是否有重写父类的方法有就调用子类的没有调用父类的（非静态的）
 * 
 * 多态的应用场景
 * 1.形参 接收更多的关系类。
 * 2.返回值 可以返回任意子类。
 * 
 * 多态的类型转换（如何让父类调用到子类的特有方法？使用类型转换可以实现）
 * 1.基本的数据类型转换
 *   自动 小->大
 *   强转 大->小
 * 2.类的类型转换（必须存在继承或实现关系，即存在多态关系）
 *   父类引用指向子类的实例    自动 小转大  （多态）
 *   父类的引用 转向 实例         强转  大转小  配合 instanceof 效果更佳  Fu f = new Zi();   Zi zi = (Zi)f; 这样就可以调用子类特有的方法了。
 * 注上面的类类型转换是建立在多态的基础上的，如果  Fu f = new Fu();  Zi zi = (Zi)f;这样报的是运行时异常类型转换错误。
 * 存在继承实现关系，可以转换。
 * 
 * 多态的例外
 * Fu f = new Zi1();
 * Zi zi = (Zi)f;  //父类引用指向的是子类Zi1 然而强转Zi 这样是没有办法调用Zi1的特有方法的。 这样报的是运行时异常类型转换错误。
 * 
 * 
 * 
 * 
 */
public class AbstractInterfaceDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Rect rect = new Rect(2.0,2.0);
		rect.setC(99);
		rect.setK(100);
		rect.sayShapeZc();
		rect.sayShapeMj();*/
		
		/*Circle c = new Circle(4);
		//c.setR(9);
		c.sayShapeMj();
		c.sayShapeZc();*/
		/*Fu fu = new Zi();
		fu.say();*/
		
		 
	}
 

}

abstract class MyShape {
	public String shapeName;

	public MyShape(String shapeName) {
		this.shapeName = shapeName;
	}

	public double mj;
	public double zc;
	
	abstract void zc();

	abstract void mj();

	public void sayShapeZc() {
		zc();
		System.out.println(this.shapeName+"周长是："+this.zc);
	}

	public void sayShapeMj() {
		mj();
		System.out.println(this.shapeName+"面积是："+this.mj);
	}

}

class Rect extends MyShape{
	private double c;
	private double k;
	
	public Rect(double c,double k){
		super("矩形");
		this.c = c;
		this.k = k;
	}
	@Override
	void zc() {
		// TODO Auto-generated method stub
		zc = (c+k)*2;
	}

	@Override
	void mj() {
		// TODO Auto-generated method stub
		mj = c*k;
	}
	
	void setC(double c){
		this.c = c;
	}
	
	void setK(double k){
		this.k = k;
	}
	
	void setCK(double c, double k){
		this.c = c;
		this.k = k;
	}
}

class Circle extends MyShape{
	private static final double PI = Math.PI;
	private double r;
	
	Circle(double r){
		super("圆形");
		this.r = r;
	}
	@Override
	void zc() {
		// TODO Auto-generated method stub
		zc = 2 * PI * r;
	}

	@Override
	void mj() {
		// TODO Auto-generated method stub
		mj = PI * Math.pow(r, 2);
	}
	void setR(double r){
		this.r = r;
	}
}


class Fu{
	int a = 1;
	void say(){
		System.out.println(a);
	}
}
class Zi extends Fu{
	int a = 2;
	void say(){
		System.out.println(a);
	}
}



 
