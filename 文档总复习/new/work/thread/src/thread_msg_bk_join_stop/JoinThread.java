package thread_msg_bk_join_stop;

class A implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("a");
		//加入线程
		B b = new B();
		Thread t = new Thread(b);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("c");
		System.out.println("d");
		System.out.println("e");
	}
	
	
}
class B implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("b");
		System.out.println("b");
		System.out.println("b");
		System.out.println("b");
		System.out.println("b");
		System.out.println("b");
		System.out.println("b");
	}
	
}

public class JoinThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		Thread t = new Thread(a);
		t.start();
	}

}
