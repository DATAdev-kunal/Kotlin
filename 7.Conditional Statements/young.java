import java.util.Scanner;

public class young {
   public static void main(String[] args) {
      int age;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter your age: ");
      age=sc.nextInt();

      if(age<=55 && age>=14)
      {
         System.out.println("You are young");
      }
      else
      {
         System.out.println("You aren't young");
      }
   }
}
