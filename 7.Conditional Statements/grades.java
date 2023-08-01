import java.util.Scanner;

public class grades {
   public static void main(String[] args) {
      float s1,s2,s3,avg;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter marks of 3 subjects: ");

      s1= sc.nextFloat();
      s2= sc.nextFloat();
      s3= sc.nextFloat();

      avg=(s1+s2+s3)/3;

      if(avg>=70)
      {
         System.out.println("Grade A");
      }
      else if(avg>=60&& avg<70)
      {
         System.out.println("Grade B");
      }
      else if(avg>=50&& avg<60)
      {
         System.out.println("Grade C");
      }
      else if(avg>=40&& avg<50)
      {
         System.out.println("Grade D");
      }
      else
      {
         System.out.println("Grade F");
      }
   }
}
