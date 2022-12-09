package HashMapdemo;
//Map集合案例-统计投票人数
//需求
//某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(（A、B、C、D)）,每个学生只
//能选择一个景点，请统计出最终哪个景点想去的人数最多。

import java.util.HashMap;
import java.util.Random;
import java.util.function.BiConsumer;

public class Demo02 {
    public static void main(String[] args) {
        Random r = new Random();
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('A', 0);
        hm.put('B', 0);
        hm.put('C', 0);
        hm.put('D', 0);
        int valueA = 0;
        int valueB = 0;
        int valueC = 0;
        int valueD = 0;

        for (int i = 0; i < 80; i++) {
            char c = (char) r.nextInt(65, 69);
            System.out.println(c);
            switch (c) {
                case 'A' -> {
                    valueA++;
                    hm.put(c, valueA);
                    break;
                }
                case 'B' -> {
                    valueB++;
                    hm.put(c, valueB);
                    break;
                }
                case 'C' -> {
                    valueC++;
                    hm.put(c, valueC);
                    break;
                }
                case 'D' -> {
                    valueD++;
                    hm.put(c, valueD);
                    break;
                }
            }
        }
        hm.forEach((Character character, Integer integer) ->
                System.out.println(character + "=" + integer)
        );
    }
}
