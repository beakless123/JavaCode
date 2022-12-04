package DateJdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
            static DateTimeFormatter ofPattern(格式) 获取格式对象
            String format(时间对象) 按照指定方式格式化
        */
public class DateTimeFormatter01 {
    public static void main(String[] args) {
        //static DateTimeFormatter ofPattern(格式) 获取格式对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E");
        //String format(时间对象) 按照指定方式格式化
        //传参只能用ZonedDateTime类的时间对象
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant,zoneId);
        Date date = new Date(0L);
        String str = dtf.format(zonedDateTime);
//        String str1 = dtf.format(date);
        System.out.println(str);
    }
}
