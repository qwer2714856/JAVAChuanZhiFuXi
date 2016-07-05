import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Login
 */

/**
 * @author www.23.com
 * 
 */
public class Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// login();
		// register();
		
/*		Scanner s = new Scanner(System.in);
		String user = s.next();
		String pwd = s.next();*/
		
	}

	public static void login() {
		System.out.println("please write username");
		Scanner usernames = new Scanner(System.in);
		String username = usernames.next();

		System.out.println("please write password");
		Scanner passwords = new Scanner(System.in);
		String pwd = passwords.next();

		p p1 = new p(username, pwd);

		// read data
		File f = new File("d:/users.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String s = "";
			boolean flg = false;
			while ((s = br.readLine()) != null) {
				if (s.equals(p1.toString())) {
					System.out.println("login ok");
					flg = true;
					break;
				}
			}
			if (!flg) {
				System.out.println("login bad");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void register() {
		System.out.println("please write username");
		Scanner usernames = new Scanner(System.in);
		String username = usernames.next();

		System.out.println("please write password");
		Scanner passwords = new Scanner(System.in);
		String pwd = passwords.next();

		// register user
		p p1 = new p(username, pwd);

		// save to device
		File f = new File("d:/users.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(f, true);
			bw = new BufferedWriter(fw);

			bw.write(p1.toString());
			bw.newLine();

			System.out.println("register success");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		bw = new BufferedWriter(fw);
	}

}

class p {
	String userName;
	String pwd;

	public p(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}

	public String toString() {
		return this.userName + '-' + this.pwd;
	}
}
