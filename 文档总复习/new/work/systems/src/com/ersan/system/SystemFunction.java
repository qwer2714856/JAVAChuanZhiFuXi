/**
 * System 类介绍 -- 系统类 -- 获取系统的属性数据--没有构造方法，都是静态方法。
 * 常用的方法
 * 1.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 *  src - 源数组。
 *	srcPos - 源数组中的起始位置。
 *	dest - 目标数组。
 *	destPos - 目标数据中的起始位置。
 *	length - 要复制的数组元素的数量。
 * 2.currentTimeMillis()  返回以毫秒为单位的当前时间。
 * 3.exit(int status)  终止当前正在运行的 Java 虚拟机。
 * 4.gc()  建议jvm赶紧运行垃圾回收器，但是java虚拟机起不启动不好说，CPU一个时段只能执行一个东西，如果被占就不执行，需要等一下。
 *   当一个对象要被回收的时候会先调用 Object类的finalize() ，其他对象集成它有这个方法
 * 5.getenv() 根据环境变量名字，获取环境变量的 什么都不传全部获取。  
 * 6.getProperties() 确定当前的系统属性,getProperties 全部 getPropertie（获取什么） 获取单个。
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
		//1.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
		/* *  src - 源数组。
		 *	srcPos - 源数组中的起始位置。
		 *	dest - 目标数组。
		 *	destPos - 目标数据中的起始位置。
		 *	length - 要复制的数组元素的数量。*/
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
		
		//exit(int status)  终止当前正在运行的 Java 虚拟机。0正常退出非零非正常退出（异常终止）。无论0和非零都退出，0 或者非零的数据对于使用者没有区别，对操作系统有用，可以得到正常退出或者非正常退出。就像linux执行完一个脚本得到的那个状态。
		/*System.exit(0);*/
		
		//gc()  建议jvm赶紧运行垃圾回收器，但是java虚拟机起不启动不好说，CPU一个时段只能执行一个东西，如果被占就不执行，需要等一下。
		/*for(int i = 0; i < 100; i++){
			new hi();
			System.gc();//这个为什么要放到里面，因为如果放到外边垃圾回收器还没启动程序就结束了，这样每创建一个就回收一个
		}*/
		
		
		//	getenv()  根据环境变量名字，获取环境变量的 什么都不传全部获取。
		/*System.out.println(System.getenv());
		System.out.println(System.getenv("OS"));
		Map al = System.getenv();
		al.get("JAVA_HOME");
		*/
		
		//getProperties() 确定当前的系统属性,getProperties 全部 getPropertie（获取什么） 获取单个。
		/*System.out.println(System.getProperties());	*/
		/*Properties p = System.getProperties();
		p.list(System.out);//System.out 就是 PrintStream	
*/		
		
	}

}
