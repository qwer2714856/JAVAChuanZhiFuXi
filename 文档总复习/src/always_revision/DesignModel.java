/**
 * 设计模式
 * 什么是设计模式？
 * 就是前人总结出来的为了解决一类问题的流程。
 * 
 * 单例设计模式
 * 解决一个类在内存中只有一份
 * 
 */
package always_revision;

/**
 * @author www.23.com
 *
 */
public class DesignModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//懒汉 多线程存在线程安全问题
class Fc{
	private static Fc fc = null;
	private Fc(){}
	public static Fc getFc(){
		if(fc == null){
			fc = new Fc();
		}
		return fc;
	}
}

//饿汉
class Fcs{
	private static Fcs fc = new Fcs();
	private Fcs(){}
	public static Fcs getFc(){
		return fc;
	}
}