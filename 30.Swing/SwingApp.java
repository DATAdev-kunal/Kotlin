import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class SwingFrame extends JFrame implements ActionListener
{
    JLabel l;
    JButton b;
    int count=0;
    public SwingFrame()
    {
        super("Swing window");
        l=new JLabel("Clicked "+count+" times");
        b=new JButton("Click");

        setLayout(new FlowLayout());
        add(l);
        add(b);

        b.addActionListener(this);

        getRootPane().setDefaultButton(b);
        l.setToolTipText("counter");

        b.setIcon(new ImageIcon("/home/kunal/Downloads/istockphoto-1133992590-170667a.jpg"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked "+count+" times");
    }
}

public class SwingApp {
    public static void main(String[] args) {
        SwingFrame sw=new SwingFrame();
        sw.setVisible(true);
        sw.setSize(800, 800);
        sw.setDefaultCloseOperation(SwingFrame.EXIT_ON_CLOSE);
        
    }
}
