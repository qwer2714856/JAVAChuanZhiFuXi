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
 * 路径
 * java 的相对路径 java命令运行时所在的目录，对于ecplise来讲相对目录是java项目所在的目录。
 * 
 * 
 */
package always_revision;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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
		
		
	}

}
