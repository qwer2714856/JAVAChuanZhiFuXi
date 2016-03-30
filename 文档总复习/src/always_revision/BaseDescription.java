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
 *     数据类型
 *     整形
 *     byte			8位		1字节	范围-128-127 		0-255 		一共2^8 个数字 
 *     short		16位		2字节	范围-32768-32767 	0-65535		一共2^16个数字
 *     int 			32位		4字节	范围					0-（2^32）-1	一共2^32个数字
 *     long			64位		8字节	范围					0-（2^64）-1	一共2^64个数字
 *     **
 *     如果一个数值没有经过特除处理，默认是int类型的。
 *     byte a = 1; 
 *     byte b = 2; 
 *     byte c1 = b;
 *     byte c = a + b; //为什么报错，因为两个int相加无法隐式的转为一个byte
 *     可以这样
 *     byte c = (byte)(a + b);
 *     这时候  a b 的值是int 类型的所以在赋值给c是报错的
 *     但是
 *     byte c = 1+1;是正确的;     
 *     
 *     [总结: 当一个常量赋值给一个变量 java编译器会先判断这个值是不是能存放到相应类型的变量，例如byte a=1;byte 类型完全可以放下1 但是byte a=128 越界直接报错]
 *     [byte a=1;byte b=a;这个直接是把a的值拷贝给b，但是如果b=a+1就报错了因为1默认是int 小类型和大类型运算得到的是大类型，a+1是个int 所以无法放到b中，因为有个变量参与运算所以java编译器无法计算是否越界只能报错]
 *     
 *     
 *     如果想引用的是long类型的在后面加一个l就行了，常量变量都可
 *     long i = 1(L|l) + 1;
 *     
 *     浮点数
 *     float 		32位			4字节
 *     double		64位			8字节
 *     java中所有的小数默认都是double类型的
 *     所以
 *     float a = 1.1;//是报错的,因为默认是double类型。转换错误。
 *     正确的
 *     float a = 1.1f;
 *     double b = 1.1; 或 double b = 1.1d;
 *     
 *     一个准则，大转小可能会丢失精度（需要强转），小转大不需要强转。
 *     
 *     char 字符类型
 *     char 两个字节   2（16）
 *     原理： -----------------------------
 *     		|字符编码找到对应码值存储  			|
 *     		|码值解释成对应的字符使用			|
 *     		|硬盘（码值）  编码表	 内存（字符）	|
 *     		-----------------------------
 *     将字符映射为码表中的对应十进制数据加以存储。
 *     
 *     boolean 布尔类型
 *     占一个字节
 *     只有true false
 *     
 *     
 *     java 的数据类型转换
 *     1.自动数据类型转换（也称作隐式数据类型转换）
 *     小精度赋值给大精度是自动转换的，也称作隐式转换
 *     byte a = 1; //00000001
 *     short b = a;//00000000 00000001
 *     int c = b;//00000000 00000000 00000000 00000001
 *     完成自动隐式转换需要满足
 *     1.类型彼此兼容。
 *     2.目标类型的取值范围一定用大于源类型。
 *     注意 整型和浮点型统称 数值型
 *     
 *     强制类型转换
 *     不可以将一个大值赋值给一个小变量，除非强转。
 *     例如
 *     byte a = 1;
 *     a = a + 1; 报错
 *     a = a++;正确是在变量原有基础自增，没有和int类型数据相加。
 *     
 *     强转会损失精度
 *     例如 int a = 128;
 *     byte b = (byte)a;
 *     00000000 00000000 00000000 10000000 int
 *     10000000 byte 前面的全部丢掉 byte只有8位因为最高为是符号位 
 *     10000000
 *     		 -1
 *     01111111 取反
 *     10000000 128 得到一个正二进制  因为符号位是1 所以-128
 *     
 *     
 *     表达式类型自动提升
 *     算数表达式，逻辑表达式
 *     所有的byte short char int 在算数运算的时候 都将被转换为int类型
 *     char a = 'a';
 *     char b = 'b';
 *     a+b = 194
 *     
 *     
 *     所有小数据类型和大数据类型进行算数运算得到的都是大数据类型。
 *     
 *     取摸
 *     正负取决于被除数 如果被除数是负数结果一定是负数，如果被除数是正数结果一定是正数。
 *     例如
 *     10 % 3  		1
 *     10 % -3 		1
 *     -10 % 3 		-1
 *     -10 % -3		-1
 *     
 * 		三元运算必须有接收的否则错误
 * 		data % 2 == 0 ? "偶数":"奇数";报错
 * 		String str = data % 2 == 0 ? "偶数":"奇数";正确    
 *     
 *     赋值运算 +=
 *     byte a = 1;
 *     byte b = a + 1;表达式提升所以这里编译报错；
 *     byte a+=1不报错因为编译器做了特殊处理。
 *    
 *     负数的二进制码如何得到十进制
 *     11111001
 *     			去掉补码 -1
 *     11111000
 *     			取反码
 *     00000111
 *     			得到十进制7 然后加上一个负号搞定。
 *      int a = 1;
		int b = 2;
		a = a ^ b;
		b = b ^ a;
		a = b ^ a;
		
		System.out.println(b);
 *
 *		<< >> >>>
 *		左乘 右除 
 *		3 >> 2 3*2*2
 *		<< 被移除的位置用0不缺，包括最高为的符号位
 *		>>  如果最高位被移 如果是 0 就用0 补如果是1用1补
 *		>>> 全部是0补位。
 *		
 *		函数的重载
 *		只要函数名相同 参数列表不同就可以 与返回值无关
 *
 *
 *		数组
 *		三种定义格式
 *		int []a = new int[2];
 *		int []a = {1,2};
 *		int []a = new int[]{1,2};
 *		
 *		Object []a = new Object[10];可以存储任意类型
 *
 *		二维数组
 *		声明一个三行两列的二维数组
 *		int a[][]=new int[3][2]
 *		int [][]a = {{1,2,3,4},{1,2,3,4}};
 *		int [][]a = new int[][]{{1}};
 *
 *		数组的三个方法
 *		Arrays.toString(a);  返回数组元素字符串[1,2,3,4]
 *		
 *		int [] a = {4,3,2,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));  没有返回值，在原有数组上排序
		
 *		int [] a = {4,3,2,1};
		System.out.println(Arrays.binarySearch(a,3));   //如果查找到元素，返回对应元素下标否则返回-1
 *		
 *		数组使用new和不使用new的区别
 *		int [] a = {}  静态初始化
 *		int [] a = new int[10]; 动态初始化
 *
 *		
 */		
