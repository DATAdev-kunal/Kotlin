abstract class Super 
{
    public void display()
    {
        System.out.println("super class");
    }

    abstract void meth2();
}

class Sub extends Super
{   
    @Override
    public void meth2()
    {
        System.out.println("Abstract method meth2 defined");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Super s1;

        Sub s2=new Sub();
        s2.meth2();
    }
}
