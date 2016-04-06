/**
 * JavaApi 复习
 * Object
 * 面向对象的思想，找适合的对象做适合的事情。
 * sun定义的很多类，我们称之为API，在这些类中Object 类是所有类的终极父类。所有的类都直接或间接继承自它。
 * Object 类的方法
 * //返回的是详细类名@哈希值16进制的形式(内存地址的16进制，hascode的16进制)。
 * //System.out.println(new a()); 默认是调用的a的toString()方法。相当于a.toString();
 * //当无法满足自定义对象的时候可以重写toString方法
 * //开发者一般需要重写toString 方法以便更好的获取类的一些信息。
 * 1.toString();
 * //比较两个对象的内存地址
 * //如果两个对象需要比较成员，则对象需要重写equals方法，默认比较的是内存地址
 * 2.equals
 * //返回hash值，java规定如果两个对象的equals相同那么他们的hashcode也必须相同。
 * 3.hashcode
 * 
 * 
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class JavaApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persion p1 = new Persion("a",1);
		Persion p2 = new Persion("a",1);
		System.out.println(p1.equals(p2));
	}

}
class Persion{
	String name;
	int age;
	public Persion(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Persion p = null;
		boolean rt = false;
		if(obj instanceof Persion){
			p = (Persion)obj;
			rt = name.equals(p.name);
		}
		return rt;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
	}
}
 
