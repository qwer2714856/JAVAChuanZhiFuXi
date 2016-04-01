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