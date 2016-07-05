package com.example.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Sqlites extends SQLiteOpenHelper {

	public Sqlites(Context context, String name, CursorFactory factory,
			int version) {
		//context 上下文对象
		//name 是db名称
		//factory 结果集对象
		//当前数据的版本，如果要动到结构等等修改这个值。 这个版本大于等于1.
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	//数据库创建的时候调用
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		System.out.println("数据库被创建了");
	}
	//数据库升级的时候调用，比如修改表结构等等 .
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		System.out.println("数据库升级了");

	}

}
