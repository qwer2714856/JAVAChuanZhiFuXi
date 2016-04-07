/**
 * JavaApi 复习
 * Object
 * 面向对象的思想，找适合的对象做适合的事情。
 * sun定义的很多类，我们称之为API，在这些类中Object 类是所有类的终极父类。所有的类都直接或间接继承自它。
 * Object 类的方法
 * //返回的是详细类名@哈希值16进制的形式(内存地址的16进制，hascode的16进制)。
 * //System.out.println(new a()); 默认是调用的a的toString()方法。相当于a.toString();
 * //当无法满足自定义对象的时候可以重写toString方法
 * //开发者一般需要重写toString 方法以便更好的获取类的一些信息。
 * 1.toString();
 * //比较两个对象的内存地址
 * //如果两个对象需要比较成员，则对象需要重写equals方法，默认比较的是内存地址
 * 2.equals
 * //返回hash值，java规定如果两个对象的equals相同那么他们的hashcode也必须相同。
 * 3.hashcode
 * 
 * 
 * String 类
 * 创建字符串的两种方式
 * 1.String str = new String("admin"); //这个是创建了一个实实在在的对象，这个每次都会创建一个新的对象。并且检查字符常量池是否有该对象"admin"没有就创建
 *   实际上是创建了两个对象，最后的引用是堆里面的那个字符串引用，不是字符串常量池种的。 这里多创建了一个是因为"admin" 这个是往常量池创建。
 * 2.String str = "admin";//这个会在字符串常量池种去找，如果没找到就在常量池里面建一个，如果有了就让变量直接只想它。
 * 
 * 字符串的比较
 * String str="admin";
 * String str2 = "admin";
 * String str3 = new String("admin");
 * String str4 = new String("admin");
 * 
 * str == str2 true 因为"admin"在字符串池中如果存在就直接赋值给变量引用地址。所以这里的==比较的也是内存地址
 * str == str3 false
 * str3 == str4 false
 * 
 * 字符串的方法
 * 1.int length() 获取字符串长度。
 * 2.char charAt(int index) 获取特定位置的字符。(存在越界)
 * 3.int indexOf(String str) 获取指定字符串的位置。
 * 4.int lastIndexOf(int char) 返回最后一个字符的位置。
 * 
 * 判断方法
 * 1.boolean endsWith(String str);									是否以指定字符串结尾
 * 2.boolean isEmpty()												判断字符串是不是""   
 * 3.boolean contains(CharSequences);								判断是否包含指定字符串序列
 * 4.boolean equals(Object anObject);								判断字符串是否相等
 * 5.boolean equalsIgnoreCase(String anotherString); 				判断字符串是否相等忽略大小写
 * 
 * 转换方法
 * 1.String String(char [] char);	new String(chr)					字符数组变字符串 
 * 2.String String(char [] char, int offset, int count)				字符数组从哪个开始变几个
 * 3.static String valueOf(char [])									静态的转换字符转字符串
 * 4.static String valueOf(char [], int offset, int count)			静态的转换字符转字符串，从哪个开始取几个。
 * 5.char[] toCharArray()											字符串转字符数组。
 * 
 * 
 * 其它方法
 * 1.String replace(char oldChar, char newChar);					查找出对应字符全部替换
 * 2.String[] split(String regex);									切割
 * 3.String substring(int beginIndex);								从哪个位置开始截取到最后
 * 4.String substring(int beginIndex, int endIndex);				从beginIndex开始 到endIndex-1结束
 * 5.String toLowerCase();											大写变小写
 * 6.String toUpperCase();											小写变大写
 * 7.String trim();													去除两边空格	
 * 
 * 					
 */
package always_revision;

import java.util.Arrays;

/**
 * @author www.23.com
 *
 */
public class JavaApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Persion p1 = new Persion("a",1);
		Persion p2 = new Persion("a",1);
		System.out.println(p1.equals(p2));*/
		
	}

}
class Persion{
	String name;
	int age;
	public Persion(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Persion p = null;
		boolean rt = false;
		if(obj instanceof Persion){
			p = (Persion)obj;
			rt = name.equals(p.name);
		}
		return rt;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
	}
}
 
