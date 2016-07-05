package com.example.sqllite;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;

public class jutil extends AndroidTestCase {
	public void testDB(){
		//测试框架是没有上下文的所以这里传虚拟上下文
		//getContext() 
		//后缀名最好写上
		//游标工厂对象(可以理解为结果集对象)，没有就传null使用默认的
		Sqlites sqlites = new Sqlites(getContext(), "xiaobiesan.db", null, 1);
		//如果数据库不存在就先创建，如果存在直接打开，获取一个可写数据库对象，返回对象是可读可写的数据库对象。
		SQLiteDatabase dbDatabase =	sqlites.getWritableDatabase();
		//sqlites.getReadableDatabase(); 和  getWritableDatabase 在硬盘不满的时候是一样的，如果满了，getReadableDatabase 返回的是只读的。 --这里的硬盘是内部存储的。//备份的时候需要将数据库文件备份到sd卡，在自己应用文件下的 databases文件夹
		//当version 号改变的时候就会触发 更新的方法。
		
	}
}
