/**
 * Java ���ʺ϶�����ʺϵ�����
 * ���� 2�� 1.�Զ��壬2.sun�ṩ����⣨ֻҪ֪��֪����ʲô�����ˣ�ǿ�м���ĺࣩܶ
 * ���е��඼�̳���Object�������Զ���ģ� ������instanceof ����
 * ѧϰ��һ��Ӷ����࿪ʼѧ��Object�Ƕ���
 * ����+���� ��ϸ����
 * java ������Դ���붼��jdk�����src.zip����
 * ͨ��eclipse �Ŀ�ݼ��鿴Ԫ����ķ�ʽ��2����ݼ���1��סctrl+��껬���Ǹ���������� 2 ѡ���Ǹ�����Ȼ��F3 ����ȥsrc.zipԴ�ļ�������ȥ
 * ���������������Ǹ��ط���text����keys�Ϳ������ÿ�ݼ�
 * java ��д��һ��equalsҪ����дһ��hashCode���� ��ΪhashCode ��ľ��Ǹ���ַ����Ҫ��д�ɺ�equals�Ƚ�һ����
 * Object
 * toString() 
 * equals()
 * hashCode()
 * ��һ������Ҫ�����յ�ʱ����ȵ��� Object���finalize() ���������󼯳������������
 * ���System.gc()ʹ��
 */
package com.ersan.object;

class Person{
	String name = "aaa";	
	
	public String toString() {
		return "name=" + this.name;
	}
	
	public boolean equals(Object obj) {
		return this.name == ((Person)obj).name;
	}
	public int hashCode(){
		return 0;
	}
}

/**
 * @author www.23.com
 *
 */
public class Objects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objects a = new Objects();
		//toString
		/*toString

		public String toString()
		���ظö�����ַ�����ʾ��ͨ���� toString �����᷵��һ�������ı���ʽ��ʾ���˶�����ַ��������Ӧ��һ�����������ڶ�������Ϣ���ʽ�������������඼��д�˷�����
		Object ��� toString ��������һ���ַ��������ַ����������������Ǹ����һ��ʵ������at ��Ƿ���@���ʹ˶����ϣ����޷���ʮ�����Ʊ�ʾ��ɡ����仰˵���÷�������һ���ַ���������ֵ���ڣ�

		getClass().getName() + '@' + Integer.toHexString(hashCode())����Ƕ�����ڴ��ַ
		 
		���أ�
		�ö�����ַ�����ʾ��ʽ��
		toString ����
		ֱ�����һ�������һ�������toString��������ֵһ����
		Ϊʲô��
		System.out.println(a)��Դ�����֪��
		toString()������ ��
		������Object��д���Եõ�һ������������Ϣ����Person����д
		*/
		//System.out.println(a.toString());
		//System.out.println(new Person());
		
		
		
		
		
		//equals
		/*equals

		public boolean equals(Object obj) 
		��������Ĭ�ϱȽ��ڴ��ַ��������
		�ַ������Ǳȵľ���ֵ
		��toString()һ������ʵ�в�һ������д��
		
		ָʾ����ĳ�������Ƿ���˶�����ȡ���
		equals �����ڷǿն���������ʵ����ȹ�ϵ��

		�Է��ԣ������κηǿ�����ֵ x��x.equals(x) ��Ӧ���� true��
		�Գ��ԣ������κηǿ�����ֵ x �� y�����ҽ��� y.equals(x) ���� true ʱ��x.equals(y) ��Ӧ���� true��
		�����ԣ������κηǿ�����ֵ x��y �� z����� x.equals(y) ���� true������ y.equals(z) ���� true����ô x.equals(z) Ӧ���� true��
		һ���ԣ������κηǿ�����ֵ x �� y����ε��� x.equals(y) ʼ�շ��� true ��ʼ�շ��� false��ǰ���Ƕ����� equals �Ƚ������õ���Ϣû�б��޸ġ�
		�����κηǿ�����ֵ x��x.equals(null) ��Ӧ���� false��
		Object ��� equals ����ʵ�ֶ����ϲ�������������ȹ�ϵ�����������κηǿ�����ֵ x �� y�����ҽ��� x �� y ����ͬһ������ʱ���˷����ŷ��� true��x == y ����ֵ true����

		ע�⣺���˷�������дʱ��ͨ���б�Ҫ��д hashCode ��������ά�� hashCode �����ĳ���Э������Э��������ȶ�����������ȵĹ�ϣ�롣

		������
		obj - Ҫ��֮�Ƚϵ����ö���
		���أ�
		����˶����� obj ������ͬ���򷵻� true�����򷵻� false��*/
		
		/*Person a1 = new Person();
		Person a2 = new Person();
		System.out.println(a1.equals(a2));*/
		 
		
		//hashCode
		Person hashcode = new Person();//hashCode��һ��������ڴ��ַ
		System.out.println(hashcode.hashCode());//�ڴ��ַ
		Person hashcode2 = new Person();//hashCode��һ��������ڴ��ַ
		System.out.println(hashcode2.hashCode());//�ڴ��ַ
	}

}
