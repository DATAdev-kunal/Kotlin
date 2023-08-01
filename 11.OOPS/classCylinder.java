class Cylinder 
{
    public double radius,height;

    public double circumference()
    {
        return 2*Math.PI*radius;
    }

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea()
    {
        return 2*lidArea()+ height*circumference();
    }

    public double volume()
    {
        return height*lidArea();
    }
}

public class classCylinder {
    public static void main(String[] args) {
        Cylinder C1 =new Cylinder();
        C1.radius=10;
        C1.height=20;

        System.out.println("circumference: "+ C1.circumference());
        System.out.println("lid Area: "+ C1.lidArea());
        System.out.println("total surface area: "+ C1.totalSurfaceArea());
        System.out.println("volume: "+ C1.volume());

        
    }
}
