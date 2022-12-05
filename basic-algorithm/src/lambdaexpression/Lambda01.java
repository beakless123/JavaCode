package lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;
//需求：{"aa","a","aaaa","aaa"}->[a, aa, aaa, aaaa]
public class Lambda01 {
    public static void main(String[] args) {
        String[] arr = {"aa","a","aaaa","aaa"};
        //匿名内部类方式
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() -o2.length() ;
//            }
//        });
        //lambda完整格式
        Arrays.sort(arr, (String o1, String o2) ->{
                 return o1.length() -o2.length() ;
             }
         );
        //lambda省略格式
        //小括号:数据类型可以省略，如果参数只有一个，小括号还可以省略
        //大括号:如果方法体只有一行，return，分号，大括号都可以省略
        Arrays.sort(arr, (o1, o2) -> o1.length() -o2.length());

        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}
