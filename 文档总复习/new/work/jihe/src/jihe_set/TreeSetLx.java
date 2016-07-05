package jihe_set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

class Comparators implements Comparator{

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int s1 = Integer.parseInt((String)o1);
		int s2 = Integer.parseInt((String)o2);
		return s1 - s2;
	}
}

public class TreeSetLx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1 10 22 -1 -99 -4";
		String []tmpStr = str.split(" ");
		TreeSet ts = new TreeSet(new Comparators());
		for(int i = 0; i < tmpStr.length; i++){
			ts.add(tmpStr[i]);
		}
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
