import java.util.List;

@FunctionalInterface
interface Anno 
{
    public void display(String str);
}
class MyAnno implements Anno
{
    @Override
    public void display(String str)
    {
        System.out.println(str);
    }
    @Deprecated
    public int sum(int x, int y)
    {
        return x+y;
    }
    
    public MyAnno()
    {

    }

}
public class InbuiltAnnotation {
    public static void main(String[] args) {
        MyAnno m=new MyAnno();
        m.sum(3, 6);

        
    }
}
