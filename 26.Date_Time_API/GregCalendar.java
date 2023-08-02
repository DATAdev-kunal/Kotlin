import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc= new GregorianCalendar();

        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));

        TimeZone tz=gc.getTimeZone();
        System.out.println(tz.getID());
        
        gc.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        System.out.println(tz.getID());

    }
}
