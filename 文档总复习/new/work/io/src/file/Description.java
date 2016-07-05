/**
 * IO 流
 * input output 输入输出流
 * 主要作用是用于解决【设备】与【设备】之间的传输问题 例如内存 和 硬盘  之间的传输 键盘 和 内存
 * 应用的场景 比如说：
 * 导出报表，文件上传，下载 socket 管道通信   android的一些数据都是保存在xml上的，解析xml文件。
 *
 * 一般数据是以何种形式保存到硬盘上的，是以文件保存的。
 * 
 * 操作文件 File类 描述文件或者文件夹的
 * 
 * File类
 * 
 * 构造方法
 * File(File parent, String child) 有时候需要在遍历的时候需要基准目录在操作子目录，父目录不变做子目录
 * 父路径对象   子路径字符串  第一个和第三个用第一个比较有用。因为父路径是个对象可以调一些方法。
 * 
 * File(String pathname) 路径是抽象的可能存在也可能不存在的  
 * 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
 * 指定路径字符串（文件或者文件夹路径）转换为路径创建file对象
 * 
 * File(String parent, String child)  和构造一样只不过字符路径都是字符串
 * 父路径字符串   子路径字符串
 * 
 * 目录分割符的问题
 * 目录分割符--跨平台的作用，在windows的分割符是不能再linux上用的 例如 \ / windows（/写一个 \\写两个） /是linux的  
 * File.separator 这个是如何知道是linux还是windows的是因为不同平台的虚拟机是不一样的。
 * 
 * 方法
 * file描述对象的方法
 * 
 * file.exists();                     如果存在true否则false
 * 
 * file.getAbsolutePath()             返回file指定的路径的绝对路径--java中这个很有用可看当前程序文件的绝对路径 File(".") 后用这个查看
 * 
 * 创建
 * boolean createNewFile()  --throws IOException当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
 * boolean mkdir()								创建此抽象路径名指定的目录。
 * boolean mkdirs()								创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
 * boolean renameTo(File dest)					重新命名此抽象路径名表示的文件。
 * 
 * 
 * 删除的方法
 * boolean delete() 							删除此抽象路径名表示的文件或目录。如果此路径名表示一个目录，则该目录必须为空才能删除。 当且仅当成功删除文件或目录时，返回 true；否则返回 false
 * void deleteOnExit()							 在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。
 * 
 * 判断的方法
 * boolean	exists()							文件是否存在
 * boolean	isFile()							是否是文件
 * boolean	isDirectory()						是否是目录
 * boolean	isHidden()							是否隐藏文件或文件夹
 * boolean	isAbsolute()						是否是绝对路径
 * 
 * 获取的方法
 * getName()									获取文件的文件名字  d:\\sdfsf.txt  sdfs.txt为文件名 文件不存在也能获取文件名,直接split取最后一个了没有判断是否存在。
 * getPath() 									获取绝对路径，你在file传什么就返回什么更假的
 * getAbsolutePath() 							获取绝对路径，你传什么就在当前路径给你传的路径拼接，例如讲File f = new File("..\\dsd.txt"); 这个得到的是当前程序文件的据对路径+你传的这个路径
 * getParent() 									获取父路径File f = new File("..\\..\\cc.txt"); 返回的是..\\..\\
 * lastModified()								获取最后一次的修改时间 返回的是时间戳 毫秒 错误路径的就是0
 * length() 									获取文件字节大小 字节为单位 --如果文件不存在就是0
 * 上面都不判断文件是否存在
 * 
 * 文件的方法 -- 指定目录错误爆异常
 * static listRoots() 							列出电脑所有根目录 返回的是File 数组 而且实现了comparable接口可以使用for 增强
 * list()										列出指定目录文件和文件夹名。返回string [] 	 注意是子文件不递归	 包括隐藏的也会列出来								
 * listFiles() 									列出指定目录的文件和文件 这个是文件了不是名了 返回File [] 注意是子文件不递归，包括隐藏的,获取指定目录的 子文件夹和文件  的对象描述
 * list listFiles 建议使用listFiles
 * 
 * list(fileName filter) 						过滤 fileName filter文件名过滤器  自定义过滤器需要需要实现FilenameFilter
 * listFiles(fileName filter)					过滤 fileName filter文件名过滤器 自定义过滤器需要实现FilenameFilter
 * 
 * 路径问题
 * 绝对路径 		该文件在硬盘的完整路径 以盘符开头
 * 相对路径		资源文件相对于当前程序所在的路径  . 当前路径  ..上一级路径   【注意！！！】程序文件和资源文件不再同一个盘符下无法访问。
 * classpath 路径
 * web 路径
 * 
 * 
 * io 的资源关闭原则，先开的后关，后开的先关。从内想外关闭
 * 
 */
