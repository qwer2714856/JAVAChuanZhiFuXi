package thread;

public class QqThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������main���߳�
		//��ʽһ �������ʽ
		video v = new video();
		new Thread(v).start();
		
		//��ʽ��
		talkAbout tb = new talkAbout();
		tb.start();
	}

}


//��ʽһ
class video implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i < 100; i++){
			System.out.println("��ʼ��Ƶ"+i);
		}
	}
	
}
//��ʽ��
class talkAbout extends Thread{

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0 ; i < 100; i++){
			System.out.println("��ʼ����"+i);
		}
	}
	
}