/**
 * ���ģʽ
 * ʲô�����ģʽ��
 * ����ǰ���ܽ������Ϊ�˽��һ����������̡�
 * 
 * �������ģʽ
 * ���һ�������ڴ���ֻ��һ��
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