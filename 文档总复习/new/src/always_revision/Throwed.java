/**
 * 异常抛出
 * 在方法抛出异常的时候需要在方法上面声明异常，否则报错。
 * public static void div(int x, int y) throws Exception{
		if(y == 0){
			throw new Exception("除数不能为0");
		}
	}
 * 抛出一个异常
 * throw new Exception("除数不能为0");
 * 在方法上声明异常
 * throws Exception
 * 
 * div(1,2);调用者必须需要用try{div(1,2);}catch(){} 处理否则编译错误。
 * 
 * div(1,2);的处理方式有两种1.捕获  2.接着抛出。
 * 1.  try{div(1,2);}catch(){}
 * 2.  在调用函数上直接在抛出异常throws 异常
 * 
 * throw 和 throws 区别
 * 相同点：
 *     都是做异常处理的
 * 不同点：
 *     throws 是在函数上的，后面如果有多个异常类用,分割 （函数上）
 *     throw 后面跟的是异常对象。				   （函数内）
 * 
 * 
 * 总结：
 * 1.try不能单独存在，可以和catch finally 配合使用 try catch finally, try catch,try finally
 * 2.catch 可以有多个，finally 只能有一个。 
 * 3.throw 后面不允许有任何代码，否则编译错误，废话。
 * 4.如果一个方法调用了，有抛出异常的方法，必须要try catch 处理否则报错。
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class Throwed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		div(1,2);
		 * 1.  try{div(1,2);}catch(){}
		 * 2.  在调用函数上直接在抛出异常throws 异常*/
		
	}
	public static void div(int x, int y) throws Exception{
		if(y == 0){
			throw new Exception("除数不能为0");
		}
		
	}

}
