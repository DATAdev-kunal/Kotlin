import java.util.Scanner;

public class palindrome {
   public static void main(String[] args) {
      int n,temp,digit=0,rev=0;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no: ");
      n=sc.nextInt();

      temp=n;

      while(n!=0)
      {
         digit=n%10;
         n=n/10;
         rev=(rev*10)+digit;
      }

      if(temp==rev)
      {
         System.out.println("Palindrome");
      }
      else
      {
         System.out.println("no");
      }
   }
}
