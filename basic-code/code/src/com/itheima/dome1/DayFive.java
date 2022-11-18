package com.itheima.dome1;

import java.util.Random;

public class DayFive {
    public static void main(String[] args) {
//        double a = 3.94;
//        double b = 3.9;
//        double min =getMin(a,b);
//        System.out.println(min);
//
//        int c = 556;
//        int d = 95;
//        int e = 99;
//        int max = getMax(c,d,e);
//        System.out.println(max);
//
//        int f = 4;
//        int g = 5;
//        getMark(f,g);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个1-9之间的整数：");
//        int h =scanner.nextInt();
//        getTable(h);

//        int[] arr = new int[3];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入第一个整数：");
//        int a = scanner.nextInt();
//        arr[0] = a;
//        System.out.println("请输入第二个整数：");
//        int b = scanner.nextInt();
//        arr[1] = b;
//        System.out.println("请输入第三个整数：");
//        int c = scanner.nextInt();
//        arr[2] = c;
//        getSort(arr);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        double a = scanner.nextDouble();
//        double abs =getAbs(a);
//        System.out.println("这个数的绝对值为："+abs);

//        double a = 39.8;
//        int b = getRound(a);
//        System.out.println(a+" 四舍五入得 "+b);

//        int[] arr = {2,588,888,1000,10000};
//        getBonus(arr);

    }
    //        ## 题目1（训练）
    //        定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
    public static double getMin(double a ,double b){
        double min = a;
        if (min > b) {
            min = b;
        }
        return min;
    }
//    ## 题目2（训练）
//    定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
    public static int getMax(int a,int b,int c) {
        int max = 0;
        if (a >= b){
            if(a>=c){
                max = a;
            } else {
                max = c;
            }
        }else {
            if(b>=c){
                max = b;
            }else {
                max = c;
            }
        }
        return max;
    }
//    ## 题目3（训练）
//    通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，方法的功能是打印n行m列的@符号。执行效果如下：
//            ```
//    请输入行数：
//            4
//    请输入列数：
//            5
//    @@@@@
//    @@@@@
//    @@@@@
//    @@@@@
//          ```
    public static void getMark(int a,int b){
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < b; i1++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
//    ## 题目4（训练）
//    我们知道数学中有九九乘法表。请定义一个方法，方法的功能是打印nn乘法表。在主方法中键盘录入取值范围为[1-9]的变量n，测试方法。执行效果如下：
//            ```
//    请输入一个1-9之间的整数：
//            4
//    乘法表：
//            1×1=1
//            1×2=2	2×2=4
//            1×3=3	2×3=6	3×3=9
//            1×4=4	2×4=8	3×4=12	4×4=16
//            ```
    public static void getTable(int a){
        for (int i = 1; i <= a; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1+"x"+i+"="+(i*i1)+"\t");
            }
            System.out.println();
        }
    }
//    ## 题目5（训练）
//    在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
//            ```
//    请输入第一个整数：10
//    请输入第二个整数：30
//    请输入第三个整数：20
//    从大到小的顺序是： 30 20 10
//            ```
    public static void getSort(int arr[]){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("从大到小的顺序是："+arr[0]+" "+arr[1]+" "+arr[2]);
    }
//    ## 题目6（训练）
//    数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
//            ### 训练提示
//            1. 方法的功能是得到一个小数的绝对值，参数应该是一个小数类型。
//            2. 绝对值需要被返回，返回值类型应该也是小数类型。
//    ## 题目6（训练）
//    数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
//            ### 训练提示
//            1. 方法的功能是得到一个小数的绝对值，参数应该是一个小数类型。
//            2. 绝对值需要被返回，返回值类型应该也是小数类型。
    public static double getAbs(double a){
        double abs = 0;
        if(a>=0){
            abs = a;
        }else {
            abs = -a;
        }
        return abs;
    }
//    ## 题目7（综合）
//    请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
//    四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。
    public static int getRound(double a){
        double r = a*10%10;
        int round = (int)a;
        if(r>=5){
            round = round+1;
        }
        return round;
    }
//    ## 题目8（综合扩展）
//    一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
//    请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）
//            ```
//            888元的奖金被抽出
//            588元的奖金被抽出
//            10000元的奖金被抽出
//            1000元的奖金被抽出
//            2元的奖金被抽出
//            ```
    public static void getBonus(int[] arr){
        Random random = new Random();
        int count = 0;
        for (;;){
            int r = random.nextInt(arr.length);
            if(arr[r]!=0){
                System.out.println(arr[r]+"元的奖金被抽出");
                arr[r]=0;
                count+=1;
                if(count== arr.length){
                    break;
                }
            }
        }
    }
}
