import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

class MyFrame extends Frame implements ActionListener
{
    int count=0;
    Label l;
    Button b;

    public MyFrame()
    {
        super("Counter App");

        l=new Label("   "+count+"   ");
        b=new Button("Count");
        b.addActionListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(b);

    }

    public void actionPerformed(ActionEvent e) {

        count++;
        l.setText("   "+count);
    }
}
public class ButtonDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}       
