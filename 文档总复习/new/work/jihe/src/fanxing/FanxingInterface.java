/**
 * 泛型接口
 * interface tt<T>{
	public void add(T t);
	}
  接口的泛型什么时候确定，实现一个接口的时候指定的。
  如果实现接口的时候不指定 默认就是Object类型。
    
    class a implements tt<String>{

	public void add(String t) {
		// TODO Auto-generated method stub
		
	}		
}
实现一个接口的时候指定



需求如果在实现接口的时候无法决定类型是什么，需要在实例化的时候确定如何实现？

 */
package fanxing;

/**
 * @author www.23.com
 *
 */
public class FanxingInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现类的时候确定接口的类型
		SxSql <String> sqsl = new SxSql<String>();
		sqsl.map("");
		//实现接口的时候确定的接口类型
		a my = new a();
		
	}

}
interface tt<T>{
	public void add(T t);
}

class a implements tt<String>{

	public void add(String t) {
		// TODO Auto-generated method stub
		
	}		
}

/**
 * 需求如果在实现接口的时候无法决定类型是什么，需要在实例化的时候确定如何实现？
 * @author www.23.com
 *
 * @param <T>
 */
interface sql<T>{
	public void map(T mml);
}
class SxSql<T> implements sql<T>{

	public void map(T mml) {
		// TODO Auto-generated method stub
		
	}
	
}
