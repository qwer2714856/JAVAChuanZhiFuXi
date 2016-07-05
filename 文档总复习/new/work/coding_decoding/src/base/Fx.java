/**
 * 编码和解码
 * 
 * 什么是编码？
 * 所谓的编码就是将看懂的字符，变为看不懂的字符这个过程叫做编码 程序向硬盘写入  
 * 
 * 什么是解码？
 * 所谓的解码就是将看不懂的东西变为看的懂的东西。 硬盘到程序。
 * 
 * 关系图
 * 三者
 * 
 * 硬盘(存字节二进制)
 * 编码表
 * 程序(字符)
 * 
 * 硬盘的数据读取出来解码到字符
 * 程序的字符编码写入硬盘
 * 
 * 世界上第一张码表
 * ASCII 码表
 * 美国人发明 1个字节表示 范围-128-127 但是没有用满只用了7位，其它空着。
 * 
 * is8859-1
 * 欧洲码表
 * 这个是唯一一个把-128-127都用满的码表是在ascii的基础上进行扩展的-128-127 都用满了，其它码表都不具备全部填满。
 * 
 * GBK2312 中国人发明的 英文1个字节，中文2个字节
 * GBK     中国人发明的外加少数民族的字符。
 * 这两个码表都没有满
 * 
 * unicode是一个协议标准，不是码表，实现它的都要适应世界范围的。
 * 
 * UTF-8 中文3个英文1个
 * UTF-16 中英都两个
 * 都没用满
 * 
 * UTF-16 是个很恶心的它的字节会有-2 -1的标志位有它的就是UTF-16编码的 英文会有个空的0
 * 
 * 编码和解码都用一套，否则很容易乱码，英文在哪都一样，注意UTF-16是2个字节但是没问题因为有个空的0。
 * 
 * 
 * 
 * 
 */
package base;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author www.23.com
 *
 */
public class Fx {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		String lm = "中国";
		
		byte []by = lm.getBytes();
		
		String str = new String(by,"ISO8859-1");

		System.out.println(new String(str.getBytes("ISO8859-1")));
	}

}
