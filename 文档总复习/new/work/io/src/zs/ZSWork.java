/**
 * 装饰者模式
 * 
 * 优点：各个装饰者可以相互装饰。
 * 缺点：因为使用了多台所以比较复杂
 * 
 * 流程
 * 1.内部维护着被装饰的对象。
 * 2.构造函数
 * 3.继承被装饰的对象（为了使用多态，相互引用）
 * 4.重写需要扩展的方法
 * 
 * 作业：
 * 一家三口都要工作
 * 儿子：画画
 * 母亲：上颜色
 * 老爸：套相框
 * 需求使用装饰者模式使他们的关系是母亲扩展儿子，老爸扩展母亲和儿子
 */
package zs;

/**
 * @author www.23.com
 *
 */
public class ZSWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		father wk = new father(new mather(new child(null)));
		wk.work();
		
	}

}





/**
 * Work
 */
interface Work{
	public void work();
}

class child implements Work{
	private Work wk = null;
	
	public child(Work wk) {
		this.wk = wk;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(wk != null){
			wk.work();
		}
		System.out.println("画画");
	}
}

class mather implements Work{
	private Work wk = null;
	
	public mather(Work wk) {
		this.wk = wk;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(wk != null){
			wk.work();
		}
		System.out.println("上颜色");
	}
	
}

class father implements Work{
	private Work wk = null;
	
	public father(Work wk) {
		this.wk = wk;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(wk != null){
			wk.work();
		}
		System.out.println("上边框");
	}
	
}
