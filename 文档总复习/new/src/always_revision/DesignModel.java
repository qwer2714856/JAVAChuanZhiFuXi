/**
 * ���ģʽ
 * ʲô�����ģʽ��
 * ����ǰ���ܽ������Ϊ�˽��һ����������̡�
 * 
 * �������ģʽ
 * ���һ�������ڴ���ֻ��һ��
 * 
 * �������ģʽ���������ģʽ�Ǵ����̰߳�ȫ�������
 * �̰߳�ȫ�Ľ������
 * if(s==null){
 *     synchronized("lock"){
 *     	   if(s == null){
 *             s = new Single();
 *         }
 *     }
 * }
 * return s; ��һ����������ʱ���
 * 
 * 
 * ģ�����ģʽ
 * ����Ҫ�в��ִ�����Ҫ�޸ĵ�ʱ����������̶�������ʹ��ģ��ģʽ��
 * ���署����һ�γ��������ʱ�䣬��ʼʱ��ͽ���ʱ���ǹ̶��ģ�ֻ�б����ԵĴ����ǲ��̶����������
 * �Ϳ�����ʵ��һ���ֲ���ʵ�ֵĽ����������ࡣ����������
 * 
 * �̶���ʹ��final ���η��������̶��ĳ���Ϊ���󷽷�������ȥʵ�֡�
 * 
 * װ����ģʽ
 * //������ʵ��
 * //����1������ļ��е�ʱ���ӡ�кš�
 * �ܽ᣺
 * ��һ��
 * ��ǿ������ά���߱���ǿ������á�
 * �ڶ���
 * �����ʼ��
 * ������
 * ��ǿ�������ñ�ά�������ǿ�����������Ƕ�̬
 * ����
 * ������������A B C ��������BufferedReader ��readLine�϶��ӡA B C ���ά���ű���ǿ������þͿ��Խ��ŵ��ã����������7�����ܡ�
 * A B C  AB AC BC ABC 
 * ��һ��
 * class ZsA extends BufferedReader{
	private BufferedReader bufferedReader;
 * 
 * class ZsB extends BufferedReader{
	private BufferedReader bufferedReader;
 *
 * class ZsC extends BufferedReader{
	private BufferedReader bufferedReader
 *
 * �ڶ���
 * public ZsA(BufferedReader in) {//Reader�������ַ����Ļ���
		super(in);
		this.bufferedReader = in;
		// TODO Auto-generated constructor stub
	}
 * ������
 * public String readLine() throws IOException{
		String rt = bufferedReader.readLine(); //��Ϊ�Ƕ�̬ bufferedReader ���Խ��� ZsA ��ʵ�� ZsB��ʵ�� ZsC��ʵ�� ���Ծ����˼�����ǿ��Ч��������������ʵ�����ʵ�ֽ���ʵ�֡�
		if(rt != null){
			rt = 'A'+rt;
		}
		return rt;
	}
 *
 *
 * װ�������ģʽ�ͼ̳е���ȱ��
 * �������Ƕ����������ǿ��Ĺ���
 * 
 * �̳У��ṹ��������ϵ�Ӵ�ÿ�����¹��ܾ���Ҫ��չ����չ����չ֮�䣬�����໥���ʹ�á�
 * 
 * װ����ģʽ�� �ṹ��΢���ӣ���ϵ���󣬵�����չ����չ֮������໥Ƕ�ס�
 * 
 * 
 * 
 * 
 * ��������������������������������������������������������������������������������������������������������������������������
 * �۲������ ģʽ--����������ǵ�һ��������ָ��������֪ͨ��һ������������Ӧ�Ĵ���
 * ���� ����Ԥ��
 * ��дһ������վ��һ�������࣬������վ���£�Ҫ֪ͨ��������Ӧ�Ĵ���
 * 
 * 1.��Ŀǰ����ָ������ʱҪ֪ͨ����һ������������Ӧ������ʱ��Ӧ�ðѶԷ�����Ӧ�����������ڽӿ��ϣ���ǰ����ά���ӿڵ����á�
 * �ӿ��൱���н�
 * 2.��������ʵ������ӿ�
 * 
 * 
 * �������ģʽ
 * ���ڲ��������
 * 
 */
package always_revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author www.23.com
 *
 */
public class DesignModel {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*tmp1 tp = new tmp1();
		tp.getRunCodeTime();*/
		
		
		//װ�������ģʽ
		//�������ı׶˾���ÿ��չһ�����ܾ�Ҫȥ��չһ���࣬�����ķ��ġ�
		/*Zs zs = null;
		try {
			zs = new Zs(new FileReader("d:/test2.txt"));
			String tmp = "";
			while((tmp = zs.readLine()) != null){
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				zs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		//������װ�������ģʽ��
		//˼��������ö�̬����ÿ������ǿ���ϣ�ά����Ҫ��ǿ������á�
		//������������A B C ��������BufferedReader ��readLine�϶��ӡA B C ���ά���ű���ǿ������þͿ��Խ��ŵ��ã����������7�����ܡ�
		//A B C  AB AC BC ABC 
		//������Ӿ������ABC��
		/*ZsA zsa = null;
		try {
			zsa = new ZsA(new ZsB(new ZsC(new BufferedReader(new FileReader("d:/test2.txt")))));
			String tmp = "";
			while((tmp = zsa.readLine()) != null){
				System.out.println(tmp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				zsa.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		//�۲������ģʽ
		//����վ
		/*Emp a1 = new Emp("a1");
		Emp a2 = new Emp("a2");
		Emp a3 = new Emp("a3");
		Emp a4 = new Emp("a4");
		ws w = new ws();
		w.add(a1);
		w.add(a2);
		w.add(a3);
		w.add(a4);
		w.work();*/
		
