/**
 * 字节流读写中文比较麻烦所以使用字符流
 * 字节流是二进制的字节，不会解码。
 * 
 * 字符流 --字符流会把二进制 进行解码或解码。
 * 输入字符流 
 * 基类Reader 抽象类
 *     |----FileReader 读取文件的输入字符流
 * FileReader用法和FileInputStream一样
 * 
 * 编码表
 * 码表分为两列，一列字符，码值
 * a        97
 * b        98
 * 这个就是码表
 * 
 * ascii 表  
 * 使用一个字节表示， 一个字节，7位，  一共可以放多少数字 2^8 个数字 -128~127，但是美国人的字符256用不完，他们只用了8位中的7位2^7 美国人的表
 * ascii 有256个格子，会有很多空格子，有些是没有对应字符的，因为他们用不了。
 * 
 * 后来欧洲又出现了 iso8859-1 拉丁码表 也是使用一个字节的
 * iso8859-1 码表 会把ascii码表剩余的格子进行补充，补充成他们需要的一些的一些特殊符号。
 * 
 * 中国的码表GB2312英文还是占1个字节，中文占两个字节。
 * 后来升级了因为有少数名族的字无法表示，改良，添加生僻字。GBK 英文还是一个中文还是2个字节，但是还没用完，还有好多空格。
 * 
 * 后来为了统一码表出现了万国码表UTF-8 三个字节表示，世界上所有字符都在这。英文还是1个，中文3个
 * 
 * 所有的码表英文都占一个字节，英文码表的数字都是通用的。
 * 中文不是的统一的，中文在GBK2个，在UTF-8三个所以无法兼容
 * 
 * 
 * 用字节流读取中文是一个字节字节读而默认是GBK的是2个字节所以读一个无法完整表示所以是乱码
 * 
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class ZfDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("d:/c.txt");

		FileReader fr = null;

		try {
			fr = new FileReader(fl);
			int l = 0;
			char [] c = new char[1024];//缓冲字符数组
			while ((l = fr.read(c)) != -1) {
				System.out.println(new String(c,0,l));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		//readChina();
	}
	/**
	 * 用字节流读中文 配合string可以，写中文配合字符串的getbyte也可以，但是如果遇到中英混合就有问题有的1个字节有的2个
	 * 但其实他们都没办法直接读取都是借助了string 或 string的方法 getbytes GBK中文2字节 UTF-8 三个字节
	 * 
	 * 
	 * 字符 -> 字节  是编码的过程
	 * 字节 -> 字符  解码
	 * 
	 * 打开文件的时候不是一堆二进制是应用程序的功能，他负责解码。
	 * 
	 * 字节流不能操作中文。
	 */
	public static void readChina(){
		File fl = new File("d:/c.txt");
		
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream(fl);
			
			byte [] by = new byte[1024];//如果只读取一次需要用 byte [] by = new byte[2] 这里需要读取2个字节才能读取正确中文，因为中文在GBK是2个字节
			int len = 0;
			try {
				while((len = fin.read(by)) != -1){
					//字节直接转字符串读中文是没有问题的。
					System.out.println(new String(by,0,len));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			} 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally{
			if(fin != null){
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				}
			}
		}
		 
	}
}
