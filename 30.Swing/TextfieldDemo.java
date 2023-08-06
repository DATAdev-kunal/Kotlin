import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.*;
import javax.swing.text.NumberFormatter;


class MyFrame extends JFrame
{
    public MyFrame()
    {
        JTextField tf1=new JTextField(20);
        DateFormat d=new SimpleDateFormat("dd/MMM/yyyy");
        JFormattedTextField ftf1=new JFormattedTextField(d);
        ftf1.setColumns(20);
        ftf1.setValue(0);


        NumberFormatter nft=new NumberFormatter();
        nft.setAllowsInvalid(false);
        nft.setMaximum(100000);

        JFormattedTextField ftf2=new JFormattedTextField(nft);
        ftf2.setColumns(20);
        ftf2.setValue(0);

        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft2=new NumberFormatter(nf);
        nft2.setAllowsInvalid(false);
        nft2.setMaximum(10000);
        
        JFormattedTextField ftf3=new JFormattedTextField(nft2);
        ftf3.setColumns(20);
        ftf3.setValue(0);


        setLayout(new FlowLayout());
        add(tf1);
        add(ftf1);
        add(ftf2);
        add(ftf3);


    }
}
public class TextfieldDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        
    }
}
