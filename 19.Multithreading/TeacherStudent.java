class Lecture 
{
    String text;
    int noOfStu=0;
    int count=0;
    public void attendance()
    {
        noOfStu++;
    }

    synchronized public void write(String text)
    {
        System.out.println("Teacher is Writing "+text);
        while(count!=0)
            try{wait();}catch(Exception e){}
        this.text=text;
        count=noOfStu;
        notify();
    }

    synchronized public String read()
    {   
        while(count==0)
            try{wait();}catch(Exception e){}
        String line=text;
        count--;
        if(count==0)
            notify();
        return line;
    }
    

}

class Teacher extends Thread
{
    Lecture lec;
    String notes[]={"Java","OOPs","Python","end"};

    Teacher (Lecture lec)
    {
        this.lec=lec;
    }
    public void run()
    {   
        for(int i=0;i<notes.length;i++)
        {
            lec.write(notes[i]);
        }
    }
}

class Student extends Thread
{
    String name;
    Lecture lec;
    Student(String name,Lecture lec)
    {
        this.name=name;
        this.lec=lec;
    }

    public void run()
    {
        String text;
        lec.attendance();

        do
        {
            text=lec.read();
            System.out.println(name+" Reading "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}

public class TeacherStudent {
    public static void main(String[] args)throws Exception {
        Lecture l= new Lecture();
        Teacher t=new Teacher(l);
        
        //Student s1=new Student("1. John", l);
        Student s2=new Student("2. Lina", l);
        Student s3=new Student("3. Alex", l);
        Student s4=new Student("4. Dyna", l);

        t.start();

        //s1.start();
        s2.start();
        s3.start();
        s4.start();


    }
}
