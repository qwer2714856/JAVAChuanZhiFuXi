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
 * 
 * 枚举类
 * 在某个值的范围 例如性别，只有男女
 * enum Sex{
 *     body,woman
 * }
 * enum 定义的枚举类也会有class
 * 枚举注意
 * 1.
 * javap -c -l private 枚举类我们发现 枚举成员是 
 * public static final Sex body;
 * public static final Sex woman;
 * 每一个枚举值都是public static final 枚举类  枚举值;
 * 枚举中声明的每一个值，都是对应当前枚举类的实例。
 * 当枚举类没有重写toString() 直接输出返回的是枚举值
 * 2.
 * 和其它类一样它也可以定义成员等。
 * 3.构造方法私有化，当构造方法带参数可以让枚举值赋值比如 body("hi") 这个是在给构造函数赋值。
 * 4.因为枚举值是对象可以直接用枚举值调用对象的方法。
 * 5.当枚举类定义抽象方法的时候，枚举值需要实现抽象方法 body("hi"){public void speak(){}}
 * 6.枚举也可以实现接口，序列化，或继承抽象类。
 * 7.jdk5 switch 支持枚举
 * switch(Sex.body) {
   	case body:;break;
   }
 * 8.枚举只有一个值，可以设计单例设计模式。
 * 
 * 
 * 正则表达式
 * 正则表达式，是用一组特殊的符号描述一个规则，匹配字符串。
 * 
 * 原子
 * .				任意字符
 * \d				0-9
 * \D				非0-9
 * \s				\n \r \t \x0B \f
 * \S				! \n \r \t \f \x0B
 * \w				0-9a-zA-Z_
 * \W				! 0-9a-zA-Z_
 * 注意在""中\需要\\
 * 
 * 原子符
 * ?				0-1
 * +				1-n
 * *				0-n
 * {n,m}			n-m
 * {n,}				n-无穷
 * {n}				只有n次
 * 
 * 原子组
 * [abc]			a,b,c
 * [^a-z]			除了a-z任意字符
 * [a-zA-Z]			a-zA-Z之间
 * [a-b[p-m]]		其实就是a-bp-m
 * [a-z&&[def]]		&&表示交集 a-z def之间的交集
 * [a-z&&[^abc]]	a-z 和 除了abc的交集
 * [a-z&&[^m-p]]	a-z除了m-p
 * 
 * ^				在没有[]的是表示开头
 * $				结尾
 * \b 				边界不匹配任何字符，只匹配边界，什么是边界？就如单词之间的特殊符号，空格等等，但是\b不是真的匹配这些字符例如
 * 					String str = " !a! ";
 * 					str.matches(" !\\ba\\b! ")
 * 
 * \B 				非边界
 * \A				输入的开头
 * \Z 				输入结尾（输入的结尾，仅用于最后的结束符如果有的话）。
 * \z 				输入结尾
 * \G 				上一个匹配的结尾
 * 
 * 
 * () 				捕获组 \1-n反向引用捕获组 str.split("(()(\\w))\\3");  从左向右 捕获组就是3
 * (?:)				非捕获组
 * (?=)				前瞻
 * (?<=)			后顾
 * (?!)				负前瞻
 * (?<!)			负后顾
 * 
 * 什么是前瞻后顾
 * 我们阅读字符串的时候是从左向右
 * 
 * 向右的前瞻，向左的是后顾。
 * 
 * 总结一个理解前瞻后顾的思路
 * (?=)前瞻是吧！那就在后面匹配里面找有没有和这个像匹配的例如
 * String str = "xiaopipi";
   System.out.println(str.matches("xiao(?=pi).+"));
 * xiao匹配了接着预判前面是不是pi果然匹配pipi的时候预言正确。
 * (?<=)后顾是吧！那就在已经匹配完毕的向左找
 * System.out.println(str.matches("xiao.+(pi)"));
 * 当匹配完整个字符串的时候向左找果然找到。
 * 
 * 前瞻	在剩下的匹配向前找
 * (?=).+ 可以说在.+中找
 * 后顾	在已经匹配完的向后找。
 * .+(?<=) 向左找.+中找
 * 
 * java 正则匹配 分割 替换所有
 * matches  匹配
 * split	分割
 * replaceAll   替换第二个参数如果想用捕获组可以用$1-n
 * 查找比较麻烦需要用的正则对象，匹配器对象。
 * Pattern 正则对象
 * Matcher 匹配器
 * 		//正则字符串获取
		String str = "aaa bb ccc ddddd eeee ffff ddd aaV dddd";
		//正则对象
		Pattern pt = Pattern.compile("\\b[a-zA-Z]{3}\\b");
		//获取匹配器
		Matcher mc = pt.matcher(str);
		//开始获取
		while(mc.find()){//必须调用find以后才能用 group
			int start = mc.start();
			int end = mc.end();
			System.out.println(str.substring(start, end));
			System.out.println(mc.group());
			System.out.println("=====================");
		}
		
		
 * URL 类
 * import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import XmlHelper;

