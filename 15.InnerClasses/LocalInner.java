class OuterLocal 
{
    void display()
    {
        class InnerLocal
        {
            void innerDisplay()
            {
                System.out.println("Hello");
            }
        }
        
        InnerLocal in=new InnerLocal();
        in.innerDisplay();
    }
}
public class LocalInner {
    public static void main(String[] args) {
        OuterLocal ol=new OuterLocal();

        ol.display();

    }
}
