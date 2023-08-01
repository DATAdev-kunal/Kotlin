class Tesla extends Thread
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

public class DaemonThread {
    public static void main(String[] args) {
        Tesla t=new Tesla();
        t.setDaemon(true);
        t.start();
        try
        {
            Thread.sleep(100); //sleeping main method on its start
        }
        catch(Exception e)
        {
            
        }
    }
}
