class Yield extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count+" Yield");
            count++;
        }
    }
}
public class YieldThread {
    public static void main(String[] args) throws Exception{
        Yield y=new Yield();
        y.start();

        int count=1;
        while(true)
        {
            System.out.println(count+" Main");
            count++;
            Thread.yield();
        }

        

    
    }
}
