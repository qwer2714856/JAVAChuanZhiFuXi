/**
 * 线程通讯
 * 一个线程完成了自己任务时，要通知另外一个线程，去做另一个线程的任务。
 * 经典的例子 生产者与消费者
 * 
 * 
 *                    产品
 *            不断生产                  不断消费           
 *        生产者                                           消费者
 * 这其中有三个实物
 * 产品 （被生产者和消费者所共享）
 * 生产者
 * 消费者
 * 
 * 效果生产一个等待消费者消费，消费者消费完一个等待生产者。生产一个消费一个。 涉及到一个等待的问题。
 * 线程通讯要用到的方法
 * wait(); 等待 -- 如果使用wait线程就会等待，等待下的线程必须被别的线程调用notify()才能唤醒
 * notify(); 唤醒 -- 唤醒等待的线程。
 * 要注意的事项
 * 1.这两个方法是属于Object类的
 * 2.wait() notify() 必须在同步代码块和同步函数中使用
 * 3.wait() 于 notify() 必须要锁对象调用否则也报错
 * 
 * 
 * 剖析 wait 和 notify
 * 
 * wait:
 * 一个线程如果执行了wait方法，该线程就会进入一个以锁对象为标识符的线程池中等待。
 * jvm建立一个线程池，这个线程池是以锁对象为标识符的，一旦执行了wait是会释放那个锁的，也就说将锁对象置为可用状态。
 * 锁对象标识符
 * ------------
 * 线程池	      |
 * ------------
 * 
 * notify:
 * 一个线程执行了notify方法，那么就会唤醒线程池中以锁对象为标识符的线程。
 * 没有线程等待，调用notify是没有任何问题的。
 * 
 * 这里的这个对象
 * p.notify();
 * p.wait();
 * p就是那个对象，以p为标识符…… 锁相同他们才会在一个池子里面。
 * 
 * 锁对象标识符
 * ------------------------
 * 线程池					   |
 * 如果线程池有好多等待状态               |
 * 它只会唤醒其中一个                          |
 * 这个没办法指定			   |
 * 一般是先等待的先唤醒                       |
 * 这个不是百分百的			   |
 *            			   |
 * ------------------------|
 * 
 * 
 * 为什么有注意事项
 * 1这两个方法是属于Object类的？
 * 因为所有的对象都可能被做被锁对象，且因为wait 和 notify需要作用在锁对象上所以需要设计在Object上所有的都继承。
 * 2.wait() notify() 必须在同步代码块和同步函数中使用？
 * 因为没有同步代码块就没有锁这个概念，而这两个需要所对象调用
 * 3.wait() 于 notify() 必须要锁对象调用否则也报错？
 * 因为需要以所对象为标识符建立一个线程池。不用锁对象调用直接报错。
 * 
 * 
 * notifyAll()
 * 唤醒线程池中所有等待的线程
 * 
 * 
 * 线程补充
 * 线程的停止
 * 如何停止个线程
 * 线程对象.stop(); 这个是过时的方法不推荐使用，取代的方法 interrupt但这个无法停止线程
 * 1.while(flg)可以操纵变量来停止线程,如果使用了wait()那么这个也无法关闭。
 * 2.需要唤醒和flg配合使用 也就说先 对象.flg = false;synchronized(对象){对象.notify();}  这个无法指定唤醒哪个。
 * 
 * 线程的任务一般都有循环在，为什么开多线程如果只执行一句话开多线程没意义，任务花费的时间也较长。
 * 
 * 
 * 
 * 唤醒线程的其它方法
 * interrupt  这个方法将临时阻塞状态清掉，拉回到可运行状态。
 * 对象.interrupt() 把线程对象的阻塞状态强制清除。不需要synchronized可以直接用。 这个会有一个异常产生。  这个可以指定唤醒哪个 对象.interrupt()清除
 * 
 * 
 * 
 * 守护线程 后台线程。
 * 什么叫做守护线程
 * 
 * 在一个进程中，如果只剩了守护线程，那么守护线程也将死亡。
 * 也就说主线程挂了守护线程也需要挂。
 * //如何判断是否是守护线程
 * System.out.println(b.isDaemon());
 * b.setDaemon(true);//设置线程为守护线程 true守护  false非守护线程 一个线程默认不是守护线程
 * 
 * join 方法  加入, 在一个线程中加入另一个线程。需呀用到join 加入的先完成才能执行后续的东西
 * 比如讲A线程在第三句话加入其它线程，那么必须要等到插入的线程执行完了才能执行A第三句后续的内容。线程让步。
 * 
 */

package thread;
/**
 * 守护线程
 * @author www.23.com
 *
 */
class backend extends Thread{
	public backend(String name){
		super(name);
	}
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int i = 0;
		while(true){
			if(++i < 100){
				System.out.println("download:"+"%"+i);
			}else{
				System.out.println("install");
				break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/**
 * join
 * @author www.23.com
 *
 */
class ThreadJoin extends Thread{
	public void run(){
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		//加入ThreadJoin2
		ThreadJoin2 t2 = new ThreadJoin2();
		t2.start();
		try {
			t2.join(); //加入的意思
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("d");
		System.out.println("e");
	}
}
class ThreadJoin2 extends Thread{
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("f");
		System.out.println("g");
		System.out.println("h");
		System.out.println("i");
		System.out.println("k");
	}
}





class product{
	String name;
	double pic;
	boolean flg = false;
}

class producter extends Thread{
	product p;
	public producter(String name, product p){
		super(name);
		this.p = p;
	}
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		//不断的生产产品
		int i = 0;
		while(true){
			synchronized(p){
				if(!p.flg){
					if(i%2 == 0){
						p.name = "苹果";
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						p.pic = 6.5;
					}else{
						p.name = "香蕉";
						p.pic = 8.5;
					}
					i++;
					System.out.println(Thread.currentThread().getName() + p.name + "多钱？=" + p.pic);
					p.flg = true;
					p.notify();
				}else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	}
	
}

class people  extends Thread {
	product p;
	public people(String name, product p){
		super(name);
		this.p = p;
	}
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		//不断的消费
		while(true){
			synchronized(p){
				if(p.flg){
					System.out.println(Thread.currentThread().getName() + p.name + "多钱？=" + p.pic);
					p.flg = false;
					p.notify();
				}else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class ThreadMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*product p = new product();
		producter pd = new producter("生产者", p);
		pd.start();
		people pp = new people("消费者", p);
		pp.start();*/
		
		//守护线程
		/*backend b = new backend("download");
		b.setDaemon(true);//设置线程为守护线程 true守护  false非守护线程 一个线程默认不是守护线程
		//如何判断是否是守护线程
		System.out.println(b.isDaemon());
		b.start();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}*/
		//可以看出主线挂了那么守护线程也挂了。它会随着主线的消失而消失。
		
		
		
		//join
		ThreadJoin ThreadJoin_ = new ThreadJoin();
		ThreadJoin_.start();
		
	}

}
