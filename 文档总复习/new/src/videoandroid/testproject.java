/**
 * 自动化android 测试
	#测试
	###按岗位划分
	* 黑盒测试：测试逻辑业务
	* 白盒测试：测试逻辑方法
	###按测试粒度分
	* 方法测试：function test
	* 单元测试：unit test
	* 集成测试：integration test
	* 系统测试：system test
	###按测试的暴力程度分
	* 冒烟测试：smoke test
	* 压力测试：pressure test
 * 
 * 
 * 单元测试
 * junit 测试框架
 * 
 * 1，创建一个 Android项目 这个项目就是测试其它项目的， 本身没有任何东西。
 * 2.在mainactivity 创建一个class 文件 -> 指定其superclass 为android.test.AndroidTestCase
 * 3.在测试框架的这个项目的清单文件中加入几个配置
 * 4.和application 同级的
 * <instrumentation 
	    //这个是固定的
	    android:name="android.test.InstrumentationTestRunner"
	    //这个是测试哪个项目的包名
	    android:targetPackage="com.example.jutil"
	    ></instrumentation>
 * 5.和 activity 同级的
 * <uses-library 
            android:name="android.test.runner"
            />
 * 固定的
 * 
 * 6.如果出现 junit 工具条 全是绿色的代表正确
 * 
 * 
 * 测试框架如何使用？
 * 测试的方法如果有返回值
 * int getSum(int i, int j){
		return i + j;
	}
	void say(){
		//判断与预期的值是否相同参数一是预期的值，参数二是实际的值，如果不同直接报错。
		assertEquals(1,getSum(0, 0));
	}
 * 测试的方法如果没有返回值
 * public class testes extends AndroidTestCase {
	int getSum(int i, int j){
		return i + j;
	}
	void test() throws Exception{
		throw new Exception("msg");
	}
	void say() throws Exception{
		//这个是有返回指定可以用断言来做。
		//assertEquals(getSum(0, 0), 1);
		//没有返回值的但是有异常存在的
		//test();
	}
}
 */
package videoandroid;


/**
 * @author www.23.com
 *
 */
public class testproject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
