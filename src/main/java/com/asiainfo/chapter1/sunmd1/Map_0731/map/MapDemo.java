package com.asiainfo.chapter1.sunmd1.Map_0731.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/31 0031.
 * map:
 * 用途：普通的集合collection都是单列集合，只能存储对象，
 * 比如我们想通过学生学号获得学生姓名，普通集合的做法是存储student对象，遍历集合，取出对象判断学号
 * map已键值对的形式进行存储，key-value，存储学号-姓名，就可以实现通过学号直接获得姓名
 * 功能：
 * 添加--put(key,value);
 * 删除--remove(key)---clear();
 * 获取--entrySet--keySet--values--get(key)--size()
 * 判断--containsKey(key)--containsValue(value)--isEmpty()
 *
 *  Map集合的特点：
 * 		将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
 *
 * Map集合和Collection集合的区别?
 * 		Map集合存储元素是成对出现的，Map集合的键是唯一的，值是可重复的。可以把这个理解为：夫妻对
 * 		Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是可重复的。可以把这个理解为：光棍(11.11)
 *
 * 注意：
 * 		Map集合的数据结构值针对键有效，跟值无关
 * 			HashMap，TreeMap等会讲。
 *		Collection集合的数据结构是针对元素有效
 *
 * Map集合的功能概述：
 * 1:添加功能
 * 		V put(K key,V value):添加元素。这个其实还有另一个功能?先不告诉你，等会讲
 * 			如果键是第一次存储，就直接存储元素，返回null
 * 			如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
 * 2:删除功能
 * 		void clear():移除所有的键值对元素
 * 		V remove(Object key)：根据键删除键值对元素，并把值返回
 * 3:判断功能
 * 		boolean containsKey(Object key)：判断集合是否包含指定的键
 * 		boolean containsValue(Object value):判断集合是否包含指定的值
 * 		boolean isEmpty()：判断集合是否为空
 * 4:获取功能
 * 		Set<Map.Entry<K,V>> entrySet():???
 * 		V get(Object key):根据键获取值
 * 		Set<K> keySet():获取集合中所有键的集合
 * 		Collection<V> values():获取集合中所有值的集合
 * 5：长度功能
 * 		int size()：返回集合中的键值对的对数
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        //添加对象
            //如果键是第一次存储，就直接存储元素，返回null
            //如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
//            System.out.println(map.put("胡歌","霍建华"));//null
//            System.out.println(map.put("胡歌","彭于晏"));//霍建华
        map.put("10010","胡歌");
        map.put("10011","霍建华");
        map.put("10012","彭于晏");
        map.put("10013","袁弘");

        //删除
//        System.out.println("remove:"+map.remove("10010"));
//        map.clear();
//        System.out.println("remove:"+map.remove("10010"));

        //判断
//        System.out.println(map.containsKey("10010"));
//        System.out.println(map.containsKey("1001"));
//
//        System.out.println(map.size());
//        System.out.println(map);
        
        //获取功能
        
        //get(key)
        System.out.println(map.get("10012"));
        
        //entrySet()
        Set<Map.Entry<String,String >> entrys = map.entrySet();
        for (Map.Entry<String,String > entry:entrys) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        //keySet
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+"--"+map.get(key));
        }

        //values
        Collection<String> values = map.values();
        for(String value : values){
            System.out.println(value);
        }

    }


}
