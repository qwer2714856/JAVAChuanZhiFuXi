/**
 * ���߳� Thread java.lang
 * ����
 * ���̣����ڡ����С��ĳ��򡣣��ж������ڴ�ռ䣩
 * �������������̸����ڴ�ռ�ķ��䣬��ϵͳ����ռ��ǽ��̵����Ρ�
 * ������Ľ���
 *     ��۵Ľ���ȷʵ�������ж��Ӧ�ó���
 *     ΢�ۣ�����cpu��һ��ʱ��Ƭֻ������һ��Ӧ�ó���--������Ǹ���ѵ���ƣ�һ��ִ��Aһ��ִ��B�����л��������ٶ�̫�����Ըо��������л����ѡ����ʵ�����������ֻ������ѵ���ѣ����̽���������Դ���ᡣ��
 * �̣߳�û�ж������ڴ�ռ䣩
 * ���������кܶ���룬��Щ���������̸߳���ִ�еģ��߳���һ�������и�������ִ�С�
 * ���߳� �����ִ���ͬʱִ�У���ô��⣬һ��Ӧ�ó�������ɱ������������������Ҫͬʱִ��ʱ���൱�ڿ����������߳���ִ�С�������߳���Ҫһ��ִ������ִ����һ����������ͬ������ִ�ж�����񣡣���
 * question
 * 1.�̸߳����˴����ִ�С�����֮ǰûѧ���߳�Ϊʲô�������ִ�У�
 * ���κ�һ��java���룬jvm�����е�ʱ�򶼻ᴴ��һ�������̣߳�main�߳�ִ��main���������д��롣
 * 2.һ��javaӦ�ó��������м����̣߳�
 * һ��main�߳�һ���������������̣�������2���̵߳�
 * 3.���߳������ͬʱִ����
 * Ҳ���ǵģ�����ѵ������cpu����Դ�ͽ���һ����������Դ������˵��������cpu������˵�߳������ᣬ���̾��Ǹ������ڴ�����ڴ�ġ�
 * 4.���̺߳ô�
 * һ�����̣�ͬһ��ʱ��Σ����Դ����������롣Ч��û����ߣ�����Դ�Ѿ����������������Դ�������ʣ����еĿ��Ա������ȥ����
 * 5.���̵߳ı׶�
 * ������cpu�ĸ�����
 * ����̴߳��ڽ���һ�������У��߳�ִ�еĸ��ʣ�������4���߳�cpu�л���ÿ���߳�ִ�и�����25%
 * !!�������̰߳�ȫ����
 * !!��������������
 * 
 * 
 * ��δ������߳� --Thread java.lang
 * 2�ִ�����ʽ
 * 1.
 * 
 *   class PrimeThread extends Thread {
         long minPrime;
         PrimeThread(long minPrime) {
             this.minPrime = minPrime;
         }
 
         public void run() {
             // compute primes larger than minPrime
              . . .
         }
     }
     
     PrimeThread p = new PrimeThread();
     p.start();
     
 * 
 * 2.��test.java����������,QqThread�ۺ�  ����ʵ�ֽӿڵķ�ʽ
 * 
 * 
 * cpu�ĵȴ��ʸ�
 * cpu���л�ʱ������еȴ����ʸ�ֻ��������ʸ�cpu�Ż������㣬�б�cpu���ʵ��ʸ�
 * 
 * cpu��ִ��Ȩ
 * cpu����ִ�����̵߳Ĵ��룬������߳���cpuִ��Ȩ��
 * 
 * �������� 
 * ʲô������������
 * �̵߳�����������ʲô������
 * һ���߳�һ����new�˳����Ժ� (����״̬������״̬�µ�ʲô�ʸ�û�У��ȴ���ִ�У��ʸ�)(�̳л�����ʵ���߳����ӿڵ��౻�������������̵߳ı�����)->
 * ����״̬�µ��̵߳�����start����������߳̽��루������״̬--�߱�cpu�ȴ��ʸ�->(һ���õ�cpu ִ��Ȩ�Ϳ��Ե�����״̬Ҳ������cpu�ȴ��ʸ�)->��run����������ɾ������ˣ�û����cpu�ȴ���ִ��Ȩ����
 * ������״̬������״̬�ǿ����໥����ģ������˾Ϳ�����״̬��
 * 
 * ����״̬�µ��߳�->��ʱ����״̬������״̬���߳�ִ���� sleep �� wait ����ʱ�����ˣ�
 * sleep ������ָ��ʱ��ͻ����½��������״̬(����һֱ��������״̬Ҳ������״̬)��˯��ã�������񴴽�״̬��ʲô��û�У�
 * wait ��������ʱ����״̬��Ҫ�����̻߳��Ѹ��̣߳����ܽ��������״̬��
 * 
 * 
 * �̳߳��õ�һЩ����
 * Thread(String name)���췽��
 * �߳�.getName(); ��ȡ�̵߳�����
 * �߳�.setName(); �����̵߳�����
 * Thread.sleep();˯����Ҫtry catch �ĸ��߳�ִ����sleep�ĸ��߳̾ͻ����ߣ�����Ǹ���̬����������������������ִ���������ͻ����ߣ����ֻ�ܲ��񣬲����׳�����Ϊ����û���׳����಻���׳�ֻ�ܲ���
 * Thread.currentThread() ���ص�ǰ�̶߳����Ǹ���̬�������ĸ��߳�ִ���������̬�����ͻ᷵������̵߳Ķ���
 * getPriority() ��ǰ�̵߳����ȼ� Ĭ���߳�ƽ�֣����ȼ�Խ��ִ��Խ�ߡ�
 * setPriority() ���ȼ�����Խ�����ȼ�Խ�ߡ����ȼ��ķ�Χ��1-10֮�� 10������,����Ǹ��ʵ����ⲻ����һ�������⡣
 * 
 * 
 * �̰߳�ȫ������
 * ��ʽһ ��Ʊ  buy.java
 * ��ʽ2 SyncFunction.java
 * 
 * 
 * 
 * ���ڴ����̵߳ļ�������
 * ʹ�÷�ʽ���������߳̾���Runnable���Ǹ�
 * 1.ʵ����Runnable ���ഴ���������̶߳�����
 * ���ǵ��������ͨ��������ֻ��Thread��Thread�����ഴ���Ĳ����̶߳�����Ϊ�̶߳�����������start���Կ���һ���̵߳ġ�
 * 2.Ϊʲô��Runnable ʵ����Ķ�����Ϊʵ�δ���Thread
 * ����Ҫ����Runnableʵ��������run����
 * 
 * 
 * 
 * runnableClass a = new runnableClass();
 * new Thread(a,"").start();
 * 
 * class runnableClass implements Runnable{
 *     public void run(){
 *         this != Thread.currentThread()
 *         
 *         this//�������a
 *         ��Thread.currentThread()��������Ǹ� new Thread �߳�
 *         
 *     }
 * }
 */

