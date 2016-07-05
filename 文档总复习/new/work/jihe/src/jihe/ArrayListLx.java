package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;
/**
 * Users
 * @author www.23.com
 *
 */
class Users{
	static Collection list = new ArrayList();
	public int getSize(){
		return list.size();
	}
	public void sayPeople(){
		Iterator it = list.iterator();
		while(it.hasNext()){
			User u = (User)it.next();
			System.out.println(u.userName);
		}
	}
}

/**
 * User
 * @author www.23.com
 *
 */
class User{
	String userName;
	String password;
	int id;
	int age;
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		String userNames="";
		if(obj instanceof User){
			userNames = ((User) obj).userName;
		}
		return userName.equals(userNames);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return userName;
	}
	
}
/**
 * Register
 * @author www.23.com
 *
 */
class Register extends Users{
	private User p;
	private static Register getRegisters;
	
	private Register(){}
	public static Register getRegister(){
		if(getRegisters == null){
			getRegisters = new Register();
		}
		return getRegisters;
	}

	public void setP(User p) {
		this.p = p;
	} 
	boolean wheatherExists() {
		// TODO Auto-generated method stub
		return list.contains(p);
	}
	void say(){
		System.out.println(p.userName);
	}
	
}
/**
 * Login
 * @author www.23.com
 *
 */
class Login extends Users{
	private User p;
	private static Login getLogins;
	private Login(){}
	public static Login getLogin(){
		if(getLogins == null){
			getLogins = new Login();
		}
		return getLogins;
	}
	public boolean lg(){
		Object[] oj = list.toArray();
		boolean isTrue = false;
		for(int i = 0; i < oj.length; i++){
			User px = (User)oj[i];
			if(px.userName.equals(p.userName) && px.password.equals(p.password)){
				isTrue = true;
				break;
			}
		}
		return isTrue;
	}
	public void setP(User p) {
		this.p = p;
	} 
	void say(){
		System.out.println("»¶Ó­»ØÀ´" + p.userName);
	}
}



public class ArrayListLx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner funct = new Scanner(System.in);
		//Ö÷¹¦ÄÜ
		while(true){
			System.out.println("ÇëÊäÈë²Ù×÷¹¦ÄÜ1×¢²á 2µÇÂ¼ÆäËûÍË³ö");
			byte ft = funct.nextByte();
			
			if(ft == 1){
				//1 ×¢²á
				User p = new User();
				
				System.out.println("username");
				Scanner un = new Scanner(System.in);
				p.userName = un.nextLine();
				
				System.out.println("password");
				Scanner pwd = new Scanner(System.in);
				p.password = pwd.nextLine();
				
				
				try {
					 
					p.id = Users.list.size() + 1;
					
					
					System.out.println("age");
					Scanner age = new Scanner(System.in);
					p.age = Integer.parseInt(age.nextLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("×¢²áÊ§°Ü");
					continue;
				}
				Register rg = Register.getRegister();
				rg.setP(p);
				if(!rg.wheatherExists() && Users.list.add(p)){
					System.out.println("×¢²á³É¹¦ÁË");
					rg.say();
				}else{
					System.out.println("×¢²áÊ§°Ü");
				}
				
				System.out.println("¹²" + rg.getSize() + "ÈË×¢²á");
				rg.sayPeople();
			} 
			else if(ft == 2){
				//2 µÇÂ¼
				System.out.println("µÇÂ¼...");
				User p = new User();
				
				System.out.println("username");
				Scanner un = new Scanner(System.in);
				p.userName = un.nextLine();
				
				System.out.println("password");
				Scanner pwd = new Scanner(System.in);
				p.password = pwd.nextLine();
				Login lg = Login.getLogin();
				lg.setP(p);
				if(lg.lg()){
					lg.say();
				}else{
					System.out.println("µÇÂ¼Ê§°Ü");
				}
				
				
			}else{
				System.out.println("ÍË³ö");
				break;
			}	
		}
	}

}
