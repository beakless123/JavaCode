package com.itheima.dome1.test1;

public class DayTow {
    public static void main(String[] args) {
//编程题一
        /*需求:
	身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
    现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
        */
//        double father = 177;
//        double mother = 165;
//        double son =(father + mother)*1.08/2;
//        double d = (father*0.923+mother)/2;
//        System.out.println("儿子身高：" + (int)son + "CM");
//        System.out.println("女儿身高：" + (int)d + "CM");

//        编程题二
//```java
//        需求:
//        定义一个int类型的变量,初始化值为1234,求这个数的个位,十位,百位,千位分别是多少?
//                运行效果:
//                1234的个位是4,十位是3,百位是2,千位是1
//```
//        int i = 1234;
//        int j = i;
//        int a = j%10;
//        j = j/10;
//        int b = j%10;
//        j = j/10;
//        int c = j%10;
//        j = j/10;
//        int d = j;
//        System.out.println(i + "的个位是" + a + ",十位是" + b + ",百位是" + c + ",千位是" + d);

//        ### 题目三:
//
//```
//        某外卖商家的菜品单价如下:
//        1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
//        2.优惠方式:
//        总金额大于100元,总金额打9折,其它无折扣
//        3.需求:
//        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?
//```
//        int yu = 24;
//        int hua = 8;
//        int mi = 3;
//        double sum = 0;
//        sum =yu*3+hua*3+mi*5;
//        if(sum>100){
//            sum = sum*0.9;
//        }
//        System.out.println("最终需要付:"+sum+"元");

//        ### 题目四:
//
//```
//        需求:
//        动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
//        请用程序实现判断两只老虎的体重是否相同。
//```
//        int t1 = 180;
//        int t2 = 200;
//        String res= t1==t2 ? "体重相同":"体重不相同";
//        System.out.println(res);
//### 题目五:
//
//```java
//        需求:
//        一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
//        请用程序实现获取这三个和尚的最高身高。
//```
        int i = 150;
        int j = 210;
        int k = 165;
        int max= i>j?(i>k?i:k):(j>k?j:k);
        System.out.println(max);
    }
}