package thread;

/**
 * @author www.23.com
 *
 */
public class Threads extends Thread  {
	public Threads(){
		super("�߳�����");
	}
	/**
	 * @param args
	 */
	//���߳�main�߳�ִ�е�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʽһ 
		/*
		1.�̳�һ��Thread�����  public class Threads extends Thread 
		2.������дThread���run���� �����Ҽ�source->override implementsѡ����Ҫ��д�ķ���
		3.����thread��������󣬲���ʹ��start������run��������ֱ�ӵ��ã�ֱ�ӵ��þ��൱�ڵ�����һ����ͨ�������ѣ���û�п����µ��̣߳��߳̿�����ִ��run������
		3.ÿ���̶߳����Լ����������
		4.run�������������������
		5.java�������߳�����������main����Ĵ���
		6.�Զ����̸߳���run�еĴ���
		*/
		
		//=============��ʽһ
		Threads t = new Threads();
		//t.run();//����൱��ִ�и���ͨ������û�����߳̿���
		t.start();//���������Զ������� run�����������߳�
		//=============��ʽ�� test ����������
		
		
		for(int i = 0; i < 100; i++){
			System.out.println("���߳�"+i);
		}
		
		/*try {//���߳�������
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Thread tx = Thread.currentThread();
		System.out.println(tx.getName());
		System.out.println(Thread.currentThread().getPriority());
	}
    //��д��Ŀ��Ϊ�˰ѣ��Զ����̵߳���������run�����С�
	public void run() {//��д����Ŀ��
		//�����Thread.currentThread()��ǰ���̶߳��� �� this��ǰ���� ��ǰ�̶߳�������ڵĶ�����һ������ һ��
		// TODO Auto-generated method stub
		super.run();//����������
		// ���̵߳Ĵ������
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i = 0; i < 100; i++){
			System.out.println("���߳�"+i);
			System.out.println(this.getName());
			System.out.println(Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
