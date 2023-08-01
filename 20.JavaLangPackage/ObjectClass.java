//Overriding Object methods
class MyObject extends Object//extending object is choice, its default otherwise
{

    public int hashCode()
    {
        return 100;
    }
   /*  public boolean equals(MyObject o)
    {
        return this.hashCode()=o.hashCode();

    } */

}
public class ObjectClass {
    public static void main(String[] args) {
        /* Object o1=new Object();
        Object o2=new Object();

        System.out.println(o1.hashCode());
        System.out.println(o1.equals(o2)); */

        MyObject ob1=new MyObject();
        MyObject ob2=new MyObject();
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob1.equals(ob2));
    }
}
