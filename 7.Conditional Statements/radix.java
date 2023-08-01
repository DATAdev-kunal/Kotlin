import java.util.Scanner;

public class radix {
   public static void main(String[] args) {
      String str;
      Scanner sc =new Scanner(System.in);
      System.out.print("enter the no. : ");
      str=sc.nextLine();

      if(str.matches("[01]+"))
      {
         System.out.println("Binary, Radix= 2");
      }
      else if(str.matches("[0-9A-F]+"))
      {
         System.out.println("Hexadecimal, Radix= 16");
      }
      else if(str.matches("[0-7]+"))
      {
         System.out.println("Octal, Radix= 8");
      }
      else
      {
         System.out.println("Decimal, Radix= 10");
      }
   }
}
