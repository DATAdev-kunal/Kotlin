import java.util.Scanner;

public class domainSeparator {
   public static void main(String[] args) {
      String str;
      String name;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter e-mail id: ");
      str= sc.nextLine();

      if(str.matches(".*gmail.*")){
         System.out.println("e-mail accepted !");
      }

      int index= str.indexOf('@');
      name=str.substring(0,index);

      System.out.println("username: "+name);

   }
}
