import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
/**
 * ������˭д����ֻҪʵ��Interable �ӿھͿ���
 * @author www.23.com
 *
 */

public class CustomClass implements Iterable<Integer>{
    Object [] a = {1,2,3,4};
    int idx = 0;
    int size = 4;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomClass s = new CustomClass();
		for(Integer i:s){
			System.out.println(i);
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>(){

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return idx != size;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return (Integer)a[idx++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void forEachRemaining(Consumer<? super Integer> action) {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

	@Override
	public void forEach(Consumer action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Spliterator spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

} 
