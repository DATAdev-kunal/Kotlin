@FunctionalInterface
interface Reference 
{
    public void display(String str);
}

class LambdaDemo
{
    public static void reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public LambdaDemo(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.append(" world");
        System.out.println(sb);
    }
}

public class MethodReference {
    public static void main(String[] args) {

        Reference rf1=System.out::println;
        rf1.display("Hello");

        Reference rf2= LambdaDemo::reverse;
        rf2.display("kunal");

        Reference rf3=LambdaDemo::new;
        rf3.display("kunal");
        
    }
}
