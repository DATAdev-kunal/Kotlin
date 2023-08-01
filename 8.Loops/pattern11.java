import java.util.Scanner;
public class pattern11
{
   public static void main(String[] args) 
   {
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no: ");
      n=sc.nextInt();

      for(int i=1;i<=2*n-1;i++)
      {
         for(int j=1;j<=n;j++)
         {
            if(j<=n-i || j<=i-n)
               System.out.print("  ");
            else
               System.out.print(" *");
         }

         if(i<=n)
         {
            for(int k=n+1;k<=2*n-1;k++)
            {
               if(k<n+i)
                  System.out.print(" *");
               else 
                  System.out.print(" ");
            }
         }
         else{
               for(int k=n+1;k<=2*n-1;k++)
               {
                  if(k<2*n-(i-n))
                     System.out.print(" *");
                  else 
                     System.out.print(" ");
               }
         }
         System.out.println("");
      }
   }
}













/* for(int i=1;i<=2*n-1;i++)
      {
         for(int j=1;j<=n;j++)
         {
            if(j<=n-i || j<=i-n)
               System.out.print("  ");
            else
               System.out.print(" *");
         }

         for(int k=n+1;k<=2*n-1;k++)
         {
            if(k<n+i)
               System.out.print(" *");
            else if(i>=2*n-1)
               System.out.print("  ");
            else 
                System.out.print(" ");
         }
         System.out.println("");
      } */




/*       for(int i=1;i<=2*n-1;i++)
      {
         for(int j=1;j<=n;j++)
         {
            if(j<=n-i || j<=i-n)
               System.out.print("  ");
            else
               System.out.print(" *");
         }

         if(i<=n)
         {
               for(int k=n+1;k<=2*n-1;k++)
               {
                  if(k<n+i)
                     System.out.print(" *");
                  else if(i>=2*n-1)
                     System.out.print("  ");
                  else 
                     System.out.print(" ");
               }
         }
         
         else{
               for(int k=n+1;k<=2*n-1;k++)
               {
                  if(k<2*n-(i-n))
                     System.out.print(" *");
                  //else if(i>=2*n-1)
                     //System.out.print("  ");
                  else 
                     System.out.print(" ");
               }
         }
         System.out.println("");
      } */
