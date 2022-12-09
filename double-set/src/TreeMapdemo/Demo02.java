package TreeMapdemo;
        /*
        需求2:
        键:学生对象
        值:籍贯
        要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
        */

import java.util.Comparator;
import java.util.TreeMap;

public class Demo02 {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int t = o1.getAge()- o2.getAge();
                t = t==0?o1.getName().compareTo(o2.getName()):t;
                return t;
            }
        });
        Student s1 = new Student("zhangsan",23);
        Student s4 = new Student("zhanaan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        treeMap.put(s1,"武汉");
        treeMap.put(s4,"guangxi");
        treeMap.put(s3,"guangdong");
        treeMap.put(s2,"guangxi");
        System.out.println(treeMap);
    }
}
