package sms;

import android.util.Log;

public class Sms {

	public Sms(String body, String date, String from, char flg) {
		super();
		this.body = body;
		this.date = date;
		this.from = from;
		this.flg = flg;
	}
	private String body;
	private String date;
	private String from;
	private char flg;
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public char getFlg() {
		return flg;
	}
	public void setFlg(char flg) {
		this.flg = flg;
	}
	
	

}
