/**
 * �쳣��ϵ
 * Throwable
 *     |----Error(����)
 *     |----Exception(�쳣)
 *         |----RuntimeException ����ʱ�쳣
 *         |----�������쳣
 * 
 * Error ���׳�Error���Ĵ���
 * Exception ���׳�Exception����
 * 
 * java�����Ĭ�Ϲ�����64M���ڴ���������ͻ��׳����󼶱���쳣
 * //java.lang.OutOfMemoryError  ���Կ����׳����ǡ�����Error
   byte [] a = new byte[1024*1024*1024];
       ���� java һ�������ڵ��ļ� �׳��Ҳ����ļ���
   
        ������ô��� Error �� jvm����Ĵ���һ�㲻��Ҫ�Ĵ��롣��Ȼ������ڴ������Ҫ�Ĵ��룬һ���ǳ���Ա�޷�����ģ�ֻ�ܻرܡ�
 	
 * Exception ����ϵ
 *     ����ʱ�쳣    		 ֻ�������е�ʱ�������׽�Ĵ��� ���� int a = 1; a / 0; 
 *     ������ʱ�쳣		 �����ʱ������̻����� int a; a += 1; û�и���ֵ
 * 	
 * Throwable ��
 * toString(); ����쳣���� a / 0 java.lang.ArithmeticException
 * getMessage(); ����쳣����Ϣ / by zero
 * printStackTrace(); ��ӡջ����Ϣ�����������쳣�࣬������Ϣ��������ʾ������е�  ����.����.����.�쳣�С�
 * ���쳣�Ǵ��������ң��׳��쳣�Ǵ��������ס�
 * 
 * at always_revision.TryCatch.call(TryCatch.java:47)
 * at always_revision.TryCatch.main(TryCatch.java:42)
 * 
 * �쳣����
 * try{�쳣����}catch(�쳣�� e){�����쳣�Ĵ���}
 * ���쳣������ĳ�������ִ�У����������ʹ˽�����
 * 
 * ���쳣
 * ���쳣�����һ��try�����ж����쳣���Էֱ��ö��catch ���񣬵�Ȼ��ͬһʱ��ֻ�ܲ���һ���쳣����Ϊһ���쳣
 * �ͻ�ȥ��Ӧ�Ĳ���catch�У�����ľͲ�ִ���ˡ�
 * try{
 * }catch(��ָ���� e){
 * 
 * }catch(�����±�Խ���� e){}
 * 
 * �ܽ�
 * 1.�������ж���쳣��Ҫ�����ǾͶ��쳣�Ĵ����ʹ��try ׷�Ӷ���쳣��Ӧ��catch
 * 2.����쳣��catch׽���ͻ�ִ�� try{}catch(){} ����������������ֹ
 * 3.try ����ж���쳣��ֻ��ִ�е�һ���쳣���쳣�����䲻ִ�У�try�еģ�
 * 4.����ʹ�ö�̬�����쳣 Exception�������Խ������е�����ʱ�쳣��
 * 5.���catch��ִ��˳�򣬴��ϵ��£�������ַ���Ĺ�ϵ��һ��Ҫ�������ϸ������£���Ϊ�����������
 * �����쳣��Զִ�в�������ʱ��ᱨ�������Ҳ����ν�Ĳ�����ִ�д��루�ϻ����룩��
 * 6.�쳣һ��ϸ������ҪΪ�˷��㶼��Exception
 * 7.�쳣���ã����ǵ������������ʱ���׸��û�����ȡ�����Ľ��������
 * 
 * 
 * 
 * �Զ����쳣
 * class NoIpException extends Exception{	
	public NoIpException(String msg){
		super(msg);
	}
	}
 * 1.�̳�Exception ���Զ����쳣�����ҲҪ��Exception��������ع淶���ѡ�
 * 
 * ����ʱ�쳣
 * RuntimeException ����쳣���Ե������ӣ���������װ���쳣�׳��� �����߿��Դ���Ҳ�ɲ����������׳���ʱ���Լ��ĺ���Ҳ���Բ���throws������
 * throw new RuntimeException(new Exception()); ʹ�ÿ��Ӱ�װһ�� �Ϳ��Բ���throws �����͵����ߴ����ˡ�
 * �������û�в��񣬳������쳣�����ֹͣ�ˡ�
 * 
 * ������ʱ�쳣���Ǳ����ʱ���ȥ���
 * ��������˷�����ʱ�쳣������try catch �� throws �ӳ�ȥ����
 * ֻҪ�ǲ��̳���RuntimeException ���Ƿ������쳣��
 * �Զ�����쳣��һ�㶼�Ƿ�����ʱ�쳣
 * 
 * �����д������쳣�ķ�����ֻ���׳��ȸ��༶��С�Ļ��߲��׳������� �����׳������쳣������׳������쳣��
 * 
 * finally �ʺϷ��ͷ���Դ�Ĵ��롣�����Ƿ��쳣����ִ�еĴ���顣�������˳��˾Ͳ�ִ���ˡ�ֻ��System.exit(0); ����ֹͣ��return ������ֹͣ��
 */
package always_revision;
 
/**
 * @author www.23.com
 *
 */
public class TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Throwable t = new Throwable("myself create message");
		call();
		
	}
	static void call(){
		try{
			int a = 1;
			System.out.println(a / 0);
		} catch(Exception e){
			e.printStackTrace();
			 
		}
	}
	static void noIp() throws NoIpException{
		throw new NoIpException("no ip address");
	}
}

class NoIpException extends Exception{	
	public NoIpException(String msg){
		super(msg);
	}
}
