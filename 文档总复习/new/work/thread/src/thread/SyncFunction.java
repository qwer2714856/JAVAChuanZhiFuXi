package thread;

public class SyncFunction implements Runnable {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 同步函数
	 * 如果是非静态同步函数的锁是this
	 * 如果是静态的同步函数锁是就是当前函数所属类的字节码文件，就是Class对象，所对象是唯一的。
	 * Class 类的实例表示正在运行的 Java 应用程序中的类和接口。枚举是一种类，注释是一种接口。每个数组属于被映射为 Class 对象的一个类，所有具有相同元素类型和维数的数组都共享该 Class 对象。基本的 Java 类型（boolean、byte、char、short、int、long、float 和 double）和关键字 void 也表示为 Class 对象。
	 * 字节码文件是什么？
	 * Class类是描述字节码文件的
	 * 
	 * 同步函数的锁是固定的不能有自己改。
	 * 
	 * 推荐使用同步代码块
	 * 原因
	 * 1.锁可以由自己制定
	 * 2.同步函数的效率低，因为有些不需要操纵共享。
	 * 
	 * 
	 * synchronized 解决了线程安全，但是引发了其他问题
	 * 死锁问题
	 * 死锁现象是如何引发的
	 * 资源相互引用。你等我我等你
	 * 
	 */
	public synchronized  void run() {
		// TODO Auto-generated method stub
		 c();
	}
    private static synchronized void c(){
    	
    }
    //这样存在死锁
    //有两个两个以上线程，存在2个或2个以上的共享资源
    //解决死锁问题 没有技术解决这个问题，只能尽量避免这个问题。
    /*解释
    当张三过来拿走遥控器然后锁关闭
    李四过来拿走电视然后锁关闭
    这个时候张三等着李四释放电池
    李四等着张三释放遥控器这个时候就死锁了
    存在着相互引用了
    */
    public void sisuo(){
    	if("张三".equals(Thread.currentThread().getName())){
    		synchronized("遥控器"){
    			synchronized("电池"){
    				
    			}
    		}
    	}else if("李四".equals(Thread.currentThread().getName())){
    		synchronized("电池"){
    			synchronized("遥控器"){
    				
    			}
    		}
    	}
    
    }
	
}
