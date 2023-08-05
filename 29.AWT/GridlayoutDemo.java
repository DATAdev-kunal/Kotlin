import java.awt.*;
import java.awt.event.*;

class Grid extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public Grid()
    {
        super("Grid layout Demo");

        setLayout(new GridLayout(3,3));
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
        

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(new Button("Seven"));
    }
}
public class GridlayoutDemo {
    public static void main(String[] args) {
        Grid g=new Grid();
        g.setVisible(true);
        g.setSize(400, 400);
        
    }
}
