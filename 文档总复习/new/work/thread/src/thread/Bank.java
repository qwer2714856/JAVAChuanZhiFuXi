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
					if(Thread.currentThread().getName().equals("����")){
						this.getMenoy[0] += avg;
					}else{
						this.getMenoy[1] += avg;
					}
					menoy -= avg;
					System.out.println(Thread.currentThread().getName()+"ȡ1000ʣ�ࣺ"+menoy);
				}else{
					if(msg == ""){
						if(this.getMenoy[0] > this.getMenoy[1]){
							msg = "�Ϲ�ʤ";
						}else{
							msg = "����ʤ";
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
		new Thread(lg,"�Ϲ�").start();
		new Thread(lp,"����").start();
	}

}
