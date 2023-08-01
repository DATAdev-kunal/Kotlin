package interfaceSmartphone;

interface Camera 
{
    void click();
    void record();
}

interface MusicPlayer
{
    void play();
    void pause();
    void stop();
}

class Phone
{
    void call()
    {
        System.out.println("Phone call");
    }
    void sms()
    {
        System.out.println("Phone sms");
    }
}
class ModernPhone extends Phone implements Camera,MusicPlayer
{
    @Override
    public void click() {
        System.out.println("Click on SmartPhone");        
    }
    @Override
    public void record() {
        System.out.println("Record on SmartPhone");
        
    }
    @Override
    public void pause() {
        System.out.println("Pause on SmartPhone");
        
    }
    @Override
    public void play() {
        System.out.println("Play on SmartPhone");
        
    }
    @Override
    public void stop() {
        System.out.println("Stop on SmartPhone");
    }
}

public class InterfaceSmartPhone {
    public static void main(String[] args) {
        ModernPhone mp=new ModernPhone();

        Phone p=mp;
        p.call();
        p.sms();
        System.out.println("");

        Camera c=mp;
        c.click();
        c.record();
        System.out.println("");

        MusicPlayer m=mp;
        m.play();
        m.pause();
        m.stop();
    }
    
}
