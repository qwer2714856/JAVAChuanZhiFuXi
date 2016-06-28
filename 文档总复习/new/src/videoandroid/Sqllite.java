/**
 * android 自带数据库sqllite
 * 1.创建一个数据库类，这个类需要继承android.database.sqlite.SQLiteOpenHelper
 * 创建的时候设置一下superclass 为android.database.sqlite.SQLiteOpenHelper
 * 使用jutil 测试数据库
 * 
 * 项目看sqliteLx
 * jutilTestSqlite
 * MyDatabase
 * 
 * 
 * 使用api实现增删改查
 * //增
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
 */
package videoandroid;

/**
 * @author www.23.com
 *
 */
public class Sqllite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
