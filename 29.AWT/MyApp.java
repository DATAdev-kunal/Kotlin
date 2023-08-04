import java.awt.*;

public class MyApp extends Frame
{
    Button b;
    TextField tf;
    Label l;
    
    public MyApp()
    {
        super("First app");


        b=new Button("OK");
        l=new Label("Name ");
        tf=new TextField(20);

        add(l);
        add(tf);
        add(b);

    }
    public static void main(String[] args) {
        MyApp f=new MyApp();
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(500, 500);
    
        
    }
}
