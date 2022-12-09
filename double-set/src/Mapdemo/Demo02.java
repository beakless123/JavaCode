package Mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

//Map集合的遍历方式
//1.将Map集合里的键单独存在一个单列集合Set中 map.keySet()，用单列集合的遍历方式遍历键，再用键获取值 map.get()
public class Demo02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("郭靖","黄蓉");
        map.put("杨过","神雕");
        map.put("小龙女","玉蜂");

        Set<String> set = map.keySet();
//        System.out.println(set);//[杨过, 小龙女, 郭靖]
        //1.1
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.print(str +"="+map.get(str)+"        ");//杨过=神雕        小龙女=玉蜂        郭靖=黄蓉
        }
        System.out.println("-----------------------------------");
        //1.2
        for (String str : set) {
            System.out.print(str +"="+map.get(str)+"        ");//杨过=神雕        小龙女=玉蜂        郭靖=黄蓉
        }
        System.out.println("-----------------------------------");
        //1.3
        set.forEach((s) ->
                System.out.print(s +"="+map.get(s)+"        ")//杨过=神雕        小龙女=玉蜂        郭靖=黄蓉
        );
    }
}
