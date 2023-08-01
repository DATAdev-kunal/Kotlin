class TV 
{
    public void switchOn()
    {
        System.out.println("TV on");
    }
    public void channelChange()
    {
        System.out.println("TV channel change");
    }
}

class SmartTv extends TV
{
    //@Override
    public void switchOn()
    {
        System.out.println("Smart TV on");        
    }

    //@Override
    public void channelChange()
    {
        System.out.println("Smart TV channel change");
    }

    public void browse()
    {
        System.out.println("Smart TV browsing");
    }
}

public class TvSmartTv {
    public static void main(String[] args) {
        TV t1=new SmartTv();
        SmartTv t2=new SmartTv();

        t1.switchOn();
        t1.channelChange();



    }
}
