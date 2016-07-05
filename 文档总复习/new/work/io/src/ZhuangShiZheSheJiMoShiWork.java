import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 1.可以实现装饰者设计模式的继承方式，但是缺点很繁琐。
 */

/**
 * @author www.23.com
 *
 */
public class ZhuangShiZheSheJiMoShiWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//需要被增强的类 BufferedReader 的readLine()方法
		//使用继承可以直接搞定
		File fl = new File("d:/users.txt");
		FileReader fr = null;
		/*try {
			fr = new FileReader(fl);
			KBufferedReader k = new KBufferedReader(fr);
			String str = "";
			while((str=k.readLine()) != null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		//使用装饰着单个
		/*try {
			ZSA zsa = new ZSA(new BufferedReader(new FileReader(fl)));
			String str = "";
			while((str = zsa.readLine()) != null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	   /*try {
			ZSB zsb = new ZSB(new BufferedReader(new FileReader(fl)));
			String str = "";
			while((str = zsb.readLine()) != null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//单个的装饰模式 之间相互串联 保证他们都继承被装饰的类 ZSB 基础上搞ZSA
		
		try {
			ZSA zsa = new ZSA(new ZSB(new BufferedReader(new FileReader(fl))));
			String str = "";
			while((str=zsa.readLine()) != null){
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
//第一种方式使用继承被装饰的类作为基类然在它原有的方法上扩展它。
class KBufferedReader extends BufferedReader{
	public KBufferedReader(FileReader fr){
		super(fr);
	}
	public String readLine() throws IOException{
		String str = super.readLine();
		if(str != null){
			str += "hi";
		}
		return str;
	}
}




//使用装饰着设计模式
class ZSA extends BufferedReader{
    private BufferedReader bf = null;

	public ZSA(BufferedReader bf) {
		super(bf);//这东西没有作用为了不报错。
		this.bf = bf;
	}
	public String readLine() throws IOException{
		String str = bf.readLine();
		if(str != null){
			str += "ZSA";
		}
		return str;
	}
}
class ZSB extends BufferedReader{
	private BufferedReader bf = null;
	
	public ZSB(BufferedReader bf) {
		super(bf);
		this.bf = bf;
	}
	
	public String readLine() throws IOException{
		String str = bf.readLine();
		if(str != null){
			str += "ZSB";
		}
		return str;
	}
}
