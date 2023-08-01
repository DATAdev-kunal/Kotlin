import java.util.Scanner;

public class armstrong {
   public static void main(String[] args) {
      int n,digit,temp,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the no: ");
      n=sc.nextInt();
      temp=n;

      while(n!=0)
      {
         digit=n%10;
         n=n/10;
         System.out.println(digit);
         sum=sum+ (digit*digit*digit);
      }
      if(sum==temp)
      {
         System.out.println("Armstrong");
      }
      else
      {
         System.out.println("Not");
      }
//ex: 0,1,153,370,371,407.
   }
}
