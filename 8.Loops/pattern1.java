import java.util.Scanner;

public class pattern1 {
   public static void main(String[] args) {
      int n;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the no: ");
      n=sc.nextInt();

      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=n;j++)
         {
            System.out.print(j+" ");
         }

      System.out.println("");

      }
   }
}