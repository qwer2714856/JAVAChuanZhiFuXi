package always_revision;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Library {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		ArrayList<User> users=new ArrayList<User>();
		users.add(new User("admin","admin"));
		ArrayList<Book> books=new ArrayList<Book>();
		books.add(new Book("JavaWeb入门     ", "老赵", "清华出版社        ", "89.0 ", "1234560", "2010-10-1"));
		books.add(new Book("JavaEE项目实践", "老汤", "机械工业出版社", "189.0", "1234561", "2010-10-2"));
		books.add(new Book("Java基础入门      ", "老钟", "北大出版社        ", "50.0 ", "1234562", "2010-10-3"));
		books.add(new Book("HTML入门             ", "老张", "邮电出版社         ", "85.0 ", "1234563", "2010-10-4"));
		books.add(new Book("XML入门                ", "老张", "电力出版社        ", "75.0 ", "1234564", "2010-10-5"));
		books.add(new Book("Android入门     ", "老蔡", "传智出版社        ", "100.0", "1234565", "1999-10-6"));
		
		while(true){
			System.out.println("请选择功能：（A）用户登录  （B）用户注册  （Q）退出系统");
			String option=scan.next();
			String id=null;
			if("b".equalsIgnoreCase(option)){
				reg(scan, users);
			}else if("a".equalsIgnoreCase(option)){
				System.out.println("请输入用户名：");
				id=scan.next();
				System.out.println("请输入密码：");
				String password=scan.next();
				Iterator<User> it=users.iterator();
				boolean flag=false;
				boolean FLAG=false;
				while(it.hasNext()){
					User user=it.next();
					if("admin".equals(id)&&"admin".equals(password)){
						flag=true;
					}else if(user.id.equals(id)&&user.password.equals(password)){
						FLAG=true;
					}
				}
				outer:if(flag){
					System.out.println("欢迎管理员admin");
					while(true){
						System.out.println("欢迎使用图书管理系统操作图书：（A）查看图书  （B）增加图书  （C）修改图书  （D）删除图书  ");
						System.out.println("（E）修改用户名  （F）修改密码  （G）修改用户  （H）删除用户");
						System.out.println("（I）查看所有用户  （Q）注销");
						String option1=scan.next();
						if("a".equalsIgnoreCase(option1)){
							showBook(scan, books);
						}else if("b".equalsIgnoreCase(option1)){
							addBook(scan, books);
						}else if("c".equalsIgnoreCase(option1)){
							//while(true){
								modiBook(scan, books);
								
							//}
						}else if("d".equalsIgnoreCase(option1)){
							
								delBook(scan, books);
						}else if("e".equalsIgnoreCase(option1)){
							System.out.println("请输入要修改的用户名：");
							String name=scan.next();
							
					
						}else if("f".equalsIgnoreCase(option1)){
							
							
						}else if("g".equalsIgnoreCase(option1)){
							System.out.println(users);
							System.out.println("请输入要修改的用户名：");
							String name=scan.next();
							Object[] o=users.toArray();
							String id1=null;
							boolean flag1=false;
							boolean flag2=false;
							for(int i=0;i<o.length;i++){
								User u=(User)o[i];
								if(name.equals(u.id)){
									System.out.println("请输入修改的用户名：");
									id1=scan.next();								
									System.out.println("请输入修改用户的密码：");
									String password1=scan.next();
									if(id1.matches("[a-zA-Z]\\w{5,}")&&password1.matches("\\d{6,}")){
										u.setId(id1);	
										u.setPassword(password1);
										flag1=true;
									}else{
										flag2=true;
									}
									
								}
							}
							if(flag1){
								System.out.println("修改成功");
								
							}else if(flag1==false){
								if(flag2==true){
									System.out.println("用户名或密码不规范，用户名首位为字母，至少6位，密码只能为数字，至少6位");
									continue;
								}
								System.out.println("无此用户，请核实后再执行操作");
							}
							
						}else if("h".equalsIgnoreCase(option1)){
							delUser(scan, users);
							
						}else if("i".equalsIgnoreCase(option1)){
							System.out.println(users);
						}else if("q".equalsIgnoreCase(option1)){						
							break outer;						
						}else{
							System.out.println("输入错误，请重新输入");
						}
					}
					
				}
				outer1:if(FLAG){
					System.out.println("欢迎登录");
					while(true){
						System.out.println("欢迎使用图书管理系统操作图书：（A）查看图书  （B）增加图书  （C）修改图书  （D）删除图书  ");
						System.out.println("（E）修改用户名  （F）修改密码  （Q）注销");						
						String option1=scan.next();
						if("a".equalsIgnoreCase(option1)){
							showBook(scan, books);
						}else if("b".equalsIgnoreCase(option1)){
							addBook(scan, books);
						}else if("c".equalsIgnoreCase(option1)){
							//while(true){
								modiBook(scan, books);
								
							//}
						}else if("d".equalsIgnoreCase(option1)){
							
								delBook(scan, books);
						}else if("e".equalsIgnoreCase(option1)){
							System.out.println("请输入要修改的用户名：");
							String name=scan.next();
							
					
						}else if("f".equalsIgnoreCase(option1)){
							
							
						}else if("q".equalsIgnoreCase(option1)){						
							break outer1;							
						}else{
							System.out.println("输入错误，请重新输入");
						}
					}
					
				}else{
					System.out.println("登录失败");
				}
				
			}else if("q".equalsIgnoreCase(option)){
				System.exit(0);
			}else{
				System.out.println("您的输入有误，请重新选择");
			}
		}
	}

	public static void delUser(Scanner scan, ArrayList<User> users) {
		System.out.println(users);
		System.out.println("请输入要删除的用户名：");
		boolean flag1=false;
		String name=scan.next();
		Object[] o=users.toArray();
		for(int i=0;i<o.length;i++){
			User u=(User)o[i];
			if(name.equals(u.id)){
				users.remove(i);
				flag1=true;
			}
		}
		if(flag1){
			System.out.println("删除成功");
		}else if(flag1==false){								
			System.out.println("无此用户，请核实后执行操作");
			
		}
	}

	public static void delBook(Scanner scan, ArrayList<Book> books) {
		System.out.println("请输入要删除的书号：");
		String num=scan.next();
		Object[] o=books.toArray();
		boolean flag1=false;
		for(int i=0;i<o.length;i++){
			Book b=(Book)o[i];
			if(Integer.parseInt(num)==Integer.parseInt(b.num)){
				System.out.println("确定要删除该书么？（Y）是 （N）否");
				String option3=scan.next();
				if("y".equalsIgnoreCase(option3)){
					books.remove(i);
					flag1=true;
					System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
					System.out.println(books);											
				}
				
			}														
		
		}
		if(flag1==false){
			System.out.println("无该书，请核实书号重新查找");
}
	}

	public static void modiBook(Scanner scan, ArrayList<Book> books) {
		System.out.println("请输入要修改的书号：");
		String num=scan.next();
		boolean flag1=false;
		Object[] o=books.toArray();
		for(int i=0;i<o.length;i++){
			Book b=(Book)o[i];									
			if(Integer.parseInt(b.num)==Integer.parseInt(num)){										
				System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
				System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date);
				System.out.println("请输入要修改的属性：（A）书名修改 （B）作者修改 （C）出版社修改 （D）价格修改 （E）书号修改 （F）出版日期修改 （G）放回上一级");
				String option3=scan.next();
				if("a".equalsIgnoreCase(option3)){
					System.out.println("请输入要书名：");
					String name=scan.next();
					b.name=name;
					System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
					System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date);
					flag1=true;
					break;
				}else if("b".equalsIgnoreCase(option3)){
					System.out.println("请输入要作者：");
					String autor=scan.next();
					b.autor=autor;
					System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
					System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date);
					flag1=true;
					break;
				}else if("c".equalsIgnoreCase(option3)){
					System.out.println("请输入要出版社：");
					String publish=scan.next();
					b.publish=publish;
					System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
					System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date);
					flag1=true;
					break;
				}else if("d".equalsIgnoreCase(option3)){
					System.out.println("请输入要价格：");
					String price=scan.next();
					b.price=price;
					System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
					System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date);
					flag1=true;
					break;
				}else if("e".equalsIgnoreCase(option3)){
					System.out.println("请输入要书号：");
					String num1=scan.next();
					b.num=num1;
					System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
					System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date);
					flag1=true;
					break;
				}else if("f".equalsIgnoreCase(option3)){
					System.out.println("请输入要出版日期：");
					String date=scan.next();
					b.date=date;
					System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
					System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date);
					flag1=true;
					break;
				}else if("g".equalsIgnoreCase(option3)){
					flag1=true;
					break;
				}else{
					System.out.println("选择有误，请重新选择");
				}
			}
			
		}
		if(flag1==false){
			System.out.println("无该书，请核实书号重新查找");
		}
	}

	public static void addBook(Scanner scan, ArrayList<Book> books) {
		System.out.println("增加图书：");
		System.out.println("请输入书名：");
		String name=scan.next();
		System.out.println("请输入作者名：");
		String autor=scan.next();
		System.out.println("请输入出版社：");
		String publish=scan.next();
		System.out.println("请输入价格：");
		String price=scan.next();
		System.out.println("请输入书号：");
		String num=scan.next();
		System.out.println("请输入出版日期：");
		String date=scan.next();
		System.out.println("新书信息如下：书名："+name+" 作者："+autor+" 出版社："+publish+" 价格："+price+" 书号："+num+" 出版日期："+date);
		
		System.out.println("是否保存该图书：（Y）是 （N）否");
		String choose=scan.next();
		if("y".equalsIgnoreCase(choose)){
			books.add(new Book(name, autor, publish, price, num, date));
			System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
			System.out.println(books);
		}else if("n".equalsIgnoreCase(choose)){
			
		}
	}

	public static void showBook(Scanner scan, ArrayList<Book> books) {
		System.out.println("查看图书");
		System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
		System.out.println(books);
		/*Object[] obj=books.toArray();
		for(int i=0;i<obj.length;i++){
			Book b=(Book)obj[i];
			System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date+"\r\n");
		}*/
		while(true){
			System.out.println("请选择查看方式：（A）价格排序  （B）作者排序  （C）出版日期排序  （E）返回上一级");
			String option2=scan.next();
			if("a".equalsIgnoreCase(option2)){
				priceSort(books);
			}else if("b".equalsIgnoreCase(option2)){
				autorSort(books);
			}else if("c".equalsIgnoreCase(option2)){
				dateSort(books);
			}else if("e".equalsIgnoreCase(option2)){
				break;
			}else{
				System.out.println("您的选择有误，请重新选择");
			}
		}
	}

	public static void dateSort(ArrayList<Book> books) {
		Object[] o=books.toArray();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<o.length-1;i++){
			for(int j=i+1;j<o.length;j++){
				Book b1=(Book)o[i];
				Book b2=(Book)o[j];

				}
				/*if(){
					Object temp=o[i];
					o[i]=o[j];
					o[j]=temp;
				}*/
			
		}
		System.out.println("|书名|      \t|作者|      \t|出版社|      \t|价格|      \t|书号|      \t|出版日期|");
		for(int i=0;i<o.length;i++){
			Book b=(Book)o[i];
			System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date+"\n");
		}
	}

	public static void autorSort(ArrayList<Book> books) {
		Object[] o=books.toArray();
		for(int i=0;i<o.length-1;i++){
			for(int j=0;j<o.length-1-i;j++){
				Book b1=(Book)o[i];
				Book b2=(Book)o[j];
				
				if(b1.autor.equals(b2.autor)){
					Object temp=o[j];
					o[j]=o[j+1];
					o[j+1]=temp;
				}
			}
		}
		System.out.println("|书名|      \t|作者|      \t|出版社|      \t|价格|      \t|书号|      \t|出版日期|");
		for(int i=0;i<o.length;i++){
			Book b=(Book)o[i];
			System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date+"\n");
		}
	}

	public static void priceSort(ArrayList<Book> books) {
		Object[] o=books.toArray();
		for(int i=0;i<o.length-1;i++){
			for(int j=i+1;j<o.length;j++){
				Book b1=(Book)o[i];
				Book b2=(Book)o[j];
				if(Double.parseDouble(b1.price)>Double.parseDouble(b2.price)){
					Object temp=o[i];
					o[i]=o[j];
					o[j]=temp;
				}
			}
		}
		System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
		for(int i=0;i<o.length;i++){
			Book b=(Book)o[i];
			System.out.println(b.name+"\t"+b.autor+"\t"+b.publish+"\t"+b.price+"\t"+b.num+"\t"+b.date+"\r");
		}
	}

	public static void reg(Scanner scan, ArrayList<User> users) {
		User user=null;
		while(true){
			System.out.println("请输入用户名：");					
			String id=scan.next();
			user=new User(id,null);
			if(id.matches("[a-zA-Z]\\w{5,}")){
				if(users.contains(user)){
					System.out.println("用户已存在，请重新输入");
				}else{
					break;
				}
			}else{
				System.out.println("用户名不规范，首位必须为字母，最少6位");
			}
		}
		String password=null;
		while(true){
		System.out.println("请输入密码：");
		    password=scan.next();
		    if(password.matches("\\d{6}")){
		    	break;
		    }else{
		    	System.out.println("密码长度必须为6位");
		    }
		}
		user.setPassword(password);
		users.add(user);
		System.out.println("用户注册成功");
	}
}
class User{
	String id;
	String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String id, String password) {
				this.id = id;
		this.password = password;
	}
	@Override
	public boolean equals(Object obj) {
		User u=(User)obj;
		return this.id.equals(u.id);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[用户名："+this.id+" 密码："+this.password+"]";
	}
}
class Book{
	String name;
	String autor;
	String publish;
	String price;
	String num;
	String date;
	public Book(String name, String autor, String publish, String price, String num, String date) {
		
		this.name = name;
		this.autor = autor;
		this.publish = publish;
		this.price = price;
		this.num = num;
		this.date = date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"\t"+this.autor+"\t"+this.publish+"\t"+this.price+"\t"+this.num+"\t"+this.date+"\r";
	}
}