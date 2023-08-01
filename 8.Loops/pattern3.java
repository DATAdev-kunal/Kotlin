import java.util.Scanner;

public class pattern3 {
   public static void main(String[] args) {
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no: ");
      n=sc.nextInt();

      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=n;j++)
         {
            System.out.print(i+j+" ");
         }

      System.out.println("");
      
      }
   }
}
