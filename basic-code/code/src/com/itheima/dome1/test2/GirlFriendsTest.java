package com.itheima.dome1.test2;
//定义数组存储4个女朋友的对象
//女朋友的属性:姓名、年龄、性别、爱好
//要求1:计算出四女朋友的平均年龄
//要求2:统计年龄比平均值低的女朋友有几个?并把她们的所有信息打印出来。
public class GirlFriendsTest {
    public static void main(String[] args) {
        GirlFriends[] arr = new GirlFriends[4];
        GirlFriends g1 = new GirlFriends("韩梅梅",18,'女',"英语写作");
        GirlFriends g2 = new GirlFriends("小美",16,'女',"英语听力");
        GirlFriends g3 = new GirlFriends("小芳",27,'女',"英语阅读");
        GirlFriends g4 = new GirlFriends("小丽",20,'女',"高数");
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;
        int sum = 0;
        double avg = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getAge();
        }
        avg = (double)sum/ arr.length ;
        System.out.println("平均年龄为："+avg);
        GirlFriends[] arrGirl = new GirlFriends[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()<avg){
                arrGirl[count] =arr[i];
                count+=1;
            }
        }
        System.out.println("年龄比平均值低的女朋友有"+count+"个。分别是：");
        for (int i = 0; i < count; i++) {
            System.out.println(arrGirl[i].getName()+","+arrGirl[i].getAge()+","+arrGirl[i].getGender()+",爱好："+arrGirl[i].getHobby());
        }
    }
}