package file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Description {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file 描述了这个抽象文件的对象
		//File filefk = new File("d:\\");
		//File file = new File(filefk,"cc.txt");//第一个参数是目录对象，第二参数是字符串的路径
		//File file = new File("d:\\", "cc.txt"); //递归遍历目录很有用固定目录遍历子目录
		//System.out.print(file.exists());
		
		//目录分割符--跨平台的作用，在windows的分割符是不能再linux上用的 例如 \ windows /是linux的
		//System.out.print(File.separator);
		
		/*File file = new File(".");
		System.out.println(file.getAbsolutePath());//返回当前程序所在的绝对路径
		
		File file2 = new File(file.getAbsolutePath()+"../../../../../cc.txt");
		System.out.println(file2.exists());*/
		
		
		//操作文件
		
		//创建文件
		//在不存在的目录创建文件就报错  如果该文件存在就不创建返回 false 不存在创建返回true 成功创建true 否则false
		/*File files = new File("d:\\javaFunctionCreate\\a.txt");
		try {
			System.out.println(files.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//创建文件夹 --中间如果存在不存在的目录将返回false如果目标文件夹存在返回false 创建单级文件夹 成功创建true 否则false
		/*File files = new File("d:\\javaFunctionCreate\\mkdir\\mkdir");
		System.out.println(files.mkdir());*/
		
		//递归创建不存在的文件夹 如果目标文件夹存在返回false 创建多级文件夹 成功创建true 否则false
		/*File files = new File("d:\\javaFunctionCreate\\mkdir\\mkdir");
		System.out.println(files.mkdirs());*/
		
		//重命名文件 @param File dest 参数是一个file对象 这个函数有两个作用 重命名和移动 没有成功就false 成功创建true 否则false
		//将files的移动到files2的描述对象上去如果同目录就是重命名，否则就是移动  重命名可以对文件夹操作，移动不能对文件夹操作
		/*File files = new File("d:\\javaFunctionCreates");
		File files2 = new File("d:\\javaFunctionCreate");
		System.out.println(files.renameTo(files2));*/
		
		//可以删除文件夹和文件，但是文件夹必须是空的 成功创建true 否则false 马上删
		/*File files = new File("d:\\javaFunctionCreate");
		System.out.println(files.delete());*/
		
		//deleteOnExit jvm退出的时候删除文件 和delete一样不能删除有内容的文件夹 返回void  退出删除 相当于析构函数一般用于删除临时文件
		/*File files = new File("d:\\javaFunctionCreate\\a.txt");
		files.deleteOnExit();*/
		
		/*File f = new File("d:\\cc.txt");
		System.out.println(f.lastModified());
		Date d = new Date(f.lastModified());
		System.out.println(d);
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sm.format(d));*/
		
		//文件夹的方法
		//列出所有的跟目录
		//System.out.print(File.listRoots());
		/*for(File p:File.listRoots()){
			System.out.println(p.getPath());
		}*/
		
		//列出指定目录的子文件和文件夹
		/*File f = new File("d:\\");
		for(String name:f.list()){
			System.out.println(name);
		}*/
		
		//获取指定目录的 子文件夹和文件  的对象描述
		/*File f = new File("d:\\");
		for(File fc:f.listFiles()){
			System.out.println(fc.getAbsolutePath());
		}*/
		/*System.out.print(new File("").lastModified());*/
		
		File [] fl = new File("D:\\javaFunctionCreate\\").listFiles(new MyFilter());
		for(File fls:fl){
			System.out.println(fls.getAbsolutePath());
		}
	}

}

class MyFilter implements FilenameFilter{

	@Override
	/**
	 * @param dir文件目录
	 * @param name文件名
	 * @如果返回true就保留false就过滤
	 */
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		boolean rt = false;
		if(name.endsWith(".java")){
			rt = true;
		}
		return rt;
	}
	
}
