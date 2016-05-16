/**
 * 反射 --获取类的信息
 * 什么是反射
 * 当以个字节码，被加载到方法区jvm会对该字节码进行相应的解剖，会创建一个对应的class对象，把字节码文件信息全部都存储到该class对象中，我们
 * 只要获取class对象我们就可以操作字节码对象设置对象的属性或调用对象的方法等操作。
 * 反射技术中，一个类的任何成员都有对应的类描述。成员变量(Field) 方法(Method) --工具需要反射，比如 JSP的那套工具
 * 
 * [反射就没有不能的事情。都可以获取包括私有的] 例如私有的构造也是可以实例的
 * 
 * 
 */
package always_revision;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author www.23.com
 *
 */
public class FanShe {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		PF p = new PF(110,"狗娃");
		
		//获取Class对象的方式1 -- 推荐使用 为什么推荐用这个？
		Class c1 = Class.forName("always_revision.PF");
		System.out.println(c1);
		
		//方式2 通过类名获取
		Class c2 = PF.class;
		System.out.println(c2);
		
		
		System.out.println(c1 == c2);
		
		
		//方式3对象获取
		Class c3 = p.getClass();
		System.out.println(c3 == c2);
		
		
		//获取类的所有信息 -- 反射中类的每一部分都有一个类描述
		Constructor [] c = c1.getConstructors(); //获取这个类所有的构造方法，除了私有的。
		for(Constructor cin : c){
			System.out.println(cin);
		}
		
		//私有非公共的加个getDeclared就可以都获取了
		//c1.getDeclaredConstructors(); --获取所有私有+共有的构造方法
		
		
		//获取单个的构造方法 -- 这里需要传什么？因为构造有多个这里需要传入与其匹配对应的那个构造的参数
		Constructor b = c1.getConstructor(int.class,String.class);
		System.out.println(b);
		
		//通过构造创建对象 --默认返回的是Object
		PF ps = (PF)b.newInstance(1,"bbb");
		
		//获取私有构造函数
		Constructor b1 = c1.getDeclaredConstructor();
		//PF ps2 = (PF)b1.newInstance(); //不暴力是没有办法创建的
		//暴力反射创建对象
		b1.setAccessible(true);//设置权限
		PF ps2 = (PF)b1.newInstance();//在创建就可以了
		
		
		//反射获取方法
		//c1.getMethods() 获取所有公共方法，非公共的Declared  这个类所有的继承信息方法都会继承过来，但是Declared是不会包含父类的方法。
		Method md = c1.getDeclaredMethod("eat",int[].class);//获取eat的方法，参数和构造一样如果有就写int.class String.class等等。没有就空着,数组类型的参数 int.class是int型的，数组类型的是int[].class
		md.setAccessible(true);//设置访问权限，让其可以访问
		
		md.invoke(ps2,new int[]{123});//执行一个方法 第一个参数 方法调用对象，第二个方法所需要的参数。 实参写数组new int[]{123}
						  //如果是静态的方法ps2就可以直接用null了 (null,1)
		
		
	}

}

class PF{
	int id;
	String name;
	public PF(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	private PF(){
		
	}
	public void eat(int []i){
		System.out.println(name+"吃饭");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+id;
	}
}
