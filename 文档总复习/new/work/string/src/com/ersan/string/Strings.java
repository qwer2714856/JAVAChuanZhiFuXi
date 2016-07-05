/**
 * String
 * "=="用于比较 引用数据类型，数据比较的时候比较的是内存地址，然而equals默认比较引用数据类型的时候比较的也是内存地址。
 * equals 在比较字符串的时候采用了 拆分字符串然后比较所以比较的是字符串的值，而非内存地址，至于算法可以使用ctrl+左键或f3在equals上查看，或者打开目标类的文件，右上角有个Outline点开有这个打开类的所有成员。
 * 字符串常量池，有双引号的都先去字符串常量池中找。
 * 		 2种创建方式
		 *  1 直接赋值
		 *  str1 = "abac";
		 *  这种方式创建字符串的时候java（JVM）虚拟会检查《字符串常量池》（在内存的方法区（静态数据共享区）还有一块字符串常量池）中是否有该字符串对象，如果没有就创建它返回内存地址，如果有就不去在创建了直接返回内存地址。所以囊第一次创建的str 第二次直接返回地址给str2所以str1和str2的内存地址相同为true
		 *  2 使用new来创建
		 *  new 的方式(jvm)首先回来到字符串常量池查看是否存在如果不存在创建存在不创建，然后在将字符串常量池种的数据拷贝一份到堆内存中去，然后返回堆内存的地址，每次new都会创建一个新对象所以地址肯定不同。
		 *  String 重写了Object 类的equals 比较的是内容所以是true
		 *  比较的时候常量位于左边 例如 "abc".equals(str); 因为str有可能为空 避免空指针出现
		 
 */
package com.ersan.string;

/**
 * @author www.23.com
 *
 */
public class Strings {

	private static int a;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String str1 = "admin";
		 String str2 = "admin";
		 String str3 = new String("admin");
		 String str4 = new String("admin");
		 
		 System.out.println("str1==str2?"+(str1==str2));
		 System.out.println("str1==str4?"+(str1==str4));
		 System.out.println("str3==str4?"+(str3==str4));
		 System.out.println("str1.equals(str4)?"+(str1.equals(str4)));
		 System.out.println("str3.equals(str4)?"+(str3.equals(str4)));
	 
		 
		 /*
		  * 
		 分析结果
		 str1==str2?true
		 str1==str4?false
		 str3==str4?false
		 str1.equals(str4)?true
		 str3.equals(str4)?true
		 
		 *
		 * 内存解析
		 * 2种创建方式
		 *  1 直接赋值
		 *  str1 = "abac";
		 *  这种方式创建字符串的时候java（JVM）虚拟会检查《字符串常量池》（在内存的方法区（静态数据共享区）还有一块字符串常量池）中是否有该字符串对象，如果没有就创建它返回内存地址，如果有就不去在创建了直接返回内存地址。所以囊第一次创建的str 第二次直接返回地址给str2所以str1和str2的内存地址相同为true
		 *  2 使用new来创建
		 *  new 的方式(jvm)首先回来到字符串常量池查看是否存在如果不存在创建存在不创建，然后在将字符串常量池种的数据拷贝一份到堆内存中去，然后返回堆内存的地址，每次new都会创建一个新对象所以地址肯定不同。
		 */

		  
		 
	}

}
