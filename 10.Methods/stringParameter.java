import java.util.Scanner;

public class stringParameter {
    
    /* static void welcome(String str)
    {
        System.out.println("welcome  "+ str);
    }
    public static void main(String[] args) {
        String name="kunal";
        welcome(name);
    } */

    static String welcome(String str)
    {   String username= str;
        //System.out.println("welcome  "+ str);
        return username;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String name=sc.nextLine();
        welcome(name);
    }

}
    
