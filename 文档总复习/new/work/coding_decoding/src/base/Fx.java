/**
 * ����ͽ���
 * 
 * ʲô�Ǳ��룿
 * ��ν�ı�����ǽ��������ַ�����Ϊ���������ַ�������̽������� ������Ӳ��д��  
 * 
 * ʲô�ǽ��룿
 * ��ν�Ľ�����ǽ��������Ķ�����Ϊ���Ķ��Ķ����� Ӳ�̵�����
 * 
 * ��ϵͼ
 * ����
 * 
 * Ӳ��(���ֽڶ�����)
 * �����
 * ����(�ַ�)
 * 
 * Ӳ�̵����ݶ�ȡ�������뵽�ַ�
 * ������ַ�����д��Ӳ��
 * 
 * �����ϵ�һ�����
 * ASCII ���
 * �����˷��� 1���ֽڱ�ʾ ��Χ-128-127 ����û������ֻ����7λ���������š�
 * 
 * is8859-1
 * ŷ�����
 * �����Ψһһ����-128-127���������������ascii�Ļ����Ͻ�����չ��-128-127 �������ˣ�����������߱�ȫ��������
 * 
 * GBK2312 �й��˷����� Ӣ��1���ֽڣ�����2���ֽ�
 * GBK     �й��˷������������������ַ���
 * ���������û����
 * 
 * unicode��һ��Э���׼���������ʵ�����Ķ�Ҫ��Ӧ���緶Χ�ġ�
 * 
 * UTF-8 ����3��Ӣ��1��
 * UTF-16 ��Ӣ������
 * ��û����
 * 
 * UTF-16 �Ǹ��ܶ��ĵ������ֽڻ���-2 -1�ı�־λ�����ľ���UTF-16����� Ӣ�Ļ��и��յ�0
 * 
 * ����ͽ��붼��һ�ף�������������룬Ӣ�����Ķ�һ����ע��UTF-16��2���ֽڵ���û������Ϊ�и��յ�0��
 * 
 * 
 * 
 * 
 */
package base;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author www.23.com
 *
 */
public class Fx {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		String lm = "�й�";
		
		byte []by = lm.getBytes();
		
		String str = new String(by,"ISO8859-1");

		System.out.println(new String(str.getBytes("ISO8859-1")));
	}

}
