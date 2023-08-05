import java.awt.*;
import java.awt.event.*;

class AdFrame extends Frame
{
    public AdFrame()
    {
        /* addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        }); */

        //OR

        addWindowListener(new MyWindow());
    }
}

class MyWindow extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}


public class Adapter {
    public static void main(String[] args) {
        AdFrame f=new AdFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        
    }
}
