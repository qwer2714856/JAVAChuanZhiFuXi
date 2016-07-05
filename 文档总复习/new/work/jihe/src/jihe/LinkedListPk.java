package jihe;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

interface PKS{
	String []pkName  = {"ºìÌÒ","ºÚÌÒ","·½Æ¬","»¨×Ó"};
	String []pkNum = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
}

class pk{
	String pkNum;
	String pkName;
	public pk(String pkName,String pkNum){
		this.pkName = pkName;
		this.pkNum = pkNum;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return pkName+pkNum;
	}
}

class items{
	LinkedList list;
	pk p;
	public items(){
		list = new LinkedList();
	}
	public void createList(){
		for(int i = 0; i < PKS.pkNum.length; i++){
			for(int j = 0; j < PKS.pkName.length; j++){
				list.add(new pk(PKS.pkName[j], PKS.pkNum[i]));
			}
		}
	}
	public void xp(){
		LinkedList cpList = new LinkedList();
		Random rd = new Random();
		
		while(list.size()>0){
			int i = rd.nextInt(list.size());
			cpList.add(list.remove(i));
		}
		list = cpList;
	}
	public LinkedList getList() {
		return list;
	}
	public void setList(LinkedList list) {
		this.list = list;
	}
	public void print(){
		ListIterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

public class LinkedListPk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		items i = new items();
		i.createList();
		i.xp();
		i.print();
		System.out.println(i.getList().size());
		
	}

}
