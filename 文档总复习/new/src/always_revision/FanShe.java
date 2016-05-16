/**
 * ���� --��ȡ�����Ϣ
 * ʲô�Ƿ���
 * ���Ը��ֽ��룬�����ص�������jvm��Ը��ֽ��������Ӧ�Ľ��ʣ��ᴴ��һ����Ӧ��class���󣬰��ֽ����ļ���Ϣȫ�����洢����class�����У�����
 * ֻҪ��ȡclass�������ǾͿ��Բ����ֽ���������ö�������Ի���ö���ķ����Ȳ�����
 * ���似���У�һ������κγ�Ա���ж�Ӧ������������Ա����(Field) ����(Method) --������Ҫ���䣬���� JSP�����׹���
 * 
 * [�����û�в��ܵ����顣�����Ի�ȡ����˽�е�] ����˽�еĹ���Ҳ�ǿ���ʵ����
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
		PF p = new PF(110,"����");
		
		//��ȡClass����ķ�ʽ1 -- �Ƽ�ʹ�� Ϊʲô�Ƽ��������
		Class c1 = Class.forName("always_revision.PF");
		System.out.println(c1);
		
		//��ʽ2 ͨ��������ȡ
		Class c2 = PF.class;
		System.out.println(c2);
		
		
		System.out.println(c1 == c2);
		
		
		//��ʽ3�����ȡ
		Class c3 = p.getClass();
		System.out.println(c3 == c2);
		
		
		//��ȡ���������Ϣ -- ���������ÿһ���ֶ���һ��������
		Constructor [] c = c1.getConstructors(); //��ȡ��������еĹ��췽��������˽�еġ�
		for(Constructor cin : c){
			System.out.println(cin);
		}
		
		//˽�зǹ����ļӸ�getDeclared�Ϳ��Զ���ȡ��
		//c1.getDeclaredConstructors(); --��ȡ����˽��+���еĹ��췽��
		
		
		//��ȡ�����Ĺ��췽�� -- ������Ҫ��ʲô����Ϊ�����ж��������Ҫ��������ƥ���Ӧ���Ǹ�����Ĳ���
		Constructor b = c1.getConstructor(int.class,String.class);
		System.out.println(b);
		
		//ͨ�����촴������ --Ĭ�Ϸ��ص���Object
		PF ps = (PF)b.newInstance(1,"bbb");
		
		//��ȡ˽�й��캯��
		Constructor b1 = c1.getDeclaredConstructor();
		//PF ps2 = (PF)b1.newInstance(); //��������û�а취������
		//�������䴴������
		b1.setAccessible(true);//����Ȩ��
		PF ps2 = (PF)b1.newInstance();//�ڴ����Ϳ�����
		
		
		//�����ȡ����
		//c1.getMethods() ��ȡ���й����������ǹ�����Declared  ��������еļ̳���Ϣ��������̳й���������Declared�ǲ����������ķ�����
		Method md = c1.getDeclaredMethod("eat",int[].class);//��ȡeat�ķ����������͹���һ������о�дint.class String.class�ȵȡ�û�оͿ���,�������͵Ĳ��� int.class��int�͵ģ��������͵���int[].class
		md.setAccessible(true);//���÷���Ȩ�ޣ�������Է���
		
		md.invoke(ps2,new int[]{123});//ִ��һ������ ��һ������ �������ö��󣬵ڶ�����������Ҫ�Ĳ����� ʵ��д����new int[]{123}
						  //����Ǿ�̬�ķ���ps2�Ϳ���ֱ����null�� (null,1)
		
		
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
		System.out.println(name+"�Է�");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+id;
	}
}
