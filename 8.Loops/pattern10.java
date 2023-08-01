import java.util.Scanner;
public class pattern10 
{
   public static void main(String[] args) 
   {
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no: ");
      n=sc.nextInt();

      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=n;j++)
         {
            if(j<=n-i)
               System.out.print("  ");
            else
               System.out.print(" *");
         }

         for(int k=n+1;k<n*i-1;k++)
         {
            if(k<n+i)
               System.out.print(" *");
            else
               System.out.print("  ");
         }
         System.out.println("");
      }
      
      System.out.println("");

      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=n;j++)
         {
            if(j<=n-i)
               System.out.print("  ");
            else
               System.out.print(" *");
         }

         for(int k=n+1;k<n*i-1;k++)
         {
            if(k<n+i)
               System.out.print(" *");
            else
               System.out.print("  ");
         }
         System.out.println("");
      }
   }
}

