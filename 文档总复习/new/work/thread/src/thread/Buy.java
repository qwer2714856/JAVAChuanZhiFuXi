/**
 * ��Ʊϵͳ
 */
package thread;

/**
 * @author www.23.com
 * ʲô���������̰߳�ȫ����
 * 1.����2����2�����ϵ��̶߳���
 * &&
 * 2.���̹߳�����һ�����ݡ�
 * 
 * ��ν���̰߳�ȫ����
 * sun �ṩ���߳�ͬ�����ƣ����������⡣
 * Ҫע����������������������һ������
 * ��ʽ��2��
 * 1.������ͬ�������
 *    synchronized(������){
 *        ��Ҫ��ͬ������
 *    }
 * 2.ͬ������ public static synchronized m(){}
 * 
 * !!!!!!!synchronized(object)!!!!!!!!!!!!!
 * ����������Ĭ���Ǵ򿪵Ľ�ȥ��͹��ϣ�ִ�����ڿ���
 * ���������һ��Ҫ��ע���������һЩ����������⣬�����һ���Ǹ���ֵ��������һֱ�����������״̬�����������new Object this ��Щ��������ԭ��ܼ򵥣�
 * �൱�ڲ�ͣ���ڻ�����Ա������Ա֮��û�н���������������ס�ˣ�һ��ע�������Ҫһ��ʼ�Ͷ���õĶ��Ҳ��ܻ���.ע������ܹؼ�ǧ���ܴ���
 * !!!static Object object = new Object();!!!
 */
public class Buy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaiPiao tt = new MaiPiao();
		MaiPiao tt2 = new MaiPiao();
		MaiPiao tt3 = new MaiPiao();
		MaiPiao tt4 = new MaiPiao();
		new Thread(tt,"A").start();
		new Thread(tt2,"B").start();
		new Thread(tt3,"C").start();
		new Thread(tt4,"D").start();
		
		//����Ӧ��ֻ����һ������Ȼ�󴴽�����߳̾��� ��������д�ǲ��Եģ����ǿ���ʵ�֣������Ϊʲôûɾ��Ҫ֪����ôЩ�¶Ե�
		/*
		MaiPiao tt = new MaiPiao();
		new Thread(tt,"A").start();
		new Thread(tt,"B").start();
		new Thread(tt,"C").start();
		new Thread(tt,"D").start();
		static int num = 5000;
		��Ϊ
		int num = 5000;
		�������Ϊ����̹߳���һ��ʵ��Runnable��Ķ���
		synchronized(object)
		��Ϊ synchronized(this) �������Ϊ����̹߳���һ��ʵ��Runnable��Ķ���
		
		*/
	}

}


class MaiPiao implements Runnable{
	static int num = 5000;
	static Object object = new Object();
	//Ϊʲô100��Ʊ �еĻ���ֶ��������		
	//�̰߳�ȫ����
	//��ν���̰߳�ȫ����
	
	public void run() {
		// TODO Auto-generated method stu
		//ͬ�������
		
		while(true){
			//���������̰߳�ȫ���⣬��ʹ�ã�����ή��Ч�ʵġ���ô֪����Ҫ�ӣ�ֻҪ���� ���̣߳��������ݾ���Ҫ��ȫ���á�
			//����������ַ���������ӦΪֱ��ȥ��������ȥ���Կ��ԡ�
			//object ���Ե��� ""
			synchronized(object){//java �κζ���������״̬�ġ� ��ͬ��������ֵ�����sleep�������������������� ���ﲻ���� new Object()ԭ��ܼ򵥣�������൱��ÿ�ζ��������Ը�����¼��ס�Ǹ���״̬��
			//synchronized("��") ����ֱ��д��"��"				
				if(num>0){
					System.out.println(Thread.currentThread().getName()+':'+num);
					num--;
				}else{
					break;
				}
			}
		}
		 
	}
	
}