public class QXOutStream {
public String outPutStr(String urlStr, String input) throws Exception{
StringBuffer strBuf = new StringBuffer();
String Resulst="";
try{
URL url = new URL(urlStr);
HttpURLConnection con = (HttpURLConnection)url.openConnection();
con.setDoInput(true);
con.setDoOutput(true);
con.setRequestMethod("POST");
con.setAllowUserInteraction(false);	
con.setUseCaches(false);
con.setRequestProperty("Accept-Charset", "GBK");
BufferedOutputStream bufOutPut = new BufferedOutputStream(con.getOutputStream());

byte[] bdat = input.getBytes("UTF-8");//解决中文乱码问题
bufOutPut.write(bdat, 0, bdat.length);
bufOutPut.flush();
BufferedInputStream inp = new BufferedInputStream(con.getInputStream());
InputStreamReader in = new InputStreamReader(inp,Charset.forName("GBK"));
BufferedReader bufReador = new BufferedReader(in);

String tempStr = "";
while (tempStr != null) {
strBuf.append(tempStr);
tempStr = bufReador.readLine();

}
Resulst = XmlHelper.getPostNodeText(strBuf.toString(), "OPERATOR_RESULT");//.getPostFirstRowText(strBuf.toString(), "OPERATOR_RESULT");

}
catch (Exception e) {
//System.err.println("Exception:"+e.toString());
throw e;
//return "N";
}
finally{
return Resulst;
}

}
}
		//爬虫程序 核心类URL java.net里面的
		try {
			URL url = new URL("http://www.baidu.com");
			URLConnection uc = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 * 
 */

//静态导入
package always_revision;
  
import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		// haha();
		/*
		 * int [] a = {1,2,3,4}; for(int sa : a){ System.out.println(sa); }
		 */
		/*
		 * HashMap<String,String> hm = new HashMap<String,String>(); hm.put("a",
		 * "b"); Set<Map.Entry<String, String>> nt = hm.entrySet();
		 * for(Map.Entry<String, String> mp : nt){
		 * System.out.println(mp.getValue()); }
		 */
		/*
		 * SXInterable<String> s = new SXInterable<String>();
		 * s.addObject("admin"); s.addObject("admin1"); s.addObject("admin2");
		 * s.addObject("admin3"); for(String str : s){ System.out.println(str);
		 * }
		 */

		/*
		 * sum(1,1,2,3,4); sum(1,new int[]{1,2,3,4,5,6});
		 */
		/* sum(1); */

		/*
		 * int a = 1; Integer ac = a; //装箱 Integer ab = 1; //装箱 int b = ab;//拆箱
		 */

		/*
		 * int a = 10; //十进制转其它进制 System.out.println(Integer.toBinaryString(a));
		 * System.out.println(Integer.toOctalString(a));
		 * System.out.println(Integer.toHexString(a)); //其它进制转十进制
		 * System.out.println(Integer.parseInt("0010",2));
		 * System.out.println(Integer.parseInt("07",8));
		 * System.out.println(Integer.parseInt("11",16));
		 */

		/*System.out.println(Sex.body.toString());*/
	
		//正则表达式
		/*String str = "J'taime";
		System.out.println(str.matches("J'(?<=taime).+"));*/
		//String str = "xiaoosppipi";
		/*System.out.println(str.matches("xiao(?=pi).+"));*/
		/*System.out.println(str.matches("xiao.+(pi)"));*/
		//String [] list = str.split("(.)\\1");
		//System.out.println(Arrays.toString(list));
		
		/*String str = "adminstrstr";
		System.out.println(str.replaceAll("(\\w+)\\1", "$1"));*/
		
		/*//正则字符串获取
		String str = "aaa bb ccc ddddd eeee ffff ddd aaV dddd";
		//正则对象
		Pattern pt = Pattern.compile("\\b[a-zA-Z]{3}\\b");
		//获取匹配器
		Matcher mc = pt.matcher(str);
		//开始获取
		while(mc.find()){//必须调用find以后才能用 group
			int start = mc.start();
			int end = mc.end();
			System.out.println(str.substring(start, end));
			System.out.println(mc.group());
			System.out.println("=====================");
		}*/
		
		/*String str = "我我。。。我。。我要。。。。要要。。。学学。。。学习。。编程。编程";
		Pattern pt = Pattern.compile("[\u4e00-\u9fa5]");
		Matcher mc = pt.matcher(str);
		String newStr = "";
		String tmp = "";
		while(mc.find()){
			tmp = mc.group();
			if(newStr.indexOf(tmp) == -1){
				newStr += tmp;
			}
		}
		System.out.println(newStr);*/
		
		/*String emailStr = "116710782@169.com";
		if(emailStr.matches("\\d{5,16}@(126|163|sina|gmail|qq)\\.(com|cn)")){
			System.out.println("done");
		}*/
		
		/*//爬虫程序 核心类URL java.net里面的
		try {
			URL url = new URL("http://www.baidu.com");
			URLConnection uc = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}

	public static void haha() {
		{
			out.println("import static ");
		}
	}

	public static void sum(int s, int... num) {

		int sums = 0;
		for (int n : num) {
			sums += n;
		}
		System.out.println(sums);
	}

}

class SXInterable<T> implements Iterable<T> {
	String name;
	Object[] c = new Object[100];
	int cursor;
	int step;

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new nbl();
	}

	private class nbl implements Iterator<T> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return step < cursor;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return (T) c[step++];
		}

	}

	public void addObject(T t) {
		c[cursor++] = t;
	}
}

// 枚举
enum Sex {
	body("hi"){
		//重写抽象方法
		@Override
		public void speak(){
			
		}
	}, girl{
		//重写抽象方法
		@Override
		public void speak(){
			
		}
	};
	private Sex(){
		
	}
	private Sex(String hi){
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "aa";
	}
	//定义抽放方法
	abstract public void speak();
}

 