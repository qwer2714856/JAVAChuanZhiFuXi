/**
 * 
 */
package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author www.23.com
 *
 */
public class Factory {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws Exception, ClassNotFoundException {
		// TODO Auto-generated method stub
		Person c = (Person)getInstance("info.txt");
		System.out.println(c);
	}

	public static Object getInstance(String filePath) throws IOException, ClassNotFoundException, NoSuchFieldException, SecurityException, NumberFormatException, IllegalArgumentException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException{
		
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String className = br.readLine();
		Class c = Class.forName(className);
		Constructor ct = c.getDeclaredConstructor(null);
		ct.setAccessible(true);
		Object o = ct.newInstance();
		
		String tmp = null;
		while((tmp = br.readLine()) != null){
			String [] s = tmp.split("=");
			Field fd = c.getDeclaredField(s[0]);
			fd.setAccessible(true);
			
			if(fd.getType() == int.class){
				fd.set(o, Integer.parseInt(s[1]));
				
			}else{
				fd.set(o, s[1]);
			}
		}
		
		
		
		return o;
	}
}
