package com.tr.gameclient.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class asss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://api.23.com/user/add_user_gameid");
			URLConnection http = url.openConnection();

			http.setRequestProperty("accept", "*/*");
			http.setRequestProperty("connection", "Keep-Alive");
			http.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			http.setDoOutput(true);
			http.setDoInput(true);

			PrintWriter pt = new PrintWriter(http.getOutputStream());
			pt.print("uid=124&game_id=1210&is_del=0");
			pt.flush();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					http.getInputStream()));
			String tmp = null;
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
