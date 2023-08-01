import java.util.Scanner;

public class methodObject {
    
    int max(int x,int y)
    {   x++;
        y--;
        System.out.printf("%d %d",x,y);
        return x>y?x:y;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=9,y=20;

        /* System.out.print("enter two no: ");
        x=sc.nextInt();
        y=sc.nextInt(); */

        methodObject mob= new methodObject();
        System.out.println("\ngreater is : "+ mob.max(x,y));

        System.out.printf("%d %d\n",x,y);
    }
}
