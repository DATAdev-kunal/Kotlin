import java.util.Scanner;

public class sumN 
{
   public static void main(String[] args) 
   {
      long n,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the number: ");
      n= sc.nextLong();

      for(int i=0;i<=n;i++)
      {
         sum= sum+i;
      }
      System.out.println("sum is: "+sum);
   }
}
