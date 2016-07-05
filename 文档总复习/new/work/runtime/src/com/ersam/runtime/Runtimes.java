/**
 * Runtime
 * ���������Ӧ�ó�������л�����һ��Ӧ�ó���ֻ��һ�����л������������ģʽ��
 * 1.getRuntime() �����뵱ǰ Java Ӧ�ó�����ص�����ʱ���󡣣���ص����л�����
 * 2.exec(String command)  ������Ӧ�õ�·�����ͻ����������� ����ֵ�ǵ�ǰ�Ľ��̣������õ��������ɱ���������,���ص���Process process��
 * 3.Process ��� destroy()  ɱ���ӽ��̡�
 * 4.freeMemory()  ���� Java ������еĿ����ڴ������ֽ�Ϊ��λ��
 * 5.maxMemory()  ���� Java �������ͼʹ�õ�����ڴ������ֽ�Ϊ��λ��jdk7.0��ǰ���64m��
 * 6.totalMemory()  ���� Java ������е��ڴ�������
 * maxMemory����Ҫ�ģ� > totalMemory��ʵ�ʵģ� ��
 */
package com.ersam.runtime;

import java.io.IOException;

/**
 * @author www.23.com
 *
 */
public class Runtimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Runtime rt = Runtime.getRuntime();
		try {
			//������Ӧ�õ�·�����ͻ����������� 
			Process progress = rt.exec("D:\\software\\navicat\\Navicat for MySQL\\navicat.exe");
			Thread.sleep(3000);
			progress.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//freeMemory() ���� Java ������еĿ����ڴ�����
		//System.out.println(Runtime.getRuntime().freeMemory()/(1024*1024));
		
		//maxMemory()  ���� Java �������ͼʹ�õ�����ڴ������ֽ�Ϊ��λ��jdk7.0��ǰ���64m������Ҳ�Ż�����һ������ʱ�򲻹�Ҫ��ô��10��m���������õ�ʱ���ڴ�����StringBuffer����ģʽһ������
		/*System.out.println(Runtime.getRuntime().maxMemory()/(1024*1024));*/
		
		//totalMemory()  ���� Java ������е��ڴ�������
		/*System.out.println(Runtime.getRuntime().totalMemory());*/
		
		
	}

}
