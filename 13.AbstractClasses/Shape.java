abstract class AbstractShape 
{
    abstract public double area(double n);
    abstract public double volume(double n);
}

class ShapeCircle extends AbstractShape
{
    double radius;

    @Override
    public double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double volume(double height)
    {
        return 0.00;
    }
}

class ShapeSquare extends AbstractShape
{   
    @Override
    public double area(double side)
    {
        return side*side;
    }

    @Override 
    public double volume(double height)
    {
        return 0;
    }

}
public class Shape {
    public static void main(String[] args) {
        ShapeSquare sq=new ShapeSquare();
        ShapeCircle circle= new ShapeCircle();

        System.out.println("area sq: "+sq.area(4));
        System.out.println("area circle: "+circle.area(4));

        System.out.println("volume circle: "+circle.volume(6));
        System.out.println("volume square: "+sq.volume(6));
    }
}
