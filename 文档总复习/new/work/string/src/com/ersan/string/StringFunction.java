/**
 * StringFunction
 * ���췽����ѧ
 * http://tool.oschina.net/apidocs/apidoc?api=jdk-zh
 * 
 */
package com.ersan.string;

import java.util.Arrays;

/**
 * @author www.23.com
 *
 */
public class StringFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////////////// ���췽��   /////////////////////////////////////////////////
		
		//byte String(byte[] bytes) 
		// ������������ַ���ascii�룬ͨ��String�Ĺ��캯��ת��Ϊ��Ӧ��ֵ����Ϊ�ַ�����
		/*byte[] bytes = {97,98,99};
		String b = new String(bytes);	
		System.out.println(b);*/
		
		//String byte ��Charset ������ʱ���� ����Ҫһ�����IO��ѧ
		
		//String(byte[] bytes, int offset, int length)
		/*��������ν�Ľ�����ǰ����ֱ�Ϊ�ַ� ascii
		bytes -  Ҫ����Ϊ�ַ��� byte  
		offset - ���ĸ�����ֵ��ʼ����
		length - Ҫ������ٸ�Ԫ�� */
		/*byte[] bytes = {97,98,99};
		String b = new String(bytes,1,2);	
		System.out.println(b);*/
		
		//String(char[] value) 
		//���ַ������Ϊ�ַ�������
		/*char [] str = {'a','b','v'};
		System.out.println(new String(str));*/
		
		//String(char[] value, int offset, int count)  ��byte���Ǹ�һ�� offset��ʼ���� count�������
		
		//String(int[] codePoints, int offset, int count) ��byte������
		
		//String(String original) new String("admin");
		 
		//String ��ͨ�ķ���
		//group by
		//��ȡ�ķ���
		//�жϵķ���
		//
		
		//��ȡ�ķ���
		/*int length() ��ȡ�ַ�������
		char charAt(int index) ��ȡ�ض�λ�õ��ַ���С���±�Խ�磩
		int indexOf(String str)��ȡ�ض��ַ���λ�� û���ҵ�������-1
		int lastIndexOf(String str)��ȡ���һ���ַ���λ�ã�û���Ҵ�-1*/ 
		
		
		//�жϵķ��� -- return boolean
		//endsWith();�ж��Ƿ���ָ�����ַ������� "".endsWith("aa");
		//isEmpty();�ж��ַ����ĸ����Ƿ�Ϊ0
		//contains();�ж��Ƿ����ָ������"".contains("a")
		//equals();�ַ����Ƚ�
		//equalsIgnoreCase();
		
		//ת���ķ���
		//static String valueOf(char[] data)
		//static Stirng valueOf(char[] data, int offset, int ct)
		//char[] toCharArray(); "".toCharArray();
		//byte[] getBytes();    "".getBytes();
		//�ֽڣ��ַ��������ת�ַ������෴�ַ���Ҳ��ת���ֽں��ַ�����
		
		//��������
		/*String str.replace("replace", "newreplace");
		String[] str.split("�ָ���");
		String str.substring(int beginIndex);
		//�����js���Ǹ�һ���ӵڼ�����ʼȡ����+������ʼ��λ�ú�
		String str.substring(int beginIndex, int endIndex);
		String str.toLowerCase()
		String str.toUpperCase()
		String str.trim()*/
		//System.out.println(fx("�й��ð�"));
		System.out.println(count("phcpphcpjavaphpjavascriptphsp","ja"));
	}
	public static String fx(String str){
		char [] rt = str.toCharArray();
		char [] result = new char[rt.length];
		int i = 0;
		int j = rt.length -1;
		while(j > -1){
			result[i++] = rt[j--];
		}
		return String.valueOf(result);
	}
	public static int count(String str, String str2){
		int count = 0;
		int idx = 0;
		while((idx = str.indexOf(str2, idx)) != -1){
			count ++;
			idx += str2.length();
		}
		return count;
	}
}
