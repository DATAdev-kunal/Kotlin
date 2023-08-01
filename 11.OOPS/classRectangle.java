class Rectangle 
{
    public double length,breadth;

    public double perimeter()
    {
        return 2*length*breadth;
    }

    public double area()
    {
        return length*breadth;
    }

    public boolean isSquare()
    {
        return length==breadth;
    }
}

public class classRectangle {
    public static void main(String[] args) {
        Rectangle R1= new Rectangle();
        R1.length=20;
        R1.breadth=20;

        System.out.println("perimeter: "+ R1.perimeter());
        System.out.println("area: "+ R1.area());
        System.out.println("Is square: "+ R1.isSquare());

    }
}
