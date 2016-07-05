package meiju;

public class UseEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People(Sexed.man);
		p.say();
		
		Sexed s = Sexed.man;
		switch(s){
		case man:;break;//这里的枚举值只需要写.后面的那个不需要再把前面的类名也写上了
		default:
			break;
		
		}
	}

}

class People{
	Sexed sex = null;
	People(Sexed sex) {
		this.sex = sex;
	}
	public void say(){
		System.out.println(sex.value);
	}
}
enum Sexed{
	man("男"),wom("女");
	String value = "";
	private Sexed(String value) {
		this.value = value;
	}
}