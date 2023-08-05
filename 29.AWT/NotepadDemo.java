import java.awt.*;
import java.awt.event.*;

class NoteFrame extends Frame implements ActionListener
{
    Label l;
    TextArea ta;
    TextField tf;
    Button b1;

    public NoteFrame()
    {
        super("My Notepad");
        l=new Label("nothing selected");
        ta=new TextArea(20, 30);
        tf=new TextField(20);
        
        b1=new Button("Click");

        b1.addActionListener(this);

        setLayout(new FlowLayout());
        add(ta);
        add(tf);
        add(l);
        add(b1);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //l.setText(ta.getSelectedText());
        
        ta.append(tf.getText());
        
    }
}
public class NotepadDemo {
    public static void main(String[] args) {
        NoteFrame nf=new NoteFrame();
        nf.setSize(500,500);
        nf.setVisible(true);
        
    }
}
