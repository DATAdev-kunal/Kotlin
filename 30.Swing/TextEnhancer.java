import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class TextFrame extends JFrame implements ActionListener
{
    JCheckBox c1,c2;
    JRadioButton r1,r2;
    JTextField tf;

    public TextFrame()
    {
        super("Text Enhancer");

        c1=new JCheckBox("Bold");
        c2=new JCheckBox("Italic");

        
        r1=new JRadioButton("lower", false);
        r2=new JRadioButton("UPPER", false);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        r1.setActionCommand("lower");
        r2.setActionCommand("UPPER");

        tf=new JTextField("demo text",30);
        
        setLayout(new FlowLayout());

        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand())
        {
            case "lower": tf.setText(tf.getText().toLowerCase());
                break;
            case "UPPER": tf.setText(tf.getText().toUpperCase());
        }

        int i=0,b=0;

        if(c1.isSelected())
            b=Font.BOLD;
        if(c2.isSelected())
            i=Font.ITALIC;

        Font f=new Font("Times New Roman", b|i, 15);
        tf.setFont(f);
            
    }
}
public class TextEnhancer {
    public static void main(String[] args) {
        TextFrame frame=new TextFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(TextFrame.EXIT_ON_CLOSE);
        
    }
}
