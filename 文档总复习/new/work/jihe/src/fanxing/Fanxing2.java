package fanxing;
/**
 * ��������Զ��巺��
 * class MyArrays <T> ������������ࡣ
 * �෽�������<T>�����Բ������ˡ�
 * 
 * ������ע�������
 * 1�������Զ��巺�͵ľ����������ͣ����ڴ����������ʱȷ���ġ�
 * MyArrays <Integer> t = new MyArrays<Integer>();
 * 2����ʵ����ָ�����͵�ʱ��Ĭ�ϵ���Object��������
 * 3��̬�ķ�������ʹ������Զ��巺�ͣ����Ҫʹ����Ҫ�ھ�̬�����Լ����塣
 * public static <T> void lol(T[] ssl){
		
	}
   4�����ķ������ڴ���ʵ�ε�ʱ�������	
	
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
