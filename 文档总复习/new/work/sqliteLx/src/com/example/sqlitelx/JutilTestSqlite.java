package com.example.sqlitelx;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.text.AndroidCharacter;

public class JutilTestSqlite extends android.test.AndroidTestCase {
	//getContext()虚拟上下文对象不能写在属性上。private a = getContext() 是得不到的。
	public void testSqlite(){
		//sqlite没有字段类型全部都是字符串的(这个指的是插入的时候不检测，但是如果数据库类型是个int 你强插一个字符串会把字符串转数字)，为啥创建表还要指定类型，是给程序员看的。
		//讲是这么讲的，但是实验还是检测了数据类型，不对直接就报错了。
		
		System.out.println("kstart");
		//创建自定义的数据库
		MyDatabase db = new MyDatabase(getContext(), "test.db", null, 1);
		
		//获取数据库对象
		//getReadableDatabase 获取只读的数据库对象，它和getWritableDatabase （读写） 一样，它们都存储在内部存储空间中，存储在应用的databases 文件夹里面，
		//备份的时候需要将文件保存到sd卡中，注意区别，在内部存储空间满了，getReadableDatabase 是只读 getWritableDatabase 读写，在不满的时候都是读写，如果
		//数据库对象不存在，创建返回，如果存在直接返回。
		
		SQLiteDatabase optDB = db.getWritableDatabase();
		//sql 语句使用占位符 ?
		//optDB.execSQL("insert into cktable values(?)", new Object[]{10});
		//增删改查
		//增
		//optDB.execSQL("insert into cktable values(8)");
		//删
		//optDB.execSQL("delete from cktable");
		//改
		//....
		//查询  不能用execSQL
		/**
		 * @param sql sql 语句
		 * @param selectionArgs 查询替换占位符
		 */
		Cursor cr = optDB.rawQuery("select * from cktable", null);
		while(cr.moveToNext()){
			/**
			 * select id,a,b,c
			 * 对应的索引是
			 * 0 1 2 3
			 * 
			 * //cr.getColumnIndex("_id") 查询字段的索引
			 */
			System.out.println("kstart"+cr.getString(cr.getColumnIndex("_id")));
		}
		
		//关闭数据库
		optDB.close();
	}
	
	@Override
	/**
	 * 测试方法执行前会调用这个方法，所以可以把 getContext 放到这里面初始化 成员。
	 */
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
	
	/**
	 * 测试方法完成后，执行它。close方法可以扔到这里。
	 */
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
}


