/**
 * �߳�ͨѶ
 * һ���߳�������Լ�����ʱ��Ҫ֪ͨ����һ���̣߳�ȥ����һ���̵߳�����
 * ��������� ��������������
 * 
 * 
 *                    ��Ʒ
 *            ��������                  ��������           
 *        ������                                           ������
 * ������������ʵ��
 * ��Ʒ ���������ߺ�������������
 * ������
 * ������
 * 
 * Ч������һ���ȴ����������ѣ�������������һ���ȴ������ߡ�����һ������һ���� �漰��һ���ȴ������⡣
 * �߳�ͨѶҪ�õ��ķ���
 * wait(); �ȴ� -- ���ʹ��wait�߳̾ͻ�ȴ����ȴ��µ��̱߳��뱻����̵߳���notify()���ܻ���
 * notify(); ���� -- ���ѵȴ����̡߳�
 * Ҫע�������
 * 1.����������������Object���
 * 2.wait() notify() ������ͬ��������ͬ��������ʹ��
 * 3.wait() �� notify() ����Ҫ��������÷���Ҳ����
 * 
 * 
 * ���� wait �� notify
 * 
 * wait:
 * һ���߳����ִ����wait���������߳̾ͻ����һ����������Ϊ��ʶ�����̳߳��еȴ���
 * jvm����һ���̳߳أ�����̳߳�����������Ϊ��ʶ���ģ�һ��ִ����wait�ǻ��ͷ��Ǹ����ģ�Ҳ��˵����������Ϊ����״̬��
 * �������ʶ��
 * ------------
 * �̳߳�	      |
 * ------------
 * 
 * notify:
 * һ���߳�ִ����notify��������ô�ͻỽ���̳߳�����������Ϊ��ʶ�����̡߳�
 * û���̵߳ȴ�������notify��û���κ�����ġ�
 * 
 * ������������
 * p.notify();
 * p.wait();
 * p�����Ǹ�������pΪ��ʶ������ ����ͬ���ǲŻ���һ���������档
 * 
 * �������ʶ��
 * ------------------------
 * �̳߳�					   |
 * ����̳߳��кö�ȴ�״̬               |
 * ��ֻ�ỽ������һ��                          |
 * ���û�취ָ��			   |
 * һ�����ȵȴ����Ȼ���                       |
 * ������ǰٷְٵ�			   |
 *            			   |
 * ------------------------|
 * 
 * 
 * Ϊʲô��ע������
 * 1����������������Object��ģ�
 * ��Ϊ���еĶ��󶼿��ܱ���������������Ϊwait �� notify��Ҫ��������������������Ҫ�����Object�����еĶ��̳С�
 * 2.wait() notify() ������ͬ��������ͬ��������ʹ�ã�
 * ��Ϊû��ͬ��������û��������������������Ҫ���������
 * 3.wait() �� notify() ����Ҫ��������÷���Ҳ����
 * ��Ϊ��Ҫ��������Ϊ��ʶ������һ���̳߳ء��������������ֱ�ӱ���
 * 
 * 
 * notifyAll()
 * �����̳߳������еȴ����߳�
 * 
 * 
 * �̲߳���
 * �̵߳�ֹͣ
 * ���ֹͣ���߳�
 * �̶߳���.stop(); ����ǹ�ʱ�ķ������Ƽ�ʹ�ã�ȡ���ķ��� interrupt������޷�ֹͣ�߳�
 * 1.while(flg)���Բ��ݱ�����ֹͣ�߳�,���ʹ����wait()��ô���Ҳ�޷��رա�
 * 2.��Ҫ���Ѻ�flg���ʹ�� Ҳ��˵�� ����.flg = false;synchronized(����){����.notify();}  ����޷�ָ�������ĸ���
 * 
 * �̵߳�����һ�㶼��ѭ���ڣ�Ϊʲô�����߳����ִֻ��һ�仰�����߳�û���壬���񻨷ѵ�ʱ��Ҳ�ϳ���
 * 
 * 
 * 
 * �����̵߳���������
 * interrupt  �����������ʱ����״̬��������ص�������״̬��
 * ����.interrupt() ���̶߳��������״̬ǿ�����������Ҫsynchronized����ֱ���á� �������һ���쳣������  �������ָ�������ĸ� ����.interrupt()���
 * 
 * 
 * 
 * �ػ��߳� ��̨�̡߳�
 * ʲô�����ػ��߳�
 * 
 * ��һ�������У����ֻʣ���ػ��̣߳���ô�ػ��߳�Ҳ��������
 * Ҳ��˵���̹߳����ػ��߳�Ҳ��Ҫ�ҡ�
 * //����ж��Ƿ����ػ��߳�
 * System.out.println(b.isDaemon());
 * b.setDaemon(true);//�����߳�Ϊ�ػ��߳� true�ػ�  false���ػ��߳� һ���߳�Ĭ�ϲ����ػ��߳�
 * 
 * join ����  ����, ��һ���߳��м�����һ���̡߳���ѽ�õ�join ���������ɲ���ִ�к����Ķ���
 * ���署A�߳��ڵ����仰���������̣߳���ô����Ҫ�ȵ�������߳�ִ�����˲���ִ��A��������������ݡ��߳��ò���
 * 
 */

