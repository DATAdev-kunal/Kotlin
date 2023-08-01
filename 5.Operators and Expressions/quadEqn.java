import java.util.Scanner;

public class quadEqn {
   public static void main(String[] args) {
      float a,b,c;
      double x1,x2;
      Scanner sc=new Scanner(System.in);
      
      System.out.print("enter coeff. of x^2: ");
      a=sc.nextFloat();
      System.out.print("enter coeff. of x: ");
      b=sc.nextFloat();
      System.out.print("enter const. term: ");
      c=sc.nextFloat();

      x1=(-b + Math.sqrt(b*b-(4*a*c)))/(2*a);
      x2=(-b - Math.sqrt(b*b-(4*a*c)))/(2*a);
      
      System.out.print("roots of given quad. eqn are: "+x1+" and "+x2);

   }
}
