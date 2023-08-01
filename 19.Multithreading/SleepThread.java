class Sleep extends Thread
{
    public void run()
    {
        int count=1;
        while(count<10)
        {
            System.out.println(count);
            count++;
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException err)
            {
                System.out.println(err);
            }
        }
    }
}

public class SleepThread {
    public static void main(String[] args) {
        Sleep t=new Sleep();
        t.start();
        t.interrupt();
    }
}
