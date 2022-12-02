package mathdemo;

public class Math02 {
//    自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
//举例1：三位数  1^3 + 5^3 + 3^3 = 153
//举例2：四位数  1^4 + 6^4 + 3^4 + 4^4 = 1634
//    如果自幂数是：
//          * 一位自幂数，也叫做：独身数
//          * 三位自幂数：水仙花数  四位自幂数：四叶玫瑰数
//          * 五位自幂数：五角星数  六位自幂数：六合数
//          * 七位自幂数：北斗七星数  八位自幂数：八仙数
//          * 九位自幂数：九九重阳数  十位自幂数：十全十美数
//    要求1：统计一共有多少个水仙花数。
//    要求2：（课后作业）证明没有两位的自幂数。
//    要求3：（课后作业）分别统计有多少个四叶玫瑰数和五角星数。（答案：都是3个）
    public static void main(String[] args) {
        System.out.println("一共有"+question1()+"个水仙花数");
        System.out.println("一共有"+question2()+"个两位的自幂数");
        System.out.println("一共有"+question3()+"个四叶玫瑰数");
        System.out.println("一共有"+question4()+"个五角星数");

    }

    private static int question4() {
        int count = 0;
        for (int i = 10000; i <100000 ; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int qian = i/100%10;
            int wang = i/1000%10;
            int swan = i/10000%10;
            if(i == (int)(Math.pow(ge,5) + Math.pow(shi,5) + Math.pow(qian,5)+ Math.pow(wang,5)+Math.pow(swan,5))){
//                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    private static int question3() {
        int count = 0;
        for (int i = 1000; i <10000 ; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int qian = i/100%10;
            int wang = i/1000%10;
            if(i == (int)(Math.pow(ge,4) + Math.pow(shi,4) + Math.pow(qian,4)+ Math.pow(wang,4))){
//                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    private static int question2() {
        int count = 0;
        for (int i = 10; i <100 ; i++) {
            int ge = i%10;
            int shi = i/10%10;
            if(i == (int)Math.pow(ge,2) + (int)Math.pow(shi,2)){
//                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    private static int question1() {
        int count = 0;
        for (int i = 100; i <1000 ; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int qian = i/100%10;
            if(i == (int)Math.pow(ge,3) + (int)Math.pow(shi,3) + (int)Math.pow(qian,3)){
//                System.out.println(i);
                count++;
            }
        }
        return count;
    }


}
