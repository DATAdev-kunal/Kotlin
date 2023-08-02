import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Formatter {
    public static void main(String[] args) {
        LocalDateTime df=LocalDateTime.now();

        DateTimeFormatter d=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d.format(df));

        System.out.println(df.get(ChronoField.YEAR));
    }   
}
