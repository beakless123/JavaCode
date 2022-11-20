package com.itheima.dome1.test1;

import java.util.Scanner;

public class DayThree {
    public static void main(String[] args) {
//    ## 题目1（训练）
//        李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
//        而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。
//        为了更省钱，李雷要不要以旧换新？请在控制台输出。
//        int np = 7988;
//        int res1 = np - 1500;
//        double res2 = np*0.8;
//        if(res2<res1){
//            System.out.println("要以旧换新");
//        }else{
//            System.out.println("不要以旧换新");
//        }

//        ## 题目2（训练）
//        让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数：");
//        int a = sc.nextInt();
//        System.out.println("请输入第二个数：");
//        int b = sc.nextInt();
//        System.out.println("请输入第三个数：");
//        int c = sc.nextInt();
//        if(a<=b){
//            if(a<=c){
//                System.out.println("最小的的数为：" + a);
//            }else{
//                System.out.println("最小的的数为：" + c);
//            }
//        }else{
//            if(b<=c){
//                System.out.println("最小的的数为：" + b);
//            }else{
//                System.out.println("最小的的数为：" + c);
//            }
//        }

//        ## 题目3（综合）
//        某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
//​	存期		年利率（%）
//​	一年		2.25
//​	两年		2.7
//​	三年		3.25
//​	五年		3.6
//        请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要存的金额（大于等于1000）：");
//        double money = sc.nextInt();
//        System.out.println("请输入要存多少年（一年、两年、三年或五年，四选一）：");
//        int yeas = sc.nextInt();
//        double res = 0;
//        if(money>=1000 && yeas == 1){
//            res = money + money * 0.0225;
//            System.out.println("本息总额为：" + res + "元");
//        } else if (money>=1000 && yeas == 2) {
//            res = money + money * 0.027 * yeas;
//            System.out.println("本息总额为：" + res + "元");
//        } else if (money>=1000 && yeas == 3) {
//            res = money + money * 0.0325 * yeas;
//            System.out.println("本息总额为：" + res + "元");
//        } else if (money>=1000 && yeas == 5) {
//            res = money + money * 0.036 * yeas;
//            System.out.println("本息总额为：" + res + "元");
//        }else{
//            System.out.println("请输入正确金额和年份！");
//        }
//## 题目4（综合）
//
//        某商场购物可以打折，具体规则如下：
//​	普通顾客购不满100元不打折，满100元打9折；
//​	会员购物不满200元打8折，满200元打7.5折；
//​	不同打折规则不累加计算。
//        请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
//        Scanner sc = new Scanner(System.in);
//        double moneyOut = 0;
//        System.out.println("您的购物金额为？");
//        int money = sc.nextInt();
//        System.out.println("您是否是会员？（非会员请按0，会员请按1）");
//        int vip = sc.nextInt();
//        if(vip == 0){
//            if(money > 0 && money < 100){
//                moneyOut = money;
//                System.out.println("应付金额为："+moneyOut+"元");
//            }else if (money>=100){
//                moneyOut = money * 0.9;
//                System.out.println("应付金额为："+moneyOut+"元");
//            }else {
//                System.out.println("输入金额错误！");
//            }
//        }else if (vip == 1) {
//            if(money > 0 && money < 200){
//                moneyOut = money *0.8;
//                System.out.println("应付金额为："+moneyOut+"元");
//            }else if (money>=200){
//                moneyOut = money * 0.75;
//                System.out.println("应付金额为："+moneyOut+"元");
//            }else {
//                System.out.println("输入金额错误！");
//            }
//        }else {
//            System.out.println("会员类型输入错误！");
//        }

//        ## 题目5（综合扩展）
//
//        2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
//        也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。
//        如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
//​	0 ~ 3000元的部分，交税3%
//​	3000 ~ 12000元的部分，交税10%
//​	12000 ~ 25000的部分 ， 交税20%
//​	25000 ~ 35000的部分，交税25%
//​	35000 ~ 55000的部分，交税30%
//​	55000 ~ 80000的部分，交税35%
//​	超过80000的部分，交税45%
//                比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，
//        个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
//        请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的税前工资：");
        double money = sc.nextInt();
        double temp = money * 0.9;
        double taxPart = temp-5000;
        double tax = 0;
        double outMoney = 0;
        if(money>0 && temp<=5000){
            System.out.println("您不用缴税");
        } else if (temp>5000) {
            if(taxPart>0 && taxPart<3000){
                tax = taxPart * 0.03;
            } else if (taxPart>=3000 && taxPart<12000) {
                tax = 3000 * 0.03 + (taxPart-3000) * 0.1;
            } else if (taxPart>=12000 && taxPart<25000) {
                tax = 3000 * 0.03 + 9000 * 0.1 + (taxPart-12000) * 0.2;
            } else if (taxPart>=25000 && taxPart<35000) {
                tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (taxPart-25000) * 0.25;
            } else if (taxPart>=35000 && taxPart<55000) {
                tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (taxPart - 35000) * 0.3;
            } else if (taxPart>=55000 && taxPart<80000) {
                tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 *0.3 + (taxPart - 55000) * 0.35;
            } else if (taxPart>=80000){
                tax = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 *0.3 + 25000 * 0.35 + (taxPart - 80000) * 0.45;
            }
            outMoney = temp - tax;
            System.out.println("个人所得税的纳税数额为：" + tax);
            System.out.println("税后工资为：" + outMoney);
        }

    }
}
