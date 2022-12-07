package Collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

//Collection的遍历方式
public class Dome02 {
    //迭代器
    //增强for
    //lambda表达式
    public static void main(String[] args) {

        Collection<Student> collection = new ArrayList<>();
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",18);
        Student s3 = new Student("wangwu",20);
        Student s4 = new Student("zhaoliu",19);
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        collection.add(s4);
        //1.迭代器遍历
        //获取迭代器对象
        Iterator<Student> iterator = collection.iterator();//指针初始位置为0索引位置
        while (iterator.hasNext()){//iterator.hasNext() 确认指针位置的集合元素是否存在
            Student s = iterator.next();//iterator.next() 返回当前索引位置的值并将指针移动到下一个索引的位置
            System.out.println(s);
        }
        System.out.println("-------------------------------");
        //2.增强for遍历
        for (Student student : collection) {
            System.out.println(student);
        }
        System.out.println("-------------------------------");

        //3.forEach的lambda表达式遍历
        collection.forEach(student -> System.out.println(student));
    }
}
