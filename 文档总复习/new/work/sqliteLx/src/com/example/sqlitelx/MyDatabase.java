package com.example.sqlitelx;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper {

	/**
	 * 构造方法
	 * @param context 	上下文对象 如果在测试框架里面使用getContext() 虚拟的上下文对象给测试框架用，因为测试框架没有上下文对象。
	 * @param name		数据库文件名 最好带着扩展名.db
	 * @param factory	游标工厂，这个可以理解为结果集对象 没有就穿null 使用默认的
	 * @param version	数据库版本大于等于1， 如果更新了这个会触发onUpgrade
	 * 创建数据库会触发onCreate
	 */
	public MyDatabase(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * 创建的时候会触发这个方法
	 * @parameterSQLiteDatabase db 数据库对象
	 */
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		System.out.println("数据库创建了");
		//得到数据库对象
		//使其执行一条sql语句
		//创建表 
		//android 规则是主键是_id 不是强制的
		db.execSQL("create table if not exists cktable(_id int(10) PRIMARY key)");
		
	}

	@Override
	/**
	 * 更新的时候会触发这个方法 --修改version 值
	 */
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		System.out.println("数据库更新");
	}

}
