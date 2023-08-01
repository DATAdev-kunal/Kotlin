class Outer 
{
    int x=10;
    
    class Inner 
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println("inner dsply "+x+" "+y);
        }
    }

    void outerDisplay()
    {
        Inner in=new Inner();
        System.out.println("outer display");
        in.innerDisplay();
    }
}

public class NestedInner {
    public static void main(String[] args) {
        Outer out=new Outer();
        out.outerDisplay();

        Outer.Inner oi=new Outer().new Inner();

        oi.innerDisplay();
        
    }
}
