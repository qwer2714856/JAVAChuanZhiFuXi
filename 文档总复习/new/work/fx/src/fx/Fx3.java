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
			System.out.println("请选择功能：注册(A) 查看用户(B) ");
			String option = scan.next();
			if (option.equals("A")) {

				System.out.println("请输入用户名");
				String userName = scan.next();
				System.out.println("请输入密码");
				String password = scan.next();
				user[index] = new User(userName, password);
				index++;
				
				user = kr(user);
				
			} else if (option.equals("B")) {
				System.out.println("当前用户有：");
				for (int i = 0; i < index-1; i++) {
					System.out.println("用户名：" + user[i].userName + " 密 码："
							+ user[i].password);
				}
			}

		}

	}
	public static User[] kr(User[] user){
		System.out.println(user.length);
		if(user.length >= 1){
			//因为数组满了我需要一个新的数组来搞定
			User []u = 	new User[user.length*2];
			//创建完了就拷贝
			for(int i = 0; i< user.length;i++){
				u[i] = user[i];
			}
			//拷贝完了也扩容完了那就返回
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