import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Reflect 
{
    private int a;
    public int b;
    protected int c;
    int d;

    public Reflect(){}
    public Reflect(int x,int y){}

    public void display(String s1,String s2){}
    public int show(int x,int y,int z,int r,int l,int w){return 0;}

}

public class ReflectionPackage {
    public static void main(String[] args) {
        Class c=Reflect.class;// ****Notice UPPERCASE 'c'in Class init

        System.out.println("\n"+c.getName()+"\n");
        System.out.println(c.getClass()+"\n");
        System.out.println(c.getSuperclass()+"\n");
        System.out.println(c.getCanonicalName()+"\n");

        Field field[]=c.getDeclaredFields();
        for(Field x:field)
            System.out.println(x.getName());
        System.out.println("");

        Method method[]=c.getDeclaredMethods();
        for(Method m:method)
            System.out.println(m.getName());
        System.out.println("");

        Parameter param[]=method[1].getParameters();
        for(Parameter p:param)
            System.out.println(p);

        
        
    }
}
