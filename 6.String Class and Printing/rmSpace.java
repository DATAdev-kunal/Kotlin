import java.util.Scanner;

public class rmSpace {
   public static void main(String[] args) {
      String str;
      Scanner sc =new Scanner(System.in);
      str=sc.nextLine();

      System.out.println(str.replaceAll("\\s+", " ").trim());
   }
}
