import java.util.Scanner;

public class pattern8 {
   public static void main(String[] args) {
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no: ");
      n=sc.nextInt();

      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=n;j++)
         {
            if(i<=j)
               System.out.print(" *");
            else
               System.out.print("  ");
         }
         System.out.println("");
      }
   }
}
