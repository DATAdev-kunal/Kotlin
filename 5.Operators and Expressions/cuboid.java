import java.util.Scanner;

public class cuboid {
   public static void main(String[] args) {
     float l,b,h,surfArea,vol;

      Scanner sc= new Scanner(System.in);
      System.out.print("enter dimensions of cuboid l,b,h: ");

      l=sc.nextFloat();
      b=sc.nextFloat();
      h=sc.nextFloat();

      surfArea=2*((l*b)+(b*h)+(h*l));
      vol=l*b*h;

      System.out.println("total surface area: "+surfArea);
      System.out.println("Volume: "+vol);


   }
}
