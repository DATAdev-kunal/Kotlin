import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyInternalFrame extends JInternalFrame
{
    static int count=0;

    JTextArea ta;
    JScrollPane sp;

    public MyInternalFrame()
    {
        super("Document "+ (++count),true,true,true,true);

        ta=new JTextArea();
        sp=new JScrollPane(ta);
        add(sp);
        
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300, 300);
        setLocation(50, 50);
        setVisible(true);

    }
}

class Multiframe extends JFrame implements ActionListener
{
    JDesktopPane jp=new JDesktopPane();

    public Multiframe()
    {
        super("Multi Window Demo");

        jp=new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb=new JMenuBar();
        JMenu d=new JMenu("Document");
        JMenuItem m=new JMenuItem("New");

        mb.add(d);
        d.add(m);
        setJMenuBar(mb);

        m.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame f=new MyInternalFrame();
        jp.add(f);
    }
}
public class MultiWindowDesktop {
    public static void main(String[] args) {
        Multiframe f=new Multiframe();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(Multiframe.EXIT_ON_CLOSE);
        
    }
}
