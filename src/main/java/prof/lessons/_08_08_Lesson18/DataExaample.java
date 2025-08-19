package prof.lessons._08_08_Lesson18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DataExaample {
    public static void main(String[] args) {
//        Set<String> zones = ZoneId.getAvailableZoneIds();
//
//        for (String zone: zones){
//            System.out.println(zone);
//        }


        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        ZoneId timeZone = ZoneId.of("Asia/Shanghai");
        LocalDateTime todayShanghai = LocalDateTime.now(timeZone);
        System.out.println(todayShanghai);


        ZonedDateTime nowTokio = ZonedDateTime.now(ZoneId.of("Asia/Tokio"));
        System.out.println(nowTokio);
    }
}
