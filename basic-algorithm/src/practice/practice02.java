package practice;
//定义递归方法求斐波那契数列的第十二个数
public class practice02 {
    public static void main(String[] args) {
        System.out.println(getSum(12));
    }
    public static int getSum(int num){
        if (num == 2 || num ==1) {
            return num = 1;
        }else {
            return getSum(num-1)+getSum(num-2);//getSum(12)=getSum(11)+getSum(10)
        }

    }
}
