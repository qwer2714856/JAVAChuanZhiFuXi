/**
 * IO 流
 * File 类  所有的IO类都在java.io 包里面
 * File类描述的是一个文件或者是文件夹，用面向对象的思想去描述一个文件或者文件夹,表示一个抽象的路径，因为这个文件可以不存在，所以确切说是描述一个抽象路径。
 * 
 * File类的构造方法
 * File(String path);						//抽象的字符串目标文件文件夹路径.
 * File(String parent, String child)		//parent 父抽象路径 child子抽象路径  实际路径是 parent+child
 * File(File parent,String child)			//parent 父抽象文件描述  child子抽象路径   实际上是parent.getPath()+child 建议使用这个
 * 如果抽象的文件文件夹描述不存在，不会有异常的抛出，可以使用exists去判断是否存在。
 * 
 * File类的方法。
 * 1.exists()			 		描述的目标文件是否存在
 * 2.isDirectory()				目标是否是文件夹
 * 3.isFile()					目标是否是文件
 * 4.getAbsolutePath()			获取绝对路径
 * 5.createNewFile()			创建文件 如果目标文件不存在创建，如果存在返回false. 换言之没创建成功就false --有异常需要处理,因为这里的目标路径可能不存在例如d:/aaa/a.txt d:/aaa/可能不存在
 * 6.mkdir()					中间目录不存在就抛出异常。成功true失败false.
 * 7.mkdirs()					中间目录即便不存在也不抛异常
 * 8.renameTo(File dest)		重名名文件或文件夹，也可以操作非空文件文件夹，文件目录不同是相当于剪切，剪切的时候不能对非空文件夹操作 true or false 同盘符.
 * 								不同盘符 的文件可以剪切，文件夹不可以			
 * 9.delete()					删除文件，如果是非空文件夹不能删除，空文件夹可以删除。
 * 10.deleteOnExit()			在虚拟机终止时，删除
 * 11.isHidden()				判断是否是隐藏文件/夹
 * 12.isAbsolute()				测试抽象路径是否为绝对路径。
 * 13.getName()					获取文件/夹名字
 * 14.getPath()					获取文件/加 相对绝对路径，但是目录要指定，就看指定的。
 * 15.getAbsolutePath()			返回绝对路径
 * 16.length()					返回文件的大小（字节） 如果不存在或者是文件夹是0L
 * 17.getParent()				返回抽象路径的父路径，如果传的没有父径返回的是null。
 * 18.lastModified()			获取最后一次修改时间
 * 19.static File[] listRoots() 列出所有的跟（windows就是所有盘符，linux 只有 /）
 * 20.list()					返回目录下面所有的文件或目录包括隐藏的，但是如果遍历文件直接返回null 返回的是字符串
 * 21.list(FilenameFilter filter)返回过滤的
 * 22.listFiles()				返回的都是对象 如果遍历文件也是null
 * 23.listFiles(FilenameFilter filter) 返回过滤的
 * class FileNameFilter implements FilenameFilter {
	private String kzm;
	
	public FileNameFilter(String kzm){
		this.kzm = kzm;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(kzm);
	}
	
	}
	File [] flItems = new File("d:/").listFiles(new FileNameFilter(".txt"));
	System.out.println(flItems.length);
	
 * 路径
 * java 的相对路径 java命令运行时所在的目录，对于ecplise来讲相对目录是java项目所在的目录。
 * 
 * 
 * IO 流
 * 按照操作类型分为，字节流，字符流
 * 按照流向分为	输入流，输出流
 * 
 * 
 * 字节流
 * 计算机中存储的都是二进制数据，一个字节是8位二进制。字节可以表示所有的数据，比如图片，视频等等。
 * 所有的应用处理的是二进制的文件，而文本文件为啥打开我们能读懂，是因为它底层将二进制文件转化为人类可以识别的字符。
 * 其它二进制字节打开我们读不懂。是因为编码和解码规则不同。 文本文件按照文本文件的规则编码和解码，而其它应用就有别的应用的编码和解码。所以说
 * 可能一个应用的编码，放到另一个应用的解码就会有乱码。除非两个应用用了同一套规则否则编码和解码不同一定乱码。
 * 
 * 字节流的两个基类--抽象类
 * java.io.InputStream 输入字节流
 * java.io.OutputStream 输出字节流
 * 
 * 他们的派生子类有个特点，所有的都是***InputStream ***OutputStream
 * 字节流处理的就是字节，用于操作二进制文件（计算机所有的文件都是二进制的文件）。
 * 
 * InputStream 输入字节流
 * 需求1
 *     1.读取一个非中文文件。
 * 	   2.使用read()方法实现
 *     3.使用int read(byte [] b)实现
 *     
 * 打开api发现
 * read一次只读取一个字节，如果读到文件末尾返回-1
 * 
 * read(byte []b) 方法,使用缓冲区（关键是缓冲区大小的确定）
 * 使用read流读取一次就处理一次，可以将读取到的数据放到字节数组里面去，一次读取多个提交效率。
 * 
 * 总结
 * 问题一 为什么输出的是数字不是字符，这个很简单因为读取的是字节，将二进制，变为十进制的字节所以是数字。如果需要变为字符需要char的强转
 * 问题二 换行 linux 是 \n window 是 \r\n 	码标值是 \r 13  \n 10
 * 
 * 形式3
 * read(byte [] b, int off, int len);
 * b是一个字节数据
 * off从数组什么位置开始存
 * len 存多少个 超过这个值的就不存了
 * 
 * 其实就是使用数组的一部分来存储，通过控制偏移量来实现。
 * 
 *     
 * skip 文件指针跳    
 * skip(long n);   如果n大于了源文件个数也不报错。
 * 
 *     
 *     
 * 输出字节流
 * OutputStream 
 * 需求2 
 * 使用write 和 write(byte[] b) 写入     
 * os.write(10);//这里有个暗坑这里虽然是个int但是写入的也只能是个byte的，如果大于byte将发生精度错误.
 * 
 * 一次写入多个字节
 * byte [] by = new byte[1024];
   for(int i = 0; i < by.length; i++){
       by[i] = 97;
   }
   os.write(by);
 * 如果目标文件不存在创建，如果中间目录不存在就异常了。
 *
 *     
 * FileOutputStream    
 * FileOutputStream(String name, boolean append);
 * FileOutputStream(File name, boolean append);
 * FileOutputStream(String name);
 * FileOutputStream(File name); 
 * 
 * 字节拷贝
 * cpSize //先建立的管道最后关闭，后开的先关
 * 
 * io的字节流的异常处理
 * finally 关闭资源流 异常可以用throw new RuntimeException(e);包装下抛出
 * 
 * 字节缓冲流
 * BufferedInputStream
 * BufferedOutputStream（由于内部维护着一个缓冲数组，如果缓冲数组没有满，可以调用flush将其刷出去。也可以关闭资源数组自动刷出）
 * 内部的缓冲数组大小是8192字节 内部默认维护着一个缓冲字节数组。
 * cpSizeBuffered
 * 这个基本没啥用处，最好还是用原生的byte [] 缓冲来做。
 * 
 * 
 * 字符流
 * 计算机不区分二进制文件与文本文件，计算机中存储的都是二进制文件，因此从本质讲，所有文件都是二进制的，
 * 所以字符流是建立在字节流的基础之上的，它能够提供字符层的编码和解码。
 * 
 * 码表
 * ASCII:		 美国标准信息交换码，一个字节  但是只用了一个字节的7位来表示0-127 码表有些是空的没有用满。
 * ISO8859-1:	拉丁码表，欧洲人用的，一个字节，但是这个是全部用满的，唯一个全部用满的码表。
 * 又称为Latin-1 它是在ascii的基础上扩展把没有用的，用起来并且全部用满它。
 * Ascii 的空的范围 0xA0-0xFF
 * GB2312:		英文占一个，中文占两个。中国码表
 * GBK:			中国码表的升级，融合了更多的字符。
 * 
 * Unicode:		国际标准码规范，融合了多种文子，所有的文子都用两个字节，java语言就是unicode
 * UTF-8:		中文三个英文一个。
 * 
 * 常用的是 Iso8859-1, GBK(iso8859-1内容+扩展中文，不是说用了iso8859-1规则只是内容), UTF-8（万国码1-3个字节不等，中文3个英文1个）
 * 每个码表都有自己的规则，很少有交集的（例如bjg5和gbk的汉字简体和繁体可能是样的，也只是部分一样），所以用一个编就用一个解。
 * 总之就是用什么编码写的就用什么编码读取否则乱码。
 * 
 * 
 * 使用字节流操作字符
 * charDoSize()
 * 由于字节流无法满足读取字符的需求，所以需要使用字符流
 * 字节流写没有问题（只要按照写的编码打开即可），当在读的时候如果这个字符占1个字节以上（编码表相同）那么也会乱码，
 * 原因是读进来的是一个字节的原来的是两个字节的
 * 		System.out.println(new String("中国".getBytes(),0,6));
		try {
			FileInputStream fi = new FileInputStream(new File("d:/iotest.txt"));
			byte [] s = new byte[3];//这理必须读三个如果1个那么将错误，因为一个汉字在utf-8下为3个字节
			int len = fi.read(s);
			System.out.println(new String(s,0,len));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 * 
 * 字符流就是 字节流+编码表
 * 抽象类
 * Reader 输入字符流
 * Writer 输出字符流
 * 
 * Reader 
 * int read();
 * 读取一个字符，返回的是读取的那个字符（理解是读到的那个字符以数字的形式返回），末尾为-1
 * int read(char [] buf);
 * 和字节一样只不过读出来的是字符。
 * 
 * 对应的两个类是
 * FileReader
 * FileWriter
 * http://www.ibm.com/developerworks/cn/java/j-lo-chinesecoding/ 
 * 关于
 * InputStream StreamDecoder Reader  读取
 * OutputStream StreamEncoder Writer 写入  
 * 关系
 * 
 * 
 * Writer
 * writer(int ch); 字符集 字符对应的值，写出去
 * writer(char ch); 字符写出去
 * writer(char [] ch); 字符数组写出去
 * writer(string str); 字符串写出去
 * flush(); 将缓冲去的数据写出去 buf 是1024
 * 
 * Reader Writer 
 * 操作的是字符，我们读取的时候由二进制解码到字符，写入由字符编码到二进制，核心就是StreamDecoder 以及 StreamEncoder,没有指定字符集用默认的
 * 默认的就是当前项目的字符集。
 *  
 * 字符流拷贝
 * characterCp();
 *		
 *
 * 字节流拷贝视频音频等等不会损坏，为什么字符流会？
 * 其原因很简单，在读取的时候视频也好音频也好它们的二进制可能在streamDecoder的编码表里面没有对应，这样就会用一个空字符对应的值代替，这个时候在写回去
 * 俨然就不是原来的值了。
 *
 *
 * 字符缓冲类
 * BufferedReader
 * BufferedWriter
 * readLine()读一行\r\n为标志
 * newLine()写入一行\r\n，否则readLine()是不会自己加的，所以写的时候需要自己写。
 * 
 * 缓冲区类拷贝
 * bufferedRW();
 * 
 * 
 * 其它流
 * 
 * 序列流（合并流）
 * SequenceInputStream
 * 对多个字节流进行合并
 * 构造函数
 * 合并两个流 sequenceInputStream();
 * SequenceInputStream(InputStream s1, InputStream s2);
 * 
 * 
 * 对象序列化
 * ObjectInput
 * 	readObject()  
 * ObjectOutput 
 *	writeObject() 
 *
 * ObjectInput,ObjectOutput 是两个接口，需要实现类实现。
 * 实现类
 * ObjectInputStream
 * ObjectOutputStream	被写入对象必须实现serializable 否则抛出异常
 * 核心的操作流程是
 * 1.类实现标志接口serializable 标志接口没有实现方法，子类不用重写方法。
 * 2.创建输出流ObjectOutStream(new FileOutputStream("path")) writeObject(对象) 将对象序列化，然后写出去
 * 3.创建输入流ObjectInputStream(new FileInputStream("path")) readObject() 将序列流读进来，在反序列化 读进来的是个Object需要自己在强转回来
 *
 * 序列化
 * 1.Serializable --标志接口 所有类如果想序列化必须实现它。包括类中引用着其它类，也必须实现这个接口。
 * 如果没有实现这个接口，试图序列化将抛出NotSerializableException
 * 2.transient 如果一个类的成员前面加上这个关键字将跳过不序列化
 * 3.序列化只适应非静态的成员。
 * 4.序列化基本数据类型  writeBoolean(true); writeDouble(3.14);
 * 5.基本数据类型反序列化 readBoolean(); readDouble();
 * 6.Serializable SerialVersionUID 
 *   用于给类指定一个UID 该UID 是通过类中的可序列化成员的数字签名运算出来的一个long值。
 *   只要是这些成员没有变化，那么该值每次都一样。
 *   该值用于判断，序列化前类 和序列化后类是否发生改变 假如，序列化后，类变了，反序列化那对象的SerialVersionUID 和类的SerialVersionUID对不起来了就报错了。
 * 
 * 读写配置文件Properties
 * Map
 *   HashTable
 *       Properies 这个无须泛型，默认就是String
 * 方法
 * setProperty(key, value);		设置配置文件键值
 * getProperty(key);			获取键的值 如果没有key值就返回的值是null
 * get(key);					获取键的值
 * Enumeration propertyNames()  获取集合中所有键值元素
 * jdk1.6 
 * StringPropertyNames()	
 * 
 * 列出集合中所有的键值对，可以通过参数打印到指定的目的地
 * list(PrintStream)
 * list(PrintWriter)
 * 例如
 * list(System.out) 打印到控制台
 * list(new PrintStream("pro.txt")); 放到文件里面
 * 
 * 可以将流中的内容载入到集合中
 * load(InputStream)
 * jdk 1.6 
 * load(Reader)
 * 注意流中的数据要是键=值的规则
 * 
 * 将集合中的数据存储
 * store(Writer, String comment); comment的会在开头用#comment表示
 * 使用该方法存储会带着存储时间
 * 注意：
 * properties 只加载key=value与文件名无关，注释使用#  这句话Properties p = System.getProperties(); 诠释了和文件无关
 * 
 * 
 * 获取系统配置文件
 * System.getProperties();
 * 
 * 
 * 打印流
 * printStream（是一个字节打印流） 可以接收文件，和其它字节输出流，所以打印流是对普通字节输出流的增强。
 * 其中定义了很多重载的print println 方便输出各种类型 可以做log 因为默认就是追加的形式
 * 打印流的三种方法
 * print			
 * println
 * printlf(String format, Object ...args)
 * 
 * print和write 区别  print有刷新 write 需要手动flush 或 close输出数据
 * println 加换行
 * printlf 可以格式化
 * printlnf("%d,%f",199,3.12);
 * 
 * 
 * 
 * 流的操作
 * 1.获取资源文件    
 * 2.创建流的管道
 * 3.操作
 * 4.关闭流管道  
 */
