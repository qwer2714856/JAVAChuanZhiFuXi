/**
 * JAR包
 * jar 命令
 * jar cvf jar包名.jar -C 打包的包名/  打包包含几层目录.用winrar打开只有class文件
 * ../会包含包名 ../../包含包名外边那层目录名。
 * 注意打包的时候一定要把包名也打包上否则无法运行
 * 
 * jar cvf jar包名.jar 包名.类名 包名.类名  将多个类放到一个包。
 * 
 * http://blog.csdn.net/kiss0931/article/details/210201
 * 
 * 
 * 打包为可运行程序
 * 1.首先工程下面 例如eclise bin 所有编译好的包
 * 2.jar cvf  随意.jar -C always_revision/ ../ always_revision这目录上面所有的文件全部打包（所有的包那层目录）。 
 * 3.生成随意.jar后用winrar打开  META-INF/MANIFEST.MF 
 *   写入
 *   如果用了三方的.jar包 比如内置的类的jar包我就需要把它一起打包指定Class-Path:
 *   Class-Path: rt.jar 三方.jar 
 *   Main-Class: 包名.类名（所谓的main入口程序的开始位置）
 * 
 * 4.运行如果有图形界面的用 双击 否则 用命令 java -jar 随意.jar
 * 
 * 
 * 
 * 
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class JAR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
