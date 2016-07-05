package thread_msg_bk_join_stop;

class stopThreads implements Runnable{
	boolean flg = true;
	public synchronized void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(flg){
			System.out.println(++i);
		}
	}
}



public class StopThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stopThreads s = new stopThreads();
		Thread t = new Thread(s,"group1");
		t.start();
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName()+i);
			if(i == 80){
				//方式一
				s.flg = false;
				synchronized(s){
					s.notify();
				}
				//方式二
				/*t.stop();*/
				//方式三
				/*s.flg = false;
				try {
					t.interrupt();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}
	}

}
