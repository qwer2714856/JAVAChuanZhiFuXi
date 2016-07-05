import java.util.ArrayList;
import java.util.Collections;

/**
 * jdk1.5的特性
 * 静态导入
 * 作用是做什么的？
 * 简化书写
 * 格式
 * 作用于一个类的所有静态成员
 * import static 包名.类名.静态成员
 *                      .* 导入所有
 */

/**
 * @author www.23.com
 *
 */
//静态导入
//作用于静态的成员方法
import static java.util.Collections.sort;
import static java.util.Collections.binarySearch;
//作用于静态的成员属性
import static java.lang.System.out;

/*特殊的地方
假使导入一个sort，而本类也有一个sort 只要和导入的名字一样，
那么会调用哪一个？
那么会调用本类的那个方法。
如果还想调用包的那个就需要使用静态类名.了
*/
	
public class StaticImportDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(10);
		al.add(-1);
		al.add(12);
		
		sort(al);
		out.println(binarySearch(al, 10));
	}

}
