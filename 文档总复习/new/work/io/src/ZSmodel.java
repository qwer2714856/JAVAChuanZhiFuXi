import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 装饰者 设计模式
 * 
 * 启发
 * 编写一个拓展BufferedReader的类，拓展它的readLine方法需要返回行号.
 * 
 * 增加一个类的功能的时候可以选择继承。通过继承实现增加功能的优点，代码简单。缺点是 如果随着需求的增多要对这个类扩展的类就很多很多。
 * 因为继承体系太庞大，所以出现了装饰者实际模式，增强一个类的功能。
 * 
 * 
 * 总结：增强一个类的功能1继承2装饰者设计模式
 * 1继承：代码结构清晰，实现简单。缺点导致继承体系太庞大，不能相互装饰。
 * 2装饰者设计模式：可以相互装饰，缺点通过多态来维护实例。
 * 
 * 
 */

/**
 * @author www.23.com
 *
 */
public class ZSmodel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DingBuffered db = new DingBuffered(new FileReader(new File("d:/users.txt")));
			String str = "";
			while((str = db.readLine()) != null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
/**
 * 通过类去增强功能
 * 优点：检点明了
 * 缺点如果需要对同一个方法实现不同的增强，如果需求很多那么增强的类就很多。很繁琐了,使用不灵活，继承的体系过于庞大。
 * class DingBuffered1 extends BufferedReader{}
 * class DingBuffered2 extends BufferedReader{}
 * class DingBuffered3 extends BufferedReader{}
 * class DingBuffered4 extends BufferedReader{}
 * ....就很繁琐了
 * @author www.23.com
 *
 */
class DingBuffered extends BufferedReader{
	private int step = 0;
	public DingBuffered(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public String readLine() throws IOException{
		String str = super.readLine();
		if(str != null){
			str = (++step) + str;
		}
		return str;
	}
	
	 public void close() throws IOException{
		 super.close();
		 step = 0;
	 }
	
}



/**
 * 装饰者设计模式步骤
 * 1.在装饰类的内部维护一个被装饰类的引用。
 * 2.构造函数实例化被装饰类。
 * A+B类如何配合?
 * 3.让他们都有一个共同的父类BufferedReader
 * 4.这个时候因为AB都是BufferedReader的子类所以A B 的构造方法可以相互传递。
 */
//装饰类
//A
class ZSClass extends BufferedReader{
	BufferedReader bf = null;
	public ZSClass(BufferedReader bf){
		super(bf); //该语句没有任何作用是为了让代码不报错。
		this.bf = bf;
	}
	public String readLine() throws IOException{
		String str = bf.readLine();
		if(str != null){
			str += "hi";
		}
		return str;
	}
	public void close() throws IOException{
		bf.close();
	}
}

//B
class ZSClassWorld extends BufferedReader{
	BufferedReader bf = null;
	public ZSClassWorld(BufferedReader bf){
		super(bf);//该语句没有任何作用是为了让代码不报错。
		this.bf = bf;
	}
	public String readLine() throws IOException{
		String str = bf.readLine();
		if(str != null){
			str += " world";
		}
		return str;
	}
	public void close() throws IOException{
		bf.close();
	}
}