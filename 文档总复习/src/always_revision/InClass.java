/**
 * 内部类
 * 定义在类内部的类为内部类，作用可以直接方法外部类的成员。
 * 根据定义的位置不同作用域也不同，定义在成员上的类叫做成员内部类，定义在局部的也叫作局部内部类。
 * 成员内部类所有的成员对其都可以见，局部内部类，所有的局部不变量对其可见。
 * 
 * 如何调用内部类
 * OutClass.InClass inclass = new OutClass().new InClass();
 * inClass.say();
 * 
 * 成员内部类细节
 * 1.如果成员内部类定义为private对外也是不可见的。
 * 2.如果内部类定义了静态的成员，那么这个内部类必须被static 修饰，静态类内部必须使用静态成员。
 * 3.如果内部类和外部类的成员名字重复，如果想调用外部的可以使用OutClass.this
 * 
 * 
 * 局部内部类
 * 只能访问外部函数的final 修饰的成员变量
 * 
 * 
 * 匿名内部类
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class InClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//非静态内部类调用
		/*OutClass.InClass inclass = new OutClass().new InClass();
		inclass.say();*/
		
		/*静态的调用
		 * OutClass.InClass inclass = new OutClass.InClass();*/
		
		
	}

}


class OutClass {
	private String str = "this is OutClass";
	static class InClass{
		static int a = 1;
		static void say(){
			//System.out.println(str);
		}
	}
	void say(){
		System.out.println("out call in");
		new InClass().say();
		final int a = 1;
		class hi{
			void say(){
				System.out.println(a);
			}
		}
	}
}