/**
 * �ڲ���
 * ���������ڲ�����Ϊ�ڲ��࣬���ÿ���ֱ�ӷ����ⲿ��ĳ�Ա��
 * ���ݶ����λ�ò�ͬ������Ҳ��ͬ�������ڳ�Ա�ϵ��������Ա�ڲ��࣬�����ھֲ���Ҳ�����ֲ��ڲ��ࡣ
 * ��Ա�ڲ������еĳ�Ա���䶼���Լ����ֲ��ڲ��࣬���еľֲ�����������ɼ���
 * 
 * ��ε����ڲ���
 * OutClass.InClass inclass = new OutClass().new InClass();
 * inClass.say();
 * 
 * ��Ա�ڲ���ϸ��
 * 1.�����Ա�ڲ��ඨ��Ϊprivate����Ҳ�ǲ��ɼ��ġ�
 * 2.����ڲ��ඨ���˾�̬�ĳ�Ա����ô����ڲ�����뱻static ���Σ���̬���ڲ�����ʹ�þ�̬��Ա��
 * 3.����ڲ�����ⲿ��ĳ�Ա�����ظ������������ⲿ�Ŀ���ʹ��OutClass.this
 * 
 * 
 * �ֲ��ڲ���
 * ֻ�ܷ����ⲿ������final ���εĳ�Ա����
 * 
 * 
 * �����ڲ���
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class InClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ǿ�̬�ڲ������
		/*OutClass.InClass inclass = new OutClass().new InClass();
		inclass.say();*/
		
		/*��̬�ĵ���
		 * OutClass.InClass inclass = new OutClass.InClass();*/
		
		
	}

}


class OutClass {
	private String str = "this is OutClass";
	static class InClass{
		static int a = 1;
		static void say(){
			//System.out.println(str);
		}
	}
	void say(){
		System.out.println("out call in");
		new InClass().say();
		final int a = 1;
		class hi{
			void say(){
				System.out.println(a);
			}
		}
	}
}