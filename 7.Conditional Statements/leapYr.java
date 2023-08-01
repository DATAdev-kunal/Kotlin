import java.util.Scanner;

public class leapYr {
   public static void main(String[] args) {
      int yr;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter year: ");
      yr= sc.nextInt();

      if(yr%4==0)
      {
         if(yr%100==0)
         {
            if(yr%400==0)
            {
               System.out.println("yes");
            }
            else
            {
               System.out.println("no");
            }
         }
         else
         {
            System.out.println("yes");
         }
      }
      else
      {
         System.out.println("no");
      }

   }
}
