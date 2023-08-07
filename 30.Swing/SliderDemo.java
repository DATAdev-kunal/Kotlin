import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Slide extends JFrame implements ChangeListener
{
    JSlider s;
    JPanel p1;
    JProgressBar pb;
    int x=50;

    public Slide()
    {
        super("Slider Demo");

        s=new JSlider(0, 100, 50);
        s.setMajorTickSpacing(10);
        s.setMinorTickSpacing(1);
        s.setPaintTicks(true);
        s.setPaintLabels(true);

        pb=new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);
        

        JPanel p2=new JPanel();
        p2.add(pb);

        p1=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                g.drawOval(200,200,x,x);
                
            }
        };
        
        add(s,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        
        s.addChangeListener(this);
        
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        x=s.getValue();
        p1.repaint();
        pb.setString(x+"%");
        pb.setStringPainted(true);
        pb.setValue(x);
    }

    
}

public class SliderDemo {
    public static void main(String[] args) {
        Slide sl=new Slide();
        sl.setSize(900, 900);
        sl.setVisible(true);
        sl.setDefaultCloseOperation(Slide.EXIT_ON_CLOSE);

    }
}
