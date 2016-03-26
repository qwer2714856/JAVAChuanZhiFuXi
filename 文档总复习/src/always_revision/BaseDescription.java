/**
 * 基础知识的复习 -- 来自传智播客最后所有的文档 24天的
 * 
 * 第一章 
 *     | jdk 目录 
 *     ----| bin 目录是存放所有的java工具，包括解释器编译器等等 反编译器 javap -c -l -private 字节码文件
 *     ----| db  目录是jdk6-7推出的一个自带数据库derby
 *     ----| include 目录 用于存放 编译本地方法 的 文件
 *     ----| jre 目录java的运行环境 （包括Jvm java程序运行所需要的核心类库）
 *         ----| bin 运行环境的工具
 *         ----| lib 运行环境的类库，包括我们用的内置类都在这里在rt.jar里面
 *     ----| lib 目录 存放java类库
 *     ----| src.zip Java的源文件
 *     
 *     | java 环境变量配置 PATH 注意环境变量有用户级别的和系统级别的，我们配置的是系统级别的在下面方格内。
 * 	   ----| 问题如果想使用java的工具必须要进到bin里面，如何在任意盘符使用？
 * 	   ----| 答 系统环境变量PATH后面加上;加上bin的绝对路径。
 * 	   ----| 使用DOS可以暂时加上，也可永久加。
 * 	   ----| 当你敲击一个命令的时候，首先会在本地当前目录检索是否有对应命令（没有），会去用户级的目录搜索，在去系统级的 。
 * 	   ----| dos下设置环境变量
 * 		        ----| set 查看所有的变量信息
 * 			    ----| set 变量查看具体的变量信息 set PATH
 * 				----| set 变量名 =   清空一个变量的值
 * 				----| set 变量名=变量值 临时的
 * 				----| 如果需要在变量的值上扩展值 set 变量名=变量值;%变量名%
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class BaseDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
