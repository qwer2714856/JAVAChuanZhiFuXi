/**
 * System ����� -- ϵͳ�� -- ��ȡϵͳ����������--û�й��췽�������Ǿ�̬������
 * ���õķ���
 * 1.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
 *  src - Դ���顣
 *	srcPos - Դ�����е���ʼλ�á�
 *	dest - Ŀ�����顣
 *	destPos - Ŀ�������е���ʼλ�á�
 *	length - Ҫ���Ƶ�����Ԫ�ص�������
 * 2.currentTimeMillis()  �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
 * 3.exit(int status)  ��ֹ��ǰ�������е� Java �������
 * 4.gc()  ����jvm�Ͻ���������������������java���������������˵��CPUһ��ʱ��ֻ��ִ��һ�������������ռ�Ͳ�ִ�У���Ҫ��һ�¡�
 *   ��һ������Ҫ�����յ�ʱ����ȵ��� Object���finalize() ���������󼯳������������
 * 5.getenv() ���ݻ����������֣���ȡ���������� ʲô������ȫ����ȡ��  
 * 6.getProperties() ȷ����ǰ��ϵͳ����,getProperties ȫ�� getPropertie����ȡʲô�� ��ȡ������
 */
package com.ersan.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

class hi{
	public hi(){
		
	}
	public void finalize() throws Throwable{
		super.finalize();
		System.out.println("quit");
	}
}

/**
 * @author www.23.com
 *
 */
public class SystemFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
		/* *  src - Դ���顣
		 *	srcPos - Դ�����е���ʼλ�á�
		 *	dest - Ŀ�����顣
		 *	destPos - Ŀ�������е���ʼλ�á�
		 *	length - Ҫ���Ƶ�����Ԫ�ص�������*/
		/*int [] y = {1,2,3,4,5,6,7,8,9,10};
		int [] t = new int[11];
		try{
		    System.arraycopy(y, 2, t, 1, 2);
		   
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		System.out.println(Arrays.toString(t));*/
		
		//System.currentTimeMillis();
		//System.out.println((System.currentTimeMillis()/1000)%60);
		//System.out.println((System.currentTimeMillis()/60000)%60);
		//System.out.println((System.currentTimeMillis()/(3600*1000))%24);
		
		//exit(int status)  ��ֹ��ǰ�������е� Java �������0�����˳�����������˳����쳣��ֹ��������0�ͷ��㶼�˳���0 ���߷�������ݶ���ʹ����û�����𣬶Բ���ϵͳ���ã����Եõ������˳����߷������˳�������linuxִ����һ���ű��õ����Ǹ�״̬��
		/*System.exit(0);*/
		
		//gc()  ����jvm�Ͻ���������������������java���������������˵��CPUһ��ʱ��ֻ��ִ��һ�������������ռ�Ͳ�ִ�У���Ҫ��һ�¡�
		/*for(int i = 0; i < 100; i++){
			new hi();
			System.gc();//���ΪʲôҪ�ŵ����棬��Ϊ����ŵ����������������û��������ͽ����ˣ�����ÿ����һ���ͻ���һ��
		}*/
		
		
		//	getenv()  ���ݻ����������֣���ȡ���������� ʲô������ȫ����ȡ��
		/*System.out.println(System.getenv());
		System.out.println(System.getenv("OS"));
		Map al = System.getenv();
		al.get("JAVA_HOME");
		*/
		
		//getProperties() ȷ����ǰ��ϵͳ����,getProperties ȫ�� getPropertie����ȡʲô�� ��ȡ������
		/*System.out.println(System.getProperties());	*/
		/*Properties p = System.getProperties();
		p.list(System.out);//System.out ���� PrintStream	
*/		
		
	}

}
