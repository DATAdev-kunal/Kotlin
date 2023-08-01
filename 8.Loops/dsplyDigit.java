import java.util.Scanner;

public class dsplyDigit {
   public static void main(String[] args) {
      int n,digit=0;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no: ");
      n=sc.nextInt();

      while(n!=0)
      {
         digit=n%10;
         n=n/10;
         System.out.println(digit);
      }
   }
}
