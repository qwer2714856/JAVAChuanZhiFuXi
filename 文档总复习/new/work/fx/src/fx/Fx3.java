package fx;

import java.util.Arrays;
import java.util.Scanner;

public class Fx3 {
	public static int index = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		User[] user = new User[1];

		while (true) {
			System.out.println("��ѡ���ܣ�ע��(A) �鿴�û�(B) ");
			String option = scan.next();
			if (option.equals("A")) {

				System.out.println("�������û���");
				String userName = scan.next();
				System.out.println("����������");
				String password = scan.next();
				user[index] = new User(userName, password);
				index++;
				
				user = kr(user);
				
			} else if (option.equals("B")) {
				System.out.println("��ǰ�û��У�");
				for (int i = 0; i < index-1; i++) {
					System.out.println("�û�����" + user[i].userName + " �� �룺"
							+ user[i].password);
				}
			}

		}

	}
	public static User[] kr(User[] user){
		System.out.println(user.length);
		if(user.length >= 1){
			//��Ϊ������������Ҫһ���µ��������㶨
			User []u = 	new User[user.length*2];
			//�������˾Ϳ���
			for(int i = 0; i< user.length;i++){
				u[i] = user[i];
			}
			//��������Ҳ���������Ǿͷ���
			user = u;
		}
		return user;
	}
}

class User {
	String userName;
	String password;

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
}