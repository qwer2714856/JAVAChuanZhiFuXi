/**
 * 
 */
package fx;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author www.23.com
 *
 */
public class Fx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//抽象类约束程序员行为
		//提高工作效率 实现一部分共同的，其它的做些区分的。
		
		//隐式继承（私有的被继承下来被称为隐式继承）--这里其实name是从父类继承下来了，只是不能直接的除了父类其它地方调用它。因为这里可以用getName 里面有this这里的这个this 其实就是子类。只有继承的方法才有全访问这个私有变量。
		/*zi z = new zi();
		z.getName();*/
		
		Collections.sort(new ArrayList());
		 
	}

}
/*class fu{
	private String name="admin";
	public void getName(){
		System.out.println(this.name);
	}
}
class zi extends fu{
	public void hi(){
		System.out.println(this.name);
	}
}*/