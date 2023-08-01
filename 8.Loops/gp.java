import java.util.Scanner;

public class gp {
   public static void main(String[] args) {
      int n,a,r,term;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter values of n,a,r: ");
      n=sc.nextInt();
      a=sc.nextInt();
      r=sc.nextInt();
      term=a;
      for(int i=0;i<n;i++)
      {  System.out.print(term);
         term= term*r;
         System.out.print(term+ " ");
      }
   }
}