		//�������ģʽ
		/*CarFactory c = new CarFactory();
		BMW o = (BMW)c.getCar(0);*/
		
	}

}
//���� ���̴߳����̰߳�ȫ����
class Fc{
	private static Fc fc = null;
	private Fc(){}
	public static Fc getFc(){
		if(fc == null){
			fc = new Fc();
		}
		return fc;
	}
}

//����
class Fcs{
	private static Fcs fc = new Fcs();
	private Fcs(){}
	public static Fcs getFc(){
		return fc;
	}
}


/**
* ģ�����ģʽ
* ����Ҫ�в��ִ�����Ҫ�޸ĵ�ʱ����������̶�������ʹ��ģ��ģʽ��
* ���署����һ�γ��������ʱ�䣬��ʼʱ��ͽ���ʱ���ǹ̶��ģ�ֻ�б����ԵĴ����ǲ��̶����������
* �Ϳ�����ʵ��һ���ֲ���ʵ�ֵĽ����������ࡣ����������
* 
* ʲôʱ����ģ��ģʽ��
* ��һ������鹦������һ�����ǹ̶��ģ�������һ�����������ڹ̶�����ĵ����ⲿ�ִ�������ж��������
* ���ʱ��ѹ̶�������������Ѳ��̶��ĳ���ɳ��󷽷�����Բ�ͬ���ȥʵ�֡�
*/
abstract class Template{
	abstract public void testCode();
	public final void getRunCodeTime(){
		long start = System.currentTimeMillis();
		testCode();
		long end = System.currentTimeMillis();
		System.out.println(end- start);
	}
}
class tmp1 extends Template{

	@Override
	public void testCode() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10000;i++){
			System.out.println(i);
		}
	}
	
}


//װ�������ģʽ
class Zs extends BufferedReader{
	private int readCount;
	public Zs(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub	
	}
	
	public String readLine() throws IOException{
		String rt = super.readLine();
		if(rt != null){
			rt = ++readCount + rt;
		}
		return  rt;
	}

}
//����Ҫ��չ����BufferedReader ��readLine������
class ZsA extends BufferedReader{
	private BufferedReader bufferedReader;
	public ZsA(BufferedReader in) {//Reader�������ַ����Ļ���
		super(in);
		this.bufferedReader = in;
		// TODO Auto-generated constructor stub
	}
	public String readLine() throws IOException{
		String rt = bufferedReader.readLine();
		if(rt != null){
			rt = 'A'+rt;
		}
		return rt;
	}
}
class ZsB extends BufferedReader{
	private BufferedReader bufferedReader;
	public ZsB(BufferedReader in) {
		super(in);
		this.bufferedReader = in;
		// TODO Auto-generated constructor stub
	}
	
	public String readLine() throws IOException{
		String rt = bufferedReader.readLine();
		if(rt != null){
			rt = 'B'+rt;
		}
		return rt;
	}
}

class ZsC extends BufferedReader{
	private BufferedReader bufferedReader;
	public ZsC(BufferedReader in) {
		super(in);
		this.bufferedReader = in;
		// TODO Auto-generated constructor stub
	}
	public String readLine() throws IOException{
		String rt = bufferedReader.readLine();
		if(rt != null){
			rt = 'C'+rt;
		}
		return rt;
	}
}

//�۲������ģʽ
interface byWSdoWork{
	public void notifyWs(String name);
}
/**
 * ����վ
 */
class ws{
	String []wss = {"����","����","����","̨��"};
	int [] timer = {1000,1500};
	
	//��Ҫ֪ͨ����������ô��ά��һ���ӿڣ�������������������ͱ���ʵ������ӿڷ���.
	ArrayList<byWSdoWork> ay = new ArrayList<byWSdoWork>();
	
	public void add(byWSdoWork d){
		ay.add(d);
	}
	
	String currentWs;
	public void updateWs(){
		Random rd = new Random();
		currentWs = wss[rd.nextInt(wss.length)];
		System.out.println(currentWs);
	}
	public void work(){
		while(true){
			try {
				Random rd = new Random();
				Thread.sleep(rd.nextInt(501)+1000);
				updateWs();
				for(byWSdoWork a : ay){
					a.notifyWs(currentWs);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
/**
* �˸�������������Ӧ����
*/
class Emp implements byWSdoWork{
	String name;

	public Emp(String name) {
		this.name = name;
	}
	
	public void notifyWs(String a){
		System.out.println(name + a);
	}
}



/**
 * �������ģʽ
 */
class Csars{
	
}
class BMW extends Csars{
	
}
class BSJ extends Csars{
	
}
class CarFactory{
    public Csars getCar(int i){
    	Csars c = null;
    	switch(i){
    	case 0:c=new BMW();break;
    	case 1:c=new BSJ();break;
    	}
    	return c;
    }
}
