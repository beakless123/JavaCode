package Test;

import javax.swing.*;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        initData();
    }
    private static void initData() {
        int[][] data = new int[4][4];
        //定义一个一维数组，存放数字代表图片的序号
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //打乱图片序号
        int temp = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] =arr[n];
            arr[n] =temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
        for (int i = 0; i < arr.length; i++) {
            data[i/4][i%4] = arr[i];
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
