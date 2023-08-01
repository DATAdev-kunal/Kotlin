class circle
{
    public double radius;

    public double circumference()
    {
        return (2*Math.PI*radius);
    }

    public double area()
    {
        return (Math.PI*radius*radius);
    }
}

public class classCirlce {

    public static void main(String[] args) {
        circle C1= new circle();

    C1.radius=30;

    System.out.println("area is: "+ C1.area());
    System.out.println("circumference is: "+ C1.circumference());

    }
}


