/**
 * ���ͽӿ�
 * interface tt<T>{
	public void add(T t);
	}
  �ӿڵķ���ʲôʱ��ȷ����ʵ��һ���ӿڵ�ʱ��ָ���ġ�
  ���ʵ�ֽӿڵ�ʱ��ָ�� Ĭ�Ͼ���Object���͡�
    
    class a implements tt<String>{

	public void add(String t) {
		// TODO Auto-generated method stub
		
	}		
}
ʵ��һ���ӿڵ�ʱ��ָ��



���������ʵ�ֽӿڵ�ʱ���޷�����������ʲô����Ҫ��ʵ������ʱ��ȷ�����ʵ�֣�

 */
package fanxing;

/**
 * @author www.23.com
 *
 */
public class FanxingInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ�����ʱ��ȷ���ӿڵ�����
		SxSql <String> sqsl = new SxSql<String>();
		sqsl.map("");
		//ʵ�ֽӿڵ�ʱ��ȷ���Ľӿ�����
		a my = new a();
		
	}

}
interface tt<T>{
	public void add(T t);
}

class a implements tt<String>{

	public void add(String t) {
		// TODO Auto-generated method stub
		
	}		
}

/**
 * ���������ʵ�ֽӿڵ�ʱ���޷�����������ʲô����Ҫ��ʵ������ʱ��ȷ�����ʵ�֣�
 * @author www.23.com
 *
 * @param <T>
 */
interface sql<T>{
	public void map(T mml);
}
class SxSql<T> implements sql<T>{

	public void map(T mml) {
		// TODO Auto-generated method stub
		
	}
	
}
