import java.util.Scanner;

public class twoD {
   public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter no: ");
      n= sc.nextInt();

      for(int i=0;i<=n;i++)
      {
         for(int j=0;j<=n;j++)
         {
            System.out.print("("+i+","+j+")");
         }
         System.out.println("\n");
      }
   }
}
