package use;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 

/**
 * 1.���ݲ�ȫ                                          alt+/�������Ҫ Ҫѧ��
 * 2.�����޸�����                                  ctrl + 1 
 * 3.Ų����  ѡ��ҪŲ�Ĵ����              alt + ���·����
 * 4.�����ƶ�                                           ����ѡ��Tab�����ƶ�
 *   ����ƶ�ѡ��                                   shift+Tab
 * 5.����ע��                                           ctrl+shift+/   ȡ���� + \
 * 6.����ע��                                           ctrl + / ȡ������Ӷ�����ԭ���о�ȡ��ԭ��û�о�ע�͹���Ƶ���ǰ��
 * 7.��������                                           �����ʽ�� ctrl+shift+f  ѡ��
 * 8.������������ ,����ȥ�����õİ� ctrl+shift+o
 * 9.ɾ����ǰ�й�����ڵ�ǰ��		ctrl+d 
 * 10.���е��ȼ� windows->prefer.. ��keys
 * 11.���캯��û�й̶���ݼ���Ҫ�Լ�����  ���ȼ�����constructor  Fields ʹ�������ֶ� from superClass û�в����Ĺ��� building��    unbind Command ���
 * 12.����get �� set ����               keys ����getter �� setter ���� Ҫ���ɵĻ���һ�����ɵ�
 * 13.�鿴Դ����                                    ctrl+�����  ����ctrl+shift+t ��������鿴���� ��ѡ�� f3
 * 14.ת��Сд	
 * 15.ת��д					ctrl+shift+x
 * 16.תСд					ctrl+shift+y
 * 17.ͳһ�ĸ�����				ѡ���Ҽ� refactor->rename
 * 18.�鿴����ļ���һЩ��Ϣ              ctrl+f3
 * �ϵ����
 * �����ó���ͣ��ָ���ط��۲�ͣ���ط����ݷ���ԭ��
 * 1.�ڴ�������һ���ϵ�
 * 2.Ȼ����debugģʽ���� debug as
 * 3.����debug��ͼ ͣ�ڶϵ�
 * 	 ��������ͣ�ڱ�����������λ�ù۲���Ϣ
 *  �����뿴�ĸ�����ѡ���Ҽ�watch ���ϻ��һ���۲�Ĵ���express
 *  step over ������һ��
 *  step into ���뵽�����ߵĺ����ڲ�
 *  step return ����������Ͻ����ص���һ��
 *  ��ɫ��ͷ���������д�����˶ϵ�������滹�жϵ���ڿ�ס
 *  Breakpoints ѡ��и����ͻ�ɾ�����еĶϵ�
 *  
 *  
 * �����鿴�Լ����ȼ��Ƿ��ͻ��������keys�Ǹ���������������Զ����ݼ������ܲ����ѳ���������
 * @author www.23.com
 *  
 *  
 * ����
 * �ͻ��������¼��¼
 * http://jingyan.baidu.com/album/f71d603776ae7a1ab641d112.html?picindex=2
 * ����ȼ���Ҫ��
 * http://outofmemory.cn/code-snippet/2721/eclipse-setting-svn-tijiao-kuaijiejian
 */
public class BuChong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
  
		bbb();
		bbb();
		bbb();
		bbb();
		
		
	}
	public static void bbb(){
		System.out.println("");
	      }
}

class pp{
	String name;

	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public pp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
 
}
