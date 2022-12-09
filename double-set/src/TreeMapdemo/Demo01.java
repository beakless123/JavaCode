package TreeMapdemo;
//需求1:
//        键:整数表示id
//        值:字符串表示商品名称
//        要求:按照id的升序排列、按照id的降序排列

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo01 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"可口可乐");
        treeMap.put(4,"可口不可乐");
        treeMap.put(3,"不可口不可乐");
        treeMap.put(2,"不可口可乐");
        //默认升序
        Set<Map.Entry<Integer,String>> entrySet = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.print(entry.getKey()+"="+entry.getValue()+"  ");//1=可口可乐  2=不可口可乐  3=不可口不可乐  4=可口不可乐
        }
        //降序
        TreeMap<Integer,String> treeMap2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        treeMap2.put(1,"可口可乐");
        treeMap2.put(4,"可口不可乐");
        treeMap2.put(3,"不可口不可乐");
        treeMap2.put(2,"不可口可乐");
        Set<Map.Entry<Integer,String>> entrySet2 = treeMap2.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet2) {
            System.out.print(entry.getKey()+"="+entry.getValue()+"  ");//4=可口不可乐  3=不可口不可乐  2=不可口可乐  1=可口可乐
        }
    }


}
