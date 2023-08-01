import java.util.Scanner;

public class table {
   public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the no: ");
      n=sc.nextInt();

      for(int i=1;i<=10;i++)
      {
         System.out.println(n+" X "+i+"= "+n*i);
      }
   }
}
