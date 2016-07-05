import java.util.ArrayList;
import java.util.Iterator;

/**
 * 可变参数
 * 在形参类型后面点上三个点，然后接参数名
 * int ... a 这个时候 a 就是个数组
 * 
 * 注意的细节
 * 1.一个函数的形参，使用了可变参数之后，那么条用该方法的时候可以传递参数，也可以不传递参数。
 * 2.可变参数实际上是一个数组对象
 * 3.可变参数必须位于形参最后一个，也就是只能有一个可变变量。
 * ... jvm会先建一个数组给到可变参数那，所以如果不传数据也没有问题空数组呗
 * 
 * 
 * 自动装箱和拆箱
 * Java 是面向对象语言，所有的都可以描述成类，8中基本数据类型的类
 * 基本数据类型               包装类
 * byte           --Byte      
 * short          --Short
 * int            --Integer
 * long           --Long
 * 
 * float          --Float
 * double         --Double
 * 
 * boolean        --Boolean
 * 
 * char           --Character
 * 
 * 基本类型有了包装类的好处
 * 1.可以使用方法
 * 
 */

/**
 * @author www.23.com
 *
 */
public class KeBianCanShu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,2,3,4,5,6);
		
		
		
		//包装数据类  如果传入非数字就抛出异常
		System.out.println(Integer.parseInt("123")+1);
		System.out.println(Integer.toString(123)+1);
		System.out.println(Integer.toBinaryString(21312));//2进制
		System.out.println(Integer.toOctalString(123));//八进制
		System.out.println(Integer.toHexString(123));//十六进制
		System.out.println(Integer.parseInt("1001", 36));//将指定字符串，指定进制的字符串 变为十进制. 进制最大不能超过36
		
		
		//自动装箱，和自动拆箱
		//集合是可以存储任意对象类型的数据，注意是任意对象。
		//装箱和拆箱是jdk1.5出的
		int a = 1;
		Integer b = a; //装箱
		int c = b;//拆箱
		
		
		ArrayList ay = new ArrayList();
		ay.add(1);
		ay.add(2);
		ay.add(3);
		//这里为什么可以存储非对象类型的数据，是因为系统自动装箱，把基本类型的数据装箱成包装类的实例
		//将包装类型的实例进行运算的或者拼接的时候就是拆箱。
		/*Iterator it = ay.iterator();
		while(it.hasNext()){
			System.out.println((Integer)it.next() + 1);
		}*/
		
		//这里为什么 128 就不相等而127就相等，这是因为Integer内部维护了一个127~-128的一个缓冲数组，这个会提高一点效率。使用的时候直接从同一个缓冲数组取数，而超出这个范围就重新创建了。
		Integer ax = 128;
		Integer ax2 = 128;
		System.out.println(ax == ax2);
		Integer ax3 = 127;
		Integer ax4 = 127;
		System.out.println(ax3 == ax4);
		
	}
	public static void add(int ... a){
		int data = 0;
		for(int i = 0; i < a.length; i++){
			data += a[i];
		}
		System.out.println(data);
	}

}
