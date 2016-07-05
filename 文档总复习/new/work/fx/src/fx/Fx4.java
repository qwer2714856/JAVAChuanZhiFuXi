/**
 * 集合 线程 复习
 */
package fx;

/**
 * @author www.23.com
 * 
 */
public class Fx4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 多线程存在的意义：让多个任务同时进行。解决了一个进程允许多个任务同时进行。
		// 多线程的创建方式 2种方式
		// 1 这个类的 extends Thread new 这个类的().start();
		// 2 implements Runnable new 这个类 () 然后创建Thread th = new
		// Thread(这个类,"进程名字").start();
		// 都要重写run 方法 线程任务代码放这

		new ThreadA().start();
		new Thread(new ThreadB(), "ThreadB").start();
		
		//线程安全
		//同步代码块 synchronized("锁"){需要被同步的代码} 这里的这个所对象可以是任意对象，最简单的是字符串，因为字符串在字符池中这个对象不会改变，这个锁的对象要一直保持是同一个对象 多线程共享资源的时候用个，没有线程安全不用锁，因为会导致效率低。
		//掉用sleep 方法不会释放锁对象，但是调用wait方法就会释放锁对象。	
		//出现线程安全根本原因，存在2个或两个以上共享资源，操作资源代码必须有多句。
		
		//同步函数 public synchronized void  run()
		//同步函数的锁对象 无法改变，非静态方法的锁对象是this，静态方法的锁对象是当前字节码对象。
		
	}

}

class ThreadA extends Thread {
	public synchronized void  run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}

class ThreadB implements Runnable {
	public void run() {
		synchronized ("") {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + i);
			}
		}
	}
}