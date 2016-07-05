/**
 * StringFunction
 * 构造方法都学
 * http://tool.oschina.net/apidocs/apidoc?api=jdk-zh
 * 
 */
package com.ersan.string;

import java.util.Arrays;

/**
 * @author www.23.com
 *
 */
public class StringFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////// 构造方法   /////////////////////////////////////////////////
		
		//byte String(byte[] bytes) 
		// 这里给出的是字符的ascii码，通过String的构造函数转换为对应的值，变为字符串。
		/*byte[] bytes = {97,98,99};
		String b = new String(bytes);	
		System.out.println(b);*/
		
		//String byte 带Charset 的先暂时不看 这需要一个码表IO在学
		
		//String(byte[] bytes, int offset, int length)
		/*参数：所谓的解码就是把数字变为字符 ascii
		bytes -  要解码为字符的 byte  
		offset - 从哪个索引值开始解码
		length - 要解码多少个元素 */
		/*byte[] bytes = {97,98,99};
		String b = new String(bytes,1,2);	
		System.out.println(b);*/
		
		//String(char[] value) 
		//将字符数组变为字符串对象
		/*char [] str = {'a','b','v'};
		System.out.println(new String(str));*/
		
		//String(char[] value, int offset, int count)  和byte的那个一样 offset开始索引 count输出几个
		
		//String(int[] codePoints, int offset, int count) 和byte是样的
		
		//String(String original) new String("admin");
		 
		//String 普通的方法
		//group by
		//获取的方法
		//判断的方法
		//
		
		//获取的方法
		/*int length() 获取字符串长度
		char charAt(int index) 获取特定位置的字符（小心下表越界）
		int indexOf(String str)获取特定字符的位置 没有找到返回是-1
		int lastIndexOf(String str)获取最后一个字符的位置，没有找打-1*/ 
		
		
		//判断的方法 -- return boolean
		//endsWith();判断是否以指定的字符串结束 "".endsWith("aa");
		//isEmpty();判断字符串的个数是否为0
		//contains();判断是否包含指定内容"".contains("a")
		//equals();字符串比较
		//equalsIgnoreCase();
		
		//转换的方法
		//static String valueOf(char[] data)
		//static Stirng valueOf(char[] data, int offset, int ct)
		//char[] toCharArray(); "".toCharArray();
		//byte[] getBytes();    "".getBytes();
		//字节，字符数组可以转字符串，相反字符串也可转，字节和字符数组
		
		//其它方法
		/*String str.replace("replace", "newreplace");
		String[] str.split("分隔符");
		String str.substring(int beginIndex);
		//这个和js的那个一样从第几个开始取几个+加上起始点位置号
		String str.substring(int beginIndex, int endIndex);
		String str.toLowerCase()
		String str.toUpperCase()
		String str.trim()*/
		//System.out.println(fx("中国好啊"));
		System.out.println(count("phcpphcpjavaphpjavascriptphsp","ja"));
	}
	public static String fx(String str){
		char [] rt = str.toCharArray();
		char [] result = new char[rt.length];
		int i = 0;
		int j = rt.length -1;
		while(j > -1){
			result[i++] = rt[j--];
		}
		return String.valueOf(result);
	}
	public static int count(String str, String str2){
		int count = 0;
		int idx = 0;
		while((idx = str.indexOf(str2, idx)) != -1){
			count ++;
			idx += str2.length();
		}
		return count;
	}
}
