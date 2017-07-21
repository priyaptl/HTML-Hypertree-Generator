package Final;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.awt.Dimension;
import static java.awt.SystemColor.text;
import java.util.List;
import javax.swing.tree.TreeNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

public class ass extends JFrame
{
    private JTree tree;
    private String test = "<html><head><title><h3>First parse<h3></title><a></a><h3></h3></head><body><p>Parsed HTML into a doc.</p></body></html>";
    int children;
    int index;
    public static void main(String[] args)
    {
                new ass().ass1();     
    }

    
    public void ass1()
    {   
        
        DefaultMutableTreeNode html = new DefaultMutableTreeNode("html");
        Document doc = Jsoup.parse(test);
        
        children = doc.childNodes().get(0).childNodes().size();   
//System.out.println("childrean   "+children);
        
        
        rec(doc,html);
        
        //System.out.println("tag: " + children);           

        tree = new JTree(html);
        add(tree);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example"); 
        this.setMinimumSize(new Dimension(300, 400));
        this.setExtendedState(3);
        this.pack();
        this.setVisible(true);
    }
    void rec(Document d,DefaultMutableTreeNode node)      
    {
        System.out.println("childrean   "+children);
        
        //children = d.childNodes().get().childNodes().size(); 
        int a=node.getIndex(node);
        System.out.println("a");
        System.out.println(node.getPreviousNode());
        for (int i=0 ; node.children().hasMoreElements() ; i++)
        {
            String tag = node.getChildAt(i).toString();
            System.out.println(tag+ "abc ");
            node.add(new DefaultMutableTreeNode("Tag: " + tag));
            rec(d,new DefaultMutableTreeNode(node.getChildAt(i)));
            node=node.getNextSibling();
        }
        //int children =node.getChildCount();
        
//        System.out.println("children "+children +" "+node.toString());
//           
//        for(int i=0; i < children; i++)
//        {
//              if(d.childNodes().get(0).childNodes().get(i).childNodeSize() > 0)
////            {
////            
////            }
//        }

    }
}