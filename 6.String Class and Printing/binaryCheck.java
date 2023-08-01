import java.util.Scanner;

public class binaryCheck {
   public static void main(String[] args) {
      int binary;

      System.out.print("enter binary no.: ");
      Scanner sc =new Scanner(System.in);
      
      binary=sc.nextInt();
      
      String bstr=String.valueOf(binary);

      if(bstr.matches("[01]*")){
       
         System.out.println("yes its binary !");
      }else{
         System.out.println("no, it's not binary");
      }
 
   }
}
