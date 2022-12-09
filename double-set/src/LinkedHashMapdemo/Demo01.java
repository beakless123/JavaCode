package LinkedHashMapdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//特点：有序，无重复，无索引
public class Demo01 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("aaa",1236);
        linkedHashMap.put("abc",789);
        linkedHashMap.put("a",45);
        Set<Map.Entry<String,Integer>> set = linkedHashMap.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.print(entry.getKey()+"="+entry.getValue()+"  ");//aaa=1236  abc=789  a=45
        }
    }
}
