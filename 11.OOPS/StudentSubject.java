class Student 
{
    private String stuId,name,dept;
    private double m1,m2,avg;
    private boolean isQualified;
    
    public String getStuId(){return stuId;}
    public String getName(){return name;}
    public String getDepartment(){return dept;}
    public double getM1(){return m1;}
    public double getM2(){return m2;}
    public boolean getIsQualified(){return isQualified;}
    public void setDepartment(String dept){if(dept!="") this.dept=dept;}

    public Student(String stuId)
    {
        this.stuId=stuId;
    }

    public Student(String stuId, String name)
    {
        this.stuId=stuId;
        this.name=name;
    }

    public Student(String stuId, String name, String dept)
    {
        this.stuId=stuId;
        this.name=name;
        this.dept=dept;
    }

    public Student(String stuId, double m1,double m2)
    {
        this.stuId=stuId;
        this.m1=m1;
        this.m2=m2;

        avg=m1+m2;

        if(avg>60)
            isQualified=true;
        else
            isQualified=false;
    }

    public String toString()
    {
        return ("Student Id: "+stuId+"\nName: "+name+"\nDepartment: "+dept+"\nSub1_marks: "+m1+"\nSub2_marks: "+m2+"\nQualified: "+isQualified);
    }

}

class Subject 
{
    private String subCode, subName;
    private double maxMarks,marksObtained;

    public String getSubCode(){return subCode;}
    public String getSubName(){return subName;}
    public double getMaxMarks(){return maxMarks;}
    public double getMarksObtained(){return marksObtained;}

    public Subject(String subCode, String subName)
    {
        this.subCode=subCode;
        this.subName=subName;
    }

    public Subject(String subCode, double maxMarks,double marksObtained)
    {
        this.subCode=subCode;
        this.maxMarks=maxMarks;
        this.marksObtained=marksObtained;
    }

}
public class StudentSubject {
    public static void main(String[] args) {
        Student []s=new Student[4];
        s[0]=new Student("UE218058", 89.3, 64.8);
        s[1]=new Student("UE218073", 73.6, 98.4);
        s[2]=new Student("UE218078", 23.8, 10.7);
        s[3]=new Student("UE218098", 78.2, 23.9);
        
        for(Student a:s)
        {
            System.out.println(a);
            System.out.println("");
        }

        
    }
}
