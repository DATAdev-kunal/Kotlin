import java.awt.*;
import java.awt.event.*;

class SelectFrame extends Frame implements ActionListener, ItemListener
{
    List li;
    Choice ch;
    TextArea ta;

    public SelectFrame()
    {
        super("My selection app");

        li=new List(4, true);
        ch=new Choice();
        ta=new TextArea(30, 20);

        li.add("Sunday");
        li.add("Monday");
        li.add("Tuesday");
        li.add("Wednesday");
        li.add("Thursday");
        li.add("Friday");
        li.add("Saturday");

        ch.add("January");
        ch.add("February");
        ch.add("March");
        ch.add("April");
        ch.add("May");
        ch.add("June");
        ch.add("July");
        ch.add("August");
        ch.add("September");
        ch.add("October");
        ch.add("November");
        ch.add("December");

        li.addActionListener(this);
        li.addItemListener(this);
        ch.addItemListener(this);
        
        setLayout(new FlowLayout());
        add(li);
        add(ch);
        add(ta);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==li)
            ta.setText(li.getSelectedItem());
        else
            ta.setText(ch.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[]= li.getSelectedItems();
    
            String str="";
            
            for(String x:list)
                str+=x+ "\n";
            
            ta.setText(str);


    addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

}

public class SelectionApp {
    public static void main(String[] args) {
        SelectFrame sf=new SelectFrame();
        sf.setVisible(true);
        sf.setSize(500, 600);
    }
}
}
