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
 * 
 * 
 * 
 * 
 */
package always_revision;

import java.io.File;

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
		File file = new File("d:/iofuxi.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	}

}
