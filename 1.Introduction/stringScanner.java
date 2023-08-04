
import java.util.Scanner;

public class stringScanner {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String Name= sc.nextLine();

      System.out.print("Welcome! "+ Name);
   }
}
