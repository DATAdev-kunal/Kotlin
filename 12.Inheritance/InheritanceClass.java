class Circle
{
    private double radius;

    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius=radius;}

    public double area()
    {
        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle
{
    private double height;

    public double getHeight(){return height;}
    public void setHeight(double height){this.height=height;}

    public double volume()
    {
        return area()*height;
    }
}

public class InheritanceClass {
    public static void main(String[] args) {

        Circle cir=new Circle();

        cir.setRadius(5);

        System.out.println("circle radius: "+cir.getRadius());
        System.out.println("circle area: "+cir.area());

        Cylinder cyl=new Cylinder();
        cyl.setRadius(8);
        cyl.setHeight(9);

        System.out.println("\nCylinder radius: "+ cyl.getRadius());
        System.out.println("Cylinder height: "+ cyl.getHeight());
        System.out.println("Cylinder lid area: "+cyl.area());
        System.out.println("Cylinder volume: "+cyl.volume());

    }
}
