package Datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
     假设，你初恋的出生年月日为:2000-11-11
     请用字符串表示这个数据，并将其转换为:2000年11月11日

     创建一个Date对象表示2000年11月11日
     创建一个SimpleDateFormat对象，并定义格式为年月日把时间变成:2000年11月11日
*/
public class SimpleDateFormat02 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        Date time1 = sdf1.parse(str);
        System.out.println(sdf2.format(time1));

    }
}
