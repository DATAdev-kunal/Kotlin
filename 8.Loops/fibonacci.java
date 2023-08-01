import java.util.Scanner;

public class fibonacci {
   public static void main(String[] args) {
      int n,a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter no of terms to be generated:");
      n=sc.nextInt();
      a=0;
      b=1;
      System.out.print(a+" "+b+" ");
      for(int i=0;i<n-2;i++)
      {  
         c=a+b;
         a=b;
         b=c;
         System.out.print(c+" ");
      }
   }
}
