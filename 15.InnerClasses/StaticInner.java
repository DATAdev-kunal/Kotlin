class OuterStatic 
{
    static int x=10;
           int y=20;

    static class InnerStatic
    {
        void display()
        {
            System.out.println(x+"\n");
        }
    }
}
public class StaticInner {
    public static void main(String[] args) {
        OuterStatic.InnerStatic oi= new OuterStatic.InnerStatic();

        oi.display();

    }
}
