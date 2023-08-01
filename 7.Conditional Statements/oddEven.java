import java.util.Scanner;

public class oddEven {
   public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter no: ");
      n= sc.nextInt();

      if(n%2==0)
      {
         System.out.println("Even");
      }
      else
      {
         System.out.println("Odd");
      }

   }
}
