interface Test 
{
    final static int x=10;

    public abstract void meth1();
    public abstract void meth2();

    private void meth6()
    {
        System.out.println("method 6 of Test");
    }
    default void meth5()
    {
        meth6();
    }
}

interface Test2 extends Test 
{
    void meth4();
}

class My implements Test2 
{

    @Override
    public void meth4() {
        System.out.println("meth4 implemented");
        
    }

    @Override
    public void meth1() {
        System.out.println("meth1 implemented");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 implemented");
    }
}

public class DosInterface {
    public static void main(String[] args) {

        System.out.println(Test.x);
        My t=new My();
        
        t.meth5();

    }
}
