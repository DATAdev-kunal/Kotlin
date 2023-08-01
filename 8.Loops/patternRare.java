import java.util.Scanner;

public class patternRare {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter no: ");
        n=sc.nextInt();

        /* for(int i=1;i<=n;i++)
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
        } */

        for(int i=2*n-1;i>=n+1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i-n-1)
                System.out.print(" *");
                else
                System.out.print(" ");
            }
            
            for(int k=2*n-1;k<=n+1;k--)
            {
                if(k>=i-n)
                System.out.print("  *");
                else
                System.out.print(" ");
            }
         System.out.println("");
        }
    }
}
