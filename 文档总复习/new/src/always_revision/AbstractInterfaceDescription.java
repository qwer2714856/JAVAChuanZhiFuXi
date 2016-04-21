/**
 * 
 */
package always_revision;

/**
 * @author www.23.com ������ͽӿ�
 * 
 *         ������ ������һ�����ʱ�������в�ȷ���ķ�������Ҫ����ȥʵ�ֿ����ó����࣬��ȷ���ķ��� �ǳ��󷽷��� �г��󷽷������ǳ����ࡣ
 *         ���署�и������࣬���ﶼ��У����̳ж��è�̳ж��Ȼ��������Ľ��޷���Ӧ���е��� ���Կ��Խ��ж�����󷽷���
 * 
 *         ��������ص� 1.�г��󷽷�����һ���ǳ����ࡣ 2.�����಻һ���г��󷽷���
 *         3.�����಻�ܱ�ʵ��������Ϊ��������г��󷽷������󷽷�û�з������޷��������Բ���ʵ��������
 *         4.��������Ϊ����ߴ��븴���ԣ�������̳�ʹ�õġ�
 *         5.������ǿ��������ȥʵ�ָ���û��ʵ�ֵĳ��󷽷���������಻��ʵ�֣���ô��������Ϊ����ġ�
 * 
 *         ��������ŵ� 1.��ߴ��븴���ԡ� 2.ǿ������ʵ�ָ���ķ����� 3.��ߴ������չ�ԣ���ߺ���ά����
 * 
 *         �������Ƿ��й��캯���� Ϊ�˳�ʼ�����������еĳ�Ա������
 * 
 *         final ���ܺ�abstractһ������ ��Ϊabstract ��Ŀ������������д����final�ǽ�ֹ��д��ì�ܡ�
 * 
 *         abstract ֻ���û���������
 * 	
 * 			
 * 		   	�������ע��ϸ��
 * 			1.���������û�г���š�
 * 			2.�������ǿ��Լ̳���ͨ��ġ�
 * 			3.�����಻��ʵ�������������й��췽�� ������һ���еġ�
 * 			4.abstract �������ؼ����Ĺ�ϵ��
 * 				final ������ abstract����
 * 				static ���ܺ�abstract���棬ԭ����static���εĿ���ʹ���������ã���abstract���η�������û�з��������Ա���
 * 				private ���ܺ�abstract���棬ԭ�������޷���д��
 * 
 * 
 * 
 * ֵ����
 * ֵ���� ע�������򣬳���������ͷ��ˡ�
 * ���ý��������ǵ�ַ��
 * 
 * ֵ�������ڴ�ͼ
 * ��main ��jvm���û���ջ������һ���ռ䣬����main�Լ��Ŀռ䣬��main������������other,����ջ��������һ���ռ�other��other��������
 * �����оֲ�������������other��ִ�н���������
 * 
 * main int a int b;
 * other(a,b);
 * a ^=b;
 * b ^= a;
 * a ^=b;
 * ���ʱ��ab������other�ռ�� ����other���������պ�main��abû�б仯��
 * 
 * ���ý���
 * main 
 * int []a = {1,2,3,4} ����a��ŵ���һ����ַ
 * other(a) ���ﴫ�����һ�� ���ý����ǵ�ַ������
 * 
 * Interface �ӿ�
 * �ӿڵĸ���
 * java ����ʹ�ýӿ����˷����̳е�ȱ�ݣ��ӿڿ�������������й�����չ��
 * ����
 * һ��Բ�̳���ͼ���࣬����ƽ��ͼ��ֻ�����ܳ����棬���ʱ���������Բ���������������Դ���һ���ӿ���ǿ��������Բȥʵ�֡�
 * ��ʽ��
 * interface it{} ע��ӿ�Ҳ������һ��class�ļ�
 * һ�������ʵ�ֶ���ӿ���, implements a,b
 * 
 * �ӿڿ���ʵ�ֵĹ���
 * 1.������Ĺ��ܣ���û��ͨ����ʵ�ֽӿڿ���������ǿ��
 * 2.����淶
 * 3.����
 * 4.��̬
 * 
 * �ӿڵ�ע��
 * 1.��������Ա�������η��� 
 * public static final
 * 2.��Ա������
 * public abstract 
 * ע�����������û����д��jvm�Զ�����ȥ�ġ�
 * 3.�г������Ĳ�һ�������࣬Ҳ�����ǽӿ� ��
 * 4.�ӿڵķ������ǳ���Ĳ���ʵ����
 * 5.�ӿ�û�й���
 * 6.���಻��ʹ��super ��Ϊ�ӿں���û�м̳й�ϵ��������˵�˽ṹ�ĳ�Ա�����Ǿ�̬�ģ������ǳ���ġ�
 * 7.�ӿڽӿ�֮��м̳У��ӿں���֮��ʵ�ֹ�ϵ��
 * 8.class a implements b,c,d{}
 * 9.interface x extends m,q{}  �ӿ��ڼ̳нӿڵĿ��Զ�̳С�����ʵ�ֽӿڿ��Զ�ʵ�֡�
 * 
 * ��̬
 * ʲô�Ƕ�̬���򵥵Ľ�����һ�����������̬��
 * ��̬�ǣ����������ָ���������ʵ����
 * class Fu{}
 * class Zi extends Fu{}
 * Fu fu = new Zi();
 * ��������ָ�������ʵ������
 * �ܽ᣺
 * ��̬��
 * 1.��������к�������ͬ�ĳ�Ա�����������Ƿ�̬�����õĶ��Ǹ���ĳ�Ա������
 * 2.������д����ĳ�Ա�������Ǿ�̬����Ĭ�ϵ��õ�������ġ�
 * 3.������д����ĳ�Ա��������̬�ģ���Ĭ�ϵ��õ��Ǹ���ġ�
 * 4.������������ķǾ�̬�����������Ҫ�У������޷����á���ϵ���Ǹ���ķ���һ���Ǳ�������д�ģ����ø��෽�����ǵ�������ġ�
 * �ܽ���ʵ���ǵ���������ָ���������ʵ�������õ�ʱ��ֻ�зǾ�̬�������õ�������ġ����඼�ǵ��ø���ġ�
 * ��̬��ǰ��
 * ������������м̳л�����ʵ�ֹ�ϵ�ġ�
 * ��̬�ı׶�
 * ����ֻ��ʹ�ø����еĳ�Ա���������ض��ĳ�Ա�ǲ����ٶ�̬��ʹ�õġ�
 * 
 * ��̬��һЩ�ص�
 * 1.����ʱ�ڲ鿴��̬���������Ƿ���иó�Ա��û�б���
 * 2.�����ڼ�鿴�����Ƿ�����д����ķ����о͵��������û�е��ø���ģ��Ǿ�̬�ģ�
 * 
 * ��̬��Ӧ�ó���
 * 1.�β� ���ո���Ĺ�ϵ�ࡣ
 * 2.����ֵ ���Է����������ࡣ
 * 
 * ��̬������ת��������ø�����õ���������з�����ʹ������ת������ʵ�֣�
 * 1.��������������ת��
 *   �Զ� С->��
 *   ǿת ��->С
 * 2.�������ת����������ڼ̳л�ʵ�ֹ�ϵ�������ڶ�̬��ϵ��
 *   ��������ָ�������ʵ��    �Զ� Сת��  ����̬��
 *   ��������� ת�� ʵ��         ǿת  ��תС  ��� instanceof Ч������  Fu f = new Zi();   Zi zi = (Zi)f; �����Ϳ��Ե����������еķ����ˡ�
 * ע�����������ת���ǽ����ڶ�̬�Ļ����ϵģ����  Fu f = new Fu();  Zi zi = (Zi)f;��������������ʱ�쳣����ת������
 * ���ڼ̳�ʵ�ֹ�ϵ������ת����
 * 
 * ��̬������
 * Fu f = new Zi1();
 * Zi zi = (Zi)f;  //��������ָ���������Zi1 Ȼ��ǿתZi ������û�а취����Zi1�����з����ġ� ��������������ʱ�쳣����ת������
 * 
 * 
 * 
 * 
 */
