import java.awt.*;
import java.awt.event.*;

class Card extends Frame implements ItemListener
{   
    Button b1,b2,b3;
    Label l1,l2,l3;
    Panel p1,p2,pcb,mp;
    Checkbox c1,c2;

    CardLayout card;
    public Card()
    {
        super("Card Layout Demo");

        CheckboxGroup cg=new CheckboxGroup();

        c1=new Checkbox("First", false, cg);
        c2=new Checkbox("Second", false, cg);
        c1.addItemListener(this);
        c2.addItemListener(this);
        
        l1=new Label("str1");
        l2=new Label("str2");
        l3=new Label("str3");

        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");

        pcb=new Panel();
        pcb.add(c1);
        pcb.add(c2);

        p2=new Panel();
        p2.add(l1);
        p2.add(l2);
        p2.add(l3);

        p1=new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        card=new CardLayout();
        mp=new Panel(card);
        mp.add(p1);
        mp.add(p2);

        add(pcb,BorderLayout.NORTH);
        add(mp,BorderLayout.CENTER);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(c1.getState())
            card.first(mp);
        else
            card.last(mp);
    }

}
public class CardlayoutDemo {
    public static void main(String[] args) {
        Card c=new Card();
        c.setSize(600, 600);
        c.setVisible(true);
        
    }
}
