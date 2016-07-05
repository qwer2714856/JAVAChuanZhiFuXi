/**
 * File 类是用来读取文件的属性。
 * 如果需要读取写入文件的内容需要用到io流来操作
 * 
 * Input Out   Stream
 * 解决的问题的问题 设备和设备之间的传输问题 譬如内存和硬盘，硬盘和内存。
 * 
 * i/o流 分类（按照数据流向分为 输入流、输出流）
 * 何时使用输入流，何时使用输出流
 * 判断使用输入输出流依据，以当前程序为参照（其实和以内存为参照一样，因为程序跑起来是在内存里面） 输入的是输入流，输出的是输出流。
 * 
 * 按照处理的单位划分
 * 字节流 字节流读取的都是二进制。读取到的二进制不会得到任何处理，处理的是字节 8位二进制是一个字节。
 * 字符流 读取文件的二进制数据，会把这些二进制数据转换成人类能是别的字符，二进制转化字符，字符流操作的是字符。 相当于字节流+解码 把字节流转解码到对应字符。
 * 
 * 
 * 字节流：输入字节流、输出字节流。
 * 字符流：输入字符流、输出字符流。
 * 
 * 
 * 1、输入字节流 
 * InputStream 类 此抽象类是表示字节输入流的所有类的超类。  是个抽象了类需要使用它的子类public abstract class InputStream
 * AudioInputStream, ByteArrayInputStream, FileInputStream, FilterInputStream, InputStream, ObjectInputStream, PipedInputStream, SequenceInputStream, StringBufferInputStream
 * --------------|读取文件的输入字节流FileInputStream
 * 
 * 缓冲数组一般定义多大合适？
 * byte []by = new byte[??];
 * 缓冲数组的长度一般是1024的倍数，与计算的处理单位有关。缓冲数组原则上缓冲数组越大效率越高，理论上，这个可以测试下找个合适的倍数。
 * 
 * 
 * 注意细节
 * 问题一、
 * 读取完毕文件，不关闭资源有什么影响？
 * 测试一个例子就很明白
 * 写一个程序读取文件，然后在关闭资源前下一个断点，然后让程序先卡着不关闭资源，然后去手动删除读取的这个资源会提示资源正在使用无法删除的字样，
 * 所以讲如果一个资源文件被占用没有关闭时没有办法对该资源文件操作的。
 * 之所以感觉不写也好用是因为jvm运行完了然后释放资源了。
 * 所以一定要使用完毕后释放资源，否则其它程序无法对该资源文件进行操作。
 * 
 * 问题二
 * 使用缓冲数组在读取数据的时候如果最后一次不满缓冲数组长度是覆盖，还是先清空在覆盖。
 * 比如讲一个文件a.txt 内容是 aaaabbb
 * 然后使用 byte []by = new byte[4];
 * 第一次读取的一定是aaaa
 * 第二次读取的是bbba 
 * 因为是覆盖的所以原来第一次的4个都满了
 * 第二次的只是从第1位开始覆盖，覆盖到第三位就结束了，所以第四个就不覆盖了。所以一定使用String(by,0,length) 否则就会最后一次有问题。
 * 
 * 问题三
 * 每个软件在编辑自己的东西的时候都会有不同的加密方式，所以比如讲使用A软件编辑的用B打开可能就乱码了因为加密方式不同当然解密也不同。不知道加密方式也就无从打开了。
 * 记事本是最原始的没加密。其他的都加密的。可以找开源的来读取word 或 这excel等
 */
package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * @author www.23.com
 *
 */
public class FileIptStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 读取文件的步骤
		 * 1.找要读取的目标文件 File 类用来找到，它用来描述文件的
		 * 2.创建一个条管道数据就是水滴。这个管道就是文件字节输入流。 FileInputStream
		 * 3.与哪个文件建立通道。就是传入的参数。
		 * 4.建立缓冲数组
		 * 5.读取数据使用流对象的方法即可。
		 * 6.释放通道对象，关闭资源!!!
		 */		
		File fl = new File("d:/b.txt");

		FileInputStream fis = null;
	
		try {
			fis = new FileInputStream(fl);//创建一个条管道数据就是水滴。这个管道就是文件字节输入流。
			
			try {
				//这里为啥需要异常，因为怕读的时候硬盘坏了。 一次读取一个字节，这个读取的是没有翻译的就是字符对应的码值，如果想查看翻译后的可以强制转换为char
				
				//方式一 读一个
				/*int content = fis.read(); //这个一次读一个没法读取完整数据。
				System.out.println((char)content);*/
				
				//方式二 循环读取所有的 效率慢
				/*int content = 0;
				while((content = fis.read()) != -1){ //不断的读如果返回-1就代表读完了
					System.out.print((char)content);
				}*/
				
				//方式三 缓冲区读取 缓冲数组
				StringBuilder sb = new StringBuilder();
				byte [] bt = new byte[1024];//购物车 定义了一个可以放1024个字节的数组
				int len = -1;
				while((len = fis.read(bt))!=-1){ //数据存储到了缓冲字节数组中了，返回值是表示读取几个字节数组到字节数组中，实际的读取个数，比如字节缓冲数组是购物车,可以定义购物车容量，而返回值是实际买的东西个数。
					sb.append(new String(bt,0,len));//这个是从第0个构建实际读取的长度
				}
				System.out.println(sb);
					 
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
