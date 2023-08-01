import java.util.Scanner;

public class reverseNo {
   public static void main(String[] args) {
      int n,digit=0,rev=0;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no: ");
      n=sc.nextInt();

      while(n!=0)
      {
         digit=n%10;
         n=n/10;
         rev=(rev*10)+digit;
      }
      System.out.println(rev);
   }
}
