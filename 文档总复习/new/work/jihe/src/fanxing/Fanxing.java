/**
 * ���Ͼ��Ǹ�������û��ָ�������ʲô���͵Ķ��������Կ������Ŷ������Կ��ܶ�����������Ӹ������͵��¶�ĳ�����Ͳ���һ�Ŷ��۵����������ͱ���������Ҫ��ץ����,��ĳ��������һ����ǩ��
 * ����
 * Ϊʲôѧ����?
 * ���Ǹ������۸��ǩ
 * ���͵ĺô�
 * ����������ʱ�Ĵ�����ǰ������ʱ��
 * ���˷��;Ͳ���Ҫǿת�ˣ���������ν��ǿ������ת����������jdk1.5ʹ�õ�������  ��ͱ�����Ҫ1.5
 * 
 * ע��
 * ArrayList <String> al = new ArrayList<String>();
 * ArrayList <String> al = new ArrayList();
 * ArrayList al = new ArrayList<String>();
 * ��2��3�����������⣬Ϊ����ǰ���ݣ�ԭ����֧�ַ��ͣ�����Ϊ�˼��ݡ�
 * 1.����û�ж�̬���������߶�Ҫһ�£�����ֻдһ�ߵķ��͡��Ƽ����߶�д��
 * 
 * 
 * �Զ��巺��
 * һ���������͵�ռλ��
 * �������Զ��巺��
 * ���η� <�����Զ��巺��>����ֵ���� ��������ʹ���Զ��巺�ͣ�{}
 * �ڷ����в���ʹ�û����������ͣ������Ҫʹ��Ҫʹ�ð�װ��������int ��ӦInteger��  ֵ���Ǳ�ǩ����ʵ��<Integer> <int> ���Ǵ���
 * Byte byte
 * Short short
 * int Integer
 * long Long
 * double Double
 * float Float
 * boolean Boolean
 * char Character
 * 
 * public static <T>T ll(T o){
		
		return o;
	}
	
	ll(new p()); ��ʱ��ʲô��ȥ�Ϳ����Զ�ʶ�����
	
	�������� ռλ��ʲôʱ����ȷ�������������͡�
	������������Ǵ���ʵ�ε�ʱ��ȷ�ϵ�
	
	
	���ռλ��һ��ϰ��ʹ��һ����д��ĸ �����T E T��type E elementԪ�ص���˼
	
	
	
	
 */
package fanxing;

import java.util.ArrayList;

/**
 * @author www.23.com
 *
 */
public class Fanxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ֻ�ܴ洢�ַ���������
		ArrayList <String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
	    
		
		//java.lang.ClassCastException �׳�ǿתʧ����ν����ʹ�÷���
		System.out.println((al.get(1)).toUpperCase());
		int a= 123;
		ll(123);
	}
	
	
	//����һ������Ҫ����Խ����κ��������ͣ�����ֵ����Ҫ��ʵ��һ�����Զ��巺��
	public static <Ts>Ts ll(Ts o){
		return o;
	}

}
class p{}
