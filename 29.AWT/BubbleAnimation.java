import java.awt.*;
import java.awt.event.*;

class Bubble extends Frame implements Runnable
{
    int x,y,tx,ty;

    public Bubble()
    {
        super("Bubble Animation");
        x=200;
        y=400;
        tx=ty=1;

        Thread t=new Thread(this);
        t.start();

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

    public void run()
    {
        while(true)
        {
            x+=tx;
            y+=ty;

            if(x<0 || x>450)
                tx=tx*-1;
            if(y<20 || y>450)
                ty=ty*-1;
            repaint();

            try {
                Thread.sleep(3);
            } catch (Exception e) {
                
            }
        }
    }
}
public class BubbleAnimation {
    public static void main(String[] args) {
        Bubble b=new Bubble();
        b.setSize(500, 500);
        b.setVisible(true);
    }
}
