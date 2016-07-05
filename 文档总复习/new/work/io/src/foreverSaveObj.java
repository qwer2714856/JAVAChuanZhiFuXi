import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;


public class foreverSaveObj {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// 图书的管理系统
		/*//save 
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("d:/test.txt")));
		oo.writeObject(new Persion("a","a"));
		oo.close();
		
		
		//read 
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("d:/test.txt")));
		Persion p = (Persion) oi.readObject();
		System.out.println(p);
		oi.close();*/
		
		ArrayList<Persion> ay = new ArrayList<Persion>();
		for(int i = 0; i < 100; i++){
			ay.add(new Persion("a","a"));
		}
		
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("d:/test.txt")));
		oo.writeObject(ay);
		oo.close();
		
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("d:/test.txt")));
		ArrayList p = (ArrayList) oi.readObject();
		Iterator<Persion> it = p.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		oi.close();
	}

}
class Persion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String pwd;
	public Persion(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+pwd;
	}
}
