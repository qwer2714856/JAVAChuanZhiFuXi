import java.io.*;
class trycatch{
	public static void main(String[] args)	throws Exception{
		//文件操作先找到文件
		File file = new File("./aaa.txt");
		//然后建立管道
		FileReader bfi = new FileReader(file);
		//从管道往外读数据
		BufferedReader br = new BufferedReader(bfi);
		try{
			String str = "";
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
		}catch(IOException e){
			
		}finally{
			try{
				br.close();
				bfi.close();
				System.out.println("释放资源成功");
			}
			catch(IOException e){
				System.out.println("释放资源失败");
			}
	   }
	}
}
 