import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;



/**
 * 
 */

/**
 * @author www.23.com
 *
 */
public class ObjectStreamReview {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*ObjectInputStream
		ObjectOutputStream*/
		FxClass fx = new FxClass("aa","bb",new Test());
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("d:/needDelete.txt")));
		oo.writeObject(fx);
		oo.close();//序列化
		
		/*ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("d:/needDelete.txt")));
		FxClass fx = (FxClass) oi.readObject();
		System.out.println(fx);//反序列化
		oi.close();*/
	}

}
class Test implements Serializable{
	
}
class FxClass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String pwd;
	transient String age;
	Test test;
	public FxClass(String name, String pwd, Test test) {
		this.name = name;
		this.pwd = pwd;
		this.test = test;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + this.pwd;
	}
}