import java.util.Scanner;

public class dsplyDigiWord {
   public static void main(String[] args) {
      int n,orig,digit=0;
      String str="";
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the no: ");
      n=sc.nextInt();

      orig=n;

      while(n!=0)
      {
         digit=n%10;
         n=n/10;
         
         str= str+ digit;
      }
      System.out.println(str);
   
      for(int i=str.length()-1;i>=0;i--)
      {
         char c= str.charAt(i);

         switch(c)
         {
            case '0': System.out.print(" zero");
                     break;
            case '1': System.out.print(" one");
                     break;
            case '2': System.out.print(" two");
                     break;
            case '3': System.out.print(" three");
                     break;
            case '4': System.out.print(" four");
                     break;
            case '5': System.out.print(" five");
                     break;
            case '6': System.out.print(" six");
                     break;
            case '7': System.out.print(" seven");
                     break;
            case '8': System.out.print(" eight");
                     break;
            case '9': System.out.print(" nine");
                     break;
         }
      }
   }
}
