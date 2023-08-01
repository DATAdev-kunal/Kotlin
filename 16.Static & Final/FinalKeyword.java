class Final 
{
    final int MIN=1;
    final static int NORMAL;
    final int MAX;

    static 
    {
        NORMAL=2;
    }

    public Final()
    {
        MAX=9;
    }

}
public class FinalKeyword {
    public static void main(String[] args) {
        Final var1=new Final();
        System.out.println(var1.MIN);
        System.out.println(var1.NORMAL);
        System.out.println(var1.MAX);

        
    }
}
