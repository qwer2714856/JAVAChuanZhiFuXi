import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Person存储在本地
 *
 * 对象输入输出流（没有读写文件的能力的需要借助管道的）
 * 主要作用，对象写信息和对象的读取信息。
 * 
 * 对象的输入流
 * ObjectInputStream
 * 
 * 对象输出流
 * ObjectOutputStream
 * 
 * 
 * ObjectOutputStream 使用步骤
 * 对象信息写硬盘
 * 		File f = new File("D:/java/day10/day22/视频/object/object.txt");
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		//把对象写出
		oo.writeObject(p);
		
 概念
 没有需要子类去实现方法的接口叫做标志接口例如Serializable
 实现它的类不需要实现它的方法，他没有需要实现的方法。
 
注意细节
1.如果对象需要被写出到文件上，对象所属的类必须实现Serializable，但这个接口是个标志接口。
 
2.对象存到硬盘上，叫做对象序列化。
     对象从硬盘读取出来，叫做对象反序列化。 
 
3. 对象创建会调用构造方法。
        然而如果是反序列化回来的对象是不会调用构造方法的。 
        
4. serialVersionUID 是用于记录class的版本信息的，serialVersionUID 这个数字是通过类名 成员 包名 工程名算出来的一个数字
   在写出的时候会，不仅仅会写出对象，还会写出serialVersionUID这个内容 记录到文件（serialVersionUID这个是class文件的版本信息）
   在反序列化的时候会先把 文件的serialVersionUID 这个东西读出来，在与本地的class文件的serialVersionUID对比一下，如果不匹配直接反序列化失败。

5.如何不让对比serialVersionUID 因为后期可能要修改类的成员？
   一开始类就指定serialVersionUID 那么在序列化与反序列化的时候jvm都不会再自己算这个class 的serialVersionUID 了。他们都相等。
 private static final long serialVersionUID = 1L;

6。如果某个对象的某个数据不想被序列化到硬盘上，可以使用transient去修饰这个属性。

7.如果一个需要序列化的类，内部有维护这另外一个类，那么在序列化的时候也需要让维护的那个类实现一下Serializable接口。
 
  如果一个对象的某些成员不想写出去可以加一个关键字修饰
 transient int age = 1;
 * @author www.23.com
 *
 */
public class ObjectSaveToDisk {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//如果要实现图书管理系统可以使用ArraList进行扩展 所有集合类都实现了Serializable所以存储批量数据没问题。
		
		//forever save
		Person p = new Person("aaa", "bbb");
		File f = new File("D:/java/day10/day22/视频/object/object.txt");
		FileOutputStream fo = new FileOutputStream(f);
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		//把对象写出
		oo.writeObject(p);
		
		oo.close();
		
		System.out.println("done");
		
		
		
		
		//对象的反序列化  
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("D:/java/day10/day22/视频/object/object.txt")));
		Person prd = (Person) oi.readObject();
		System.out.println(prd);
		
		
	}

}


class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName;
	String passWord;
	transient int age;//如果加上这个关键字就写不 出去了。
	public Person(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userName + passWord;
	}
}