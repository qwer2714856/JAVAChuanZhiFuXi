/**
 * ���� �߳� ��ϰ
 */
package fx;

/**
 * @author www.23.com
 * 
 */
public class Fx4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���̴߳��ڵ����壺�ö������ͬʱ���С������һ����������������ͬʱ���С�
		// ���̵߳Ĵ�����ʽ 2�ַ�ʽ
		// 1 ������ extends Thread new ������().start();
		// 2 implements Runnable new ����� () Ȼ�󴴽�Thread th = new
		// Thread(�����,"��������").start();
		// ��Ҫ��дrun ���� �߳�����������

		new ThreadA().start();
		new Thread(new ThreadB(), "ThreadB").start();
		
		//�̰߳�ȫ
		//ͬ������� synchronized("��"){��Ҫ��ͬ���Ĵ���} ����������������������������򵥵����ַ�������Ϊ�ַ������ַ�����������󲻻�ı䣬������Ķ���Ҫһֱ������ͬһ������ ���̹߳�����Դ��ʱ���ø���û���̰߳�ȫ����������Ϊ�ᵼ��Ч�ʵ͡�
		//����sleep ���������ͷ������󣬵��ǵ���wait�����ͻ��ͷ�������	
		//�����̰߳�ȫ����ԭ�򣬴���2�����������Ϲ�����Դ��������Դ��������ж�䡣
		
		//ͬ������ public synchronized void  run()
		//ͬ�������������� �޷��ı䣬�Ǿ�̬��������������this����̬�������������ǵ�ǰ�ֽ������
		
	}

}

class ThreadA extends Thread {
	public synchronized void  run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}

class ThreadB implements Runnable {
	public void run() {
		synchronized ("") {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + i);
			}
		}
	}
}