package always_revision;

import java.util.Arrays;


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
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		
			int data = Integer.parseInt(br.readLine());
			//System.out.println(data % 2 == 0 ? "偶数":"奇数");
			System.out.println(true & false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*Scanner sc = new Scanner(System.in);
		int str = Integer.parseInt(sc.next());
		int guess = (int)(Math.random() * 10);
		while(true){
			if(str  > guess){
				System.out.println(str+"大于了");
			}else if(str < guess){
				System.out.println(str+"小于了");
			}else{
				System.out.println("猜中");
				break;
			}
			str = Integer.parseInt(sc.next());
		}*/
		
		/*for(int i = 1; i < 10; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}*/
		
		 /*int [] a = {1,2,3,4,5,6,7,8,9};
		 int tmp = a[0];
		 for(int i = 0; i < a.length; i++){
			 tmp = Math.max(tmp, a[i]);
		 }
		 System.out.println(tmp);*/
		
		//直接插入排序。
		//核心算法  从数组的第二个元素做标志比对位，往<-前找如果找到比自己大的就让大的往后挪，直到挪到第一位然后将标志位值放上。
		//例子
		/*int []a = {4,5,7,1,3,4,5,0};
		for(int i = 1; i < a.length; i++){
			int tmp = a[i];
			int j = i - 1;
			while(j>=0 && tmp < a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = tmp;
		}
		System.out.println(Arrays.toString(a));*/
		
		//冒泡排序
		/*int []a = {4,5,7,1,3,4,5,0};
		for(int i = 0; i < a.length - 1; i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i] > a[j]){
					a[i] = a[i] ^ a[j];
					a[j] = a[i] ^ a[j];
					a[i] = a[i] ^ a[j];
				}
			}
		}
		System.out.println(Arrays.toString(a));*/
		
		//选择排序
		/*int []a = {4,5,7,1,3,4,5,0};
		for(int i = 0; i < a.length - 1; i++){
			int tmp = a[i];
			int tmpIdx = i;
			for(int j = i + 1; j < a.length; j++){
				if(tmp > a[j]){
					tmp = a[j];
					tmpIdx = j;
				}
			}
			a[tmpIdx] = a[i];
			a[i] = tmp;
		}*/
		//二分查找
		/*int find = 0;
		int left = 0;
		int right = a.length - 1;
		int md = (left + right) / 2;
		
		while(left <= right){
			if(find > a[md]){
				left = md + 1;
			}else if(find < a[md]){
				right = md - 1;
			}else{
				System.out.println("find it position is" + md);
				break;
			}
			md = (left + right) / 2;
		}
		
		if(left > right){
			System.out.println("find error");
		}*/
		
		//数组翻转
		/*int [] a = {1,2,3,4};
		int len = (a.length - 1) / 2;
		int len2 = a.length - 1;
		for(int i = 0; i < len; i++){
			a[i] = a[i] ^ a[len2 - i];
			a[len2 - i] = a[i] ^ a[len2 - i];
			a[i] = a[i] ^ a[len2 - i];
		}
		
		System.out.println(Arrays.toString(a));*/
		 
		
	}
	 
}
