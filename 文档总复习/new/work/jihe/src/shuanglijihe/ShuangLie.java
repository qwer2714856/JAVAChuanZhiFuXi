/**
 * 为什么是双例集合？
 * 现实生活中什么东西是成对出现的，夫妻、一把钥匙对应一把锁。
 * 成对的是映射关系
 * 一个key对应着一个value --键值对
 * 
 * 根接口Map
 * 将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
 * 		
 * -------------------MAP 如果实现了MAP接口的实现类 特点存储的特点都已键值对存在的。键不重复值可以重复
 * 					  | HashMap
 * 					  | TreeMap
 * 					  | HashTable
 * 学这三个实现类   搞定这些方法就搞定MAP了
 * MAP
 * 的方法
 * 
 * 增
 * put(K key, V value) 将指定的值与此映射中的指定键关联（可选操作）。
 * putAll(Map<? extends K,? extends V> m) 从指定映射中将所有映射关系复制到此映射中（可选操作）
 * 删
 * clear() 从此映射中移除所有映射关系（可选操作）。
 * remove(Object key) 如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
 * 改
 * 
 * 查
 * get(Object key)  返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
 * size() 返回此映射中的键-值映射关系数。
 *
 *
 * 判断
 * containsKey(Object key)  如果此映射包含指定键的映射关系，则返回 true。
 * containsValue(Object value)  如果此映射将一个或多个键映射到指定值，则返回 true。
 * equals(Object o)  比较指定的对象与此映射是否相等。
 * isEmpty()  如果此映射未包含键-值映射关系，则返回 true。
 * 
 * 
 * 坑的总结
 * 注意双例的put 和 单例 Set的add add重复无法添加返回false,双例的put如果重复直接赶走覆盖，赶走的返回 注意键是保留的只是值变了。
 * 
 * 
 * put !!一定注意后面的替换前面的只有值，键不变！！！ HashMap 和 TreeMap尤其注意 自定对象key如果重复只是换值保留原来的key
 */
package shuanglijihe;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author www.23.com
 *
 */
public class ShuangLie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,String>mp = new HashMap<String,String>();
		
		 
		
		////////////////////////////////////增加//////////////////////////////////////////////////
	
		//填加一key 一个value,返回值是键所存储的值，如果键第一次用那么返回的是null，如果是第二次用那就返回上次存的值 
		//mp.put("userName", "ding.luchao");
		//键第一次用null
		//System.out.println(mp.put("userNames", "ding.luchao"));
		//键第二次用返回第一次存的值以此类推，第三次返回第二次，谁出局谁返回
		//System.out.print(mp.put("userName", "aaa"));
		
		/*
		 * putAll 没有返回值，作用将一个MAP对象合并到另一个MAP对象中去 如果存在重复key元素后面合并前面的
		 * mp.put("user", "d");
		Map<String,String>l = new HashMap<String,String>();
		l.put("a", "b");
		mp.putAll(l);//没有返回值
		System.out.print(mp);*/
		
		////////////////////////////////////删除//////////////////////////////////////////////////
		
		//根据键删除map中的数据返回被删键对的值,如果不存在该键返回的就是个null
		/*mp.put("ddd", "ll");
		System.out.println(mp.remove("ddds"));*/
		
		//clear() 清空所有数据 无返回值
		
		////////////////////////////////////获取//////////////////////////////////////////////////
		/*
		 * 如果键不存在返回null
		 * mp.put("ddd", "ll");
		System.out.println(mp.get("ddds"));*/
		
		/* 获取map里面键值对的个数
		 * mp.put("ddd", "ll");
		System.out.println(mp.size());*/
		
		////////////////////////////////////判断//////////////////////////////////////////////////
		/* 判断集合中是否包涵指定的key
		 * mp.put("ddd", "ll");
		System.out.println(mp.containsKey("ddd"));*/
		
		/* 判断map集合中是否包涵指定的值
		 * mp.put("ddd", "ll");
		System.out.println(mp.containsValue("ddd"));*/
		
		/*
		 * 判断map是否为空 空true 否则false
		 * System.out.println(mp.isEmpty());*/
		/*mp.put(null, null); 这是不空的null null 也能作为键值
		System.out.println(mp.isEmpty());*/
		
		//equals(Object o)  比较指定的对象与此映射是否相等。
		
		
		
	}

}
