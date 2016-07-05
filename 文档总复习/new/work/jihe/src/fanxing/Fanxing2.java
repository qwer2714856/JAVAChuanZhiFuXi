package fanxing;
/**
 * 在类加入自定义泛型
 * class MyArrays <T> 这个叫做泛型类。
 * 类方法下面的<T>都可以不声明了。
 * 
 * 泛型类注意的事项
 * 1在类上自定义泛型的具体数据类型，是在创建该类对象时确定的。
 * MyArrays <Integer> t = new MyArrays<Integer>();
 * 2当类实例不指定泛型的时候默认的是Object数据类型
 * 3静态的方法不能使用类的自定义泛型，如果要使用需要在静态函数自己定义。
 * public static <T> void lol(T[] ssl){
		
	}
   4方法的泛型是在传入实参的时候决定的	
	
 * 
 */
import java.util.Arrays;

public class Fanxing2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a={"2","3","1","2","4","6","9"};
		Integer []b = {1,2,3,4,5};
		MyArrays <String> t = new MyArrays<String>();
		//MyArrays <Integer> t = new MyArrays<Integer>();
		//t.reversed(b);
		t.reversed(a);
		System.out.println(Arrays.toString(a));
	}

}

class MyArrays <T>{
	public void reversed(T[] ay){
		for(int i = 0,j=ay.length-1; i <(int)(ay.length/2); i++,j--){
			T tmp;
			tmp = ay[i];
			ay[i] = ay[j];
			ay[j] = tmp;
		}
	}
	public static <T> void lol(T[] ssl){
		
	}
}
