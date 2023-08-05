import java.awt.*;
import java.awt.event.*;

class Menuframe extends Frame 
{
    MenuBar mb;
    Menu file,sub;// sub is for sub-menu items in later item
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    TextField tf;
    public Menuframe()
    {
        super("My menu");

        open=new MenuItem("Open");
        save=new MenuItem("Save");
        close=new MenuItem("Close");
        closeall=new MenuItem("Close all");

        auto=new CheckboxMenuItem("Autosave");

        file=new Menu("File");
        sub=new Menu("Sub-menu");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeall);


        mb=new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);


        open.addActionListener((ActionEvent ae)->{tf.setText("Open");});
        save.addActionListener((ActionEvent ae)->{tf.setText("Save");});
        close.addActionListener((ActionEvent ae)->{tf.setText("Close");});
        closeall.addActionListener((ActionEvent ae)->{tf.setText("Close All");});

        auto.addItemListener((ItemEvent ie)->{
            if(auto.getState())
                tf.setText("Autosave ON");
            else
                tf.setText("Autosave OFF");
        });


        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
    }

}

public class MenuDemo {
    public static void main(String[] args) {
        Menuframe mf=new Menuframe();
        mf.setSize(500, 500);
        mf.setVisible(true);
        
    }
}
