import java.util.Scanner;

public class pattern4 {
   public static void main(String[] args) {
      int n,count=0,temp=0;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter no: "); 
      n=sc.nextInt();

      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=n;j++)
         {
            count++;
            System.out.format("%02d ",count);
         }
         
      System.out.println("");
      
      }
   }
}
