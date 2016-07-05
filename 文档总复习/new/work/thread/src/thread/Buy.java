/**
 * 卖票系统
 */
package thread;

/**
 * @author www.23.com
 * 什么情况会出现线程安全问题
 * 1.存在2个或2个以上的线程对象。
 * &&
 * 2.多线程共享着一个数据。
 * 
 * 如何解决线程安全问题
 * sun 提供了线程同步机制，解决这个问题。
 * 要注意的事项，锁对象可以是任意的一个对象
 * 方式有2种
 * 1.可以是同步代码块
 *    synchronized(锁对象){
 *        需要被同步代码
 *    }
 * 2.同步函数 public static synchronized m(){}
 * 
 * !!!!!!!synchronized(object)!!!!!!!!!!!!!
 * 这里的这把锁默认是打开的进去后就关上，执行完在开开
 * 这里这个锁一定要狠注意否则会出现一些乱起八糟问题，这个锁一定是个定值，它否则一直看着这个锁的状态所以囊如果用new Object this 这些都不合适原因很简单，
 * 相当于不停的在换看管员而看管员之间没有交流所以锁就锁不住了，一定注意这个是要一开始就定义好的而且不能换它.注意这个很关键千万不能错了
 * !!!static Object object = new Object();!!!
 */
public class Buy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaiPiao tt = new MaiPiao();
		MaiPiao tt2 = new MaiPiao();
		MaiPiao tt3 = new MaiPiao();
		MaiPiao tt4 = new MaiPiao();
		new Thread(tt,"A").start();
		new Thread(tt2,"B").start();
		new Thread(tt3,"C").start();
		new Thread(tt4,"D").start();
		
		//这里应该只创建一个对象然后创建多个线程就行 上面这样写是不对的，但是可以实现，这就是为什么没删掉要知道那么些事对的
		/*
		MaiPiao tt = new MaiPiao();
		new Thread(tt,"A").start();
		new Thread(tt,"B").start();
		new Thread(tt,"C").start();
		new Thread(tt,"D").start();
		static int num = 5000;
		改为
		int num = 5000;
		这个是因为多个线程共享一个实现Runnable类的对象
		synchronized(object)
		改为 synchronized(this) 这个是因为多个线程共享一个实现Runnable类的对象
		
		*/
	}

}


class MaiPiao implements Runnable{
	static int num = 5000;
	static Object object = new Object();
	//为什么100张票 有的会出现多次卖出。		
	//线程安全问题
	//如何解决线程安全问题
	
	public void run() {
		// TODO Auto-generated method stu
		//同步代码块
		
		while(true){
			//真正存在线程安全问题，才使用，否则会降低效率的。怎么知道需要加，只要满足 多线程，共享数据就需要安全设置。
			//这里可以用字符串当锁，应为直接去常量池中去所以可以。
			//object 可以等于 ""
			synchronized(object){//java 任何对象都有锁的状态的。 在同步代码块种调用了sleep并不会调用这个锁方法。 这里不能用 new Object()原因很简单，这个锁相当于每次都换，所以根本记录不住那个锁状态。
			//synchronized("锁") 这里直接写个"锁"				
				if(num>0){
					System.out.println(Thread.currentThread().getName()+':'+num);
					num--;
				}else{
					break;
				}
			}
		}
		 
	}
	
}
