import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Spinner extends JFrame implements ActionListener,ListSelectionListener, ChangeListener
{
    JComboBox cb;
    JSpinner s1,s2;
    JList list;
    JTextField tf;
    
    public Spinner()
    {
        super("My Spinner demo");

        String countries[]={"India","USA","Canada","China","Australia","Germany"};

        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

        String days[]={"  Sunday","  Monday","  Tuesday","  Wednesday","  Thursday","  Friday","  Saturday"};

        cb=new JComboBox<>(countries);
        list=new JList<>(months);
        list.setVisibleRowCount(5);
        tf=new JTextField(15);
        s1=new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));

        s2=new JSpinner(new SpinnerListModel(days));

        setLayout(new FlowLayout());
        add(cb);
        add(s1);
        add(s2);
        add(new JScrollPane(list));
        add(tf);

        cb.addActionListener(this);
        list.addListSelectionListener(this);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText((String)list.getSelectedValue());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText((String)cb.getSelectedItem());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==s1)
            tf.setText(s1.getValue()+"");
        else
            tf.setText((String)s2.getValue());
    }


}

public class SpinnerDemo{
    public static void main(String[] args) {
        Spinner sp=new Spinner();

        sp.setSize(800, 600);
        sp.setVisible(true);
        sp.setDefaultCloseOperation(Spinner.EXIT_ON_CLOSE);
    }
}