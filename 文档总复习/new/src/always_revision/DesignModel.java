/**
 * 设计模式
 * 什么是设计模式？
 * 就是前人总结出来的为了解决一类问题的流程。
 * 
 * 单例设计模式
 * 解决一个类在内存中只有一份
 * 
 * 
 * 
 * 模板设计模式
 * 当需要有部分代码需要修改的时候其它代码固定，可以使用模板模式。
 * 比如讲计算一段程序的运行时间，开始时间和结束时间是固定的，只有被测试的代码是不固定的所以这个
 * 就可以用实现一部分不能实现的交个它的子类。抽象类来做
 * 
 * 固定的使用final 修饰方法，不固定的抽象为抽象方法让子类去实现。
 * 
 * 
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class DesignModel {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*tmp1 tp = new tmp1();
		tp.getRunCodeTime();*/
	}

}
//懒汉 多线程存在线程安全问题
class Fc{
	private static Fc fc = null;
	private Fc(){}
	public static Fc getFc(){
		if(fc == null){
			fc = new Fc();
		}
		return fc;
	}
}

//饿汉
class Fcs{
	private static Fcs fc = new Fcs();
	private Fcs(){}
	public static Fcs getFc(){
		return fc;
	}
}


/**
* 模板设计模式
* 当需要有部分代码需要修改的时候其它代码固定，可以使用模板模式。
* 比如讲计算一段程序的运行时间，开始时间和结束时间是固定的，只有被测试的代码是不固定的所以这个
* 就可以用实现一部分不能实现的交个它的子类。抽象类来做
* 
* 什么时候用模板模式？
* 在一个代码块功能中有一部分是固定的，而其它一部分是依赖于固定代码的但是这部分代码可能有多种情况，
* 这个时候把固定的提出出来，把不固定的抽象成抽象方法，针对不同情况去实现。
*/
abstract class Template{
	abstract public void testCode();
	public final void getRunCodeTime(){
		long start = System.currentTimeMillis();
		testCode();
		long end = System.currentTimeMillis();
		System.out.println(end- start);
	}
}
class tmp1 extends Template{

	@Override
	public void testCode() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10000;i++){
			System.out.println(i);
		}
	}
	
}



