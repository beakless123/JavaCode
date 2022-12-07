package Collectiondemo;
//Coolection 的常用方法

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

//  public boolean add(E e)                 把给定的对象添加到当前集合中
//  public void clear()                     清空集合中所有的元素
//  public boolean remove(E e)              把给定的对象在当前集合中删除
//  public boolean contains(0bject obj)     判断当前集合中是否包含给定的对象
//  public boolean isEmpty()                判断当前集合是否为空
//  public int size()                       返回集合中元素的个数/集合的长度
/*注意点：
        Collection是一个接口,我们不能直接创建他的对象。
        所以，现在我们学习他的方法时，只能创建他实现类的对象。
        实现类：ArrayList
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建Collection对象
        Collection<String> collectionList = new ArrayList<>();
        Collection<String> collectionSet = new HashSet<>();
        //1.添加  public boolean add(E e) 把给定的对象添加到当前集合中
        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "ccc";
        String str4 = "aaa";

        collectionList.add(str1);
        collectionList.add(str2);
        boolean b1 = collectionList.add(str3);
        boolean b2 = collectionList.add(str4);

        collectionSet.add(str1);
        collectionSet.add(str2);
        boolean b3 = collectionSet.add(str3);
        boolean b4 = collectionSet.add(str4);

        System.out.println(b1);//true,进行添加是会返回Boolean值判断是否添加成功
        System.out.println(b2);//true,实现类为List系列的集合可以重复添加
        System.out.println(b3);//false,,进行添加是会返回Boolean值判断是否添加成功
        System.out.println(b4);//true,实现类为Set系列的集合可以不重复添加

        System.out.println(collectionList);//[aaa, bbb, ccc, aaa]
        System.out.println(collectionSet);//[aaa, bbb, ccc]

        //2.清空  public void clear() 清空集合中所有的元素
//        collectionSet.clear();
//        collectionList.clear();
//
//        System.out.println(collectionList);//[]
//        System.out.println(collectionSet);//[]

        //3.public boolean remove(E e)  把给定的对象在当前集合中删除
        collectionSet.remove("aaa");
        collectionList.remove("aaa");

        System.out.println(collectionSet);//[bbb, ccc]
        System.out.println(collectionList);//[bbb, ccc, aaa],有多个时删除靠前的

        //4.public boolean contains(0bject obj) 判断当前集合中是否包含给定的对象
        //如果在集合中存储的是自定义对象，需要重写equals方法
        boolean b5 = collectionSet.contains("aaa");
        boolean b6 = collectionList.contains("aaa");

        System.out.println(b5);//false
        System.out.println(b6);//true

        //5.public boolean isEmpty()    判断当前集合是否为空
        Collection<Student> collectionEmpty = new ArrayList<>();

        boolean b7 = collectionEmpty.isEmpty();
        boolean b8 = collectionSet.isEmpty();
        boolean b9 = collectionList.isEmpty();

        System.out.println(b7);//true
        System.out.println(b8);//false
        System.out.println(b9);//false

        //6.public int size()   返回集合中元素的个数/集合的长度
        int sum1 = collectionEmpty.size();
        int sum2 = collectionSet.size();
        int sum3 = collectionList.size();

        System.out.println(sum1);//0
        System.out.println(sum2);//2
        System.out.println(sum3);//3

        //
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("zhangsan",18);

        collectionEmpty.add(s1);

        boolean b10 = collectionEmpty.contains(s2);

        System.out.println(b10);//true
    }

}
