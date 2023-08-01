@FunctionalInterface
interface Lam 
{
    public void show();
}

class Method
{
    public void callLambda(Lam ml)
    {
        ml.show();
    }
}
public class MethodParamLambda {
    public static void main(String[] args) {
        Method m=new Method();
        //passing lambda exp as a parameter to method
        
        m.callLambda(()->{System.out.println("ello");});
    }
}
