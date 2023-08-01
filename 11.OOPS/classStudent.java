class Student 
{
    public String roll,name,course;
    public double m1,m2,m3;

    public double total()
    {
        return m1+m2+m3;
    }

    public double avg()
    {
        return (m1+m2+m3)/3;
    }

    public String grade()
    {
        if(avg()>=70)
      {
         return (" A");
      }
      else if(avg()>=60&& avg()<70)
      {
         return (" B");
      }
      else if(avg()>=50&& avg()<60)
      {
         return (" C");
      }
      else if(avg()>=40&& avg()<50)
      {
         return (" D");
      }
      else
      {
         return (" F");
      }
    }

    public String toString()
    {
        return ("name: "+name+"\ncourses_enrolled: "+course);
    }

}

public class classStudent {
    public static void main(String[] args) {
        Student s1= new Student();

        s1.name="Kunal";
        s1.course="Data Science, Java, Kotlin";
        s1.m1=30;
        s1.m2=28;
        s1.m3=19;

        System.out.println("\n"+s1);
        System.out.println("average: "+s1.avg());
        System.out.println("total: "+s1.total());
        System.out.println("grade: "+s1.grade());
        
    }
}
