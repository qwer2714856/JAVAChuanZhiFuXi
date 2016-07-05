package jihe;

import java.util.LinkedList;
import java.util.Random;

class people{
	String name;
	int age;
	public people(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return ""+age;
	}
}

public class LinkedListSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lt = new LinkedList();

		Random rd = new Random();
		int fi = 100;
		while(--fi >= 0){
			int r = rd.nextInt(100);
			lt.add(new people("df"+r,r));
		}
		
		int len = lt.size();
		
		for(int i = 0; i < len - 1; i++){
			int front = i;
			people pf,pfp;
			pf = pfp = (people) lt.get(i);
			for(int j = i+1; j < len; j++){
				people pj = (people) lt.get(j);
				if(pf.age > pj.age){
					front = j;
					pf = pj;
				}
			}
			if(front != i){
				people tmp = pfp;
				lt.set(i, lt.get(front));
				lt.set(front, tmp);
			}
		}
		System.out.println(lt);
	}

}
