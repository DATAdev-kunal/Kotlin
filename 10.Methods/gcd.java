import java.util.Scanner;

public class gcd {
    static int gcd(int x,int y)
    {
        while(x!=y)
        {
            if(x>y)
                x=x-y;
            else
                y=y-x;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int n1,n2;
        System.out.print("enter two no: ");
        
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        System.out.println("gcd is: "+ gcd(n1,n2));

    }
}
