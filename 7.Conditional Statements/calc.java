import java.util.Scanner;

public class calc {
   public static void main(String[] args) {
      float a,b;
      String option;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the option: ");
      option= sc.nextLine();
      
      System.out.print("enter two numbers: ");
      a=sc.nextFloat();
      b=sc.nextFloat();

      switch(option)
      {
         case "ADD": System.out.println(a+b);
                  break;
         case "MULTI": System.out.println(a*b);
                  break;
         case "DIV": System.out.println(a/b);
                  break;
         case "SUB": System.out.println(a-b);
                  break;
         default: System.out.println("invalid fuction");
      }


   }
}
