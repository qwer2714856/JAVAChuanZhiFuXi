/**
 * Date ������  ��util ������ java.util ������ Date ����Ĵ󲿷ַ�������ʱ�ˣ�����ʹ��Calendar�����,����һ��Date ��� SimpleDataFormatʹ��
 * ���캯��
 * Date() ���ص�ǰϵͳʱ�����
 * new Date().setTime(System.currentTimeMillis()); �������� Ȼ��ͨ��SimpleDateFormat��ʽ����
 * 
 * Calendar ����̳���Ϊ���췽����protected���Բ�ͬ��ֻ�ܼ̳У�����ʹ�þ�̬������ȡ��
 * Calendar.getInstance() ��ȡ��ǰϵͳʱ����� --ͨ����̬��ȥ���ڶ���
 * Calendar ��һ��get�������Ի�ȡ������ʱ����public int get(int field)
 * ���get�������������Ӧ�ĳ��� int field
 *     Calendar.YEAR --��
 *     Calendar.MONTH --�� 0-11�»�ȡ��ʱ����Ҫ+1��������0-6
 *     Calendar.MONDAY -- ָʾ Monday �� DAY_OF_WEEK �ֶ�ֵ
 *     Calendar.DATE --��  --DAY_OF_MONTH ���Թ�ȥ����һ��λ�����ǵڼ������Լ��ܵȵ�
 *     Calendar.HOUR --ʱ  HOUR_OF_DAY 24Сʱ ����   HOUR 12Сʱ����
 *     Calendar.MINUTE --��
 *     Calendar.SECOND --��
 *     Calendar.MILLISECOND --����
 *     
 *     
 *     ���ڸ�ʽ����
 *     SimpleDateFormat   -- ������java.text.SimpleDateFormat;��
 *     ���������� 
 *     1.������ת��ָ����ʽ���ַ���    format()
 *     2.���ַ���ת����Ӧ����	  parse()
 *     SimpleDateFormat() Ĭ�ϸ�ʽ������һ�����ڸ�ʽ��
 *     
		��ĸ	���ڻ�ʱ��Ԫ��	��ʾ	ʾ��
		G	Era ��־��	Text	AD
		y	��	Year	1996; 96
		M	���е��·�	Month	July; Jul; 07
		w	���е�����	Number	27
		W	�·��е�����	Number	2
		D	���е�����	Number	189
		d	�·��е�����	Number	10
		F	�·��е�����	Number	2
		E	�����е�����	Text	Tuesday; Tue
		a	Am/pm ���	Text	PM
		H	һ���е�Сʱ����0-23��	Number	0
		k	һ���е�Сʱ����1-24��	Number	24
		K	am/pm �е�Сʱ����0-11��	Number	0
		h	am/pm �е�Сʱ����1-12��	Number	12
		m	Сʱ�еķ�����	Number	30
		s	�����е�����	Number	55
		S	������	Number	978
		z	ʱ��	General time zone	Pacific Standard Time; PST; GMT-08:00
		Z	ʱ��	RFC 822 time zone	-0800
		"yyyy��MM��dd��HHʱmm��ss��"
		
		
		
 *
 *   ��ѧ��Math �ṩ�˺ܶ���ѧ��ʽʹ�� -- java.lang.Math������
 *   abs ����ֵ
 *   ceil ����ȡ�� �����ȡ��
 *   floor ����ȡ��
 *   round ��������
 *   random ȡ����� 0-1������� ������1
 *   ��һ����������� Random --java.util.Random
 *   Random rd = new Random();
	 System.out.println(rd.nextInt(11));
	  ���� 0-10�������
	 System.out.println(rd.nextInt(11)+1);
	 1-10 
	 
 *   
 *   ��֤��	 
 */
package tool;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author www.23.com
 *
 */
public class Dates{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Date date = new Date();//��ȡ��ǰϵͳʱ��
*/	
		/*Calendar a = Calendar.getInstance();
		a.setTimeInMillis(System.currentTimeMillis()+5000);//����һ��ʱ��
		System.out.println(a.get(Calendar.YEAR));//��ȡһ��ʱ��
	    
		//���ڸ�ʽ�� ��
		SimpleDateFormat sf = new SimpleDateFormat("yyyy��MM��dd��-HHʱmm��ss��");
		try {
			System.out.println(sf.parse(sf.format(a.getTime())));//�ַ���ת���� -- ����ַ���һ��Ҫ����simpleDateFormat�ĸ�ʽ�ַ���-����ת������,����ֱ���쳣.
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sf.format(a.getTime()));//����ת�ַ��� 
*/		
		
		/*Random rd = new Random();
		System.out.println(rd.nextInt(11)+1);*/
		
		
		Random rd = new Random();
		char[] a = {'b','s','d','e','t','p','��','·','��'};
		int rds = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 31; i++){
			rds = rd.nextInt(a.length);
			sb.append(a[rds]);
		}
		System.out.println(sb.toString());
	}
}
