package DateJdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */
public class ZoneDateTime01 {
    public static void main(String[] args) {
        //static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);//2022-12-03T12:06:36.367725500+08:00[Asia/Shanghai]

        //通过Instant + 时区的方式指定获取时间对象
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zdt4 = ZonedDateTime.ofInstant(instant,zoneId);
        System.out.println(zdt4);//2022-12-03T12:06:36.367725500+08:00[Asia/Shanghai]

        //static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
        ZonedDateTime zdt1 = ZonedDateTime.of(1997,12,23,
                1,0,0,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt1);//1997-12-23T01:00+08:00[Asia/Shanghai]

        //ZonedDateTime withXxx(时间) 修改时间系列的方法
        ZonedDateTime zdt2 = zdt1.withMonth(11);
        ZonedDateTime zdt3 = zdt2.withDayOfMonth(24);
        System.out.println(zdt2);//1997-11-23T01:00+08:00[Asia/Shanghai]
        System.out.println(zdt3);//1997-11-24T01:00+08:00[Asia/Shanghai]
    }
}
