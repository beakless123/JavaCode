package Mapdemo;

import java.util.HashMap;
import java.util.Map;

//        v put(K key,v value)                  添加元素
//        v remove(object key)                  根据键删除键值对元素
//        void clear()                          移除所有的键值对元素
//        boolean containsKey(object key)       判断集合是否包含指定的键
//        boolean containsValue(object value)   判断集合是否包含指定的值
//        boolean isEmpty()                     判断集合是否为空
//        int size()                            集合的长度，也就是集合中键值对的个数
public class Demo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        System.out.println("---------------1--------------");
        //1. v put(K key,v value)                  添加元素
        map.put("郭靖","黄蓉");
        map.put("杨过","神雕");
        map.put("小龙女","玉蜂");

        System.out.println(map);//{杨过=神雕, 小龙女=玉蜂, 郭靖=黄蓉}
        System.out.println("---------------2--------------");
        //2. v remove(object key)                  根据键删除键值对元素
        String v1 = map.remove("郭靖");
        System.out.println(v1);//黄蓉 ,返回删除键对应的值
        System.out.println(map);//{杨过=神雕, 小龙女=玉蜂}
        System.out.println("---------------3--------------");
        //3. void clear()                          移除所有的键值对元素
//        map.clear();
//        System.out.println(map);//{}
        System.out.println("---------------4--------------");
        //4.boolean containsKey(object key)       判断集合是否包含指定的键
        boolean b1 = map.containsKey("郭靖");
        boolean b2 = map.containsKey("小龙女");
        System.out.println(b1);//false
        System.out.println(b2);//true
        System.out.println("---------------5--------------");
        //5. boolean containsValue(object value)   判断集合是否包含指定的值
        boolean b3 = map.containsValue("黄蓉");
        boolean b4 = map.containsValue("神雕");
        System.out.println(b3);//false
        System.out.println(b4);//true
        System.out.println("---------------6--------------");
        //6. boolean isEmpty()                     判断集合是否为空
        boolean b5 = map.isEmpty();
        boolean b6 = map2.isEmpty();
        System.out.println(b5);//false
        System.out.println(b6);//true
        System.out.println("---------------7--------------");
        //7. int size()                            集合的长度，也就是集合中键值对的个数
        int sum1 = map.size();
        int sum2 = map2.size();
        System.out.println(sum1);//2
        System.out.println(sum2);//0
    }
}
