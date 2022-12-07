package Listdome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/*
    List系列集合的五种遍历方式：
        1.迭代器
        2.列表迭代器
        3.增强for
        4.Lambda表达式
        5.普通for循环
 */
public class Demo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "ccc";
        String str4 = "aaa";
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);

        //1.迭代器遍历
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println("---------2---------");
        //2.增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------3---------");
        //3.forEach lambda表达式遍历
        list.forEach((String s)-> {
            System.out.println(s);
        });
        System.out.println("---------4---------");
        //4.普通for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------5---------");
        //5.列表迭代器遍历
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        //额外添加了一个方法：在遍历的过程中，可以添加元素
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = listIterator.next();
            if(str.equals("ccc")){
                listIterator.add("ddd");
            }
            System.out.print(str+" ");//aaa bbb ccc aaa ,添加的元素不会在本次迭代器中遍历
        }
        System.out.println();
        System.out.println(list);//[aaa, bbb, ccc, ddd, aaa]
    }
}
