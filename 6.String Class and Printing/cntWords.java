import java.util.Scanner;

public class cntWords {
   public static void main(String[] args) {
      String str;
      Scanner sc= new Scanner(System.in);

      str= sc.nextLine();
      str=str.replaceAll("\\s+", " ").trim();

      String word[]= str.split("\\s");

      System.out.println(word.length);


   }
}
