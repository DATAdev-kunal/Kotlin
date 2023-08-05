import java.awt.*;
import java.awt.event.*;

class Counter extends Frame 
{
    Button b;
    TextField tf;
    int count=0;

    public Counter()
    {
        super("Counter editor");

        b=new Button("Click");
        tf=new TextField(20);

        setLayout(new FlowLayout());
        add(tf);
        add(b);
        
        //b.addActionListener(new MyListener());
        //OR using fly call

        /* b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                count++;
                tf.setText(String.valueOf(count));
            }
        }); */

        // SINCE ActionListener IS A FUNTIONAL INTERFACE, SO WE CAN WRITE LAMBDA EXPRESSION FOR THAT:

        b.addActionListener((ActionEvent ae)->{
            count++;
            tf.setText(String.valueOf(count));
        });

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

/* class MyListener implements ActionListener
{
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));
    }

} */
    //OR


}
public class CounterEditor {
    public static void main(String[] args) {
        Counter c=new Counter();
        c.setSize(500, 500);
        c.setVisible(true);
    }
}
