package com.itheima.dome1.test1;

public class DayFour {
    public static void main(String[] args) {
        //        Random random = new Random();
//        int i = random.nextInt(0,1);
//        System.out.println(i);
        //        ## 题目1:
//```java
//        需求:
//        请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,
//                遍历数组,在同一行打印所有元素,元素之间用空格隔开,
//                比如1:如果数组为{1,2,3,4,5}打印结果:1 2 3 4 5
//        比如2:如果数组为{1,2,3,4,5}打印结果:[1, 2, 3, 4, 5]
//```
//### 你的答案:
//        int[] array1 = {1,2,3,4,5};
////        int array2[] = new int[]{5,4,3,2,1};
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i]+" ");
//        }

        int sum = getSum();
        System.out.println("所有元素的和为："+sum);
        int min = getMin();
        System.out.println("最小值为："+min);
        int max = getMax();
        System.out.println("最大值为："+max);
        int avg = (sum-max-min)/(getLength()-2);
        System.out.println("平均值为："+avg);
    }


//        ## 题目2
//```java
//        需求:
//        现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的和并打印。
//```
        public static int getSum(){
            int[] array1 = {100,50,90,60,80,70};
            int sum = 0;
            for (int i = 0; i < array1.length; i++) {
                sum = sum +array1[i];
            }
//            System.out.println(sum);
            return sum;
        }


//        ## 题目3
//```java
//        需求:
//        现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最小值并打印。
//```
        public static int getMin(){
            int[] array1 = {100,50,90,60,80,70};
            int min = array1[0];
            for (int i = 1; i < array1.length; i++) {
                if (min>array1[i]) {
                    min = array1[i];
                }
            }
//            System.out.println(min);
            return min;
        }
//        ## 题目4
//```java
//    需求:
//    现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最大值并打印。
//            ```
    public static int getMax(){
        int[] array1 = {100,50,90,60,80,70};
        int max = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (max<array1[i]) {
                max = array1[i];
            }
        }
//            System.out.println(min);
        return max;
    }
//    ## 题目5
//```java
//    需求:
//    现有一个整数数组{100,50,90,60,80,70}。
//    请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
//            ```
    public static int getLength(){
        int[] array1 = {100,50,90,60,80,70};
        return array1.length;
    }
}
