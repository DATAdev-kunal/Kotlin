import java.util.Scanner;

public class overloading {
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static int max(int x,int y,int z)
    {
        return x>y && x>z ? x:(y>z?y:z);
    }
    static float max(float x,float y)
    {
        return x>y?x:y;
    }

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        //loat a=10.343829f,b=10.343828f;//,c=89;
        int a=10,b=23;
        System.out.println(max(a,b));
    }
}
