/**
 * 包的概念
 * 当定义了多个类，可能会有类名重复的情况，为了隔离开重复类名出现了包。
 * java包的机制
 * 使用 package 关键字
 * package 包名
 * 这句话的意思是当前文件的类，隶属于包名这个空间中。
 * 
 * 注意编译和运行时包的使用
 * javac 可以直接编译java文件
 * java 必须要带着包名在加类名 才能运行 否则抛出找不到类。
 * 
 * 包就是一个文件夹，如果没有建一个行了。运行的时候java 包名.编译好的类不带class
 * 其实不用每次都建一个文件夹，使用javac -d 指定目录 .java文件生成的class就自带包的文件夹了。
 * 
 * 包的优点
 * 1.防止类的冲突
 * 2.使源文件和类文件分离开。 java -d . ....java 将编译好的指定到别的目录去，和源文件分开，发布只发布编译好的。
 * 
 * 注意细节
 * 1.一个java类只能定义一个包。
 * 2.包语句位于第一句。
 * 
 * 包机制引发的问题
 * 1.当在运行类文件的时候需要带着包名。
 *   java 包名.类名
 * 2.第二个问题如果想在代码中别的包中引用类就需要
 * 	 package1.class1 c = new package1.class1(); 非常繁琐
 * 	  这个时候可以使用import  import 包名.类名
 * 	 import package1.class1;
 * 	 class1 c1 = new class1();
 * 
 * 
 * 细节
 * 如果一个包中有许多的类，都想引用可以使用统配符。
 * 
 * 1.import package1.*;全部都引用进来。 一般不要使用*
 * 2.使用*不能导入包下面包的类只能导入包下面的类
 * 3.import可以有多句
 * 
 * 单类型导入至少有以下两点好处
 * 1.提高编译速度 查找这个包下面所有的类进行编译。
 * http://blog.chinaunix.net/uid-26895266-id-3193507.html
 * 2.避免命名冲突例如：当你import java.awt.*;import java.util.*后，使用List的时候编译器将会出编译错误）
 * 3.结构清晰。
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class Package {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
