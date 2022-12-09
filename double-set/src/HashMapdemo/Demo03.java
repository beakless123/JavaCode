package HashMapdemo;

import java.util.*;
import java.util.function.BiConsumer;

//Map集合案例-统计投票人数
//需求
//某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(（A、B、C、D)）,每个学生只
//能选择一个景点，请统计出最终哪个景点想去的人数最多。
public class Demo03 {
    public static void main(String[] args) {
        //改进 不用计数器
        //1.定义数组存储景点
        String[] arr = {"A","B","C","D"};
        //2.随机数模拟投票
        Random r = new Random();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
           int index = r.nextInt(arr.length);
           arrayList.add(arr[index]);
        }
        //3.利用hashmap集合统计个数
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String key = arrayList.get(i);
            if(hm.containsKey(key)){
                int value = hm.get(key)+1;
                hm.put(key,value);
            }else {
                hm.put(key,1);
            }
        }
        //4.求最大值
        int max = 0;
        Set<Map.Entry<String,Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()>=max){
                max = entry.getValue();
            }
        }
        //5.获取最大值对应的景点
        Set<Map.Entry<String,Integer>> entries2 = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries2) {
            if(entry.getValue() == max){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
}
