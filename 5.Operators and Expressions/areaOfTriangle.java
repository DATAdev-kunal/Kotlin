import java.util.Scanner;

public class areaOfTriangle {
   public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      double area=0;

      System.out.println("enter base: ");
      double length= s.nextDouble();

      System.out.println("enter height: ");
      double height= s.nextDouble();

      area= (length*height)/2;
      System.out.println("area of triangle is: "+area);
   }
}
