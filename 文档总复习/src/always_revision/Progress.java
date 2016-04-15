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
 * 7.getId()			获取线程id 没有setId()
 * 
 * 
 * extends Thread 的类叫做线程对象 可以直接用this.getName setName getPriority setPriority
 * 线程对象中this == Thread.currentThread()
 * 这些方法都是父类Thread的方法所以可以直接用super.getName ....
 * 
 * implements Runnable 的只是实现了接口的类不是线程对象，它无法直接用this.  它只能从 Thread.currentThread() 获取set get .
 * 
 * 创建线程的第二种方法
 * 使用Runnable 接口
 * 该类中的代码就是线程要执行的任务定义。
 * 1.定义实现Runnable 接口
 * 2.重写Runnable接口run方法，就是将线程代码放到run里面去。
 * 3.通过Thread类建立线程对象。
 * 4.将Runnable接口的子类做为实际参数，传递给Thread的构造方法。
 * 5.调用Thread类的start()方法启动线程，将自动调用Runnable实现类的run方法。
 * 6.为什么要传Runnable 实现类对象，因为需要Runnable 实现类对象的run方法，调用start() 自动调用Runnable实现类对象的run方法.
 * 
 * Runnable Sale 注意如果是实现接口的类，那么多个线程会共享一个接口实现对象。
 * 所以以此为例做一个售票，注意票数就不需要在变为静态了，因为多个线程共享一个对象。
 * int num = 100;// 注意将来线程会共享这一个对象，所以他不需要在去声明静态的成员，当然声明也没错，只是为了更好理解，线程共享对象。
 * SaleRunnable
 * 
 * 锁对象
 * 什么是锁对象？
 * 每个java对象都有一个锁对象，而且只有一把钥匙。
 * 如何创建锁对象？
 * 1.使用对象直接做为锁 例如 Object p1 = new Object(); this "lock" 等等，但是如果是Object p1 = new Object();这个注意
 * 要保持多个线程共享一个锁，要不没用！！！！ this 的话对接口实现的有用，对继承实现的没有，原因接口实现的共享一个对象，
 * 继承的创建多个对象this也就不同，最好就是使用字符串，因为直接字符串在线程池只有一份！！！推荐使用。
 * 
 * 
 * 2. 使用类的字节码作为锁
 * 类.class
 * 类的实例.getClass()
 * 
 * Java 中的每一个对象都有一个内置的锁，只有当对象具有同步方法代码时，内置锁才会起作用。
 * 
 * 因为一个对象只有一把锁，所以如果一个线程获得了这个锁，其它线程就不能获得了，直到拿到锁这个线程释放这个锁其它的线程才能使用，
 * 也就说释放前任何线程都不能进入到线程代码块种执行。
 * 
 * 释放锁就是指只有该锁的线程退出同步方法。
 * 
 * 锁只能锁住两个东西
 * 1.线程共同的代码块。synchronized("lock"){}
 * 2.锁住线程函数。public static synchronized int setName(String name){Xxx.name = name;}
 * 	 如果是非静态同步函数的锁是this
           如果是静态的同步函数锁是就是当前函数所属类的字节码文件，就是Class对象，所对象是唯一的。
 * 
 * 
 * 
	关于锁和同步，有一下几个要点：
	1）、只能同步方法，而不能同步变量和类；
	2）、每个对象只有一个锁；当提到同步时，应该清楚在什么上同步？也就是说，在哪个对象上同步？
	3）、不必同步类中所有的方法，类可以同时拥有同步和非同步方法。
	4）、如果两个线程要执行一个类中的synchronized方法，并且两个线程使用相同的实例来调用方法，那么一次只能有一个线程能够执行方法，另一个需要等待，直到锁被释放。也就是说：如果一个线程在对象上获得一个锁，就没有任何其他线程可以进入（该对象的）类中的任何一个同步方法。
	5）、如果线程拥有同步和非同步方法，则非同步方法可以被多个线程自由访问而不受锁的限制。
	6）、线程睡眠时，它所持的任何锁都不会释放。
	7）、线程可以获得多个锁。比如，在一个对象的同步方法里面调用另外一个对象的同步方法，则获取了两个对象的同步锁。
	8）、同步损害并发性，应该尽可能缩小同步范围。同步不但可以同步整个方法，还可以同步方法中一部分代码块。
	9）、在使用同步代码块时候，应该指定在哪个对象上同步，也就是说要获取哪个对象的锁。例如：
 * 
 * 
 * 
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
		/*new Thread(){
			public void run(){
				PersonThread p1 = new PersonThread("A");
				PersonThread p2 = new PersonThread("B");
				p1.start();
				p2.start();
			}
		}.start();
		 */
		/*ThreadDeom t1 = new ThreadDeom("t1");
		ThreadDeom t2 = new ThreadDeom("t2");
		t1.setName("kakaxi1");
		t2.setName("卡卡西2");
		t1.setPriority(1);
		t2.setPriority(8);
		t1.start();
		t2.start();*/
		
		/*System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);*/
		
		/*new Thread(new  rt(),"t").start();*/
		
		//售票系统
		/*Sale s1 = new Sale("窗口1");
		Sale s2 = new Sale("窗口2");
		
		s1.start();
		s2.start();*/
		
		
		//接口版售票
		/*SaleRunnable sr = new SaleRunnable();
		Thread th1 = new Thread(sr,"售票窗口1");
		Thread th2 = new Thread(sr,"售票窗口2");
		
		th1.start();
		th2.start();*/
		
		
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

class ThreadDeom extends Thread{
	public ThreadDeom(String ThreadName){
		super(ThreadName);
	}
	public void run(){
		String tn = Thread.currentThread().getName();
		for(int i = 0; i < 100; i++){
			System.out.println(tn+":"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class rt implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tn = Thread.currentThread().getName();
		for(int i = 0; i < 100; i++){
			System.out.println(tn+":"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


class Sale extends Thread {
	public Sale(String name) {
		super(name);
	}

	static int num = 100;

	public void run() {
		while (true) {
			synchronized ("lock") {
				if (Sale.num > 0) {
					System.out.println(this.getName() + "：" + "售出1张，剩余"
							+ --Sale.num);
				} else {
					break;
				}
			}
		}
	}
}

/**
* Runnable Sale 注意如果是实现接口的类，那么多个线程会共享一个接口实现对象。
* 所以以此为例做一个售票，注意票数就不需要在变为静态了，因为多个线程共享一个对象。
*/
class SaleRunnable implements Runnable {
	int num = 100;// 注意将来线程会共享这一个对象，所以他不需要在去声明静态的成员，当然声明也没错，只是为了更好理解，线程共享对象。

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized ("lock2") {
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() + "："
							+ "售出1张，剩余" + --num);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					System.out.println(Thread.currentThread().getName() + ": 售罄");
					break;
				}
			}
		}
	}

}