package always_revision;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.io.Serializable;
 
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.sound.midi.Sequence;

/**
 * @author www.23.com
 *
 */
public class IO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show_list(new File("d:/bbb"),	"-|");
		
		//FilenameFilter
		/*File [] list = new File("d:/").listFiles(new FileNameFilter(".txt"));
		System.out.println(list.length);*/
		
		//io 需求1
		/*InputStream is = null;
		try {
			is = new FileInputStream(new File("d:/iotest.txt"));
			int rd = -1;
			byte [] by = new byte[200];
			while((rd = is.read(by)) != -1){
				System.out.println(new String(by,0, rd));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		/* 形式3
		 * InputStream is = null;
		try {
			is = new FileInputStream(new File("d:/iotest.txt"));
			byte [] by = new byte[1024];
			System.out.println(is.read(by,10,2));//实际上也就读了2个。这里如果设置了读取个数就只读取指定的读取个数。
			System.out.println(new String(by,10,4));//因为读了2个，其它的就是些空的，如果是字节数组打印默认是0。
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		/*InputStream is = null;
		try {
			is = new FileInputStream(new File("d:/iotest.txt"));
			is.skip(10000);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//需求2
		//System.out.println((int)'定');
		//write();
		
		//cpSize
		//cpSize(new File("d:/a/org.apache.http.legacy.jar"), new File("d:/b/org.apache.http.legacy.jar"));
		
		//cpSizeBuffered
		//cpSizeBuffered(new File("d:/a/org.apache.http.legacy.jar"), new File("d:/b/org.apache.http.legacy.jar"));
		
		//charDoSize
		//charDoSize(new File("d:/iotest.txt"));
		/*FileReader fr = null;
		try {
			fr = new FileReader(new File("d:/iotest.txt"));
			int i = 0;
			while((i = fr.read()) != -1){
				System.out.println((char)i);
			}
			char [] byf = new char[10];//缓冲字符数组
			int len = 0;
			while((len = fr.read(byf)) != -1){
				System.out.println(new String(byf,0,len));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		/*FileWriter fw = null;
		try {
			fw = new FileWriter(new File("d:/iotest.txt"));//和输出字节流一样追加需要第二个参数否则直接清空
			fw.write(185600000);//这个就是字符集对应的字符的值
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		//字符流拷贝
		//characterCp(new File("d:/iotest.txt"),new File("d:/iotestcp.txt"));
		/*BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("d:/iotest.txt"));
			String tmp = "";
			while((tmp = br.readLine()) != null){//这没有维护什么数组就是当读到\r\n 为结束标志
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		//使用字符流缓冲区类拷贝文件
		//bufferedRW(new File("d:/iotest.txt"),new File("d:/iotestcp.txt"));
		
		//序列流
		//sequenceInputStream();
		
		//对象存储
	/*	serializableObject so = new serializableObject();
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:/object.txt"));
			os.writeObject(so);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("d:/object.txt"));
			serializableObject ssl = (serializableObject)oi.readObject();
			System.out.println(ssl.a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 
		//不存文件的序列化
		/*try {
			//网络接口
			URL url = new URL("http://www.baodu.com");
			URLConnection uc = url.openConnection();
			uc.setDoOutput(true);
			ObjectOutputStream os = new ObjectOutputStream(uc.getOutputStream());
			os.writeObject(new serializableObject());
		 
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//读写配置文件Properties
		/*Properties p = System.getProperties();//获取系统的配置信息
		//将所有的配置信息打印到控制台
		p.list(System.out);
		//获取 所有的key stringPropertyNames 这个是1.6才出的
		Set<String> st = p.stringPropertyNames();
		Iterator<String> it = st.iterator();
		while(it.hasNext()){
			System.out.println("ding:"+it.next()+"="+p.getProperty(it.next()));
		}*/
		
		//读取本地配置文件
		/*Properties p = new Properties();
		//加载进来
		try {
			p.load(new FileReader("d:/jvmSetting.txt"));
			//遍历集合中的元素
			Set<Map.Entry<Object, Object>> m = p.entrySet();
			for(Map.Entry<Object, Object> mx : m){
				System.out.println((String)mx.getKey()+"---"+(String)mx.getValue());
			}
			
			//获取键的值
			System.out.println(p.get("java.specification.vendor"));
			p.setProperty("java.specification.vendor", "hahahahahahahahahahahahahahahahahahahahahahahahahahahaha");
			
			//回写
			p.store(new FileWriter("d:/jvmSetting.txt"), "dingluchao");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//构造可以接收
		//OutputStream filename  File
		//PrintStream ps = System.out;
		
		//普通的write 需要flush 或 close
		/*ps.write(97);
		ps.close();//关闭*/		
		
		/*ps.print(false);//向控制台输出
		
		try {
			PrintStream ps2 = new PrintStream("d:/a.txt");
			System.setOut(ps2);//改变System.out的流向为ps2
			ps2.print(false);
			ps2.print(false);
			ps2.print(false);//流向了a.txt 
			ps2.println(1234);
			ps2.println(1234);
			System.out.println("dddd");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	public static void show_list(File fl,	String fg){
		if(fl.isDirectory()){
			File [] fileItems = fl.listFiles();
			for(File flItem : fileItems){
				System.out.println(fg + flItem.getName());
				if(flItem.isDirectory()){
					show_list(flItem, "--"+fg);
				}
			}
		}
	}

	public static void write() {
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(new File("d:/iotest.txt"));//FileOutputStream 如果没有第二个追加参数，每次创建这个实例都会清空目标文件。
			//os.write(10);//这里有个暗坑这里虽然是个int但是写入的也只能是个byte的，如果大于byte将发生精度错误.
			/*
			 * 一次写入多个字节
			 * byte [] by = new byte[1024];
			for(int i = 0; i < by.length; i++){
				by[i] = 97;
			}
			os.write(by);*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
					System.out.print("done");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void cpSize(File from, File to) {
		if (from.isFile() && to.getParentFile().isDirectory()) {
			FileInputStream fi = null;
			FileOutputStream fo = null;

			try {
				fi = new FileInputStream(from);
				fo = new FileOutputStream(to);

				// 创建缓冲数组
				byte[] by = new byte[1024];
				int len = 0;
				while ((len = fi.read(by)) != -1) {
					fo.write(by, 0, len);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				 
				try {
					if(fo != null){
						fo.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					if(fi != null){
						try {
							fi.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				

			}

		}
	}
	
	public static void cpSizeBuffered(File from, File to){
		if (from.isFile() && to.getParentFile().isDirectory()) {
			BufferedInputStream fis = null;
			BufferedOutputStream bos = null;
			
			try {
				fis = new BufferedInputStream(new FileInputStream(from));
				bos = new BufferedOutputStream(new FileOutputStream(to));
				
				byte [] by = new byte[1024];
				int len = 0;
				while((len = fis.read(by)) != -1){//如果没达到8192的边界就直接从缓冲数组拿。
					bos.write(by,0,len);//这里并没有真正的写出去因为内部的缓冲数组，当达到8192才会出去。
					//bos.flush(); 这里可以强制写出去
				}
				System.out.println("is done");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					if(bos != null){
						bos.close();//关闭也可写出去
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					try {
						if(fis != null){
							fis.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	}
	
	public static void charDoSize(File fl){
		if(fl.isFile()){
			try {
				FileInputStream fi = new FileInputStream(fl);
				byte [] by = new byte[1024];
				int len = 0;
				while((len = fi.read(by)) != -1){//由于中文在utf-8下是一个汉字3字节，GBK也有两个字节，而这个每次读一个字节当然是乱码
					System.out.println(new String(by,0,len));
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void characterCp(File fl,	File fg){
		if(fl.isFile()){
			FileReader fr = null;
			FileWriter fw = null;
			
			try {
				fr = new FileReader(fl);
				fw = new FileWriter(fg);
				
				char [] by = new char[1024];
				int len = 0;
				while((len = fr.read(by)) != -1){
					fw.write(by,0,len);
				}
				System.out.println("done");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					if(fw != null){
					fw.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					try {
						if(fr != null){
						fr.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
	}
	public static void bufferedRW(File fl,	File fg){
		if(fl.isFile()){
			BufferedReader br = null;
			BufferedWriter bw = null;
			
			try {
				br = new BufferedReader(new FileReader(fl));
				bw = new BufferedWriter(new FileWriter(fg));
				
				String tmp = null;
				if((tmp = br.readLine()) != null){
					bw.write(tmp);
					bw.flush();//刷出去，因为底层用的还是FileWriter的writer所以有个缓冲刷出去的问题。
					bw.newLine();
				}
				System.out.println("is done");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					if(bw!=null){
					bw.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						if(br != null){
						br.close();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
	}
	
	public static void sequenceInputStream(){
		
		//合并两个流
		/*try {
			FileInputStream fi1 = new FileInputStream("d:/test.txt");
			FileInputStream fi2 = new FileInputStream("d:/test2.txt");
			
			SequenceInputStream si = new SequenceInputStream(fi1,fi2);
			byte [] by = new byte[1024];
			int len = 0;
			while((len = si.read(by)) != -1){
				System.out.println(new String(by,0,len));
			}
			si.close();//关闭多个流
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//合并多个流
		/*ArrayList<FileInputStream> fileItems = new ArrayList<FileInputStream>();
		try {
			fileItems.add(new FileInputStream("d:/test.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		final Iterator<FileInputStream> it = fileItems.iterator();
		SequenceInputStream si = new SequenceInputStream(new Enumeration<FileInputStream>(){

			@Override
			public boolean hasMoreElements() {
				// TODO Auto-generated method stub
				return it.hasNext();
			}

			@Override
			public FileInputStream nextElement() {
				// TODO Auto-generated method stub
				return it.next();
			}

			
		
		});
		
		byte [] by = new byte[1024];
		int len = 0;
		try {
			while((len = si.read(by)) != -1){
				System.out.println(new String(by,0,len));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			si.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//关闭多个流
*/		
		
		
	}
}

class FileNameFilter implements FilenameFilter{
	private String kzm;
	public FileNameFilter(String kzm){
		this.kzm = kzm;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(kzm);
	}
	
}



//对象序列化
class serializableObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int a = 1;
	public int c = 2;
	
}
