package fanxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

/**
 * ����������
 * �����е�ͨ�����?���ᵥ��ʹ��
 * <? super Integer>
 * ����﷨��ô��⣿
 * ?��֪����ʲô���ͣ���ֻ�ܴ��������ĸ���
 * ? super Integer ֻ�ܴ洢 Integer �������ĸ���super��Integer�ĸ��� ��
 * ����Ƿ��͵�����
 * 
 * Collection<? extends Number> m
 * ֻ�ܴ洢?֪��֪��ʲô���� ���� ������Number ���� ������Number��
 * ���������
 * 
 * T<? super Integer> m
 * �Զ��巺�Ͳ������������������������ȷ������T����ȷ��.
 * 
 * ʲô��������
 * ���޹̶����ൽ����
 * 
 * ���޹̶����ൽ����
 * 
 * ֻ�ܴ洢Integer->����
 * ֻ�ܴ洢Number->����
 * 
 * @author www.23.com
 *
 */
public class FanXingUpDown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ssl2(new ArrayList<Number>());
	}
	//������һ�����Խ����������͵ļ��϶���Ҫ����յļ��϶���ֻ�ܴ洢Integer������Integer�ĸ��࣬��������
	public static void ssl(Collection<? super Integer> m){
		
	}
	//������һ�����Խ����������͵ļ��϶���Ҫ����յļ��϶���ֻ�ܴ洢Number������Number�����࣬��������
	public static void ssl2(Collection<? extends Number> m){
			
	}
	 

}
