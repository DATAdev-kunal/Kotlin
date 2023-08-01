public class TryCatch {
    public static void main(String[] args) {
        int a,b,c;
        a=1;b=0;
        
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
