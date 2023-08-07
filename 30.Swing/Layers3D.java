import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

class LayerFrame extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JRadioButton r1,r2,r3;
    JLayeredPane lp;
    public LayerFrame()
    {
        super("3D Layers");

        r1=new JRadioButton("red", false);
        r2=new JRadioButton("green", false);
        r3=new JRadioButton("blue", true);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        l1=new JLabel("Red");
        l1.setBounds(10, 10, 300, 300);
        l1.setBackground(Color.RED);
        l1.setOpaque(true);

        l2=new JLabel("Green");
        l2.setBounds(110, 110, 300, 300);
        l2.setBackground(Color.GREEN);
        l2.setOpaque(true);

        l3=new JLabel("Blue");
        l3.setBounds(210, 210, 300, 300);
        l3.setBackground(Color.BLUE);
        l3.setOpaque(true);

        l4=new JLabel("B");
        l4.setBounds(310, 310, 100, 100);
        l4.setBackground(Color.BLACK);
        l4.setOpaque(true);

        lp=new JLayeredPane();
        lp.add(l1,new Integer(0));
        lp.add(l2,new Integer(1));
        lp.add(l3,new Integer(2));
        lp.add(l4,new Integer(3));
        
        JPanel p=new JPanel();
        p.add(r1);
        p.add(r2);
        p.add(r3);

        add(lp,BorderLayout.CENTER);
        add(p,BorderLayout.NORTH);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me)
            {
                l4.setLocation(me.getX(),me.getY());
            }
        });

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(r1.isSelected())
            lp.setLayer(l4,1);
        if(r2.isSelected())
            lp.setLayer(l4,2);
        if(r3.isSelected())
            lp.setLayer(l4,3);
    }
}
public class Layers3D {
    public static void main(String[] args) {
        LayerFrame f=new LayerFrame();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(LayerFrame.EXIT_ON_CLOSE);
    }
}
