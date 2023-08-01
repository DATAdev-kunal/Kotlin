import java.util.Scanner;

public class hexacheck {
   public static void main(String[] args) {
      String hexa;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter hexadecimal no: ");
      hexa=sc.nextLine();

      System.out.println(hexa.matches("[0-9A-F]+"));

      
   }
}
