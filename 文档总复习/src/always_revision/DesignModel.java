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



