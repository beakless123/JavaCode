package sort;

import java.util.StringJoiner;

//1. 从数列中挑出一个元素，一般都是左边第一个数字，称为 "基准数";
//2. 创建两个指针，一个从前往后走，一个从后往前走。
//3. 先执行后面的指针，找出第一个比基准数小的数字
//4. 再执行前面的指针，找出第一个比基准数大的数字
//5. 交换两个指针指向的数字
//6. 直到两个指针相遇
//7. 将基准数跟指针指向位置的数字交换位置，称之为：基准数归位。
//8. 第一轮结束之后，基准数左边的数字都是比基准数小的，基准数右边的数字都是比基准数大的。
//9. 把基准数左边看做一个序列，把基准数右边看做一个序列，按照刚刚的规则递归排序
public class Quicksort01 {
    public static void main(String[] args) {
    int[] arr = {6,3,1,7,9,2,5,4,8,0};
    quickSort(arr,0, arr.length-1);

    }

    private static void quickSort(int[] arr, int i, int j) {

        //2. 创建两个指针，一个从前往后走，一个从后往前走。
        int start = i+1;
        int end = j;
        if (start>end){
            return;
        }
        //6. 直到两个指针相遇
        //1. 从数列中挑出一个元素，一般都是左边第一个数字，称为 "基准数";
        int basicNum = arr[i];
        while (end != start){
            //3. 先执行后面的指针，找出第一个比基准数小的数字
            while (true){
                if(arr[end]<basicNum|| start>=end){
                    break;
                }
                end--;
            }
            //4. 再执行前面的指针，找出第一个比基准数大的数字
            while (true){
                if(arr[start]>basicNum || start>=end){
                    break;
                }
                start++;
            }
            //5. 交换两个指针指向的数字
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        //7. 将基准数跟指针指向位置的数字交换位置，称之为：基准数归位。
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        //8. 第一轮结束之后，基准数左边的数字都是比基准数小的，基准数右边的数字都是比基准数大的。
        showArray(arr);
        //9. 把基准数左边看做一个序列，把基准数右边看做一个序列，按照刚刚的规则递归排序
        quickSort(arr,i,start-1);
        quickSort(arr, start+1,j);
    }

    public static void showArray(int[] arr){
        StringJoiner sj = new StringJoiner(",","{","}");
        for (int i = 0; i < arr.length; i++) {
            String str =""+arr[i];
            sj.add(str);
        }
        String strOut = sj.toString();
        System.out.println(strOut);
    }
}
