class ThreadNaming extends Thread
{
    public ThreadNaming(String name)
    {
        super(name);
        setPriority(MIN_PRIORITY+2);
    }
}

public class NameThread {
    public static void main(String[] args) {
        ThreadNaming t=new ThreadNaming("mainThread");

        System.out.println("Id: "+t.threadId());
        System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        t.start();
        System.out.println("State: "+t.getState());
        System.out.println("Alive: "+t.isAlive());
    }
}
