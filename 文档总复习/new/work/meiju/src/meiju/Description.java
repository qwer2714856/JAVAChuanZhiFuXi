package meiju;
/**
 * ö������ -- jdk 1.5 ��������
 * ĳЩ���������ܵ����ݱ����ڹ̶���Χ֮�ڵ�
 * 
 * 1.�Զ��������ʵ��
 * class xb{
	String sex = "";
	static final xb man = new xb("��");
	static final xb nv = new xb("Ů");
	private xb(String sex){
		this.sex = sex;
	}
  }

 * 2.ʹ��ö������
 * //ö�ٽ�� -- ��Ҳ������һ��.class ����˵����һ����
	enum Sexs{
	    			
	}
 * 
 * 
 * @author www.23.com
 *
 */
public class Description {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xb.nv);
		
		System.out.print(Sexs.��);
		
		
	}
	public static void meijus(){
		
	}

}

 
class xb{
	String sex = "";
	static final xb man = new xb("��");
	static final xb nv = new xb("Ů");
	private xb(String sex){
		this.sex = sex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sex;
	}
}

// ö�ٽ�� -- ��Ҳ������һ��.class ����˵����һ����
/* jvm ���enum Sexs��Ϊ
 * public static final Sexs ��
 * public static final Sexs Ů  ������ö��������� javap -c -l -private Sexs
 * System.out.print(Sexs.Ů);
 * 
 * 1.ö����һ���������
 * 2.ö��Ĭ�����η���public static final 
 * 3.ö�ٵ�����������ö�������������Ǹ����ͣ�Ȼ��ö��ֵָ���˱���Ķ���
 * �ͺ�1���ĸ�ԭ��
 * 4.��Ĺ��췽����private ���ε�
 * 5.����ͨ��һ�����ǿ��Զ����Ա��
 * 6.�����Զ��幹�캯�������η�������private�����ǣ�ö�ٶ�����Ҫ����ֵ����Ϊԭ���Ĳ����͹��캯����ȥ����,ע�����ﴫ�����������Ǹ����ι����õģ���ö�ٶ�����û��ϵ���������Ǹ��У�Ů
 * 7.���Զ�����󷽷��������ڴ���ö��ֵ��ʱ����Ҫʵ�ֳ��󷽷���
 * 8.ö��ֵ����Ҫλ��ö����ĵ�һ����䣬���򱨴�
 * 
 * �ع� 
 * switch ��Ӧ�ĵ� byte short int char string Ҳ��Ӧ��ö������
 * Sexed s = Sexed.man;
		switch(s){
		case man:;break;//�����ö��ֵֻ��Ҫд.������Ǹ�����Ҫ�ٰ�ǰ�������Ҳд����  ����Ϊʲô���ô���������1 ����д��2.���Ҵ����ݣ�switch(s) ��  case ������͵�ȥ�Ƚ���������ġ�
		//���署 һ��ö���Ǵ����ﶬ����һ��ö����0-6 1������ ��һ��switch(�����ﶬ) case ����ֻ���Ǵ����ﶬ����������������case ������ ����1��������Ȼ���ԡ�
		default:
			break;
		
		} 
 * */

enum Sexs{
   ��("��1") {
	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
},Ů("Ů1") {
	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
};//�������ö��ֵ 	
   private int s=1;
   String value = "";
   private Sexs(String value){
	   this.value = value;
   }
   public void aaa(){
	   
   }
   abstract public void c();
}
