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
		case man:;break;//�����ö��ֵֻ��Ҫд.������Ǹ�����Ҫ�ٰ�ǰ�������Ҳд����
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
	man("��"),wom("Ů");
	String value = "";
	private Sexed(String value) {
		this.value = value;
	}
}