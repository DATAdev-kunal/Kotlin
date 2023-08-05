import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class Key extends Frame implements KeyListener
{
    Label l1;
    Label l2;
    Label l3;
    Label l4;

    public Key()
    {
        super("Key events Demo");

        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");

        l1.setBounds(50, 50 ,  300, 20);
        l2.setBounds(50, 100 , 300, 20);
        l3.setBounds(50, 150 , 300, 20);
        l4.setBounds(50, 200 ,300, 20);

        setLayout(null);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Kye Pressed");
        l2.setText("");
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
    @Override
    public void keyTyped(KeyEvent e) {
        l3.setText("Key Typed");
        l4.setText(new Date(e.getWhen())+"");
    }


}

public class KeyeventsDemo {
    public static void main(String[] args) {
        Key k=new Key();
        k.setSize(500, 500);
        k.setVisible(true);
        
    }
}