package thread;
/**
 * �ػ��߳�
 * @author www.23.com
 *
 */
class backend extends Thread{
	public backend(String name){
		super(name);
	}
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int i = 0;
		while(true){
			if(++i < 100){
				System.out.println("download:"+"%"+i);
			}else{
				System.out.println("install");
				break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/**
 * join
 * @author www.23.com
 *
 */
class ThreadJoin extends Thread{
	public void run(){
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		//����ThreadJoin2
		ThreadJoin2 t2 = new ThreadJoin2();
		t2.start();
		try {
			t2.join(); //�������˼
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("d");
		System.out.println("e");
	}
}
class ThreadJoin2 extends Thread{
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("f");
		System.out.println("g");
		System.out.println("h");
		System.out.println("i");
		System.out.println("k");
	}
}





class product{
	String name;
	double pic;
	boolean flg = false;
}

class producter extends Thread{
	product p;
	public producter(String name, product p){
		super(name);
		this.p = p;
	}
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		//���ϵ�������Ʒ
		int i = 0;
		while(true){
			synchronized(p){
				if(!p.flg){
					if(i%2 == 0){
						p.name = "ƻ��";
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						p.pic = 6.5;
					}else{
						p.name = "�㽶";
						p.pic = 8.5;
					}
					i++;
					System.out.println(Thread.currentThread().getName() + p.name + "��Ǯ��=" + p.pic);
					p.flg = true;
					p.notify();
				}else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	}
	
}

class people  extends Thread {
	product p;
	public people(String name, product p){
		super(name);
		this.p = p;
	}
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		//���ϵ�����
		while(true){
			synchronized(p){
				if(p.flg){
					System.out.println(Thread.currentThread().getName() + p.name + "��Ǯ��=" + p.pic);
					p.flg = false;
					p.notify();
				}else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class ThreadMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*product p = new product();
		producter pd = new producter("������", p);
		pd.start();
		people pp = new people("������", p);
		pp.start();*/
		
		//�ػ��߳�
		/*backend b = new backend("download");
		b.setDaemon(true);//�����߳�Ϊ�ػ��߳� true�ػ�  false���ػ��߳� һ���߳�Ĭ�ϲ����ػ��߳�
		//����ж��Ƿ����ػ��߳�
		System.out.println(b.isDaemon());
		b.start();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}*/
		//���Կ������߹�����ô�ػ��߳�Ҳ���ˡ������������ߵ���ʧ����ʧ��
		
		
		
		//join
		ThreadJoin ThreadJoin_ = new ThreadJoin();
		ThreadJoin_.start();
		
	}

}
