import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 1.����ʵ��װ�������ģʽ�ļ̳з�ʽ������ȱ��ܷ�����
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
		//��Ҫ����ǿ���� BufferedReader ��readLine()����
		//ʹ�ü̳п���ֱ�Ӹ㶨
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
		
		
		//ʹ��װ���ŵ���
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
		
		//������װ��ģʽ ֮���໥���� ��֤���Ƕ��̳б�װ�ε��� ZSB �����ϸ�ZSA
		
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
//��һ�ַ�ʽʹ�ü̳б�װ�ε�����Ϊ����Ȼ����ԭ�еķ�������չ����
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




//ʹ��װ�������ģʽ
class ZSA extends BufferedReader{
    private BufferedReader bf = null;

	public ZSA(BufferedReader bf) {
		super(bf);//�ⶫ��û������Ϊ�˲�����
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
