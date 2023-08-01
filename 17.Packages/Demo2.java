
interface Bluetooth
{
    public void connect(); 
}

class Tethering 
{
    public void device()
    {
        System.out.println("...connecting to device");
    }
}

class Headphone extends Tethering implements Bluetooth
{

    @Override
    public void connect() {
        System.out.println("You are plugged into Nivarna !");        
    }
    
}

public class Demo2 {
    public static void main(String[] args) {
        Headphone hp=new Headphone();
        hp.device();
        hp.connect();
    }
}
