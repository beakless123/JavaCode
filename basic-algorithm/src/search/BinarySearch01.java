package search;
//二分查找/折半查找
//核心：
//每次排除一半的查找范围
//需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
//数据如下：{7, 23, 79, 81, 103, 127, 131, 147}
public class BinarySearch01 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int num = 28;
        System.out.println(getIndex(arr,num));
    }
    public static int getIndex(int[] arr ,int num){
        int min = 0;
        int max = arr.length-1;
        int mid = (min +max)/2;

        while (true){
            if (min>max){
                System.out.println(num+"不存在数组中");
                return -1;
            }
            if(num>arr[mid]){//查找的数字在mid的右边
                min = mid+1;
                mid = (min +max)/2;
            } else if (num<arr[mid]) {//查找的数字在mid的左边
                max = mid-1;
                mid = (min +max)/2;
            } else if (num == arr[mid]) {
                return mid;
            }
        }
    }
}
