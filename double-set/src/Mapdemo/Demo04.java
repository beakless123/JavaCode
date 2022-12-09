package Mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//Map集合的遍历方式
//1.将Map集合里的键单独存在一个单列集合Set中 map.keySet()，用单列集合的遍历方式遍历键，再用键获取值 map.get()
//2.将Map集合里的键值对Entry存在一个单列集合Set中 map.entrySet()，用单列集合的遍历方式遍历键，再获取键和值 Entry.getKey()和Entry.getValue()
//3.直接用forEach的lambda表达式形式
public class Demo04 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("郭靖","黄蓉");
        map.put("杨过","神雕");
        map.put("小龙女","玉蜂");

        map.forEach((String s, String s2) ->
                System.out.println(s+"="+s2)
        );
    }
}
