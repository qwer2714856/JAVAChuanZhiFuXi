package thread;

class GotBank implements Runnable{
	static int menoy = 30000000;
	static int avg = 1000;
	static int[] getMenoy = {0,0};
	static String msg = "";
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized("lock"){
				if(menoy > 0){
					if(Thread.currentThread().getName().equals("老婆")){
						this.getMenoy[0] += avg;
					}else{
						this.getMenoy[1] += avg;
					}
					menoy -= avg;
					System.out.println(Thread.currentThread().getName()+"取1000剩余："+menoy);
				}else{
					if(msg == ""){
						if(this.getMenoy[0] > this.getMenoy[1]){
							msg = "老公胜";
						}else{
							msg = "老婆胜";
						}
						System.out.println(msg);
					}
					break;	
				}
			}
		}
	}
	
}




public class Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GotBank lg = new GotBank();
		GotBank lp = new GotBank();
		new Thread(lg,"老公").start();
		new Thread(lp,"老婆").start();
	}

}
