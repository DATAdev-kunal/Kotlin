@FunctionalInterface
interface MyLambda 
{
    public void display();
}

public class Lambda {
    public static void main(String[] args) {

        //Lambda Expression

        MyLambda ml=()->System.out.println("Hello World");
        ml.display();
    }    
}
