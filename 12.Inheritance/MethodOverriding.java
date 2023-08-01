class Super 
{
    public void display()
    {
        System.out.println("Super class");
    }
}

class Sub extends Super 
{
    @Override
    public void display()
    {
        System.out.println("Sub class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        
        Super su1=new Super();
        su1.display();

        Sub sb1= new Sub();
        sb1.display();

        //Dynamic Method Dispatch
        Super su2= new Sub();
        su2.display();

    }
}
