package test;

public class Person {
	int id;
	String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"--"+id;
	}
	public Person(){}
}
