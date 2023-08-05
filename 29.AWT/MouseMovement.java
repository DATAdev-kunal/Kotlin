import java.awt.*;
import java.awt.event.*;

class Mouse extends Frame implements MouseListener,MouseMotionListener
{
    Label l1;
    Label l2;

    public Mouse()
    {
        super("Mouse Demo");
        l1=new Label("");
        l2=new Label("");
        
        setLayout(null);
        l1.setBounds(20, 40, 300, 50);
        l2.setBounds(20, 110, 300, 50);

        addMouseListener(this);
        addMouseMotionListener(this);

        add(l1);
        add(l2);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l1.setText("mouseDragged");
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        l1.setText("mouseMoved");
        l2.setText("("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("mouseExited");
    }
}
public class MouseMovement {
    public static void main(String[] args) {
        Mouse m=new Mouse();
        m.setSize(500, 500);
        m.setVisible(true);
        
    }
}
