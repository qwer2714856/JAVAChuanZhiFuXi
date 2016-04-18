/**
 * ecplise 的使用
 * 工作空间(worksapce)
 * 工程(project)
 * 
 * 工作空间：
 * 建议使用年月日命名，不能有中文和空格
 * 工程：
 * java project 管理所有的java原文件和 class文件
 * file->new -> java project  可以选择jdk版本，和工作空间。
 * 
 * 运行java文件
 * 1.ctrl + f11
 * 2.右键源文件 run as -> java application
 * 3.工具栏 Run -> run as -> java application
 * 4.在package explorer 上右键源文件 -> run as -> java application
 * 
 * 常用快捷键
 * alt + /									内容补全
 * ctrl + 1									快速修复
 * ctrl + shift + o 						快速引包，没有引用的包去掉。包的清理和加入
 * ctrl + shift + f 						代码整理
 * alt + ↑↓									条换代码位置
 * ctrl + / 								添加删除单行注释,热键冲突
 * ctrl + shift + /							添加多行注释
 * ctrl + shift + \							删除多行注释
 * window->Reset Perspective 				还原视图当视图被搞乱
 * ctrl + shift + x 						转大写
 * ctrl + shift + y 						转小写
 * ctrl + alt + 向下键						复制 行，热键冲突
 * ctrl + 单击方法名或类名或其它。				查看源代码，注意需要有api否则看不了，src.zip里面有
 * ctrl + shift + t 						搜索查看方法或类的源文件。
 * ctrl + d 								删除当前行
 * ctrl + h 								搜索全局的
 * 
 * 自定义快捷键
 * 设置自定义快捷键
 * window->preferences->搜索keys->在右侧的搜索栏中输入快捷键可产看是否已经使用，或者搜一些关键词，
 * 例如setter 这个是设置set 或 get的，设置constructor 是设置构造方法的，带fields的是带参的.剩下的那个是不带参的(SuperClass).
 * unbind command 解除绑定
 * binding 		     绑定的意思
 * 
 * 类的创建
 * 方法、构造函数，封装
 * 1在类上{里面空白地方} 右键 source->可以创建一些东西
 * 将代码快抽成 独立的方法。
 * 2选中代码块，右键 -> refactor-> Extract Method->输入方法名即可
 * 3变量重命名一个文档中变量很多如何全部重命名？
 * 选中变量 右键 refactor->rename 就可以
 * 
 * JDK1.5
 * 安全，高效
 * 静态导入
 * 自动拆装箱
 * 增强for
 * 可变参数
 * 枚举
 * 泛型
 * 
 * 
 * 静态导入
 * importa static 包名.类名.静态方法名;或者静态属性名。
 * 
 * 增强for循环
 * for 只能作用于数组，和实现了Iterable的接口的类上。
 * 
 * 可变参数
 * 可变参数可以定义一个接受，多个同类型实参，同类型数组，以及即传数组又传参数
 * 语法：
 * 数据类型...变量 可变参数是object数组（可变参数存的是对象数组）
 * 可变形参只能有一个，有且只能在最后一个位置。
 * 可以传0-n个参数。
 * 其本质就是一个数组。
 * 当传递0个参数时，参数数组是有值的，不为null,长度是0
 * 
 * 自动拆装箱
 * 装箱： 基本数据类型直接赋值给包装类
 * 拆箱：包装类直接赋值给基本数据类型
 *		int a = 1;
		Integer ac = a; //装箱
		Integer ab = 1; //装箱
		int b = ab;//拆箱
 * 基本数据类型包装类
 * byte		Byte
 * short    Short
 * int		Integer
 * char		Character
 * long 	Long
 * boolean	Boolean
 * float	Float
 * double	Double
 * 
 * java 所有的基本数据类型都有自己的包装类
 * 好处是包装类对象，可以扩展一些方法。
 * 例如
 * 1.
 * Integer.MAX_VALUE
 * Integer.MIN_VALUE
 * 
 * 2.
 * Integer parseInt() 静态 intValue()非静态 toString()静态
 * 
 * parseInt() 里面必须是字符串数字，否则抛出异常
 * 
 * Double.parseDouble(); 字符串转double
 * 
 * 每个类型都有自己类型的parse包装类
 * 
 * 3.进制之间的转换
 * 十进制转其它进制 返回对应进制无符号字符串
 * toBinaryString(int i); 二进制
 * toHexString(int i); 十六进制
 * toOctalString(int i);八进制
 * 
 * 其它进制转十进制
 * parseInt(String redix);
 * parseInt(String s,int redix); "123321",2 这个代表 2进制的123321 转为十进制 转换错误抛异常。
 * 
 *  //十进制转其它进制
	System.out.println(Integer.toBinaryString(a));
	System.out.println(Integer.toOctalString(a));
	System.out.println(Integer.toHexString(a));
	//其它进制转十进制
	System.out.println(Integer.parseInt("0010",2));
	System.out.println(Integer.parseInt("07",8));
	System.out.println(Integer.parseInt("11",16));
	
 * 
 * intValue jdk5 以后用不到
 * Integer x = new Integer(1);//装箱
 * int intValue = x.intValue;//拆箱
 * 
 * 现在直接赋值
 * int i = x;
 * 
 * Integer a = 127;
 * Integer b = 127;
 * 
 * a == b ? true 
 * 
 * Integer a = 128;
 * Integer b = 128;
 * 
 * a == b false
 * 
 * 为什么
 * 因为
 * Integer 对象默认 缓存 -128-127 之间的对象。 所以上面那个是同一个对象，后面的不是。
 * 
 */
//静态导入
package always_revision;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
/**
 * @author www.23.com
 * 
 */
public class UseEclipse {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//haha();
		/*int [] a = {1,2,3,4};
		for(int sa : a){
			System.out.println(sa);
		}*/
		/*HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("a", "b");
		Set<Map.Entry<String, String>> nt = hm.entrySet();
		for(Map.Entry<String, String> mp : nt){
			System.out.println(mp.getValue());
		}*/
		/*SXInterable<String> s = new SXInterable<String>();
		s.addObject("admin");
		s.addObject("admin1");
		s.addObject("admin2");
		s.addObject("admin3");
		for(String str : s){
			System.out.println(str);
		}*/
		
		
		/*sum(1,1,2,3,4);
		sum(1,new int[]{1,2,3,4,5,6});*/
		/*sum(1);*/
		
		
		/*int a = 1;
		Integer ac = a; //装箱
		Integer ab = 1; //装箱
		int b = ab;//拆箱*/
		
		/*int a = 10;
		//十进制转其它进制
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		//其它进制转十进制
		System.out.println(Integer.parseInt("0010",2));
		System.out.println(Integer.parseInt("07",8));
		System.out.println(Integer.parseInt("11",16));*/
		
		
	}

	public static void haha() {
		{
			out.println("import static ");
		}
	}
	public static void sum(int s, int... num){
	 
		int sums = 0;
		for(int n:num){
			sums+=n;
		}
		System.out.println(sums);
	}

}
class SXInterable<T> implements Iterable<T>{
	String name;
	Object [] c = new Object [100];
	int cursor;
	int step;
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new nbl();
	}
	private class nbl implements Iterator<T>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return step < cursor;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return (T)c[step++];
		}
		
	}
	
	public void addObject(T t){
		c[cursor++] = t;
	}
}
