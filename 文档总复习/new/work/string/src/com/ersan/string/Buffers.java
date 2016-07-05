/**
 * 经常操作一定用StringBuffer 提供的方法比较齐全
 * 字符串缓冲类 StringBuffer 他可以反复修改，他是存储字符的容器。
 * 字符串的一个特点
 * "" 当字符串常量，在字符串常量池中创建以后就不能在修改。
 * 字符串的内容一旦发生变化马上会创建一个新的对象。也就说在字符串常量池种又创建一个。
 * 字符串的内容不适宜频繁修改，因为修改就相当于创建一个新的对象。
 * 如果需要频繁修改字符串内容，建议使用字符串缓冲类
 */
/**
 * StringBuilder 这个也是一个字符串缓冲类。推荐用这个，因为现实中很少有用多线程操作一个数据。这个也区分对待，多线程用buffer 非 用builder
 * StringBuffer 有的   StringBuilder 同样有 作用功能都一样 
 * 区分点
 * 1 它比StringBuffer（是线程安全的）要快  jdk 1.0 推出
 * 2 StringBuilder（是线程不安全的） jdk 1.5 推出
 * 所以Builder快
 * 线程安全
 * 一个时间段只有一个线程操纵一份代码
 * 线程不安全
 * 一个时间段多个线程同时操纵一份代码
 */
package com.ersan.string;

/**
 * @author www.23.com
 *
 */
public class Buffers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		//StringBuffer
		//构造方法
		/*构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
		 * 存放字符的一个容器，内部维护的是一个char 数组不同的在扩展
		 * 这个默认十六个字符,如果不够的话变为原来的1倍+2（回答一般就1倍）
		 * 容器的行为，增删改查判断
		StringBuffer() */
		//StringBuffer sb = new StringBuffer();
		//sb.append("ding.luchao-jiang.liliding.luchao-jiang.liliding.luchao-jiang.liliding.luchao-jiang.lili");
		//System.out.println(sb.length());
		
		/*//增
		append(可以有多个)它是个重载方法 可以添加任何数据类型
		insert(int offset, char c)  可以插入任意数据类型
		//删除
		delete(int start, int end)  移除此序列的子字符串中的字符。
		deleteCharAt(int index) 	移除此序列指定位置的 char。
		//查看
		int  capacity()  返回当前容量。
		char charAt(int index) 返回此序列中指定索引处的 char 值。
		int indexOf(String str)   返回第一次出现的指定子字符串在该字符串中的索引。
		int lastIndexOf(String str, int fromIndex) 返回最后一次出现的指定子字符串在此字符串中的索引。
		int length() 返回长度（字符数）。
		toString();
		//修改
		ensureCapacity(int minimumCapacity) 确保容量至少等于指定的最小值，确认初始值，确认内部的那个char数组长度。
		replace(int start, int end, String str) 使用给定 String 中的字符替换此序列的子字符串中的字符。
		reverse() 将此字符序列用其反转形式取代。
		setCharAt(int index, char ch) 将给定索引处的字符设置为 ch。
		substring(int start) 返回一个新的 String，它包含此字符序列当前所包含的字符子序列。
		//判断
*/		
		
		//StringBuffer sb = new StringBuffer();
		//append 添加任意类型
		/*sb.append(false);
		sb.append(31.4f);
		System.out.println(sb.toString());*/
		
		//insert 可以出入任意类型
		/*sb.insert(0, false);
		sb.insert(2, false);*/
		
		//delete(int start, int end) 从开始哪个，也是删除几个开始位置+删除几个
		//deleteCharAt(int index) 删除指定职位的字符删除一个
		/*sb.append("dingluchao");
		sb.delete(4, 6);
		sb.deleteCharAt(1);*/
		
		//replace(int start, int end, String str) 
		//reverse() 将此字符序列用其反转形式取代。
		//setCharAt(int index, char ch) 将给定索引处的字符设置为 ch。
		//substring 和 String的那个一样
		/*sb.append("dingluchao");
		sb.replace(4, 6, "jianglili");
		sb.reverse();
		sb.setCharAt(1,'x');
		String str = sb.substring(0,1);
		sb.ensureCapacity(100);//默认内部数组长度为100 一般不会用它
		*/		
		
		//查看
		//int indexOf(String str)
		//int  capacity() 当前内部字符组的长度。
		//char charAt(int index) 查找指定位置的字符
		//int length() 返回长度（字符数）。 这个是查看存储字符个数，和capacity区分这个是看数组长度不是实际的长度。
		//int lastIndexOf(String str, int fromIndex) 返回最后一次出现的指定子字符串在此字符串中的索引。
		//toString(); 把字符串缓冲类的内容转换成字符串返回。
		/*sb.append("dingluchao");
		int idx = sb.indexOf("lu");
		int m = sb.capacity();
		System.out.println();*/
		
		
		
	}

}
