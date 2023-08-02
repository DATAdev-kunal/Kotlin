import java.sql.Date;

public class ClassDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(Long.MAX_VALUE); //max value that a long value can store


        Date d=new Date(2023, 8, 1);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getYear());
        
        System.out.println(System.currentTimeMillis()/(1000*60*60*24*365));

        System.out.println( d.toLocalDate());
        
    }
}
