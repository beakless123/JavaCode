package HashMapdemo;
//需求
// 创建1个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
// 存储三个键值对元素，并遍历
// 要求:同姓名，同年龄认为是同一个学生

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap = new HashMap<>();
        Student s1 = new Student("zhangsan",18,"wubeiwuhan");
        Student s2 = new Student("lisi",18,"wubeijingzhou");
        Student s3 = new Student("wangwu",18,"wubeixiangyang");
        Student s4 = new Student("wangwu",19,"wubeiwuhan");
        Student s5 = new Student("wangwu",18,"wubeiwuhan");
        hashMap.put(s1,s1.getAdders());
        hashMap.put(s2,s2.getAdders());
        hashMap.put(s3,s3.getAdders());
        hashMap.put(s4,s4.getAdders());
        hashMap.put(s5,s5.getAdders());
        //System.out.println(hashMap);
        hashMap.forEach((Student student, String s)->
                System.out.println(student+"="+s)
        );

    }
}
