package thread;
class t extends Thread{
	static int i = 50;
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this){
			while(true){
				if(i > 0){
					System.out.println(i);
					--i;
				}else{
					break;
				}
			}
		}
	}
	
}
public class testBuy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t t1 = new t();
		t t2 = new t();
		t1.start();
		t2.start();
	}

}
