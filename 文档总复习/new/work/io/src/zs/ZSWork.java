/**
 * װ����ģʽ
 * 
 * �ŵ㣺����װ���߿����໥װ�Ρ�
 * ȱ�㣺��Ϊʹ���˶�̨���ԱȽϸ���
 * 
 * ����
 * 1.�ڲ�ά���ű�װ�εĶ���
 * 2.���캯��
 * 3.�̳б�װ�εĶ���Ϊ��ʹ�ö�̬���໥���ã�
 * 4.��д��Ҫ��չ�ķ���
 * 
 * ��ҵ��
 * һ�����ڶ�Ҫ����
 * ���ӣ�����
 * ĸ�ף�����ɫ
 * �ϰ֣������
 * ����ʹ��װ����ģʽʹ���ǵĹ�ϵ��ĸ����չ���ӣ��ϰ���չĸ�׺Ͷ���
 */
package zs;

/**
 * @author www.23.com
 *
 */
public class ZSWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		father wk = new father(new mather(new child(null)));
		wk.work();
		
	}

}





/**
 * Work
 */
interface Work{
	public void work();
}

class child implements Work{
	private Work wk = null;
	
	public child(Work wk) {
		this.wk = wk;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(wk != null){
			wk.work();
		}
		System.out.println("����");
	}
}

class mather implements Work{
	private Work wk = null;
	
	public mather(Work wk) {
		this.wk = wk;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(wk != null){
			wk.work();
		}
		System.out.println("����ɫ");
	}
	
}

class father implements Work{
	private Work wk = null;
	
	public father(Work wk) {
		this.wk = wk;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(wk != null){
			wk.work();
		}
		System.out.println("�ϱ߿�");
	}
	
}
