import java.util.Date;

class Pupil
{
    private String rollNo;
    static private int count=1;

    static private String rollNoGenerator()
    {
        Date d= new Date();
        String rn="UNIV-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }

    public Pupil()
    {
        rollNo=rollNoGenerator();
        System.out.println(rollNo);
    }

}
public class rollGenerator {
    public static void main(String[] args) {
        Pupil stu[]=new Pupil[3];

        stu[0]=new Pupil();
        stu[1]=new Pupil();
        stu[2]=new Pupil();
    }
}