public class AbstractInterfaceDescription {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Rect rect = new Rect(2.0,2.0);
		rect.setC(99);
		rect.setK(100);
		rect.sayShapeZc();
		rect.sayShapeMj();*/
		
		/*Circle c = new Circle(4);
		//c.setR(9);
		c.sayShapeMj();
		c.sayShapeZc();*/
		/*Fu fu = new Zi();
		fu.say();*/
		
		 
	}
 

}

abstract class MyShape {
	public String shapeName;

	public MyShape(String shapeName) {
		this.shapeName = shapeName;
	}

	public double mj;
	public double zc;
	
	abstract void zc();

	abstract void mj();

	public void sayShapeZc() {
		zc();
		System.out.println(this.shapeName+"�ܳ��ǣ�"+this.zc);
	}

	public void sayShapeMj() {
		mj();
		System.out.println(this.shapeName+"����ǣ�"+this.mj);
	}

}

class Rect extends MyShape{
	private double c;
	private double k;
	
	public Rect(double c,double k){
		super("����");
		this.c = c;
		this.k = k;
	}
	@Override
	void zc() {
		// TODO Auto-generated method stub
		zc = (c+k)*2;
	}

	@Override
	void mj() {
		// TODO Auto-generated method stub
		mj = c*k;
	}
	
	void setC(double c){
		this.c = c;
	}
	
	void setK(double k){
		this.k = k;
	}
	
	void setCK(double c, double k){
		this.c = c;
		this.k = k;
	}
}

class Circle extends MyShape{
	private static final double PI = Math.PI;
	private double r;
	
	Circle(double r){
		super("Բ��");
		this.r = r;
	}
	@Override
	void zc() {
		// TODO Auto-generated method stub
		zc = 2 * PI * r;
	}

	@Override
	void mj() {
		// TODO Auto-generated method stub
		mj = PI * Math.pow(r, 2);
	}
	void setR(double r){
		this.r = r;
	}
}


class Fu{
	int a = 1;
	void say(){
		System.out.println(a);
	}
}
class Zi extends Fu{
	int a = 2;
	@Override
	void say(){
		System.out.println(a);
	}
}



 
