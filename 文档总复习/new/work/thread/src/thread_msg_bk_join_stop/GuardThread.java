package thread_msg_bk_join_stop;

class Guard implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("guard");
		}
	}
	
}


public class GuardThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guard g = new Guard();
		Thread t = new Thread(g,"guard");
		t.setDaemon(true);
		t.start();
		//t.isDaemon();
		for(int i = 0; i < 100; i++){
			System.out.println(i);
		}
	}

}
