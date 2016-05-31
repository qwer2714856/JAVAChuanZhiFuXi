/**
 * LogCat
 * logcat 的等级
 * Level  在logcat控制台上右侧的下拉框可以选择等级，只显示指定的等级信息。例如选择debug 就筛选出debug 包括自己以上的等级。
 * V verbose										冗余，最低级，选择它就所有的都显示。											
 * D debug											调试信息
 * I info											正常等级的信息
 * W warn											警告
 * E error											错误
 * A assert											断言--这个logcat等级没有关系，不用管它。
 * 
 * 调试信息是debug 和 info打印的，但是很多刚靠这个的，需要配合其它过滤。
 * 可以在logcat控制台上搜索，关键字
 * 
 * 控制台左侧的菜单
 * saved Filter 
 * 点击+加一个过滤 
 * 一般就Tag过滤信息，这个没有实际意义，就是用来过滤的。
 * 一般不用application 因为这个有BUG 有时会显示空的。
 * System.out 默认就是info级别的。
 * 
 * 怎么输出级别的提示信息？
 * //用e别打印 tag 和 msg 都是字符串，一个显示tag 一个显示text的
 * Log.e(tag,msg); //错误
 * Log.w(tag,msg);//警告
 * log.d i v ...
 * 
 */
package videoandroid;

/**
 * @author www.23.com
 *
 */
public class LogCat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
