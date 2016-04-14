/**
 * 线程
 * 进程，正在运行的应用程序，负责对这个程序进行内存空间的分配，代表内存的执行区域。
 * 线程，就是进程中负责执行一个任务路径。
 * 多线程就是一个进程中有多个同时执行的线程。
 * 例如杀毒软件
 * 杀毒软件是一个进程，当它杀毒和清理垃圾同时执行的时候就是两条线程在同时执行两个不同任务。
 * 
 * 假象
 * 电脑上运行多任务，也就是多个应用程序的时候，其实是cpu（分时机制的作用，使的每个进程都获得自己的cpu时间片）在不停的轮转，由于速度快所以看着像同时进行。
 * 
 * 当有多个任务同时进行的时候,其实就是在同时段抢夺cpu资源，谁抢到谁就执行下，然后在抢。
 * cpu 的分时机制做切换。
 * 
 * 多线程的好处
 * 1.解决了一个进程中可以同时运行多个任务。
 * 2.提高资源利用率，而不是效率。
 * 这句话怎么理解就好比
 * 当前系统只有一个进程A 我完成了进程A CPU就空闲了，运行完的时间还是那个时间。
 * 
 * 当有AB两个进程他们一起抢夺cpu 如果cpu够用那么就会消耗cpu的空闲时间。他们执行效率没有变化还是那么个速度只是cpu利用率上来了。
 * 
 * 多线程的弊端
 * 1.降低了进程里面线程使用cpu的几率，这个很好理解
 * 2.对线程管理需要额外的cpu开销。线程的使用会给系统带来上下文切换的额外负担。
 * 3.共有变量在进行多线程读写的时候有线程安全性问题。
 * 4.线程的死锁，较长时间等待资源，或资源竞争以死锁等多线程症状。
 * 
 * //创建线程的方式一
 * 1.继承Thread类
 * PersonThread extends Thread
 * 重写
 * public void run() {//线程代码}
 * 
 * 调用
 * PersonThread p1 = new PersonThread("A");
 * p1.start();//启动线程 直接就跑run中的代码了。 这里注意必须要调用start才会当做一个线程启动，如果直接使用run jvm就当做普通方法。
 * 线程只能启动一次，如果再次启动抛出异常。
 * 如果没有重写run那就什么都不执行
 * 
 * 
 * 一个线程的状态
 * 
 * ======================================
 * 		↓	←	←（睡眠，阻塞，等待）
 * ======================================
 * 创建->可运行->运行（↑）->死亡
 * ======================================
 * 
 * 线程的状态：
 * 1.创建，创建一个线程对象。
 * 2.可运行，线程对象创建后，其它线程调用了该对象start()之后，该状态的线程位于可运行的线程池中，变的可以运行，等待获取cpu的执行权。
 * 3.运行，就绪状态的线程获取了cpu执行权，执行代码
 * 4.阻塞状态是线程由于某种原因放弃cpu使用权，暂停运行，直接到线程就绪状态，才有机会转到运行状态。
 * 5.死亡线程执行完它的任务。
 * 
 * 常见的线程方法
 * 1.Thread() 			初始化线程名字。 new Thread(Runnable 实现类的对象，"线程名字");
 * 2.getName()			返回线程的名字。
 * 3.setName()			设置线程的名字。
 * 4.getPriority()		返回当前线程的对象优先级，默认线程优先级是5.
 * 5.setPriority(int p) 设计优先级最小1最大10 默认5。
 * 6.currentThread()	返回cpu正在执行的线程对象。 
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class Progress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//匿名内部类的线程方式
		new Thread(){
			public void run(){
				PersonThread p1 = new PersonThread("A");
				PersonThread p2 = new PersonThread("B");
				p1.start();
				p2.start();
			}
		}.start();
	
		 
		
	}

}
class PersonThread extends Thread{
	String name;

	public PersonThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i = 0; i < 1000; i++){
			System.out.println(name+"--"+i);
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

