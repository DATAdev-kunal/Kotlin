import java.util.Scanner;

public class greatestOf3 {
   public static void main(String[] args) {
      float a,b,c;
      Scanner sc=new Scanner(System.in);

      System.out.print("enter three numbers: ");
      a=sc.nextFloat();
      b=sc.nextFloat();
      c=sc.nextFloat();

      if(a>b && a>c)
      {
         System.out.println(a);
      }
      else if(b>c)
      {
         System.out.println(b);
      }
      else
      {
         System.out.println(c);
      }
   }
}
