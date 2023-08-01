class Rect
{
    private double length;
    private double breadth;

    //constructor
    public Rect()
    {
        length=1;
        breadth=1;
    }

    //constructor
    public Rect(double l,double b)
    {
        length=l;
        breadth=b;
    }
    
    //getter setter
    public double Area()
    {
        return length*breadth;
    }

    public void setLength(double l)
    {
        if(l>0)
            length=l;
    }

    public double getLength()
    {
        return length;
    }

    public void setBreadth(double b)
    {
        if(b>0)
            breadth=b;
    }

    public double getBreadth()
    {
        return breadth;
    }
}

public class constructors {
    public static void main(String[] args) {
        Rect r1= new Rect(3,4);

        System.out.println(r1.Area());
    }
}
