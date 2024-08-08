import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.*;

class Bar extends JFrame implements ActionListener
{
    JToolBar tb;
    JTextArea ta;
    JButton b1,b2;

    public Bar()
    {
        super("My Toolbar Demo");

        b1=new JButton(new ImageIcon("/home/kunal/Downloads/—Pngtree—toolbar icon_4758776 (1).png"));

        b2=new JButton(new ImageIcon("/home/kunal/Downloads/istockphoto-1133992590-170667a (1).jpg"));
        tb=new JToolBar();
        tb.add(b1);
        tb.add(new JToolBar.Separator());
        tb.add(b2);
        
        ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("Save");
        JMenuItem m2=new JMenuItem("Open");
        
        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);
        
        
        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);
        
        b2.setActionCommand("Open");

        b2.addActionListener(this);
        m2.addActionListener(this);

        b1.addActionListener(this);
        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Open"))
        {
            JFileChooser fc=new JFileChooser();
            fc.showOpenDialog(this);
            File f=fc.getSelectedFile();
    
            try {
                FileInputStream fis=new FileInputStream(f);
                byte b[]=new byte[fis.available()];
                fis.read(b);
    
                String str=new String(b);
                ta.setText(str);
    
                fis.close();
    
            } catch (Exception e1) {
                
            }

        }
        else
        {
            new JColorChooser();
            Color col=JColorChooser.showDialog(this, "Font Colour",Color.red);
            ta.setForeground(col);

        }

    }
}
public class InteractiveToolBar {
    public static void main(String[] args) {
        Bar b=new Bar();
        b.setSize(700, 700);
        b.setVisible(true);
        b.setDefaultCloseOperation(Bar.EXIT_ON_CLOSE);
        
    }
}
