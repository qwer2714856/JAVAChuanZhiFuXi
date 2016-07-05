package fanxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

/**
 * 泛型上下限
 * 泛型中的通配符是?不会单独使用
 * <? super Integer>
 * 这个语法怎么理解？
 * ?不知道存什么类型，他只能存它或它的父类
 * ? super Integer 只能存储 Integer 或者他的父类super是Integer的父类 。
 * 这个是泛型的下限
 * 
 * Collection<? extends Number> m
 * 只能存储?知不知道什么类型 但是 可以是Number 子类 或者是Number。
 * 这个是上限
 * 
 * T<? super Integer> m
 * 自定义泛型不能用这个，这里的这个必须是确切类型T必须确切.
 * 
 * 什么是上下限
 * 上限固定父类到下面
 * 
 * 下限固定子类到上面
 * 
 * 只能存储Integer->下限
 * 只能存储Number->上限
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
	//需求定义一个可以接收任意类型的集合对象，要求接收的集合对象只能存储Integer或者是Integer的父类，泛型下限
	public static void ssl(Collection<? super Integer> m){
		
	}
	//需求定义一个可以接收任意类型的集合对象，要求接收的集合对象只能存储Number或者是Number的子类，泛型上限
	public static void ssl2(Collection<? extends Number> m){
			
	}
	 

}
