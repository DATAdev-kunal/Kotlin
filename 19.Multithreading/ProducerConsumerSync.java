class Sync 
{
    int value=0;
    boolean flag=true;

    synchronized public void set(int value) 
    {
        while(flag!=true)
            try{wait();}catch(Exception e){}
        this.value = value;
        flag=false;
        notify();
        try{Thread.sleep(1000);}catch(Exception err){}
    }
   
    synchronized public int get() 
    {
        int x=0;
        while(flag!=false)
            try{wait();}catch(Exception e){}
        x=value;
        flag=true;
        notify();
        try{Thread.sleep(1000);}catch(Exception err){}
        return x;
    }

    
}

class Producer extends Thread
{
    Sync d;
    Producer(Sync d)
    {
        this.d=d;
    }

    public void run()
    {
        int i=0;
        while(true)
        {
            d.set(i);
            System.out.println("Producer: "+i);
            i++;
        }
    }
}

class Consumer extends Thread
{
    Sync d;
    Consumer(Sync d)
    {
        this.d=d;
    }

    public void run()
    {
        while(true)
        {
        
           System.out.println("Consumer: "+d.get());
            
        }
    }
}
public class ProducerConsumerSync {
    public static void main(String[] args) {
        Sync s= new Sync();

        Producer p=new Producer(s);
        Consumer c=new Consumer(s);

        p.start();
        c.start();
    }
}
