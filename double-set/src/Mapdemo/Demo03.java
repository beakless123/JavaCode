package Mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

//Map集合的遍历方式
//1.将Map集合里的键单独存在一个单列集合Set中 map.keySet()，用单列集合的遍历方式遍历键，再用键获取值 map.get()
//2.将Map集合里的键值对Entry存在一个单列集合Set中 map.entrySet()，用单列集合的遍历方式遍历键，再获取键和值 Entry.getKey()和Entry.getValue()
public class Demo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("郭靖","黄蓉");
        map.put("杨过","神雕");
        map.put("小龙女","玉蜂");

        Set<Map.Entry<String,String>> entries = map.entrySet();
//        System.out.println(entries);//[杨过=神雕, 小龙女=玉蜂, 郭靖=黄蓉]
        //2.1
        Iterator<Map.Entry<String,String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        //2.2
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        //2.3
        entries.forEach(stringStringEntry ->
            System.out.println(stringStringEntry.getKey()+"="+stringStringEntry.getValue())
        );
    }
}
