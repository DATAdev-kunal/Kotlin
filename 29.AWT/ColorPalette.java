import java.awt.*;
import java.awt.event.*;

class Palette extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;

    public Palette()
    {
        super("My color palette");

        red=new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green=new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);

        tf=new TextField(20);

        tf.setBounds(50, 50, 300, 100);
        red.setBounds(50, 200, 300, 30);
        green.setBounds(50, 280, 300, 30);
        blue.setBounds(50, 360, 300, 30);

        setLayout(null);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        
        add(tf);
        add(red);
        add(green);
        add(blue);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {

        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
    }
}
public class ColorPalette {
    public static void main(String[] args) {
        Palette p=new Palette();
        p.setSize(400, 500);
        p.setVisible(true);
        
    }
}
