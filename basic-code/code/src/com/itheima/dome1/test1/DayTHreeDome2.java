package com.itheima.dome1.test1;

/*switch判断语句*/
public class DayTHreeDome2 {
    public static void main(String[] args){
//        ## 题目1（综合）
//
//        模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
//        要求：
//​	键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算
//                (1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
//​		请输入第一个整数: 30
//​		请输入第二个整数: 40
//​		请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
//​		控制台输出:30+40=70
//        Scanner sc = new Scanner(System.in);
//        int res = 0;
//        String d = "";
//        System.out.println("请输入第一个整数：");
//        int a = sc.nextInt();
//        System.out.println("请输入第二个整数：");
//        int b = sc.nextInt();
//        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
//        int c = sc.nextInt();
//        switch (c){
//            case 1:
//                res = a+b;
//                d = "+";
//                System.out.println(a + d + b + "=" + res);
//                break;
//            case 2:
//                res = a-b;
//                d = "-";
//                System.out.println(a + d + b + "=" + res);
//                break;
//            case 3:
//                res = a*b;
//                d = "*";
//                System.out.println(a + d + b + "=" + res);
//                break;
//            case 4:
//                res = a/b;
//                d = "/";
//                System.out.println(a + d + b + "=" + res);
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }

        /*循环语句*/
//        ## 题目1(训练)
//        已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
//        for(int i=1949;i<=2019;i++){
//            if((i-2019)%12==0){
//                System.out.println(i);
//            }
//        }

//        ## 题目2(训练)
//        有一个输出语句System.out.print("@")。使用这个语句，在控制台打印出一个四行五列的长方形，效果如下：
//​	@@@@@
//​	@@@@@
//​	@@@@@
//​	@@@@@
//        for(int i=0;i<4;i++){
//            for(int j=0;j<5;j++){
//                System.out.print("@");
//            }
//            System.out.print("\n");
//        }

//        ## 题目3(训练)
//        有一个输出语句System.out.print("@")。使用这个语句，在控制台打印出一个五行的三角形，效果如下：
//​	@
//​	@@
//​	@@@
//​	@@@@
//​	@@@@@
//        for(int i=0;i<5;i++){
////            System.out.print(i);
//            for(int j=0;j<=i;j++){
//                System.out.print("@");
//            }
//            System.out.print("\n");
//        }

//        ## 题目4（训练）
//        使用for循环打印出九九乘法表。打印效果如下：
//        1×1=1
//        1×2=2	2×2=4
//        ...
//        1×8=8	2×8=16	3×8=24	4×8=32	5×8=40	6×8=48	7×8=56	8×8=64
//        1×9=9	2×9=18	3×9=27	4×9=36	5×9=45	6×9=54	7×9=63	8×9=72	9*9=81
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i+"x"+j+"="+(i*j)+"\t");
//            }
//            System.out.print("\n");
//        }

//        ## 题目5（综合）
//        小明手中有一张10元纸币。需要到商店兑换零钱。商店只有1元纸币和5角硬币。那么请列举出所有的兑换方式。打印效果如下：
//        换1元纸币1张，5角硬币18个
//        换1元纸币2张，5角硬币16个
//        换1元纸币3张，5角硬币14个
//        ...   ...
//        换1元纸币9张，5角硬币2个
        //换i张一元纸币需要多少五角硬

//        for(int i=1;i<10;i++){
//            for(int j=1;j<=20;j++){
//                if(i*10+j*5==100){
//                    System.out.println("换1元纸币"+i+"张，5角硬币"+j+"个");
//                }
//            }
//
//        }

//        ## 题目6（综合）
//        中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。
//        （年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。
//        请打印出1988年到2019年的所有闰年年份。
//        for(int i=1988;i<=2019;i++){
//            if((i%4==0&&i%100!=0)||i%400==0){
//                System.out.println(i+ "年是闰年");
//            }
//        }

//        ## 题目7（综合）
//        有一个容量为10L的空水桶。水桶的上面开始往里灌水，同时下面开始往出流水。
//        第一分钟灌水的速度是1L/min，第二分钟灌水的速度是2L/min，第三分钟灌水的速度是3L/min，以此类推。
//        而流水的速度固定是3L/min。那么几分钟之后，水桶里能保持灌满水的状态？
        int count = 0;
        for(int i=1;;i++){
            count=count+i-3;
            if(i-3<0){
                count=0;
            }
            if(count>=10){
                System.out.println("桶里的灌满水需要"+i+"分钟");
                break;
            }
        }
//        public class Demo3 {
//            public static void main(String[] args) {
                //1.定义桶中已有的水量开始是0L;
//                int water = 0;
//                //2.定义变量代表分钟数
//                int minute = 0;
//                //3.循环判断
//                while(water < 10){
//                    //3.1每次循环给分钟数加1
//                    minute++;
//                    //3.2每分钟计算桶里的水量
//                    water += minute - 3;
//                    //3.3桶里的水不可能是负数
//                    if(water < 0){
//                        water = 0;
//                    }
//                }
//                //4.打印所用分钟数
//                System.out.println("桶里的灌满水需要"+ minute + "分钟");
    }
}
