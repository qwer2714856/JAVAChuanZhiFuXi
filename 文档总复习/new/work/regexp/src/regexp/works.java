package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class works {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String patternStr = "\\d";
		String telNum = "138639469402";
		System.out.println(telNum.matches(patternStr));*/
		
		/*String patternStr = "(.)\\1+";
		String pp = "С��������ɸɸ�ȥ������ţţţţţѧ";
		String [] fg = pp.split(patternStr);
		System.out.println(Arrays.toString(fg));*/
		
		/*String patternStr = "(\\w)\\1+";
		String zfc = "aaaaaaaa13863946940sssss";
		System.out.println(zfc.replaceAll(patternStr, "$1"));*/
		
		//������Ҫ�õ�Pattern���ƥ����Matcher
		Pattern pt = Pattern.compile("\\b\\d{11}\\b");
		Matcher m = pt.matcher("sdfsdf:22213863916,sdfsd:12345678912");
		while(m.find()){
			System.out.println(m.group());
		}
	}

}
