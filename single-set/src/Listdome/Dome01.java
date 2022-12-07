package Listdome;

import java.util.ArrayList;
import java.util.List;

/*
        List系列集合独有的方法：
        void add(int index,E element)       在此集合中的指定位置插入指定的元素
        E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        E get(int index)                    返回指定索引处的元素
        */
public class Dome01 {
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
        //1.void add(int index,E element)       在此集合中的指定位置插入指定的元素
        String str5 = "eee";
        list.add(3,str5);

        System.out.println(list);//[aaa, bbb, ccc, eee, aaa]

        //2.E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        String e1 = list.remove(4);

        System.out.println(list);//[aaa, bbb, ccc, eee]
        System.out.println("被删除元素为："+e1);//被删除元素为：aaa

        //3. set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        String e2 = list.set(3,"ddd");
        System.out.println(list);//[aaa, bbb, ccc, ddd]
        System.out.println("被修改元素为："+e2);//被修改元素为：eee

        //4.E get(int index)                    返回指定索引处的元素
        String e3 = list.get(1);
        System.out.println(e3);//bbb

        //拓展
        //List系列集合中的两个删除的方法
        //1.直接删除元素
        //2.通过索引进行删除

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.remove(1);//此处删除的是索引1位置的元素，若想删除的是元素1应该如何操作呢？

        System.out.println(list1);//[1, 3]

        Integer e = 1;
        list1.remove(e);

        System.out.println(list1);//[3]
        //小结：因为在调用方法的时候，如果方法出现了重载现象
        //     优先调用，实参跟形参类型一致的那个方法。


    }

}
