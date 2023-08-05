import java.awt.*;
import java.awt.event.*;

class Paintframe extends Frame
{
    int x=0,y=0;

    public Paintframe()
    {
        super("My Paint");

        /* addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me)
            {
                x=me.getX();
                y=me.getY();
                repaint();
            }
        }); */

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me)
            {
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }

    
}
public class Painting {
    public static void main(String[] args) {
        Paintframe pf=new Paintframe();
        pf.setSize(500, 500);
        pf.setVisible(true);
    }
}
