class Join extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count);
            count++;
        }
    }
}

public class JoinThread {
    public static void main(String[] args) throws Exception
    {
        Join j=new Join();
        j.setDaemon(true);
        j.start();

        Thread mainThread= Thread.currentThread();
        mainThread.join();

    }
}
