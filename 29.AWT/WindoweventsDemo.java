import java.awt.*;
import java.awt.event.*;

class Window extends Frame implements WindowListener
{
    Label l;

    public Window()
    {
        l=new Label("                     ");

        addWindowListener(this);
        add(l);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}
public class WindoweventsDemo {
    public static void main(String[] args) {
        Window w=new Window();
        w.setSize(500, 500);
        w.setVisible(true);
        
    }
}
