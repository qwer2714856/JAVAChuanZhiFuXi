package jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIterators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		/*Object [] c = list.toArray();
		for(int i = 0; i < c.length; i++){
			System.out.print(c[i]);
		}
		
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
		}*/
		
		ListIterator lt = list.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		
		while(lt.hasPrevious()){
			System.out.print(lt.previous());
		}
		
	}

}
