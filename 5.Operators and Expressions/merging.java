import java.util.Scanner;

public class merging {
   public static void main(String[] args) {
      int a=9,b=5;
      int c=0;
      Scanner sc= new Scanner(System.in);

      a=(byte)(a<<4);
      c=(byte)(a|b);

      System.out.println((c&0b11110000)>>4);
      System.out.println((c&0b00001111));

      System.out.println(String.format("%8s",Integer.toBinaryString(c)));

   }
}
