package thread;

/**
 * 生产和消费一个产品
 * @author www.23.com
 *
 */
/**
 * 产品
 * @author www.23.com
 *
 */
class products{
	String name;
	double pic;
	boolean isSale;
}
class productser extends Thread{
	products p;
	public productser(String threadName, products p){
		super(threadName);
		this.p = p;
	}

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int i = 0;
		while(true){
			synchronized(p){
				if(!p.isSale){
					if(i%2 == 0){
						p.name = "苹果";
						p.pic = 6.5;
					}else{
						p.name = "香蕉";
						p.pic = 2.5;
					}
					i++;
					System.out.println(Thread.currentThread().getName() + p.name + p.pic);
					p.isSale = true;
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


class peoples extends Thread{
	products p;
	public peoples(String threadName, products p){
		super(threadName);
		this.p = p;
	}
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
			synchronized(p){
				if(p.isSale){
					System.out.println(Thread.currentThread().getName() + p.name + p.pic);
					p.isSale = false;
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


public class TestThreadMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		products o = new products();
		productser a = new productser("生产者",o);
		peoples b = new peoples("消费者",o);
		a.start();
		b.start();
	}

}
