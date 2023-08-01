//Case2: same package sub class

package mypackage;
import mypackage.Test1;

public class Test2 extends Test1
{
    public void display()
    {
        System.out.println(a+" "+b+" "+c+" "+d);
        System.out.println(a+b+c+d);
    }
    
}
