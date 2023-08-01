import java.util.Scanner;

public class dateCheck {
   public static void main(String[] args) {
      String date;
      Scanner sc = new Scanner(System.in);
      date=sc.nextLine();
      System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
   }
}
