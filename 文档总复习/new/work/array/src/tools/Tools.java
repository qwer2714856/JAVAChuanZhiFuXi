/**
 * Arrays
 * ����Ĺ�����
 * 1.copyOf()
 * 2.copyOfRange()
 * 3.equals
 * 4.List
 */
package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author www.23.com
 *
 */
public class Tools {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//copyOf
		/*int [] a = {1,2,3,4};
		//origina ԭ���� newLength �����鳤��
		int [] cp  = Arrays.copyOf(a,6);//�����귵��һ�����顣
		System.out.print(Arrays.toString(cp));*/
		
		//copyOfRange ���������һ���� originaԪ���� from�� to �� ����һ������,��������Ǹ�λ�ô���ԭ��������ô��Ĭ�ϵĲ��룬���ᱨ��
		/*int [] a = {1,2,3,4};
		int [] copyOfRange = Arrays.copyOfRange(a, 1, 20);
		System.out.print(Arrays.toString(copyOfRange));*/
		
		//equals�Ƚ���������Ԫ���Ƿ�һ�� ��Ӧλ�õ�
		/*int [] a = {1,2,3,4};
		int [] b = {1,2,3};
		System.out.println(Arrays.equals(a, b));*/
		
		//������伯�� ���ϱ����� -- ���Ϻ������໥ת��
		/*Integer[] a = {1,2,3,4};
		List<Integer> ls = Arrays.asList(a);
		Integer[] b = (Integer[]) ls.toArray();*/
	 
	}

}
