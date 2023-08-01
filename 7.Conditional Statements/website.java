import java.util.Scanner;

public class website {
   public static void main(String[] args) {
      String url;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the website: ");
      url= sc.nextLine();

      String protocol=url.substring(0, url.indexOf(":"));

      if(protocol.equals("http"))
      {
         System.out.println("HyperText Transfer Protocol");
      }
      else if(protocol.equals("ftp"))
      {
         System.out.println("File Transfer Protocol");
      }

      String extension= url.substring(url.lastIndexOf(".")+1);

      if(extension.equals("com"))
      {
         System.out.println("Commercial");
      }
      else if(extension.equals("org"))
      {
         System.out.println("Organisation");
      }
      else if(extension.equals("net"))
      {
         System.out.println("Network");
      }
   }
}
