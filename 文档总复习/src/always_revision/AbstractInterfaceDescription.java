/**
 * 
 */
package always_revision;

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