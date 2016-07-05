/**
 * Arrays
 * 数组的工具类
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
		//origina 原数组 newLength 新数组长度
		int [] cp  = Arrays.copyOf(a,6);//拷贝完返回一个数组。
		System.out.print(Arrays.toString(cp));*/
		
		//copyOfRange 拷贝数组的一部分 origina元素组 from从 to 到 返回一个数组,如果到的那个位置大于原来数组那么用默认的补齐，不会报错
		/*int [] a = {1,2,3,4};
		int [] copyOfRange = Arrays.copyOfRange(a, 1, 20);
		System.out.print(Arrays.toString(copyOfRange));*/
		
		//equals比较两个数组元素是否一致 对应位置的
		/*int [] a = {1,2,3,4};
		int [] b = {1,2,3};
		System.out.println(Arrays.equals(a, b));*/
		
		//将数组变集合 集合变数组 -- 集合和数组相互转换
		/*Integer[] a = {1,2,3,4};
		List<Integer> ls = Arrays.asList(a);
		Integer[] b = (Integer[]) ls.toArray();*/
	 
	}

}
