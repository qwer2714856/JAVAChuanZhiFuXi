package meiju;
/**
 * 枚举类型 -- jdk 1.5 的新特性
 * 某些方法所接受的数据必须在固定范围之内的
 * 
 * 1.自定义类可以实现
 * class xb{
	String sex = "";
	static final xb man = new xb("男");
	static final xb nv = new xb("女");
	private xb(String sex){
		this.sex = sex;
	}
  }

 * 2.使用枚举类解决
 * //枚举解决 -- 这也会生成一个.class 所以说它是一个类
	enum Sexs{
	    			
	}
 * 
 * 
 * @author www.23.com
 *
 */
public class Description {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xb.nv);
		
		System.out.print(Sexs.男);
		
		
	}
	public static void meijus(){
		
	}

}

 
class xb{
	String sex = "";
	static final xb man = new xb("男");
	static final xb nv = new xb("女");
	private xb(String sex){
		this.sex = sex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sex;
	}
}

// 枚举解决 -- 这也会生成一个.class 所以说它是一个类
/* jvm 会把enum Sexs变为
 * public static final Sexs 男
 * public static final Sexs 女  类型是枚举类的类型 javap -c -l -private Sexs
 * System.out.print(Sexs.女);
 * 
 * 1.枚举是一个特殊的类
 * 2.枚举默认修饰符是public static final 
 * 3.枚举的数据类型是枚举类所声明的那个类型，然后枚举值指向了本类的对象。
 * 就和1差不多的个原理
 * 4.类的构造方法是private 修饰的
 * 5.和普通类一样它是可以定义成员的
 * 6.可以自定义构造函数（修饰符必须是private）但是，枚举对象需要传入值，因为原来的不带餐构造函数被去掉了,注意这里传入的这个参数是给代参构造用的，和枚举对象本身没关系。它本身还是个男，女
 * 7.可以定义抽象方法，但是在创建枚举值得时候需要实现抽象方法。
 * 8.枚举值必须要位于枚举类的第一个语句，否则报错
 * 
 * 回顾 
 * switch 适应的的 byte short int char string 也适应于枚举类型
 * Sexed s = Sexed.man;
		switch(s){
		case man:;break;//这里的枚举值只需要写.后面的那个不需要再把前面的类名也写上了  这里为什么不让带上类名，1 简化书写。2.怕乱传数据，switch(s) 和  case 别的类型的去比较是有问题的。
		//例如讲 一个枚举是春夏秋冬，另一个枚举是0-6 1到周日 当一个switch(春夏秋冬) case 里面只能是春夏秋冬，如果允许你带类名case 里面有 个周1到周日显然不对。
		default:
			break;
		
		} 
 * */

enum Sexs{
   男("男1") {
	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
},女("女1") {
	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
};//这个就是枚举值 	
   private int s=1;
   String value = "";
   private Sexs(String value){
	   this.value = value;
   }
   public void aaa(){
	   
   }
   abstract public void c();
}
