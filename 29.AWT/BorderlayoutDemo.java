import java.awt.*;
import java.awt.event.*;

class Border extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public Border()
    {
        super("Border Layout Demo");

        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
        
        
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.WEST);
        //add(b4,BorderLayout.EAST);
        add(b5,BorderLayout.CENTER);

        Panel p=new Panel();
        p.setLayout(new GridLayout(3, 1));
        p.add(new Button("Select"));
        p.add(new Button("Delete"));
        p.add(new Button("Alter"));
        add(p,BorderLayout.EAST);
    }
}

public class BorderlayoutDemo {
    public static void main(String[] args) {
        Border b=new Border();
        b.setVisible(true);
        b.setSize(500, 500);
        
    }
    
}
