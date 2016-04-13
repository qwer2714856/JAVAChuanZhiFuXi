/**
 * 前导
 * 当一个集合中存储不同类型的时候，如果按照同一一种类型强转会报强转错误。
 * 例如
 * 		ArrayList ay = new ArrayList();//当没有对集合指定什么类型的时候可以存任意类型，因为底部维护的是Object数组
		ay.add(new QDc1());
		ay.add(new QDc2());
		Iterator it = ay.iterator();
		while(it.hasNext()){
			QDc1 q1 = (QDc1)it.next();//因为上面没有指定类型所以这里强转按照一种类型强转显然会报错。
		}
 * 发现虽然集合可以存任意类型的数据，但如果需要使用对象方法就需要强转，如果集合存入不同类型的对象发生强转失败，我们应该将这错误放到
 * 程序运行前检查，而不是运行中检查。如何强制集合只能传特定类型的数据？那就要用到泛型
 * 
 * 泛型 jdk5.0出现
 * 泛型的格式
 * 集合<类型> 变量名  = new 集合<类型>();
 * 好处
 * 1.将运行异常，提前到了编译异常。
 * 2.遍历不要在强转了
 * 
 * 什么时候使用泛型？
 * 当类中操作的类型不确定的时候就可以使用泛型。
 * 
 * 泛型的细节
 * 1.泛型如果指定了确认类型那么就只能传入指定类型的那个数据否则编译报错。
 * 2.泛型必须使用引用类型，如果是基本数据类型需要使用包装类来包装。
 * 3.使用泛型后存入的对象就不需要强转了。
 * 
 * 泛型的方法
 * public <声明泛型> 泛型返回值 方法名字（泛型参数）{
 * 
 * }
 * public <T> T back(T str){
 * 	return str;
 * }
 * 调用back("");//这里传入的是什么T就是什么
 * 细节
 * 使用泛型方法的时候需要在方法前面声明一下，<泛型> 声明的位置在返回值前面。
 * 当一个类中多处用了泛型可以将泛型放到类上，这样就不需要声明泛型方法了。
 * class QDc1{
	public <T> T gll(T str){
		return str;
	}
	public <T> T gll2(T str){
		return str;
	}
	
	public <T> T gll3(T str){
		return str;
	}
}
class QDc2<T>{
	public T gll(T str){
		return str;
	}
	public T gll2(T str){
		return str;
	}
	
	public T gll3(T str){
		return str;
	}
}
 * 如果将泛型放到类上泛型方法就不需要在声明泛型了。 
 * 但是和泛型方法不同的是调用
 * 泛型方法直接调用如果传入什么就是什么。
 * 而泛型类需要实例化的时候指定引用类型。
 * new QDc2<Object>();
 * 
 * 
 * !!!泛型类中不可以让其中的静态方法使用泛型，因为泛型类的泛型值是在实例化之后，而静态方法可以在不实例的时候调用，
 * 所以没有办法确认泛型类型。
 * static void mmq(T str){
	 
	}
 * 报错！！！
 * 如果静态的方法需要使用泛型可以自定义，不用该类的。
 * static <T> void mmq(T str){
		 
   }
 * 
 * 如果创建泛型不指定具体类型就和Object一样。
 * 
 * 自定义泛型类
 * System.out.println(new CustomF<String,Integer>("aa",1).getName());
 * class CustomF<S,N>{
	S name;
	N age;
	public CustomF(S name, N age) {
		this.name = name;
		this.age = age;
	}
	public S getName(){
		return name;
	}
	public N getAge(){
		return age;
	}
	}
 * 
 */
package always_revision;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author www.23.com
 *
 */
public class FanXing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList ay = new ArrayList();//当没有对集合指定什么类型的时候可以存任意类型，因为底部维护的是Object数组
		ay.add(new QDc1());
		ay.add(new QDc2());
		Iterator it = ay.iterator();
		while(it.hasNext()){
			QDc1 q1 = (QDc1)it.next();//因为上面没有指定类型所以这里强转按照一种类型强转显然会报错。
		}*/
		
		gcc(new Object());
		new QDc2<Object>();
		
		
	}
	public static <T> T gcc(T str){
		return str;
	}

}
class QDc1{
	public <T> T gll(T str){
		return str;
	}
	public <T> T gll2(T str){
		return str;
	}
	
	public <T> T gll3(T str){
		return str;
	}
}
class QDc2<T>{
	public T gll(T str){
		return str;
	}
	public T gll2(T str){
		return str;
	}
	
	public T gll3(T str){
		return str;
	}
	
}
class CustomF<S,N>{
	S name;
	N age;
	public CustomF(S name, N age) {
		this.name = name;
		this.age = age;
	}
	public S getName(){
		return name;
	}
	public N getAge(){
		return age;
	}
}

