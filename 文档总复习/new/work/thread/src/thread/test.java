package thread;

public class test implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		new Thread(t).start();
		for(int i = 0; i < 100; i++){
			System.out.println("主线程"+i);
		}
	}

	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++){
			System.out.println("子线程"+i);
		}
	}
	
}
