package Datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 需求:
   秒杀活动开始时间:2023年11月11日 0:0:0
   秒杀活动结束时间:2023年11月11日 0:10:0

   小贾下单并付款的时间为:2023年11月11日 0:01:0
   小皮下单并付款的时间为:2023年11月11日 0:11:0
   用代码说明这两位同学有没有参加上秒杀活动?
*/
public class SimpleDateFormat03 {
    public static void main(String[] args) throws ParseException {
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String jiaStr = "2023年11月11日 0:01:0";
        String piStr = "2023年11月11日 0:11:0";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 h:m:s");

        Date startTime = sdf1.parse(startStr);
        Date endTime = sdf1.parse(endStr);
        Date jiaTime = sdf1.parse(jiaStr);
        Date piTime = sdf1.parse(piStr);

        if(jiaTime.getTime()>=startTime.getTime() && jiaTime.getTime()<=endTime.getTime()){
            System.out.println("小贾参加成功");
        }else {
            System.out.println("小贾参加失败");
        }
        if(piTime.getTime()>=startTime.getTime() && piTime.getTime()<=endTime.getTime()){
            System.out.println("小皮参加成功");
        }else {
            System.out.println("小皮参加失败");
        }
    }
}
