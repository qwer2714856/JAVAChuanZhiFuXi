/**
 * Runtime
 * 该类代表了应用程序的运行环境，一个应用程序只有一个运行环境（单例设计模式）
 * 1.getRuntime() 返回与当前 Java 应用程序相关的运行时对象。（相关的运行环境）
 * 2.exec(String command)  传入相应用的路径，就会启动起来。 返回值是当前的进程，可以拿到这个进程杀死这个进程,返回的是Process process。
 * 3.Process 类的 destroy()  杀掉子进程。
 * 4.freeMemory()  返回 Java 虚拟机中的空闲内存量，字节为单位。
 * 5.maxMemory()  返回 Java 虚拟机试图使用的最大内存量，字节为单位，jdk7.0以前最大64m。
 * 6.totalMemory()  返回 Java 虚拟机中的内存总量。
 * maxMemory（想要的） > totalMemory（实际的） 量
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
			//传入相应用的路径，就会启动起来。 
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
		
		//freeMemory() 返回 Java 虚拟机中的空闲内存量。
		//System.out.println(Runtime.getRuntime().freeMemory()/(1024*1024));
		
		//maxMemory()  返回 Java 虚拟机试图使用的最大内存量，字节为单位，jdk7.0以前最大64m，后期也优化（当一启动的时候不管要这么多10几m，当真正用的时候在创建像StringBuffer管理模式一样）。
		/*System.out.println(Runtime.getRuntime().maxMemory()/(1024*1024));*/
		
		//totalMemory()  返回 Java 虚拟机中的内存总量。
		/*System.out.println(Runtime.getRuntime().totalMemory());*/
		
		
	}

}
