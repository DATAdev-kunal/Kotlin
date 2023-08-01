import java.lang.*;
import java.util.Scanner;
public class AOT {
   public static void main(String[] args) {
      int a,b,c;

      Scanner sc= new Scanner(System.in);

      System.out.print("enter three sides of triangle: ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();

      float s = (a+b+c)/2;
      double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("area of triangle is: "+ area);
   }
}
