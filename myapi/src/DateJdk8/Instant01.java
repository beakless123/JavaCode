package DateJdk8;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneId zone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */
public class Instant01 {
    public static void main(String[] args) {
        //static Instant now() 获取当前时间的Instant对象(标准时间)
        Instant instant = Instant.now();
        System.out.println(instant);//2022-12-03T03:36:50.397032900Z

        //static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);//1970-01-01T00:00:00Z
        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);//1970-01-01T00:00:01Z
        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);//1970-01-01T00:00:027

        //ZonedDateTime atZone(ZoneId zone) 指定时区
        //ZoneId.of("Asia/Shanghai")：获取指定时区的时区对象
        //ZonedDateTime atZone(ZoneId zone): 是一个需要时区对象的方法需要Instant对象调用
        //zdt:定义的ZonedDateTime类的对象，是带时区的时间对象
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt);//2022-12-03T11:46:46.241856200+08:00[Asia/Shanghai]

        //boolean isxxx(Instant otherInstant) 判断系列的方法
        Instant instant4 = Instant.now();
        System.out.println(instant4.isAfter(instant));//true
        System.out.println(instant.isBefore(instant4));//true

        //Instant minusXxx(long millisToSubtract) 减少时间系列的方法
        ZonedDateTime zdt1 = zdt.minusDays(1L);
        System.out.println(zdt);//2022-12-03T12:01:59.965785900+08:00[Asia/Shanghai]
        System.out.println(zdt1);//2022-12-02T12:01:59.965785900+08:00[Asia/Shanghai]

        //Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        ZonedDateTime zdt2 = zdt.plusDays(1L);
        System.out.println(zdt); //2022-12-03T12:03:56.632808600+08:00[Asia/Shanghai]
        System.out.println(zdt2);//2022-12-04T12:03:56.632808600+08:00[Asia/Shanghai]
    }
}
