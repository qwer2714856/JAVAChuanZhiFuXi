package thread;

public class SyncFunction implements Runnable {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * ͬ������
	 * ����ǷǾ�̬ͬ������������this
	 * ����Ǿ�̬��ͬ���������Ǿ��ǵ�ǰ������������ֽ����ļ�������Class������������Ψһ�ġ�
	 * Class ���ʵ����ʾ�������е� Java Ӧ�ó����е���ͽӿڡ�ö����һ���࣬ע����һ�ֽӿڡ�ÿ���������ڱ�ӳ��Ϊ Class �����һ���࣬���о�����ͬԪ�����ͺ�ά�������鶼����� Class ���󡣻����� Java ���ͣ�boolean��byte��char��short��int��long��float �� double���͹ؼ��� void Ҳ��ʾΪ Class ����
	 * �ֽ����ļ���ʲô��
	 * Class���������ֽ����ļ���
	 * 
	 * ͬ�����������ǹ̶��Ĳ������Լ��ġ�
	 * 
	 * �Ƽ�ʹ��ͬ�������
	 * ԭ��
	 * 1.���������Լ��ƶ�
	 * 2.ͬ��������Ч�ʵͣ���Ϊ��Щ����Ҫ���ݹ���
	 * 
	 * 
	 * synchronized ������̰߳�ȫ��������������������
	 * ��������
	 * �������������������
	 * ��Դ�໥���á�������ҵ���
	 * 
	 */
	public synchronized  void run() {
		// TODO Auto-generated method stub
		 c();
	}
    private static synchronized void c(){
    	
    }
    //������������
    //���������������̣߳�����2����2�����ϵĹ�����Դ
    //����������� û�м������������⣬ֻ�ܾ�������������⡣
    /*����
    ��������������ң����Ȼ�����ر�
    ���Ĺ������ߵ���Ȼ�����ر�
    ���ʱ���������������ͷŵ��
    ���ĵ��������ͷ�ң�������ʱ���������
    �������໥������
    */
    public void sisuo(){
    	if("����".equals(Thread.currentThread().getName())){
    		synchronized("ң����"){
    			synchronized("���"){
    				
    			}
    		}
    	}else if("����".equals(Thread.currentThread().getName())){
    		synchronized("���"){
    			synchronized("ң����"){
    				
    			}
    		}
    	}
    
    }
	
}
