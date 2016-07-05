package com.tr.gameclient.tools;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/***
 * //get   ?aaa=md5(name/age/zhangsan/15)
  //post  name=md5(zhangsan,15,identity);
 * @author Administrator
 * MD5 Tools
 */
public class AAA {

	/***
	 * 
	 * @param par zhangsan,15,identit
	 * y
	 * @return aaa=md5(zhangsan,15,identity);
	 */
	public static String postMD5POST(String par){
		 par+="bbb";
		 System.out.println(par);
		  MessageDigest messageDigest = null;  
		  
	        try {  
	            messageDigest = MessageDigest.getInstance("MD5");  
	  
	            messageDigest.reset();  
	  
	            messageDigest.update(par.getBytes("UTF-8"));  
	        } catch (NoSuchAlgorithmException e) {  
	            System.out.println("NoSuchAlgorithmException caught!");  
	            System.exit(-1);  
	        } catch (UnsupportedEncodingException e) {  
	            e.printStackTrace();  
	        }  
	  
	        byte[] byteArray = messageDigest.digest();  
	  
	        StringBuffer md5StrBuff = new StringBuffer();  
	  
	        for (int i = 0; i < byteArray.length; i++) {              
	            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)  
	                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));  
	            else  
	                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
	        }  
	  
	        return md5StrBuff.toString(); 
	}
	/***
	 * get?aaa=md5(name/age/zhangsan/15)
	 * @return aaa=md5(name/age/zhangsan/15)
	 */
	public static String getMD5GET(String url) { 
		
		//String url="http://api.23.com/user/add_uimg_head";
		String result="";
		if (url.contains(".com")) {
			result=url.substring(url.indexOf(".com"),url.length());
		}else{
			result=url.substring(url.indexOf(".21"),url.length());
		}
	//	String result=url.substring(url.indexOf(".com"),url.length());
		
		result=result.replace("/", "*");
		String array[]=result.split("\\*");
		result="";
		for (int i = 1; i < array.length; i++) {
			result+=array[i];
		}
		result
		+="bbb";
		System.out.println(result);
        MessageDigest messageDigest = null;  
  
        try {  
            messageDigest = MessageDigest.getInstance("MD5");  
  
            messageDigest.reset();  
  
            messageDigest.update(result.getBytes("UTF-8"));  
        } catch (NoSuchAlgorithmException e) {  
            System.out.println("NoSuchAlgorithmException caught!");  
            System.exit(-1);  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
  
        byte[] byteArray = messageDigest.digest();  
  
        StringBuffer md5StrBuff = new StringBuffer();  
  
        for (int i = 0; i < byteArray.length; i++) {              
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)  
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));  
            else  
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
        }  
  
        return md5StrBuff.toString();  
    }
}
