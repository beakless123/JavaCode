package math01;

import java.util.Scanner;

public class Math01 {
    public static void main(String[] args) {
//需求：
//判断一个数是否为一个质数
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean b = isZhiShu(num);
        System.out.println(b);
    }

    private static boolean isZhiShu(int num) {
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if(num % i == 0){
//                System.out.println(num+"不是一个质数");
                return false;
            }
        }
//        System.out.println(num+"是一个质数");
        return true;
    }

}
