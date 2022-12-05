package practice;

import java.util.Arrays;
import java.util.Comparator;

//按照要求进行排序
//
// 定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
// 要求1:属性有姓名、年龄、身高。
// 要求2∶按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
// (姓名中不要有中文或特殊字符，会涉及到后面的知识)
public class practice01 {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend("xioadandan",18,160);
        GirlFriend gf2 = new GirlFriend("lihua",19,160);
        GirlFriend gf3 = new GirlFriend("hanmeimei",15,180);
        GirlFriend gf4 = new GirlFriend("bingbing",15,156);
        GirlFriend gf5 = new GirlFriend("any",18,160);
        GirlFriend gf6 = new GirlFriend("aby",18,160);
        GirlFriend gf7 = new GirlFriend("abx",18,160);
        GirlFriend[] arr = {gf1,gf2,gf3,gf4,gf5,gf6,gf7};

        Arrays.sort(arr, (GirlFriend o1, GirlFriend o2)-> {
                double temp = 0;
                //年龄和身高相同的比较姓名
                if (o1.getHeight()- o2.getHeight()==0 && o1.getAge()- o2.getAge()==0){
                    temp = o1.getName().compareTo(o2.getName());
                }
                //年龄相同比较身高
                else if (o1.getAge()- o2.getAge()==0){
                    temp = o1.getHeight()- o2.getHeight();
                }
                else//按年龄排序
                    temp = o1.getAge()- o2.getAge();

                if (temp > 0) return 1;
                else if (temp == 0) return 0;
                else return -1;
            }
        );

        System.out.println(Arrays.toString(arr));
    }
}
