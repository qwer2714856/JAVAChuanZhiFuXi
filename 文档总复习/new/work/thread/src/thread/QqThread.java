package thread;

public class QqThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//虚拟机启动的main主线程
		//方式一 用这个方式
		video v = new video();
		new Thread(v).start();
		
		//方式二
		talkAbout tb = new talkAbout();
		tb.start();
	}

}


//方式一
class video implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i < 100; i++){
			System.out.println("开始视频"+i);
		}
	}
	
}
//方式二
class talkAbout extends Thread{

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0 ; i < 100; i++){
			System.out.println("开始聊天"+i);
		}
	}
	
}