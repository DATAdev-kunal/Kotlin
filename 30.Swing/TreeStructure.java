import java.awt.BorderLayout;
import java.io.File;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class Dir extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel l;

    public Dir()
    {
        super("My Directory");

        DefaultMutableTreeNode root=new DefaultMutableTreeNode("/home/kunal/Java_se_learning");

        File f=new File("/home/kunal/Java_se_learning");

        for(File x:f.listFiles())
        {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());

                for(File y:x.listFiles())
                {
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }

                root.add(temp);
            }
            else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }

        tree=new JTree(root);
        l=new JLabel("No file selected");


        JScrollPane sc=new JScrollPane(tree);

        add(sc,BorderLayout.CENTER);
        add(l,BorderLayout.SOUTH);

        tree.addTreeSelectionListener(this);

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        //StringTokenizer st=new StringTokenizer(e.getPath().toString(), );
        l.setText(e.getPath().toString());
    }
}
public class TreeStructure {
    public static void main(String[] args) {
        Dir d=new Dir();
        d.setSize(500, 500);
        d.setVisible(true);
        d.setDefaultCloseOperation(Dir.EXIT_ON_CLOSE);

        
    }
}
