class Parent 
{
    public Parent()
    {
        System.out.println("Parent");
    }

    public Parent(int x)
    {
        System.out.println("Parent Parametrized ");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child");
    }

    public Child(int y)
    {
        System.out.println("Child Parametrized");
    }

    public Child(int x,int y)
    {
        super(x);
        System.out.println("Child Parametrized");
    }
}

public class constCall {
    public static void main(String[] args) {

        Child c=new Child();
        System.out.println("");

        Child d=new Child(4);
        System.out.println("");

        Child f=new Child(3,6);
        System.out.println("");
        
    }
}
