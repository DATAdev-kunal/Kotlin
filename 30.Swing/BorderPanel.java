import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

class BorderFrame extends JFrame
{
    JTextField tf;
    JButton b;
    JLabel l;

    public BorderFrame()
    {
        tf=new JTextField(20);
        b=new JButton("Click");
        l=new JLabel("Login");
        
        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), l.getText(), TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION);

        JPanel p=new JPanel();
        p.add(tf);
        p.add(b);
        p.setBorder(br);
        
        setLayout(new FlowLayout());
        add(p);
    }
}
public class BorderPanel {
    public static void main(String[] args) {
        BorderFrame bf=new BorderFrame();
        bf.setVisible(true);
        bf.setSize(500,500);
        bf.setDefaultCloseOperation(BorderFrame.EXIT_ON_CLOSE);
        
    }
}
