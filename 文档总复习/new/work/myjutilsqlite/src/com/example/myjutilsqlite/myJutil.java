package com.example.myjutilsqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.text.AndroidCharacter;

public class myJutil extends android.test.AndroidTestCase {
	private SQLiteDatabase db;
	public void testMySqlite(){
		db.execSQL("insert into user values(?)", new Object[]{1});
		db.execSQL("insert into user values(?)", new Object[]{2});
		db.execSQL("insert into user values(?)", new Object[]{3});
		db.execSQL("insert into user values(?)", new Object[]{4});
		db.execSQL("insert into user values(?)", new Object[]{5});
		
		//query
		Cursor cr = db.rawQuery("select *from user", null);
		while(cr.moveToNext()){
			System.out.println("dingluchaossl"+cr.getString(cr.getColumnIndex("_id")));
		}
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		MyDatabases db = new MyDatabases(getContext(), "mysql.db", null, 1);
		this.db = db.getWritableDatabase();
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		db.close();
	}
	
	/**
	 * api 增删改查
	 */
	//增
	public void insert(){
		//table 表名
		//nullColumnHack 如果values为空或者size为0 nullColumnHack 是 指定一个字段为null 没有就写null
		//values 和 hashmap一样是键值对赋值字段 key 表索引  value 值
		//返回值是影响的行数，如果返回-1操作失败
		ContentValues values = new ContentValues();
		values.put("_id", 111);
		long affowd = db.insert("user", null, values);
		System.out.println("insert--"+affowd);
	}
	//删除
	public void delete(){
		//table 表名
		//条件字符串多个用and连接
		//占位符的值
		//返回值是影响行数
		int delcount = db.delete("user", "_id = ?", new String[]{"111"});
		System.out.println("delete--"+delcount);
	}
	//修改
	public void update(){
		//table 表名
		//values 和 hashmap一样是键值对赋值字段 key 表索引  value 值 用作set
		//where 条件
		//占位符值
		//返回值是影响行数
		ContentValues values = new ContentValues();
		values.put("_id", 111);
		int upcount = db.update("user", values, "_id = ?", new String[]{"1"});
		System.out.println("update--"+upcount);
	}
	
	//查找
	public void select(){
		//没有就写null
		//返回时Cursor
		Cursor cr = db.query("user", new String[]{"_id"}, "_id = ?", new String[]{"111"}, null, null, null);
		while(cr.moveToNext()){
			System.out.println("mapreduce" + cr.getString(cr.getColumnIndex("_id")));
		}
		
	}
	
	//事物处理
	public void sw(){
		try{
		//开启事物
		db.beginTransaction();
		//sql 语句
		//设置 事物执行成功开始执行。 如果没有使用这句 endTransaction 这个提交了也没用。
		db.setTransactionSuccessful();
		}finally{
		//关闭事物并提交
		db.endTransaction();
		}
		
	}
}
