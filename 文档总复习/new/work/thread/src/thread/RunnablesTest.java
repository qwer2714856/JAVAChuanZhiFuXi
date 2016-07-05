package thread;

class sale implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		synchronized("lock"){
			for(int i=0; i<10; i++){
				System.out.println(Thread.currentThread().getName() + i);
			}
		}
	}
	
}

public class RunnablesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sale s = new sale();
		new Thread(s,"test").start();
		
	}

}
