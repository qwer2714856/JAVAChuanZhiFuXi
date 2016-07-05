/**
 * String
 * "=="���ڱȽ� �����������ͣ����ݱȽϵ�ʱ��Ƚϵ����ڴ��ַ��Ȼ��equalsĬ�ϱȽ������������͵�ʱ��Ƚϵ�Ҳ���ڴ��ַ��
 * equals �ڱȽ��ַ�����ʱ������� ����ַ���Ȼ��Ƚ����ԱȽϵ����ַ�����ֵ�������ڴ��ַ�������㷨����ʹ��ctrl+�����f3��equals�ϲ鿴�����ߴ�Ŀ������ļ������Ͻ��и�Outline�㿪�������������г�Ա��
 * �ַ��������أ���˫���ŵĶ���ȥ�ַ������������ҡ�
 * 		 2�ִ�����ʽ
		 *  1 ֱ�Ӹ�ֵ
		 *  str1 = "abac";
		 *  ���ַ�ʽ�����ַ�����ʱ��java��JVM��������顶�ַ��������ء������ڴ�ķ���������̬���ݹ�����������һ���ַ��������أ����Ƿ��и��ַ����������û�оʹ����������ڴ��ַ������оͲ�ȥ�ڴ�����ֱ�ӷ����ڴ��ַ�������ҵ�һ�δ�����str �ڶ���ֱ�ӷ��ص�ַ��str2����str1��str2���ڴ��ַ��ͬΪtrue
		 *  2 ʹ��new������
		 *  new �ķ�ʽ(jvm)���Ȼ������ַ��������ز鿴�Ƿ������������ڴ������ڲ�������Ȼ���ڽ��ַ����������ֵ����ݿ���һ�ݵ����ڴ���ȥ��Ȼ�󷵻ض��ڴ�ĵ�ַ��ÿ��new���ᴴ��һ���¶������Ե�ַ�϶���ͬ��
		 *  String ��д��Object ���equals �Ƚϵ�������������true
		 *  �Ƚϵ�ʱ����λ����� ���� "abc".equals(str); ��Ϊstr�п���Ϊ�� �����ָ�����
		 
 */
package com.ersan.string;

/**
 * @author www.23.com
 *
 */
public class Strings {

	private static int a;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String str1 = "admin";
		 String str2 = "admin";
		 String str3 = new String("admin");
		 String str4 = new String("admin");
		 
		 System.out.println("str1==str2?"+(str1==str2));
		 System.out.println("str1==str4?"+(str1==str4));
		 System.out.println("str3==str4?"+(str3==str4));
		 System.out.println("str1.equals(str4)?"+(str1.equals(str4)));
		 System.out.println("str3.equals(str4)?"+(str3.equals(str4)));
	 
		 
		 /*
		  * 
		 �������
		 str1==str2?true
		 str1==str4?false
		 str3==str4?false
		 str1.equals(str4)?true
		 str3.equals(str4)?true
		 
		 *
		 * �ڴ����
		 * 2�ִ�����ʽ
		 *  1 ֱ�Ӹ�ֵ
		 *  str1 = "abac";
		 *  ���ַ�ʽ�����ַ�����ʱ��java��JVM��������顶�ַ��������ء������ڴ�ķ���������̬���ݹ�����������һ���ַ��������أ����Ƿ��и��ַ����������û�оʹ����������ڴ��ַ������оͲ�ȥ�ڴ�����ֱ�ӷ����ڴ��ַ�������ҵ�һ�δ�����str �ڶ���ֱ�ӷ��ص�ַ��str2����str1��str2���ڴ��ַ��ͬΪtrue
		 *  2 ʹ��new������
		 *  new �ķ�ʽ(jvm)���Ȼ������ַ��������ز鿴�Ƿ������������ڴ������ڲ�������Ȼ���ڽ��ַ����������ֵ����ݿ���һ�ݵ����ڴ���ȥ��Ȼ�󷵻ض��ڴ�ĵ�ַ��ÿ��new���ᴴ��һ���¶������Ե�ַ�϶���ͬ��
		 */

		  
		 
	}

}
