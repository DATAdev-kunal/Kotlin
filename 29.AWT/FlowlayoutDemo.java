import java.awt.*;
import java.awt.event.*;

class Flow extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public Flow()
    {
        super("Flow Layout Demo");

        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
        
        FlowLayout fl=new FlowLayout(FlowLayout.RIGHT);
        setLayout(fl);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }
}
public class FlowlayoutDemo {
    public static void main(String[] args) {
        
        Flow f=new Flow();

        f.setSize(500, 500);
        f.setVisible(true);
    }
}
