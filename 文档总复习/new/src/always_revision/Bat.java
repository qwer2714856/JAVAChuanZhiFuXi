/**
 * P处理文件
 * jar包 双击可以运行，但是仅仅是针对于图形化界面的，对于控制台式不起作用的。
 * 
 * 如何编写p处理文件
 * 所有命令都放到文本文件，然后将扩展名改为.bat 即可
 * p处理文件常用的命令
 * pause 当前控制台停留
 * 
 * 把class所在文件加 打包成zip文件如何执行？
 * java -classpath 打包好的那个zip文件;第二个zip;第三个jar包...; 包名.类名
 * 多个用;分割一个可以不写;
 * 注意一个问题如果不写;就只在zip包里面找，如果使用了;还会在当前目录下面找
 * 
 * 和set classpath=./ 区分
 * 
 * 设置classpath不必理会和java内部的工具冲突。直接设行了。！！！
 * 
 * 
 * 
 * 常用的命令
 * echo 输出
 * 隐藏执行过的命令
 * echo off
 * 隐藏echo off
 * 后面的命令
 * 例如
 * echo off
 * java .... 控制台就不会显示执行过哪些命令
 * 
 * @隐藏当前行执行的命令
 * 
 * title 改变当前控制台窗口的标题
 * 
 * color 改变颜色
 * 背景 
 * 前景
 * 第一个背景第二个前景
 * color ? 查看颜色
 * color 00
 * 
 * 注释用%....%来注释 这是个单行注释不能换行的
 * 
 * 参数
 * %1~%9给你p处理文件传入参数 最多只能有9个
 * run.bat 参数1 参数2 这个就控制台能用双击不能用 
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class Bat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

}
