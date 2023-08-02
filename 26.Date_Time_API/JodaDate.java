import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaDate {
    public static void main(String[] args)throws Exception {

//LocalDate
        /* LocalDate dt=LocalDate.now();
        System.out.println(dt);

        LocalDate d=LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println(d);

        LocalDate dat=(LocalDate.ofEpochDay(100000));

        System.out.println(dat); */

        //String str=d.format(":");
        //LocalDate.parse("2023:Aug:01");


//LocalTime
       /*  LocalTime lt=LocalTime.now();
        System.out.println(lt.getHour()+" :"+lt.getMinute());
 */

//LocalDateTime
        /* LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); */

//ZonedDateTime
        /* ZonedDateTime zd=ZonedDateTime.now();
        System.out.println(zd.getChronology()); */


//OffsetDateTime
        /* OffsetDateTime oft=OffsetDateTime.now();
        System.out.println(oft); */


//ZoneId
        /* ZoneId zid=ZoneId.of("America/New_York");
        System.out.println(zid); */

//MonthDay
        //MonthDay md=MonthDay.now(MonthDay.parse("America/New_York"));


    }
}
