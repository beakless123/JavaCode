package TreeMapdemo;
//需求:字符串"aababcabcdabcde"
// 请统计字符串中每一个字符出现的次数，并按照以下格式输出输出结果:
// a (5) b (4) c (3) d (2) e ( 1)

import java.util.*;

public class Demo03 {
    public static void main(String[] args) {
        //1.将字符串拆成单个字符存在数组或集合中
        String str = "aababcabcdabcde";
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        //2.需要排序 用TreeMap集合，统计字符出现个数
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            char key = arr[i];
            if(treeMap.containsKey(key)){
                int value = treeMap.get(key)+1;
                treeMap.put(key,value);
            }else {
                treeMap.put(key,1);
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet = treeMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.print(entry.getKey()+"("+entry.getValue()+") ");
        }
    }
}
