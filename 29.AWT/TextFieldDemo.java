import java.awt.*;
import java.awt.event.*;

class TextFrame extends Frame 
{
    Label l1,l2;
    TextField tf;

    public TextFrame()
    {
        super("Text Field Demo");

        l1=new Label("No text");
        l2=new Label("Enter not hit");
        tf=new TextField(20);
        tf.setEchoChar('*');
    
        Handler h=new Handler();

        tf.addTextListener(h);
        tf.addActionListener(h);
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);

    }

    
    class Handler implements TextListener, ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
        }
    
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText());
        }

    }


}
public class TextFieldDemo {
    public static void main(String[] args) {
        TextFrame tf=new TextFrame();
        
        tf.setSize(500, 500);
        tf.setVisible(true);
    }
}
