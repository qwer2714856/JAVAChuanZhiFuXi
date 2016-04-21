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
 * 泛型的继承
 * class CustomFu<T>{
	
	}
	class CustomZi<T> extends CustomFu<T>{
		
	}
 * 父类的泛型如果在继承的时候不明确就让子类的对象实现 子类也需要把泛型拿过来
 * 如果明确
 * class CustomZi extends CustomFu<String>{
 * 
 * }
 * 
 * 范型接口
 * 	interface MSQl<T>{
		public T getMysql(T db);
	}
	interface Mmysql<T> extends MSQl<T>{
		
	}
 * 
 * 
 * 	interface MSQl<T>{
		public T getMysql(T db);
	}
	interface Mmysql extends MSQl<String>{
		
	}
	class a implements MSQl<String>{}
	class a<T> implements MSQl<T>{}
 *
 *
 *	泛型的通配符
 *	public static void print(Collection<?> coll){
		
	}
 * 如果形参上还有需要泛型的那么使用通配符?
 * Collection<?> coll 形参上需要进一步使用泛型。采用参数类型<通配符> 形参 注意泛型没有多台！！！！<里面定义什么就是什么没有多台> 
 * 非形参类型先声明在使用，形参类型直接用?
 * public static void print(Collection<?> col){
		Iterator<?> it = col.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
 * ArrayList<Object> l2 = new ArrayList<Object>();
 * l2.add(new Object());
 * 集合中Object 是位置有好多可能所以定义形参类型的时候需要使用泛型的通配符。接收任意值
 * 
 *  通配符的界限
 *  在形参类型后面的那个通配符可以定义它的界限
 *  例如
 *  Collection<? extends Object> coll
 *  那么在传入的时候就是Object或者Object的子类的类型都可以传入
 *  Collection<? super String> 那么可以传入String或者String的父类
 *  
 *  JDK5 中的泛型允许程序员编写集合代码，就限制集合的处理类型，把程序运行时的问题放到编译上，提高程序稳定性。
 *  泛型是提供给javac编译器使用的，它限定类型，在编译上解决问题，生成的class文件是不带有泛型的。所以程序不受影响。这个过程称为擦除。
 *  
 *  泛型的基本术语
 *  以ArrayList为例
 *  ArrayList<E> E是形参 ArrayList<E> 整个称为泛型类型
 *  new ArrayList<String> String是实参   ArrayList<String> 参数化类型 
 *  
 *  数据结构网站
 *  www.cs.armstrong.edu/liang/animation/index.html
 *  
 */
package always_revision;

import java.util.ArrayList;
import java.util.Collection;
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
		ArrayList<String> l = new ArrayList<String>();
		l.add("aaa");
		ArrayList<Object> l2 = new ArrayList<Object>();
		l2.add(new Object());
		print(l2);
	}
	public static <T> T gcc(T str){
		return str;
	}
	public static void print(Collection<? extends Object> col){
		Iterator<?> it = col.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
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



