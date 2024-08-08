import java.lang.*;
import java.util.*;

public class formatSpecifiers {
   public static void main(String[] args) {
      int x=14;
      int t=-10;
      float y=12234.56f;
      char z= 'A';
      String str="Hello";

      //conversions
      System.out.printf("Hi %d %f %c \n\n",x,y,z);
      System.out.printf("Hi %d %.3f %c \n\n",x,y,z);
      System.out.printf("Hi %o %e %c \n\n",x,y,z);
      System.out.printf("Hi %x %e %c \n\n",x,y,z);

      //argument-index
      System.out.printf("Hi %4$s %2$f %1$d %3$c \n\n",x,y,z,str);

      //width and flags
      System.out.printf("Yup %(d %f %c \n\n",t,y,z);
      System.out.printf("Yup %+d %f %c \n\n",t,y,z);
      System.out.printf("Yup %od %f %c \n\n",x,y,z);
   }
}
