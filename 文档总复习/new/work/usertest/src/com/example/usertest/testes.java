package com.example.usertest;

import android.test.AndroidTestCase;

public class testes extends AndroidTestCase {
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
