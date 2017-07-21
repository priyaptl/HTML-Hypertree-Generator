package Final;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

public class gtree extends JFrame
{
    private JTree tree;
    private String test; 
    
    public void set_str(String dstr)
    {
        test=dstr;
    }

   

   public void dis_gtree() 
   {
    // create window
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("JTree Example");
    this.setMinimumSize(new Dimension(300, 400));
    this.setExtendedState(3);

    // create tree and root node
    this.tree = new JTree();
    final DefaultMutableTreeNode ROOT = new DefaultMutableTreeNode("html");

    // create model
    DefaultTreeModel treeModel = new DefaultTreeModel(ROOT);
    tree.setModel(treeModel);

    // add scrolling tree to window
    this.add(new JScrollPane(tree));

    // parse document (can be cleaned too)
       System.out.println("mmkmkmmkmmkmkmkmkmkmkk");
    Document doc = Jsoup.parse(test);
    // Cleaner cleaner = new Cleaner(Whitelist.simpleText());
    // doc = cleaner.clean(doc);

    // walk the document tree recursivly
    traverseRecursivly(doc.getAllElements().first(), ROOT);

    this.expandAllNodes(tree);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
}

private void traverseRecursivly(Node docNode, DefaultMutableTreeNode treeNode) 
{
    
    // iterate child nodes:
    for (Node nextChildDocNode : docNode.childNodes()) 
    {
        // create leaf:
        DefaultMutableTreeNode nextChildTreeNode = new DefaultMutableTreeNode(nextChildDocNode.nodeName());
        // add child to tree:
        treeNode.add(nextChildTreeNode);
        // do the same for this child's child nodes:
        traverseRecursivly(nextChildDocNode, nextChildTreeNode);
    }
}

// can be removed ...
private void expandAllNodes(JTree tree) 
{
    int j = tree.getRowCount();
    int i = 0;
    while (i < j) {
        tree.expandRow(i);
        i += 1;
        j = tree.getRowCount();
    }
 }

}