import java.util.ArrayList;
import java.util.Iterator;

/**
 * �ɱ����
 * ���β����ͺ�����������㣬Ȼ��Ӳ�����
 * int ... a ���ʱ�� a ���Ǹ�����
 * 
 * ע���ϸ��
 * 1.һ���������βΣ�ʹ���˿ɱ����֮����ô���ø÷�����ʱ����Դ��ݲ�����Ҳ���Բ����ݲ�����
 * 2.�ɱ����ʵ������һ���������
 * 3.�ɱ��������λ���β����һ����Ҳ����ֻ����һ���ɱ������
 * ... jvm���Ƚ�һ����������ɱ�����ǣ����������������Ҳû�������������
 * 
 * 
 * �Զ�װ��Ͳ���
 * Java ������������ԣ����еĶ������������࣬8�л����������͵���
 * ������������               ��װ��
 * byte           --Byte      
 * short          --Short
 * int            --Integer
 * long           --Long
 * 
 * float          --Float
 * double         --Double
 * 
 * boolean        --Boolean
 * 
 * char           --Character
 * 
 * �����������˰�װ��ĺô�
 * 1.����ʹ�÷���
 * 
 */

/**
 * @author www.23.com
 *
 */
public class KeBianCanShu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,2,3,4,5,6);
		
		
		
		//��װ������  �����������־��׳��쳣
		System.out.println(Integer.parseInt("123")+1);
		System.out.println(Integer.toString(123)+1);
		System.out.println(Integer.toBinaryString(21312));//2����
		System.out.println(Integer.toOctalString(123));//�˽���
		System.out.println(Integer.toHexString(123));//ʮ������
		System.out.println(Integer.parseInt("1001", 36));//��ָ���ַ�����ָ�����Ƶ��ַ��� ��Ϊʮ����. ��������ܳ���36
		
		
		//�Զ�װ�䣬���Զ�����
		//�����ǿ��Դ洢����������͵����ݣ�ע�����������
		//װ��Ͳ�����jdk1.5����
		int a = 1;
		Integer b = a; //װ��
		int c = b;//����
		
		
		ArrayList ay = new ArrayList();
		ay.add(1);
		ay.add(2);
		ay.add(3);
		//����Ϊʲô���Դ洢�Ƕ������͵����ݣ�����Ϊϵͳ�Զ�װ�䣬�ѻ������͵�����װ��ɰ�װ���ʵ��
		//����װ���͵�ʵ����������Ļ���ƴ�ӵ�ʱ����ǲ��䡣
		/*Iterator it = ay.iterator();
		while(it.hasNext()){
			System.out.println((Integer)it.next() + 1);
		}*/
		
		//����Ϊʲô 128 �Ͳ���ȶ�127����ȣ�������ΪInteger�ڲ�ά����һ��127~-128��һ���������飬��������һ��Ч�ʡ�ʹ�õ�ʱ��ֱ�Ӵ�ͬһ����������ȡ���������������Χ�����´����ˡ�
		Integer ax = 128;
		Integer ax2 = 128;
		System.out.println(ax == ax2);
		Integer ax3 = 127;
		Integer ax4 = 127;
		System.out.println(ax3 == ax4);
		
	}
	public static void add(int ... a){
		int data = 0;
		for(int i = 0; i < a.length; i++){
			data += a[i];
		}
		System.out.println(data);
	}

}
