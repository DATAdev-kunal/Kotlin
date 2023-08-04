import java.awt.*;
import java.awt.event.*;

class RadioFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox cg1,cg2,cg3;
    CheckboxGroup cbg;
    
    public RadioFrame()
    {
        super("Radio button demo");

        l=new Label("Nothing selected");

        cbg=new CheckboxGroup();

        cg1=new Checkbox("Java",false,cbg);
        cg2=new Checkbox("Python",false,cbg);
        cg3=new Checkbox("C++",false,cbg);

        cg1.addItemListener(this);
        cg2.addItemListener(this);
        cg3.addItemListener(this);

        setLayout(new FlowLayout());
        
        add(l);
        add(cg1);
        add(cg2);
        add(cg3);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        
        String str="";

        if(cg1.getState())
            str=str+" "+cg1.getLabel();
        if(cg2.getState())
            str=str+" "+cg2.getLabel();
        if(cg3.getState())
            str=str+" "+cg3.getLabel();
        if(str.isEmpty())
            str=l.getText();

        l.setText(str);

    }
}
public class RadioButton {
    public static void main(String[] args) {
        RadioFrame rf=new RadioFrame();
        rf.setSize(500, 500);
        rf.setVisible(true);

    }
}
