import java.util.Scanner;

public class swapBitwise {
   public static void main(String[] args) {
      int a,b,xor;
      Scanner sc=new Scanner(System.in);

      System.out.print("enter first no. a: ");
      a=sc.nextInt();

      System.out.print("enter second no. b: ");
      b= sc.nextInt();

      xor= a^b;
      a= a^xor;
      b= b^xor;

      System.out.print("values after swapping: \n"+"a: "+a+"\nb: "+b);

   }
}
