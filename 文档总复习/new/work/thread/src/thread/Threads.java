/**
 * 多线程 Thread java.lang
 * 概念
 * 进程，正在【运行】的程序。（有独立的内存空间）
 * 进程启动，进程负责内存空间的分配，向系统申请空间是进程的责任。
 * 多任务的解析
 *     宏观的解析确实是在运行多个应用程序
 *     微观（单核cpu在一个时间片只能运行一个应用程序--这个就是个轮训机制，一会执行A一会执行B来回切换，由于速度太快所以感觉不到在切换而已。本质单个单个做。只不过轮训而已，进程进程在做资源争夺。）
 * 线程（没有独立的内存空间）
 * 进程里面有很多代码，这些代码是由线程负责执行的，线程在一个进程中负责代码的执行。
 * 多线程 两部分代码同时执行，这么理解，一个应用程序中有杀毒和清理垃圾，当需要同时执行时就相当于开启了两条线程在执行。如果单线程需要一个执行完在执行另一个。！！！同个进程执行多个任务！！！
 * question
 * 1.线程负责了代码的执行。我们之前没学过线程为什么代码可以执行？
 * 答：任何一个java代码，jvm在运行的时候都会创建一个（主线程）main线程执行main方法的所有代码。
 * 2.一个java应用程序至少有几个线程？
 * 一个main线程一个垃圾回收器进程，至少有2个线程的
 * 3.多线程真的是同时执行吗？
 * 也不是的，靠轮训，抢夺cpu的资源和进程一样都是抢资源，与其说进程争夺cpu还不如说线程在争夺，进程就是个申请内存分配内存的。
 * 4.多线程好处
 * 一个进程，同一个时间段，可以处理多任务代码。效率没有提高（总资源已经定死），提高了资源的利用率（空闲的可以被分配出去）。
 * 5.多线程的弊端
 * 加重了cpu的负担了
 * 多个线程存在降低一个进程中，线程执行的概率，例如有4个线程cpu切换来每个线程执行概率是25%
 * !!会引发线程安全问题
 * !!出现了死锁现象
 * 
 * 
 * 如何创建多线程 --Thread java.lang
 * 2种创建方式
 * 1.
 * 
 *   class PrimeThread extends Thread {
         long minPrime;
         PrimeThread(long minPrime) {
             this.minPrime = minPrime;
         }
 
         public void run() {
             // compute primes larger than minPrime
              . . .
         }
     }
     
     PrimeThread p = new PrimeThread();
     p.start();
     
 * 
 * 2.在test.java里面有体现,QqThread综合  采用实现接口的方式
 * 
 * 
 * cpu的等待资格
 * cpu在切换时候程序有等待的资格，只有有这个资格cpu才会轮序到你，有被cpu访问的资格。
 * 
 * cpu的执行权
 * cpu正在执行你线程的代码，你这个线程有cpu执行权。
 * 
 * 生命周期 
 * 什么称作生命周期
 * 线程的生命周期是什么！！！
 * 一个线程一旦被new了出来以后 (创建状态，创建状态下的什么资格都没有，等待和执行（资格）)(继承或者是实现线程类或接口的类被创建出来就是线程的被创建)->
 * 创建状态下的线程调用了start方法，这个线程进入（可运行状态--具备cpu等待资格）->(一旦得到cpu 执行权就可以到运行状态也可以有cpu等待资格)->当run方法代码完成就死掉了（没有了cpu等待与执行权）。
 * 可运行状态和运行状态是可以相互抢夺的，被抢了就可运行状态。
 * 
 * 运行状态下的线程->临时阻塞状态（运行状态的线程执行了 sleep 或 wait 就临时阻塞了）
 * sleep 超过了指定时间就会重新进入可运行状态(否则一直处于休眠状态也就阻塞状态)（睡多久）（这个像创建状态，什么都没有）
 * wait 进入了临时阻塞状态需要其它线程唤醒该线程，才能进入可运行状态。
 * 
 * 
 * 线程常用的一些方法
 * Thread(String name)构造方法
 * 线程.getName(); 获取线程的名字
 * 线程.setName(); 设置线程的名字
 * Thread.sleep();睡眠需要try catch 哪个线程执行了sleep哪个线程就会休眠，这个是个静态方法，如果这个是在主方法执行主方法就会休眠，这个只能捕获，不能抛出，因为父类没有抛出子类不能抛出只能捕获。
 * Thread.currentThread() 返回当前线程对象，是个静态方法。哪个线程执行了这个静态方法就会返回这个线程的对象。
 * getPriority() 或当前线程的优先级 默认线程平分，优先级越大执行越高。
 * setPriority() 优先级数字越大优先级越高。优先级的范围是1-10之间 10是最大的,这个是概率的问题不代表一定的问题。
 * 
 * 
 * 线程安全性问题
 * 方式一 买票  buy.java
 * 方式2 SyncFunction.java
 * 
 * 
 * 
 * 关于创建线程的几个问题
 * 使用方式二创建的线程就是Runnable的那个
 * 1.实现了Runnable 的类创建对象是线程对象吗？
 * 不是的这个和普通类无区别，只有Thread和Thread的子类创建的才是线程对象，因为线程对象它必须有start可以开启一个线程的。
 * 2.为什么把Runnable 实现类的对象作为实参传给Thread
 * 他需要运行Runnable实现类对象的run方法
 * 
 * 
 * 
 * runnableClass a = new runnableClass();
 * new Thread(a,"").start();
 * 
 * class runnableClass implements Runnable{
 *     public void run(){
 *         this != Thread.currentThread()
 *         
 *         this//代表的是a
 *         二Thread.currentThread()代表的是那个 new Thread 线程
 *         
 *     }
 * }
 */

package thread;

/**
 * @author www.23.com
 *
 */
public class Threads extends Thread  {
	public Threads(){
		super("线程名字");
	}
	/**
	 * @param args
	 */
	//主线程main线程执行的
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方式一 
		/*
		1.继承一下Thread这个类  public class Threads extends Thread 
		2.子类重写Thread类的run方法 类中右键source->override implements选择需要重写的方法
		3.创建thread的子类对象，并且使用start开启，run方法不能直接调用，直接调用就相当于调用了一个普通方法而已，并没有开启新的线程，线程开启就执行run方法。
		3.每个线程都有自己的任务代码
		4.run就是用来放置任务代码
		5.java虚拟主线程任务代码就是main里面的代码
		6.自定义线程负责run中的代码
		*/
		
		//=============方式一
		Threads t = new Threads();
		//t.run();//这就相当于执行个普通方法，没有让线程开工
		t.start();//这样就是自动调用了 run方法开启了线程
		//=============方式二 test 里面体现了
		
		
		for(int i = 0; i < 100; i++){
			System.out.println("主线程"+i);
		}
		
		/*try {//主线程在休眠
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Thread tx = Thread.currentThread();
		System.out.println(tx.getName());
		System.out.println(Thread.currentThread().getPriority());
	}
    //重写的目的为了把，自定义线程的任务定义在run方法中。
	public void run() {//重写他的目的
		//这里的Thread.currentThread()当前的线程对象 和 this当前对象 当前线程对象和现在的对象是一个东西 一样
		// TODO Auto-generated method stub
		super.run();//这个必须调用
		// 多线程的代码放这
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i = 0; i < 100; i++){
			System.out.println("子线程"+i);
			System.out.println(this.getName());
			System.out.println(Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
