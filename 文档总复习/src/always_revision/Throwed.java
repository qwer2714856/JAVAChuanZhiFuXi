/**
 * �쳣�׳�
 * �ڷ����׳��쳣��ʱ����Ҫ�ڷ������������쳣�����򱨴�
 * public static void div(int x, int y) throws Exception{
		if(y == 0){
			throw new Exception("��������Ϊ0");
		}
	}
 * �׳�һ���쳣
 * throw new Exception("��������Ϊ0");
 * �ڷ����������쳣
 * throws Exception
 * 
 * div(1,2);�����߱�����Ҫ��try{div(1,2);}catch(){} �������������
 * 
 * div(1,2);�Ĵ���ʽ������1.����  2.�����׳���
 * 1.  try{div(1,2);}catch(){}
 * 2.  �ڵ��ú�����ֱ�����׳��쳣throws �쳣
 * 
 * throw �� throws ����
 * ��ͬ�㣺
 *     �������쳣�����
 * ��ͬ�㣺
 *     throws ���ں����ϵģ���������ж���쳣����,�ָ� �������ϣ�
 *     throw ����������쳣����				   �������ڣ�
 * 
 * 
 * �ܽ᣺
 * 1.try���ܵ������ڣ����Ժ�catch finally ���ʹ�� try catch finally, try catch,try finally
 * 2.catch �����ж����finally ֻ����һ���� 
 * 3.throw ���治�������κδ��룬���������󣬷ϻ���
 * 4.���һ�����������ˣ����׳��쳣�ķ���������Ҫtry catch ������򱨴�
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class Throwed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		div(1,2);
		 * 1.  try{div(1,2);}catch(){}
		 * 2.  �ڵ��ú�����ֱ�����׳��쳣throws �쳣*/
		
	}
	public static void div(int x, int y) throws Exception{
		if(y == 0){
			throw new Exception("��������Ϊ0");
		}
		
	}

}
