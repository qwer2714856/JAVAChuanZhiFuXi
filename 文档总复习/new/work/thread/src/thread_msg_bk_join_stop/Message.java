package thread_msg_bk_join_stop;

/**
 * 杯子
 * @author www.23.com
 * 
 */
class Cup{
	int capacity = 0;
	final int max = 50;
	final int min = 0;
}
/**
 * 进水
 * @author www.23.com
 *
 */
class InCup implements Runnable{
	Cup p; 
	final int step = 5;
	public InCup(Cup p){
		this.p = p;
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(p){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(p.capacity < p.max){
					p.capacity += step;
					System.out.println(Thread.currentThread().getName() + "水量" + p.capacity);
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
/**
 * 出水
 * @author www.23.com
 *
 */
class OutCup implements Runnable{
	Cup p; 
	final int step = 2;
	public OutCup(Cup p){
		this.p = p;
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(p){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(p.capacity > p.min){
					p.capacity -= step;
					System.out.println(Thread.currentThread().getName() + "水量" + p.capacity);
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

public class Message {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup cp = new Cup();
		
		InCup in = new InCup(cp);
		Thread t = new Thread(in,"进水");
		t.start();
		
		OutCup ot = new OutCup(cp);
		Thread t2 = new Thread(ot,"出水");
		t2.start();
		
	}

}
