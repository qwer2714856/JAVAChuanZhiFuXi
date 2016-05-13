/**
 * 设计模式
 * 什么是设计模式？
 * 就是前人总结出来的为了解决一类问题的流程。
 * 
 * 单例设计模式
 * 解决一个类在内存中只有一份
 * 
 * 单例设计模式的懒汉设计模式是存在线程安全的问题的
 * 线程安全的解决方案
 * if(s==null){
 *     synchronized("lock"){
 *     	   if(s == null){
 *             s = new Single();
 *         }
 *     }
 * }
 * return s; 第一次慢其它的时候快
 * 
 * 
 * 模板设计模式
 * 当需要有部分代码需要修改的时候其它代码固定，可以使用模板模式。
 * 比如讲计算一段程序的运行时间，开始时间和结束时间是固定的，只有被测试的代码是不固定的所以这个
 * 就可以用实现一部分不能实现的交个它的子类。抽象类来做
 * 
 * 固定的使用final 修饰方法，不固定的抽象为抽象方法让子类去实现。
 * 
 * 装饰着模式
 * //繁琐的实现
 * //需求1在输出文件行的时候打印行号。
 * 总结：
 * 第一步
 * 增强子类中维护者被增强类的引用。
 * 第二步
 * 构造初始化
 * 第三步
 * 增强方法调用被维护类的增强方法，这里是多态
 * 举例
 * 现在有三个类A B C 功能是在BufferedReader 的readLine上多打印A B C 如果维护着被增强类的引用就可以接着调用，三个类完成7个功能。
 * A B C  AB AC BC ABC 
 * 第一步
 * class ZsA extends BufferedReader{
	private BufferedReader bufferedReader;
 * 
 * class ZsB extends BufferedReader{
	private BufferedReader bufferedReader;
 *
 * class ZsC extends BufferedReader{
	private BufferedReader bufferedReader
 *
 * 第二步
 * public ZsA(BufferedReader in) {//Reader是所有字符流的基类
		super(in);
		this.bufferedReader = in;
		// TODO Auto-generated constructor stub
	}
 * 第三步
 * public String readLine() throws IOException{
		String rt = bufferedReader.readLine(); //因为是多态 bufferedReader 可以接收 ZsA 的实例 ZsB的实例 ZsC的实例 所以就有了继续增强的效果，这里是拿着实现类的实现接着实现。
		if(rt != null){
			rt = 'A'+rt;
		}
		return rt;
	}
 *
 *
 * 装饰着设计模式和继承的优缺点
 * 首先他们都可以完成增强类的功能
 * 
 * 继承：结构清晰，体系庞大，每当有新功能就需要扩展，扩展和扩展之间，不能相互组合使用。
 * 
 * 装饰着模式： 结构稍微复杂，体系不大，但是扩展和扩展之间可以相互嵌套。
 * 
 */
package always_revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

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
		
		
		//装饰着设计模式
		//这样做的弊端就是每扩展一个功能就要去扩展一个类，造成类的泛滥。
		/*Zs zs = null;
		try {
			zs = new Zs(new FileReader("d:/test2.txt"));
			String tmp = "";
			while((tmp = zs.readLine()) != null){
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				zs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		//完整的装饰着设计模式。
		//思想就是利用多态，在每个子增强类上，维护者要增强类的引用。
		//现在有三个类A B C 功能是在BufferedReader 的readLine上多打印A B C 如果维护着被增强类的引用就可以接着调用，三个类完成7个功能。
		//A B C  AB AC BC ABC 
		//这个例子就是完成ABC的
		/*ZsA zsa = null;
		try {
			zsa = new ZsA(new ZsB(new ZsC(new BufferedReader(new FileReader("d:/test2.txt")))));
			String tmp = "";
			while((tmp = zsa.readLine()) != null){
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				zsa.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
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


//装饰着设计模式
class Zs extends BufferedReader{
	private int readCount;
	public Zs(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub	
	}
	
	public String readLine() throws IOException{
		String rt = super.readLine();
		if(rt != null){
			rt = ++readCount + rt;
		}
		return  rt;
	}

}
//现在要扩展的是BufferedReader 的readLine方法。
class ZsA extends BufferedReader{
	private BufferedReader bufferedReader;
	public ZsA(BufferedReader in) {//Reader是所有字符流的基类
		super(in);
		this.bufferedReader = in;
		// TODO Auto-generated constructor stub
	}
	public String readLine() throws IOException{
		String rt = bufferedReader.readLine();
		if(rt != null){
			rt = 'A'+rt;
		}
		return rt;
	}
}
class ZsB extends BufferedReader{
	private BufferedReader bufferedReader;
	public ZsB(BufferedReader in) {
		super(in);
		this.bufferedReader = in;
		// TODO Auto-generated constructor stub
	}
	
	public String readLine() throws IOException{
		String rt = bufferedReader.readLine();
		if(rt != null){
			rt = 'B'+rt;
		}
		return rt;
	}
}

class ZsC extends BufferedReader{
	private BufferedReader bufferedReader;
	public ZsC(BufferedReader in) {
		super(in);
		this.bufferedReader = in;
		// TODO Auto-generated constructor stub
	}
	public String readLine() throws IOException{
		String rt = bufferedReader.readLine();
		if(rt != null){
			rt = 'C'+rt;
		}
		return rt;
	}
}


