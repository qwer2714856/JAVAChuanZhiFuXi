/**
 * ������ʽ--���ڲ����ַ�����һ������,һ������������ʽʹ�����س��ķ��ű�ʾ��
 * ƥ�䣬У��
 * 
 * ԭ��
 * .    �����ַ� ���˻��з� \r �س� �ǻص����� \n��һ�� 
 * \d	���֣�[0-9]
 * \D	�����֣� [^0-9]
 * \s	�հ��ַ���[ \t\n\x0B\f\r] ���뿴�����Ķ���
 * \S	�ǿհ��ַ���[^\s]
 * \w	�����ַ���[a-zA-Z_0-9]
 * \W	�ǵ����ַ���[^\w]
 * \b   ���ʱ߽� ֻҪ�Ǵ����ʼ�Ľ����Ϳ���ƥ�� ���ǲ�ƥ���ַ��� ��ƥ���κ��ַ�ֻ�Ǹ��߽��ǰհ�ͺ�˺��� Ҳ��˵matcher("a b") a\bb�ǲ�ƥ�����Ϊ �ո���\b \b��ƥ���κ��ַ����Ǹ��߽���ѡ�
 * \B   �Ǳ߽�
 * 
 * ����ԭ����û�м�������ֵ֮ǰ�κ�Ԥ�����ַ���ֻ��ƥ��һ����
 * �ַ�����\ת���嵫���ԭ���ǲ���ת�������Ҫ�ڼ�һ��\��ת���� ���署\r ��ϵͳת�����ַ��� \d���ǵģ��ַ���������Ҫ�ȶ�\ת����\\Ȼ���ڼ�d ���ɵ���\d 
 * 
 * Ԫ�ַ�
 * 
 * X?	X��һ�λ�һ��Ҳû��
 * X*	X����λ��� {0,}
 * X+	X��һ�λ���{1,}
 * X{n}	X��ǡ�� n ��
 * X{n,}	X������ n �� 
 * X{n,m}	X������ n �Σ����ǲ����� m ��
 * 
 * ��Χ
 * [abc]	a��b �� c�����ࣩ
 * [^abc]	�κ��ַ������� a��b �� c���񶨣�
 * [a-zA-Z]	a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ��
 * [a-d[m-p]]	a �� d �� m �� p��[a-dm-p]
 * [a-z&&[def]]	d��e �� f
 * [a-z&&[^bc]]	a �� z������ b �� c��[ad-z]����ȥ��
 * [a-z&&[^m-p]]	a �� z������ m �� p��[a-lq-z]����ȥ��
 * 
 * 
 * Back ����
 * \n	�κ�ƥ��� nth ������
 * 
 * ���⹹�죨�ǲ���
 * (?:X)	X����Ϊ�ǲ�����
 * (?idmsux-idmsux) 	Nothing�����ǽ�ƥ���־i d m s u x on - off
 * (?idmsux-idmsux:X)  	X����Ϊ���и�����־ i d m s u x on - off
 * (?=X)	X��ͨ�����ȵ��� lookahead ǰհ
 * (?!X)	X��ͨ�����ȵĸ� lookahead ��ǰհ
 * (?<=X)	X��ͨ�����ȵ��� lookbehind ���
 * (?<!X)	X��ͨ�����ȵĸ� lookbehind �����
 * (?>X)	X����Ϊ�����ķǲ�����
 * 
 * 
 * ()����������� ��߸�����
 * java��������\n \1-\n
 * ()������״γ��ֵ�Ϊ\1 �پ����Դ����� \1 - \n
 * ģʽ������
 * 
 * 
 * 
 * 
 * ƥ��ĺ���
 * matches
 * 
 * 
 * 
 * ƥ��
 * matches
 * �滻
 * replaceAll
 * �и�
 * split
 * ����
 */
package regexp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author www.23.com
 *
 */
public class Description {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ƥ��
		String pattern = "([a-z0-9A-Z])(?:[a-z0-9A-Z])+@(?:163|qq)\\.(?:com|cn)";
		String tel = "(\\d{4}-)?\\d{7,8}";
		System.out.println("1177284@163.com".matches(pattern));
		
		//�и� �൱����ģʽ������g
		String a = "С����������������ѧѧѧ";
		String aPattern = "(.)\\1{1,}";
		String []getA = a.split(aPattern);
		System.out.println(Arrays.toString(getA));
		
		//���� �ַ���û�����÷���--ʹ������������������ Pattern  Matcher ƥ��������   -- java.util
		//Pattern �������
		//Matcher ƥ�������� ���еĶ�������ƥ������
		//�ҳ�������ĸ��ɵĵ���
		Pattern pt = Pattern.compile("\\b[a-zA-Z1-9]\\w+@(?:163|126)(\\.(?:com|cn|net)){1,2}\\b");
		Matcher m = pt.matcher("dfsdf:13863946940@126.com.com.com.com :13863946940 dfsdf:13863946940 dfsdf:13863946940 dfsdf:13863946940");
		//ƥ������Ҫʹ�õķ���
		//m.find(); ����boolean֪ͨƥ����ȥƥ���ַ������ҷ��Ϲ�����ַ�����  ���ҷ��Ϲ���� ����ɶԳ���
		//m.group(); ��ȡ���Ϲ�����ַ��� --ʹ�÷�����ʱ��һ���ȵ���find��ʹ��group ����е������
		while(m.find()){ //�͵�����һ���÷�
			System.out.println(m.group());
		}
		
		
		
		
		//�滻 replaceAll �൱����ģʽ������g   �����Ҫ�� replaceAll �����ⲿ ����������� �� $1-n����ǰ��Ĳ�����
		System.out.println("�������ú���������ľľ".replaceAll("(.)\\1+", "$1"));
		
		
	}

}
