/**
 * 对象的拷贝
 * Object 有个clone方法
 * 深拷贝--采用Io流来处理，利用serialize
 * 
 * 
 * 
 * 
 * 浅拷贝
 * 1.对象类重写
 * public Object clone() throws CloneNotSupportedException {//这里不能直接用，原因protected 不同包只能子类使用
		// TODO Auto-generated method stub
		return super.clone();
	}
 * 2.实现Cloneable 标志接口
 * 3.浅克隆是不会调用被克隆对象的构造方法。
 * 
 */
package always_revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * @author www.23.com
 *
 */
public class ObjectCopy {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PersionCp pc = new PersionCp(110,"狗娃");
		PersionCp pc1;
		System.out.println(pc);
		
		
		//浅拷贝
		pc1 = (PersionCp) pc.clone();
		System.out.println(pc1.toString());
		
		
		//深拷贝
		writePersionCp(pc);//先写到临时文件
		//在读回来
		PersionCp p2 = getPersionCp();
		p2.c.a = 2;
		System.out.println(pc.c.a);
		
		
	}
	public static void writePersionCp(PersionCp p) throws IOException{
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:/obj.txt"));
		os.writeObject(p);
		os.close();
	}
	public static PersionCp getPersionCp() throws Exception{
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("d:/obj.txt"));
		
		return (PersionCp)oi.readObject();
	}
}
class PersionCp implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	lddd c = new lddd();
	public PersionCp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + this.name;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {//这里不能直接用，原因protected 不同包只能子类使用
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
class lddd implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a = 1;
}