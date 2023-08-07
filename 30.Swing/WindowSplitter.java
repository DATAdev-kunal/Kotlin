import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MainFrame extends JFrame implements ListSelectionListener
{   
    JSplitPane sp;
    JList list;
    JLabel l;

    public MainFrame()
    {
        super("My Splitter");

        String cols[]={"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};

        list=new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane jp1=new JScrollPane(list);
        

        l=new JLabel(" ");
        l.setBackground(Color.red);
        l.setOpaque(true);
        JScrollPane jp2=new JScrollPane(l);
        

        /* sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jp1, jp2);
        sp.setDividerLocation(300);
        add(sp); */

//OR FOR MAKING TABBED PANE:
        JTabbedPane tp=new JTabbedPane();
        tp.add("Color list", jp1);
        tp.add("Demo",jp2);
        add(tp);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

        String str=(String)list.getSelectedValue();

        switch(str)
        {
            case "RED": l.setBackground(Color.RED);
                break;
            case "GREEN": l.setBackground(Color.GREEN);
                break;
            case "BLUE": l.setBackground(Color.BLUE);
                break;
            case "YELLOW": l.setBackground(Color.YELLOW);
                break;
            case "MAGENTA": l.setBackground(Color.MAGENTA);
                break;
            case "ORANGE": l.setBackground(Color.ORANGE);
                break;
            case "BLACK": l.setBackground(Color.BLACK);
                break;
            
        }
    }
}

public class WindowSplitter {
    public static void main(String[] args) {
        MainFrame mf=new MainFrame();
        mf.setVisible(true);
        mf.setSize(800, 300);
        mf.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        
    }
}
