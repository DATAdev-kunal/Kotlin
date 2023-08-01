enum Dept
{
    IT("John","California"),
    CS("Katie","Los Angeles"),
    AI("Jenifer","New York"),
    MECH("Aishwarya","Sunnyvale"),
    SE("Taylor","Dreamland");

    String head;
    public String getHead() {
        return head;
    }

    String loc;

    public String getLoc() {
        return loc;
    }

    private Dept(String head,String loc)
    {
        this.head=head;
        this.loc=loc;
    }

}

public class EnumClass {
    public static void main(String[] args) {
        Dept d1=Dept.IT;
        Dept d2=Dept.AI;
        Dept d3=Dept.CS;
        Dept d4=Dept.MECH;
        Dept d5=Dept.SE;

        System.out.println(d1.ordinal());
        System.out.println(d2.ordinal());

        Dept d[]=Dept.values();
        for(Dept k:d)
            System.out.println(k);

        System.out.println("");

        System.out.println(d1.getHead()+"-:- " +d1.getLoc());
        System.out.println(d2.getHead()+"-:- " +d2.getLoc());
        System.out.println(d3.getHead()+"-:- " +d3.getLoc());
        System.out.println(d4.getHead()+"-:- " +d4.getLoc());
        System.out.println(d5.getHead()+"-:- " +d5.getLoc());

    }
}
