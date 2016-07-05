/**
 * 编码和解码
 * 什么是编码？
 * 看的懂的编码为看不懂的
 * 
 * 什么事解码？
 * 看不懂的解码为看的懂的
 * 
 * 图解释：
 * 硬盘               码表                       程序
 *         （两列）
 *  	字符  数字（码值）
 * 		a	97
 * 
 * 1 程序向硬盘写字符它是如何操作的？
 * 把a 查出a对应的是哪一个，向硬盘写出的是对应的值 97 这个过程是编码。
 * 
 * 2 硬盘向内存程序写数据 会先找到97 所对应的字符然后交给程序。 这个过程是解码
 * ==================字符流=====================================
 * 
 * 回顾一下码表
 * Ascii 美国人发明的码表  只用一个字节的其中7位就可以存储完毕，其它都空着，-128-127
 * 
 * 欧洲人发明了
 * iso8859-1码表， 在ascii码表的基础上把那些没有用的空格子利用起来了，这-128-127个字符都填满了，唯一一个将码表数字都填满的码表，其它码表都不具备的。
 * 
 * 中国人
 * GB2312 英文还是占一个字节，中文占2个字节 
 * GBK    英文还是占一个字节，中文占2个字节  这个是在GB2312的基础上加入了少数民族的字符。
 * 
 * unicode 这个是一个标准 不是码表，是一个类似于协议。准确说是一个规范，容纳世界所有的文字。
 * 万国码表世界上的通用码表
 * UTF-8 它实现了unicode规范 英文1个字节中文三个字节。
 * 
 * UTF-16 码表实现了unicode 不管英文中文都占2个字节。
 * 
 * =============================================
 * 用一下
 * 注意
 * 以后编码与解码都使用统一码表，否则非常容易出乱码。如果英文没有问题，每个码表都基本都是英文占一个字节都兼容，除了UTF-16以外 但是也兼容它虽然英文占两个字节，但是有一个字节是空的0。
 * 
 * UTF-16 的问题 
 * 
 */
package base;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author www.23.com
 *
 */
public class Description {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String str = "a中国";
		//str.getBytes(); 可以指定码表的。 指定码表的时候是有异常的，为什么它怕你写的码表不存在
		byte [] buf = str.getBytes("UTF-8");//平台默认的编码表示GBK编码表,可以指定码表。
		System.out.println(buf.length);
		System.out.println(Arrays.toString(buf));//返回的是对应的字节码值
		
		
		String tmpStr = new String(buf);//这个时候是用平台默认的编码表去解码。也就是用GBK的去解释UTF-8的所以错误。GBK 一个中文2字节，UTF-8一个中文3字节规则都不同所以解不出来。
		System.out.println(tmpStr);//这里会有问题，首先我字节数组编码是utf-8的码表，但是平台是GBK的这个时候输出是个乱码
		
		//用什么编码用什么解码
		String tmpStr2 = new String(buf,"UTF-8"); //使用utf-8进行解码
		System.out.println(tmpStr2);//这个就可以得到正确结果，用什么编就用什么解。
		
		
		//unicode
		String unicode = "a中国";
		byte []unicodeBuf = unicode.getBytes("unicode"); //在编码和解码的时候指定的是unicode那么其实用的是utf-16 但是要知道unicode是个规范。
		System.out.println(Arrays.toString(unicodeBuf)); //utf-16不管中文英文都是占两个字节 这里为什么会有8个？
		//utf-16不管中文英文都是占两个字节 这里为什么会有8个？
		//解释 这个东西很恶心只要靠头是-2 -1 就代表是utf-16 编码出来的 这两个是标志位。只要用的的是UTF-16就一定会多两位，标志位。可以无视-2 -1 只不过是个标志而已。
		//不管中文因为都是2个字节。
		//因为英文会在前面加了一个0
		
		
		//乱码还原
		String lm = "中国";
		byte [] by = lm.getBytes();
		String lmStr = new String(by,"iso8859-1");//这里有个问题，by是显示了4个数字，iso8859-1是一个唯一都有对应的码表，然而控制台有些数字无法显示所以就问号了
		System.out.println(lmStr);//这里有些内容控制台无法打印所以就显示?了
		//lmStr乱码如何还原 不是所有乱码都可以还原 只能是在-128-127之间的。因为有些大数找不对应字符返回的是未知字符，所以就丢失了。位置数字对应的是-1所以原来的就丢失了。
		byte [] hy = lmStr.getBytes("iso8859-1");
		System.out.println(new String(hy));
	}

}
