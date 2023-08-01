public class ClassRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ClassRunnable m=new ClassRunnable();
        Thread t= new Thread(m);

        t.start();

        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
