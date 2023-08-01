abstract class My 
{
    abstract public void display();
}

class OuterAnon
{
    public void meth()
    {
        /* My m=new My()
        {
            public void display()
            {
                System.out.println("abst class defined");
            }
        };
        m.display(); */

        //OR 
        new My(){public void display(){System.out.println("Hello");}}.display();
    }
}
public class AnonymousInner {
    public static void main(String[] args) {
        OuterAnon obj=new OuterAnon();

        obj.meth();
    }   
}
