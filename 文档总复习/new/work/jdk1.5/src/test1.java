import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;


public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> mp = new HashMap<String, String>();
		mp.put("a", "b");
		Set<Entry<String, String>> et = mp.entrySet();
		for (Entry<String, String> entry : et) {
			System.out.println(entry.getValue());
		}
		
		ding c = new ding();
		for(Integer t:c){
			System.out.println("hi");
		}
	}

}

class ding implements Iterable<Integer>{
	int flg = 0;
	int size = 10;
	Object [] k = new Object[10];
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator(){

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return flg != size;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return (Integer)k[flg++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void forEachRemaining(Consumer action) {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	@Override
	public void forEach(Consumer<? super Integer> action) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Spliterator<Integer> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
