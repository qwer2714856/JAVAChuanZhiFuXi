/**
 * 类的权限修饰符的范围
 * ------------------------------------------
 * 				public	protected	default	private
 * 同类			√		√			√		√
 * 同包			√		√			√		×
 * 子类			√		√			√		×
 * 不同包			√		×			×		×
 * 不同包子类		√		√			×		×
 * ------------------------------------------
 * 
 * 1.private只能在本类中使用。
 * 2.如果一个成员没有使用修饰符默认是default
 * 3.类只有public 和默认
 * 4.默认只能被同包访问。
 * 5.类不能用private 和 protected子类无法继承。
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class XiuFuFangWen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
