/**
 * 异常体系
 * Throwable
 *     |----Error(错误)
 *     |----Exception(异常)
 *         |----RuntimeException 运行时异常
 *         |----非运行异常
 * 
 * Error 会抛出Error类别的错误
 * Exception 会抛出Exception错误
 * 
 * java虚拟机默认管理了64M的内存如果超出就会抛出错误级别的异常
 * //java.lang.OutOfMemoryError  可以看到抛出的是。。。Error
   byte [] a = new byte[1024*1024*1024];
       例如 java 一个不存在的文件 抛出找不到文件。
   
        可以这么理解 Error 是 jvm级别的错误，一般不需要改代码。当然如果是内存溢出需要改代码，一般是程序员无法解决的，只能回避。
 	
 * Exception 的体系
 *     运行时异常    		 只有在运行的时候才能扑捉的错误 例如 int a = 1; a / 0; 
 *     非运行时异常		 编译的时候就能铺货错误 int a; a += 1; 没有赋初值
 * 	
 * Throwable 类
 * toString(); 输出异常类名 a / 0 java.lang.ArithmeticException
 * getMessage(); 输出异常的信息 / by zero
 * printStackTrace(); 打印栈的信息，包括错误异常类，错误信息，还会提示错误的行等  包名.类名.方法.异常行。
 * 找异常是从外往里找，抛出异常是从里往外抛。
 * 
 * at always_revision.TryCatch.call(TryCatch.java:47)
 * at always_revision.TryCatch.main(TryCatch.java:42)
 * 
 * 异常处理
 * try{异常代码}catch(异常类 e){处理异常的代码}
 * 当异常被处理的程序会继续执行，如果不处理就此结束。
 * 
 * 多异常
 * 多异常，如果一个try块中有多种异常可以分别用多个catch 捕获，当然了同一时间只能捕获一种异常，因为一旦异常
 * 就会去相应的捕获catch中，后面的就不执行了。
 * try{
 * }catch(空指针类 e){
 * 
 * }catch(数组下标越界类 e){}
 * 
 * 总结
 * 1.程序中有多个异常需要处理，那就对异常的代码块使用try 追加多个异常对应的catch
 * 2.如果异常被catch捉到就会执行 try{}catch(){} 后面的语句否则程序终止
 * 3.try 如果有多句异常，只能执行第一个异常，异常后的语句不执行（try中的）
 * 4.可以使用多态处理异常 Exception。它可以接收所有的运行时异常。
 * 5.多个catch的执行顺序，从上到下，如果有字符类的关系，一定要子类在上父类在下，因为如果父类在上
 * 子类异常永远执行不到，这时候会报编译错误，也就所谓的不可能执行代码（废话代码）。
 * 6.异常一定细化，不要为了方便都用Exception
 * 7.异常作用，就是当程序代码错误的时候不抛给用户，采取其他的解决方案。
 * 
 * 
 * 
 * 自定义异常
 * class NoIpException extends Exception{	
	public NoIpException(String msg){
		super(msg);
	}
	}
 * 1.继承Exception 在自定义异常类后面也要加Exception这个是遵守规范而已。
 * 
 * 运行时异常
 * RuntimeException 这个异常可以当做壳子，经过它包装的异常抛出后 调用者可以处理也可不出处理，在抛出的时候自己的函数也可以不用throws声明。
 * throw new RuntimeException(new Exception()); 使用壳子包装一下 就可以不用throws 声明和调用者处理了。
 * 但是如果没有捕获，出现了异常程序就停止了。
 * 
 * 非运行时异常就是编译的时候会去检查
 * 如果出现了非运行时异常必须用try catch 或 throws 扔出去处理
 * 只要是不继承自RuntimeException 就是非运行异常。
 * 自定义的异常，一般都是非运行时异常
 * 
 * 子类从写父类带异常的方法，只能抛出比父类级别小的或者不抛出！！！ 父类抛出几个异常子类就抛出几个异常。
 * 
 * finally 适合放释放资源的代码。不管是否异常都会执行的代码块。当程序退出了就不执行了。只有System.exit(0); 可以停止；return 都不能停止。
 */
package always_revision;
 
/**
 * @author www.23.com
 *
 */
public class TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Throwable t = new Throwable("myself create message");
		call();
		
	}
	static void call(){
		try{
			int a = 1;
			System.out.println(a / 0);
		} catch(Exception e){
			e.printStackTrace();
			 
		}
	}
	static void noIp() throws NoIpException{
		throw new NoIpException("no ip address");
	}
}

class NoIpException extends Exception{	
	public NoIpException(String msg){
		super(msg);
	}
}
