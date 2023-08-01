import java.util.Scanner;

public class masking {
   public static void main(String[] args) {
      int x,y;
      int z1,z2,z3,z4,z5,z6,z7;
      Scanner sc= new Scanner(System.in);

      System.out.println("enter first no:  ");
      x=sc.nextInt();

      System.out.println("enter second no: ");
      y=sc.nextInt();
      
      z1=x&y;
      z2=x|y;
      z3=x^y;
      z4=x<<1;
      z5=y<<1;
      z6=x>>1;
      z7=y>>1;
      
      System.out.println("and: "+z1);
      System.out.println("or: "+z2);
      System.out.println("xor: "+z3);
      System.out.println("leftshift_x: "+z4);
      System.out.println("leftshift_y: "+z5);
      System.out.println("rightshift_x: "+z6);
      System.out.println("rightshift_y: "+z7);

   }
}