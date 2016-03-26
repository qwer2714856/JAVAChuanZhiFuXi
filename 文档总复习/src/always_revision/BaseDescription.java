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
 * 	   ----| classpath 一定要注意不要随便乱配置（可以不配置），如果配置了 需要这么写 set classpath 看看配了没有，没有 set classpath=.;....目录
 * 	   ----| 它会先在本地找，没有在去指定目录找，注意一定需要这个.否则当前目录的无法执行。
 * 	   ----| dos下设置环境变量
 * 		        ----| set 查看所有的变量信息
 * 			    ----| set 变量查看具体的变量信息 set PATH
 * 				----| set 变量名 =   清空一个变量的值
 * 				----| set 变量名=变量值 临时的
 * 				----| 如果需要在变量的值上扩展值 set 变量名=变量值;%变量名%
 * 	    | Java classpath环境变量
 * 		----| 设置类的搜索路径，如果设置了jvm和java 编译器会根据指定的classpath寻找class文件 比如import java.io.* 这时候编译器就需要到指定的classpath下寻找这个类，然后编译。
 * 		----| classpath . 设置与不设置的区别，如果不设置就不从当前的目录去找。
 * 
 * 第二章
 *     | /**//*/ 这种注释当使用javadoc会生成网页文档。 java特有的， 多行注释不能嵌套多好注释。
 *     | javadoc 编写软件说明书
 *     | 只能抽取public 定义的方法
 *     | javadoc -d 指定存储的路径  【 -author -version】（可选） 目标 java源文件
 *     | 格式 多行注释出现在类的头部 且类是用public修饰的 javadoc -d ./类名.html -version -author 类名.java javadoc --help看文档
 *     | 常量 整形，小数，字符，字符串，Null，布尔   单纯的值可以被称作常量，final 定义的变量可以被称作常量
 *     | 进制  一种记录方式 可以用现有的符号代表所有的值。【十进制 0-9 不能是0开头】【八进制 0-7 0开头】【二进制 0-1】【十六进制0-9A-F 0x开头】
 *     | 十进制转 二进制 求最小公倍数  7 2 最小公倍数 然后从下到上连起来 0111 
 *     00000111 八位一个字节
 *     
 *     2 |- 7 余数 1
 *     2 |- 商3 余数 1
 *     2 |- 商1 
 *     
 *     从下往上 是111 前面没有的就是0    00000111
 *     二进制转十进制
 *     0111 1*2^0+1*2^1+1*2^2  1+2+4 = 7
 *     打印System.out.println(Integer.toBinaryString(123)); 十进制转二进制
 *     
 *     二进制转 八进制
 *     三位二进制 转成十进制是一个位的八进制
 *     解释一下
 *     110 000 100 二进制吧
 *     转成八进制
 *     三位一个段 转十进制
 *     604
 *     
 *     二进制转十六进制
 *     和八进制一个道理不过是4位一个段
 *     1100 0010 0000
 *     4位一个段转十进制
 *     C	2    0
 *     前缀是0x
 *     
 *     八进制是0-7 组成
 *     十进制转八进制 对8 求最小公倍数
 *     从下到上
 *     8|17 余数是1 21 
 *      2
 *      
 *     八进制转十进制
 *     1*8^0+2*8^1 = 17
 *     
 *     十进制转十六进制
 *     对十六求最小公倍数
 *     然后十六转十进制 n*16^0....n*16^n
 *     
 *      
 *     8 进制 16进制 转2进制 
 *     8进制每个数字变3位二进制，每位 对 2 求最小公倍数
 *     16进制每个数字变4位二进制 每位 对 2 求最小公倍数
 *     
 *     人使用的是十进制，计算机底层数据处理的是二进制 八进制 以及十六进制
 *     System.out.println(0X11); 这样返回的是一个10进制
 *     Integer 里面有进制转换函数。
 *     
 *     
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
