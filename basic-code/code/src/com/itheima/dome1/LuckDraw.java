package com.itheima.dome1;

import java.util.Random;
import java.util.Scanner;

//双色球抽奖
//需求：投注号码由6个红色号码和一个蓝色号码组成
//红色号码从1~33中选择；蓝色号码从1~16号中选择
//一等奖：1000万 中6个红色号码和1个蓝色号码
//二等奖：500万  中6个红色号码和0个蓝色号码
//三等奖：3000元 中5个红色号码和1个蓝色号码
//四等奖：200元  中5个红色号码和0个蓝色号码或者中4个红色号码和1个蓝色号码
//五等奖：10元   中4个红色号码和0个蓝色号码或者中3个红色号码和1个蓝色号码
//六等奖：5元    中2个红色号码和1个蓝色号码或者中1个红色号码和1个蓝色号码或者中0个红色号码和1个蓝色号码
public class LuckDraw {
    public static void main(String[] args) {
        //1.确定中奖号码
        Random random = new Random();
        int[] arr = new int[7]; //存放中奖号码
        int countNum = 0;
        for (; ; ) {
            if (countNum < 6) {    //红色中奖号码 1~33,不能重复
                int redNum = random.nextInt(1, 34);
                boolean falg = contains(arr, redNum);
                if (!falg) {
                    arr[countNum] = redNum;
                    countNum++;
                }
            } else if (countNum == 6) {    //蓝色中奖号码
                int blueNum = random.nextInt(16) + 1;
                arr[countNum] = blueNum;
                break;
            }
        }

        //2.消费者选择号码
        Scanner scanner = new Scanner(System.in);
        int[] arrChoose = new int[7];   //存放选择号码的数组
        int countChoose = 0;            //变量名太难起了，干脆以后都叫index
        while (true) {
            //选择红色号码不能重复1~33
            if (countChoose < 6) {
                System.out.println("请输入第" + (countChoose +1)+ "个号码");
                int redNumChoose = scanner.nextInt();
                boolean flagChoose = contains(arrChoose, redNumChoose);     // 判断选择的红色号码是否在存放选择号码的数组中
                if (redNumChoose > 0 && redNumChoose < 34 && !flagChoose) { //在1~33范围内并且不存在arrChoose数组的号码
                    arrChoose[countChoose] = redNumChoose;
                    countChoose+=1;
                } else {
                    System.out.println("红色号码重复或者超出范围");
                }
            }
            //选择蓝色号码
            if (countChoose==6){
                System.out.println("请输入第" + (countChoose +1)+ "个号码");
                int blueNumChoose = scanner.nextInt();
                if (blueNumChoose > 0 && blueNumChoose < 17) {  //蓝色号码在1~16
                    arrChoose[countChoose] = blueNumChoose;
//                    System.out.println("countChoose="+countChoose);
                    break;
                } else System.out.println("蓝色号码超出范围");
            }
        }
        System.out.println("您选的号码为：");
        for (int i = 0; i< arrChoose.length; i++) {
            System.out.print(arrChoose[i] + " ");
        }
        System.out.println();
        System.out.print("中奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //3.判断是否中奖
        //红色号码需要顺序和号码一致才算中奖
        int red = 0;        //分别表示中奖号码的个数
        int blue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i<6 && arr[i]==arrChoose[i]){
                red += 1;
            }
            if(i==6 && arr[i]==arrChoose[i]){
                blue += 1;
            }
        }
        if(red == 6 && blue == 1){
            System.out.println("中了一等奖，奖金10000万元！");
        } else if (red == 6 && blue == 0) {
            System.out.println("中了二等奖，奖金500万元！");
        }else if (red == 5 && blue ==1 ) {
            System.out.println("中了三等奖，奖金3000元！");
        }else if (red == 5 && blue == 0 || red == 4 && blue == 1) {
            System.out.println("中了四等奖，奖金200元！");
        }else if (red == 4 && blue == 0 || red == 3 && blue == 1) {
            System.out.println("中了五等奖，奖金10元！");
        }else if (red == 2 && blue == 0 || red == 1 && blue == 1 || red == 0 && blue == 1) {
            System.out.println("中了六等奖，奖金5元！");
        }else {
            System.out.println("多谢惠顾！");
        }
    }


    /**
     * 判断生成红色中奖号码是否重复
     * @param array
     * @param Num
     * @return
     */
    public static boolean contains(int[] array, int Num){
        for (int i = 0; i < array.length; i++) {
            if (Num == array[i]) {
                return true;
            }
        }
        return false;
    }
}