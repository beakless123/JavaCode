package sort;

import java.util.StringJoiner;

/*
  插入排序：
  将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
  遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
  N的范围：0~最大索引
*/
public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        insertSort(arr);

    }

    private static void insertSort(int[] arr) {
        //1.确定无序数列开始索引
        int strat = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<arr[i]){
                strat = i+1;
                break;
            }
        }
//        System.out.println(strat);

        //2.遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
        for (int i = strat; i < arr.length ; i++) {
            int k = i;
            while (k>0 && arr[k]<arr[k-1]){
                int temp =arr[k];
                arr[k] = arr[k-1];
                arr[k-1] = temp;
                k--;
            }

        }
        showArray(arr);
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
