package com.itheima.dome1;

public class ArrayDome {
    public static void main(String[] args){
        //## 题目3 (训练）
//创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
//        Random random = new Random();
//        int[] arr = new int[6];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(100);
//            sum =sum +arr[i];
//            System.out.println(arr[i]);
//        }
//        System.out.println(sum);

//        ## 题目4(训练)
//        现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。
//        依次类推。请编写程序计算，这个数组所表示的整数值。例如：
//```java
//        数组：{2, 1, 3, 5, 4}
//        表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
//```
//        Random random = new Random();
//        int[] arr = new int[5];
//        int sum =0;
////        int i = 12;
////        int j =0;
////        System.out.println(Math.pow(i, j));
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10);
//            System.out.println(arr[i]);
//            sum = sum +arr[i]*(int)Math.pow(10,i);  //sum=sum*10+arr[i];
//        }
//        System.out.println(sum);

//## 题目5（训练）
//        定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。

//        ## 题目6（训练）
//        有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
//        要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
//```
//        请输入一个整数数字：
//        50
//        生成的新数组是：12 14 23 45 50 66 68 70 77 90
//```
        //输入一个整数
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int add = scanner.nextInt();
//        //将整数加入新数组
//        int[] arr = {12,14,23,45,66,68,70,77,90,91};
//        int[] arrCopy = new int[arr.length+1];
//        for (int i = 0; i < arrCopy.length; i++) {
//            if (i < arr.length) {
//                arrCopy[i] = arr[i];
//            }else{
//                arrCopy[i] = add;
//            }
////            System.out.print(arrCopy[i]+" ");
//        }
////        System.out.println();
//        //新数组排序
//        int temp = 0;
//        for (int i = 0; i < arrCopy.length-1; i++) {
//            for (int j = 0; j< arrCopy.length-i-1;j++){
//                if(arrCopy[j]>arrCopy[j+1]){
//                    temp = arrCopy[j];
//                    arrCopy[j] = arrCopy[j+1];
//                    arrCopy[j+1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arrCopy.length; i++) {
//            System.out.print(arrCopy[i]+" ");

//        ## 题目7（综合）
//        小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。
//        请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
//        ```
//        赚钱的股票一共有：4只
//        赔钱的股票一共有：6只
//        ```
        //定义数组，double类型
//        double[] arr = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
//        //每个元素与0比较，大于0，i+1，小于0，j+1
//        int i = 0;
//        int j = 0;
//        for (int i1 = 0; i1 < arr.length; i1++) {
//            if(arr[i1]>0){
//                i+=1;
//            } else if (arr[i1]<0) {
//                j+=1;
//            }
//        }
//        System.out.println("赚钱的股票一共有："+i+"只");
//        System.out.println("赔钱的股票一共有："+j+"只");

//        ## 题目8（综合）
//        定义一个数组其中包含多个数字。
//        用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
        //定义数组
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] outArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                outArr[index]=arr[i];
                index += 1;
            }
        }
        int temp = index;
        System.out.println("奇数个数："+temp);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                outArr[index] = arr[i];
                index += 1;
            }
        }
        System.out.println("偶数个数："+(outArr.length-temp));
        for (int i = 0; i < outArr.length; i++) {
            System.out.print(outArr[i]+" ");
        }
    }
}
