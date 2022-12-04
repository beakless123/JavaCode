package search;

public class InterpolationSearch01 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int num = 127;
        System.out.println(getIndex(arr,num));
    }
    public static int getIndex(int[] arr ,int key){
        int min = 0;
        int max = arr.length-1;
        int mid=min+(key-arr[min])/(arr[max-1]-arr[min])*(max-min);

        while (true){
            if (min>max){
                System.out.println(key+"不存在数组中");
                return -1;
            }
            if(key>arr[mid]){//查找的数字在mid的右边
                min = mid+1;
                mid=min+(key-arr[min])/(arr[max-1]-arr[min])*(max-min);
            } else if (key<arr[mid]) {//查找的数字在mid的左边
                max = mid-1;
                mid=min+(key-arr[min])/(arr[max-1]-arr[min])*(max-min);
            } else if (key == arr[mid]) {
                return mid;
            }
        }
    }
}
