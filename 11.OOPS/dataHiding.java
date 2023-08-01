class Rectangle 
{
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }

    public void setLength(double l)
    {
        if(l>0)
            length=l;
    }

    public double getBreadth()
    {
        return breadth;
    }

    public void setBreadth(double b)
    {
        if(b>0)
            breadth=b;
    }

    public double area()
    {
        return length*breadth;
    }

}
public class dataHiding {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();

        r1.setLength(23);
        r1.setBreadth(34);

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
        System.out.println("area is: "+r1.area());
    }
}
