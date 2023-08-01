import java.util.Scanner;

public class cntDigits {
   public static void main(String[] args) {
      int n,count=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter no: ");
      n=sc.nextInt();

      while(n!=0)
      {
         n/=10;
         count++;
      }
      System.out.println(count);
   }
}
