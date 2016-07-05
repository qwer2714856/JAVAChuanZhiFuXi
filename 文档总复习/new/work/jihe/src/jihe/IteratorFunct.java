package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorFunct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		int i = 100;
		while(--i > 0){
			c.add(new Integer(i));
		}
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(c);
	}

}
