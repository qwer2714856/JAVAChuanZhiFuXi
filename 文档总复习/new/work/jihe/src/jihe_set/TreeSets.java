/**
 * TreeSet
 * �ص�
 * ���Ԫ�ؾ߱���Ȼ˳������ԣ���ô�Ͱ���Ԫ����Ȼ˳������Խ�������洢��
 * ��Ȼ˳��a-z 1-n,�ַ��ǰ���ÿλ��ascii������
 * 
 * TreeSetҪע�������
 * 1.��TreeSet���Ԫ�أ����Ԫ�ر�������Ȼ˳��ᰴ����Ȼ˳������С->��
 * 2.�����TreeSet���Ԫ�أ����Ԫ�ر���û����Ȼ˳�����ԣ���ô��Ԫ�����������ʵ��Comparable �ӿ�   Comparable����ӿ���java.lang�� �� �ȽϹ�������compareTo
 * �����ϡ�
 *     ������
 * 3.���ʹ��TreeSet ���������Ԫ�ص�ʱ���ֱȽϵ��Ǹ��ֶ����Ϊ0��ô����Ϊ�ظ�Ԫ���޷����롣��compareTo ��������0�������hashCode �� equalsû��ϵ��
 * 4.����TreeSet������ݵ�ʱ�����Ԫ�ر����߱���Ȼ˳��Ԫ��������Ҳû��ʵ��comparable�ӿڣ���ô��Ҫ�ڹ����ʱ����һ���Ƚ�����
 * 5.Comparator Comparable ���ͬʱʵ��ʹ�� Comparator �ıȽ��� ����
 * 6.TreeSet���Զ��ַ�������������Ϊ�ַ���ʵ����Comparable�ӿ�
 * 7.�ַ����ȽϹ���
 *     ��λ�Ƚ�ascii�����û�ж�Ӧ��û�е��Ǹ�С��
 *     abc
 *     <
 *     abw
 *     ��λ�Ƚ�
 * 
 *     abc
 *     ��λǰ�涼һ�������Ȳ�ͬ�Ƚϳ��ȡ�
 *     abcd
 * ԭ��
 * �ײ���ʹ�ú������Ҳ���Ƕ��������ݽṹ���洢������С�Ҵ�
 * ����2��Ҷ�ӽ�㣬С����ߣ�����ұ�
 * ��������˱Ƚϵ�����������Ϊ0��ô����Ϊ�ظ�Ԫ���޷���ӽ�ȥ
 * 
 * �������Ĵ�ȡ�ͱ���
 * 
 * ��һ��ʹ��add�����Ԫ����Ϊ���ڵ�
 *                        ��1  Ǯ100
 * ��������ӽ���ʱ�����ȥ����1�Ƚ�Ǯ������ֱ�100С��ô��λ����1�����
 * 					   ��2 Ǯ50	 
 * �������αȽ�������3 120 ��ȥ���ϱȽϷ��ֱ���1���Ǿͷŵ���1 ���ұ�
 *                              ��3 Ǯ 120
 * �����Ĵ���4Ǯ 5 ���Ⱥ���1�ȱ���1Сȥ��ߺ���2�ȱ���2С
 *                  ��4 Ǯ5
 * ��������� ��4 ��2 ��3 ��1  �������µ�Ҷ�ӿ�ʼ ��Ҷ�� �����Ҷ�ӵݹ�
 * 
 * ���������е�һ���ص㡿
 * �ڶ������У�������㹹����һ������Ļ��ͻ������㣬�������˻�ʹ�Ƚϴ������١�
 * 
 * �����ṹ����
 * ����
 * A
 *  B
 *   C
 * ����������ʱ��û�й���һ�����档 ������Ľ��Ϊ
 *     B
 *  A     C
 *  ��һ�����λ�ڵڶ�����ߣ��ڶ���λ���м䣬������Ϊ�ڶ����ұߡ�
 *  
 *      B
 *  A       C
 *           D
 *            E
 * ABC��һ�Ŷ��棬B�������Ľ�㣬������ǲ���������ģ�����BCD��������������CD ��CDE�����������	ֻ��֦Ҷ��
 * ����CDE������û���γɲ� ���Ϸ����仯��
 * 
 * 
 * 
 * �Զ���Ƚ�����ʽ
 * �Զ���һ����ʵ��comparator
 * class Com implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
 
	
}


Comparator Comparable ���ͬʱʵ��ʹ�� Comparator �ıȽ��� ����
�Ƽ�ʹ������	�Ƽ�Comparator


��ϰ��
TreeSetLx

 * 
 * 
 */
package jihe_set;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author www.23.com
 *
 */
/**
 * �Ƚ���
 * @author www.23.com
 *
 */
class Com implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		ps p1 = (ps)o1;
		ps p2 = (ps)o2;
		return p2.qian - p1.qian;
	}
 
	
}

public class TreeSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet ts = new TreeSet();
		ts.add(new ps("s"));//TreeSetĬ���ǰ�����Ȼ˳���������ģ����Զ������û�пɱ��ԣ�����Ҫ����������ʲô������򱨴�
		System.out.print(ts);*/
		
		//Ԫ���˱���ʵ����comparable 
		//TreeSet ts = new TreeSet();
		//�Զ���Ƚ��� new Com
		TreeSet ts = new TreeSet(new Com());
		ts.add(new ps("bs",4));
		ts.add(new ps("as1",3));
		ts.add(new ps("cs2",2));
		ts.add(new ps("es3",1));
		ts.add(new ps("zs4",99));
		ts.add(new ps("zs4x",99));
		System.out.print(ts);
	 
	}

}


class ps implements Comparable{
	String u;
	int qian;
	public ps(String u,int qian) {
		// TODO Auto-generated constructor stub
		this.u = u;
		this.qian = qian;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return u;
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return u.hashCode();
	}
	//����������������������ݴ˶�����С�ڡ����ڻ��Ǵ���ָ������  ��С�����������
	/*�� a С�� b���������������� a Ӧ�ó����� b ֮ǰ���򷵻�һ��С�� 0 ��ֵ��
	�� a ���� b���򷵻� 0��
	�� a ���� b���򷵻�һ������ 0 ��ֵ��*/
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		ps s = (ps)o;
		System.out.println(u+"��"+s.u+"�Ƚ���");
		return qian - s.qian;
		
		
	}
}