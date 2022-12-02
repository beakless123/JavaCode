package Datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    /*
    public simpleDateFormat() 默认格式
    public simpleDateFormat(String pattern) 指定格式
    public final string format(Date date) 格式化(日期对象 ->字符串)
    public Date parse(string source) 解析(字符串 ->日期对象)
    */
    public static void main(String[] args) throws ParseException {
        //以指定格式创建SimpleDateFormat对象
        String str = "yyyy年MM月dd日 HH:mm:ss E";
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        //以默认格式创建SimpleDateFormat对象
        SimpleDateFormat sdf0 = new SimpleDateFormat();
        //获取当前时间
        Date d = new Date();
        long timeNow = d.getTime();
        //以指定格式打印当前时间
        System.out.println(sdf.format(timeNow));
        //以默认格式打印当前时间
        System.out.println(sdf0.format(timeNow));


        //定义字符串，记录已知时间
        String strSource = "2023-11-11 11:11:11";
        //按相同格式创建SimpleDateFormat对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //定义Date对象time1，记录解析时间
        Date time1 = sdf1.parse(strSource);
        //以指定格式创建SimpleDateFormat对象sdf2
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        //定义字符串strOut，记录已经按指定格式输出的字符串
        String strOut = sdf2.format(time1);
        System.out.println(strOut);
    }
}
