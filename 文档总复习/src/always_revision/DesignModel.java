/**
 * ���ģʽ
 * ʲô�����ģʽ��
 * ����ǰ���ܽ������Ϊ�˽��һ����������̡�
 * 
 * �������ģʽ
 * ���һ�������ڴ���ֻ��һ��
 * 
 * 
 * 
 * ģ�����ģʽ
 * ����Ҫ�в��ִ�����Ҫ�޸ĵ�ʱ����������̶�������ʹ��ģ��ģʽ��
 * ���署����һ�γ��������ʱ�䣬��ʼʱ��ͽ���ʱ���ǹ̶��ģ�ֻ�б����ԵĴ����ǲ��̶����������
 * �Ϳ�����ʵ��һ���ֲ���ʵ�ֵĽ����������ࡣ����������
 * 
 * �̶���ʹ��final ���η��������̶��ĳ���Ϊ���󷽷�������ȥʵ�֡�
 * 
 * 
 * Interface �ӿ�
 * �ӿڵĸ���
 * java ����ʹ�ýӿ����˷����̳е�ȱ�ݣ��ӿڿ�������������й�����չ��
 * ����
 * һ��Բ�̳���ͼ���࣬����ƽ��ͼ��ֻ�����ܳ����棬���ʱ���������Բ���������������Դ���һ���ӿ���ǿ��������Բȥʵ�֡�
 * ��ʽ��
 * interface it{} ע��ӿ�Ҳ������һ��class�ļ�
 * һ�������ʵ�ֶ���ӿ���, implements a,b
 * 
 * �ӿڿ���ʵ�ֵĹ���
 * 1.������Ĺ��ܣ���û��ͨ����ʵ�ֽӿڿ���������ǿ��
 * 2.����淶
 * 3.����
 * 4.��̬
 * 
 * �ӿڵ�ע��
 * 1.��������Ա�������η��� 
 * public static final
 * 2.��Ա������
 * public abstract 
 * ע�����������û����д��jvm�Զ�����ȥ�ġ�
 * 3.�г������Ĳ�һ�������࣬Ҳ�����ǽӿ� ��
 * 4.�ӿڵķ������ǳ���Ĳ���ʵ����
 * 5.�ӿ�û�й���
 * 6.���಻��ʹ��super ��Ϊ�ӿں���û�м̳й�ϵ��������˵�˽ṹ�ĳ�Ա�����Ǿ�̬�ģ������ǳ���ġ�
 * 7.�ӿڽӿ�֮��м̳У��ӿں���֮��ʵ�ֹ�ϵ��
 * 8.class a implements b,c,d{}
 * 9.interface x extends m,q{}  �ӿ��ڼ̳нӿڵĿ��Զ�̳С�����ʵ�ֽӿڿ��Զ�ʵ�֡�
 * 
 */
package always_revision;

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



