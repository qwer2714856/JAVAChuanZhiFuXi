/**
 * 集合就是个容器，没有指明它存放什么类型的东西，所以可以随便放对象，所以可能对容器进行添加各种类型导致对某种类型操作一概而论导致其它类型报错，所以需要先抓出来,对某种容器贴一个标签。
 * 泛型
 * 为什么学泛型?
 * 就是给容器价格标签
 * 泛型的好处
 * 将容器运行时的错误，提前到编译时。
 * 加了泛型就不需要强转了，避免了无谓的强制类型转换。泛型是jdk1.5使用的新特性  最低编译需要1.5
 * 
 * 注意
 * ArrayList <String> al = new ArrayList<String>();
 * ArrayList <String> al = new ArrayList();
 * ArrayList al = new ArrayList<String>();
 * 第2，3中是遗留问题，为了向前兼容，原来不支持泛型，所以为了兼容。
 * 1.泛型没有多态的左右两边都要一致，或者只写一边的泛型。推荐两边都写。
 * 
 * 
 * 自定义泛型
 * 一个数据类型的占位符
 * 方法上自定义泛型
 * 修饰符 <声明自定义泛型>返回值类型 函数名（使用自定义泛型）{}
 * 在泛型中不能使用基本数据类型，如果需要使用要使用包装类型例如int 对应Integer。  值得是标签不是实参<Integer> <int> 就是错误
 * Byte byte
 * Short short
 * int Integer
 * long Long
 * double Double
 * float Float
 * boolean Boolean
 * char Character
 * 
 * public static <T>T ll(T o){
		
		return o;
	}
	
	ll(new p()); 这时候传什么过去就可以自动识别回来
	
	方法泛型 占位符什么时候能确定它的数据类型。
	调用这个方法是传入实参的时候确认的
	
	
	这个占位符一般习惯使用一个大写字母 最常见的T E T是type E element元素的意思
	
	
	
	
 */
package fanxing;

import java.util.ArrayList;

/**
 * @author www.23.com
 *
 */
public class Fanxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//该容器只能存储字符串容器。
		ArrayList <String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
	    
		
		//java.lang.ClassCastException 抛出强转失败如何解决？使用泛型
		System.out.println((al.get(1)).toUpperCase());
		int a= 123;
		ll(123);
	}
	
	
	//定义一个方法要求可以接收任何数据类型，返回值类型要和实参一样。自定义泛型
	public static <Ts>Ts ll(Ts o){
		return o;
	}

}
class p{}
