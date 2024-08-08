import java.util.Scanner;

public class ap {
   public static void main(String[] args) {
      int n,a,d,term;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no. of terms to be calculated: ");
      n=sc.nextInt();
      System.out.print("enter a & d: ");
      a=sc.nextInt();
      d=sc.nextInt();

      term=a;

      for(int i=0;i<n;i++)
      {
         term=a+ (i*d);
         System.out.print(term+" ");
      
      }
   }
}
