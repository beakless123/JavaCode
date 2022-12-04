package DateJdk8;

import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

/*
        static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
        static ZoneId systemDefault() 获取系统默认时区
        static Zoneld of(string zoneld) 获取一个指定时区
*/
public class ZoneId01 {
    public static void main(String[] args) {
        //获取Java中支持的所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());//600
        System.out.println(zoneIds);// [Asia/Aden, America/Cuiaba, Etc/GMT+9, Etc/GMT+8, Africa/Nairobi, America/Marigot...]
        //获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai
        //获取一个指定时区
        zoneId = ZoneId.of("Asia/Aden");

        System.out.println(zoneId);//Asia/Aden

        //获取系统默认时区
        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId1);//Asia/Shanghai


    }
}
