class Rectan 
{
    public int length,breadth;
    int x=10;

    public Rectan(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        System.out.println("length: "+length+"\nbreadth: "+breadth);
    }
}

class Cuboid extends Rectan
{
    public int height;
    public int x=20;

    Cuboid(int length,int breadth,int height)
    {
        super(length,breadth);
        this.height=height;
    }

    public void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }

}

public class ThisSuper {
    public static void main(String[] args) {
        Cuboid cu=new Cuboid(3,4,5);

        cu.display();

    

        
    }
}
