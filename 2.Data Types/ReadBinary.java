import java.util.*;

public class ReadBinary {
   public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      s.useRadix(2);
      System.out.print("Enter your binary number: ");
      int x= s.nextInt();
      System.out.println("Decimal form of given binary no. is: "+x);
   }
}