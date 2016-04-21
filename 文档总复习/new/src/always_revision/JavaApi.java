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
 * StringBuffer
 * 当对字符串进行频繁的操作的时候使用 + 会造成字符串池中的字符串对象泛滥。
 * 所以当进行频繁的字符串操作考虑使用
 * StringBuffer 这个是线程安全的。
 * 它的特点
 * 1.默认缓冲区是16个字符
 * 2.它是线程安全的，比起StringBuilder效率低
 * StringBuilder str = new StringBuilder("jack");
 * str.append("str").append("ding").append("lu"); 支持链式编程
 * str.toString();
 * str.insert(2,"java");在原来字符串的第二个位置插入java
 * 返回字符串内容
 * str.toString();
 * str.indexOf("");返回指定字符串第一次出现位置。
 * str.substring(0);截取字符串
 * 修改
 * str.replace(0,end,String str) 从第0个到第end-1个替换为str
 * str.setChar(0,char ch) 第0个替换为指定字符
 * 删除
 * str.delete(2,5) 从第二个开始删删到第5-1个结束 清空的话就是str.delete(0,str.length());
 * str.deleteCharAt(2) 删除指定字符
 * 反序
 * str.reverse();
 * 
 * StringBuilder 这个和StringBuffer 完全一样唯一区别是它不是线程安全的，所以效率要高于StringBuffer. jdk1.5 之后又的 方法同StringBuffer
 * 
 * System 系统层的
 * 获取系统配置信息
 * Properties ps = System.getProperties();
 * ps.list(System.out);
 * String str = System.getProperty("sun.os.patch.level");
 * for(Map.Entry<String, String> me : System.getenv().entrySet()){
 *	System.out.println(me.getKey()+"--"+me.getValue());
 * }
 * 
 * foreach 实现Iterable接口的才能使用for增强
 * 
 * 
 * Runtime 类描述应用程序的运行环境。JVM 层的
 * Runtime rt = Runtime.getRuntime(); 单例运行时环境
 * rt.exit(0); 退出虚拟机 0 正常1非正常System.exit(0);同	
 * Runtime rt = Runtime.getRuntime();
 //rt.exit(0);
 //System.exit(0);
 rt.exec("dir");//命令行 可以启动一个别的应用程序
 System.out.println(rt.freeMemory());//可用内存量
 rt.gc();//手动启动垃圾回收器
 System.out.println(rt.maxMemory());//虚拟机最大内存
 System.out.println(rt.totalMemory());//内存总量		
 
 * Date 日期类
 * Date是封装了当前的系统时间的类，不过已经过时，推荐使用Calendar类 Calendar是一个日历类	
 * 
 * 		Date d = new Date();
		Calendar cld = Calendar.getInstance();//静态的
		System.out.println(cld.get(Calendar.DAY_OF_WEEK));//不同地区可能需要减去1 月需要+1 http://blog.sina.com.cn/s/blog_45c06e600100pm77.html
		
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//以这个格式为标准。
		String str = sm.format(new Date());
		System.out.println(sm.parse(str).toString());
	
		
 * Math 类
 * Math.PI  			返回一个π
 * Math.ceil()			向上取整 向大的取
 * Math.floor()			向下取整 向小的取
 * Math.round()			四舍五入 
 * Math.random()		随机数0-1但是不包括1
 * 
 * 
 * //创建验证码
   StringBuilder sb = new StringBuilder();
   char [] a = {'a','b','c','d','e','f','g','h'};
   int len = a.length;
   int i = 0;
   while(i < 4){
		int as = (int) Math.floor(Math.random() * len);
		sb.append(a[as]);
		i++;
	}
	System.out.println(sb.toString());
 */
package always_revision;

import java.io.IOException;
import java.text.ParseException;
 

/**
 * @author www.23.com
 *
 */
public class JavaApi {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		/*Persion p1 = new Persion("a",1);
		Persion p2 = new Persion("a",1);
		System.out.println(p1.equals(p2));*/
		
		/*StringBuffer sb = new StringBuffer("admin");
		sb.append(false).append(3.06d).append('a');
		sb.insert(0, "ding");
		sb.deleteCharAt(5);
		System.out.println(sb.reverse());*/
		
		/*Properties ps = System.getProperties();
		ps.list(System.out);
		String str = System.getProperty("sun.os.patch.level");
		for(Map.Entry<String, String> me : System.getenv().entrySet()){
			System.out.println(me.getKey()+"--"+me.getValue());
		}*/
		
		/*Runtime rt = Runtime.getRuntime();
		//rt.exit(0);
		//System.exit(0);
		rt.exec("dir");//命令行 可以启动一个别的应用程序
		System.out.println(rt.freeMemory());//可用内存量
		rt.gc();//手动启动垃圾回收器
		System.out.println(rt.maxMemory());//虚拟机最大内存
		System.out.println(rt.totalMemory());//内存总量
*/		
		
		/*Date d = new Date();
		Calendar cld = Calendar.getInstance();//静态的
		System.out.println(cld.get(Calendar.DAY_OF_WEEK));//不同地区可能需要减去1 月需要+1 http://blog.sina.com.cn/s/blog_45c06e600100pm77.html
*/		
		/*SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = sm.format(new Date());
		System.out.println(sm.parse(str).toString());*/
		 
		
		
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
 
