/**
 * ��������һ����StringBuffer �ṩ�ķ����Ƚ���ȫ
 * �ַ��������� StringBuffer �����Է����޸ģ����Ǵ洢�ַ���������
 * �ַ�����һ���ص�
 * "" ���ַ������������ַ����������д����Ժ�Ͳ������޸ġ�
 * �ַ���������һ�������仯���ϻᴴ��һ���µĶ���Ҳ��˵���ַ������������ִ���һ����
 * �ַ��������ݲ�����Ƶ���޸ģ���Ϊ�޸ľ��൱�ڴ���һ���µĶ���
 * �����ҪƵ���޸��ַ������ݣ�����ʹ���ַ���������
 */
/**
 * StringBuilder ���Ҳ��һ���ַ��������ࡣ�Ƽ����������Ϊ��ʵ�к������ö��̲߳���һ�����ݡ����Ҳ���ֶԴ������߳���buffer �� ��builder
 * StringBuffer �е�   StringBuilder ͬ���� ���ù��ܶ�һ�� 
 * ���ֵ�
 * 1 ����StringBuffer�����̰߳�ȫ�ģ�Ҫ��  jdk 1.0 �Ƴ�
 * 2 StringBuilder�����̲߳���ȫ�ģ� jdk 1.5 �Ƴ�
 * ����Builder��
 * �̰߳�ȫ
 * һ��ʱ���ֻ��һ���̲߳���һ�ݴ���
 * �̲߳���ȫ
 * һ��ʱ��ζ���߳�ͬʱ����һ�ݴ���
 */
package com.ersan.string;

/**
 * @author www.23.com
 *
 */
public class Buffers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		//StringBuffer
		//���췽��
		/*����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
		 * ����ַ���һ���������ڲ�ά������һ��char ���鲻ͬ������չ
		 * ���Ĭ��ʮ�����ַ�,��������Ļ���Ϊԭ����1��+2���ش�һ���1����
		 * ��������Ϊ����ɾ�Ĳ��ж�
		StringBuffer() */
		//StringBuffer sb = new StringBuffer();
		//sb.append("ding.luchao-jiang.liliding.luchao-jiang.liliding.luchao-jiang.liliding.luchao-jiang.lili");
		//System.out.println(sb.length());
		
		/*//��
		append(�����ж��)���Ǹ����ط��� ��������κ���������
		insert(int offset, char c)  ���Բ���������������
		//ɾ��
		delete(int start, int end)  �Ƴ������е����ַ����е��ַ���
		deleteCharAt(int index) 	�Ƴ�������ָ��λ�õ� char��
		//�鿴
		int  capacity()  ���ص�ǰ������
		char charAt(int index) ���ش�������ָ���������� char ֵ��
		int indexOf(String str)   ���ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е�������
		int lastIndexOf(String str, int fromIndex) �������һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е�������
		int length() ���س��ȣ��ַ�������
		toString();
		//�޸�
		ensureCapacity(int minimumCapacity) ȷ���������ٵ���ָ������Сֵ��ȷ�ϳ�ʼֵ��ȷ���ڲ����Ǹ�char���鳤�ȡ�
		replace(int start, int end, String str) ʹ�ø��� String �е��ַ��滻�����е����ַ����е��ַ���
		reverse() �����ַ��������䷴ת��ʽȡ����
		setCharAt(int index, char ch) ���������������ַ�����Ϊ ch��
		substring(int start) ����һ���µ� String�����������ַ����е�ǰ���������ַ������С�
		//�ж�
*/		
		
		//StringBuffer sb = new StringBuffer();
		//append �����������
		/*sb.append(false);
		sb.append(31.4f);
		System.out.println(sb.toString());*/
		
		//insert ���Գ�����������
		/*sb.insert(0, false);
		sb.insert(2, false);*/
		
		//delete(int start, int end) �ӿ�ʼ�ĸ���Ҳ��ɾ��������ʼλ��+ɾ������
		//deleteCharAt(int index) ɾ��ָ��ְλ���ַ�ɾ��һ��
		/*sb.append("dingluchao");
		sb.delete(4, 6);
		sb.deleteCharAt(1);*/
		
		//replace(int start, int end, String str) 
		//reverse() �����ַ��������䷴ת��ʽȡ����
		//setCharAt(int index, char ch) ���������������ַ�����Ϊ ch��
		//substring �� String���Ǹ�һ��
		/*sb.append("dingluchao");
		sb.replace(4, 6, "jianglili");
		sb.reverse();
		sb.setCharAt(1,'x');
		String str = sb.substring(0,1);
		sb.ensureCapacity(100);//Ĭ���ڲ����鳤��Ϊ100 һ�㲻������
		*/		
		
		//�鿴
		//int indexOf(String str)
		//int  capacity() ��ǰ�ڲ��ַ���ĳ��ȡ�
		//char charAt(int index) ����ָ��λ�õ��ַ�
		//int length() ���س��ȣ��ַ������� ����ǲ鿴�洢�ַ���������capacity��������ǿ����鳤�Ȳ���ʵ�ʵĳ��ȡ�
		//int lastIndexOf(String str, int fromIndex) �������һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е�������
		//toString(); ���ַ��������������ת�����ַ������ء�
		/*sb.append("dingluchao");
		int idx = sb.indexOf("lu");
		int m = sb.capacity();
		System.out.println();*/
		
		
		
	}

}
