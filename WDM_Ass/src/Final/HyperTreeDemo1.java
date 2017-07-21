
package Final;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTree;


public class HyperTreeDemo1 extends javax.swing.JFrame 
{

    String str;
    StringBuilder  stringBuilder;
    private JTree tree;
    
    public HyperTreeDemo1() 
    {
        initComponents();
    }
    public HyperTreeDemo1(int i){}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        btn_gtree = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_head = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_tail1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_prime = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 255, 204));

        panel2.setBackground(new java.awt.Color(255, 204, 204));

        btn_gtree.setText("Generate tree");
        btn_gtree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gtreeActionPerformed(evt);
            }
        });

        jLabel3.setText("Tail-Enter n:");

        btn_head.setText("head");
        btn_head.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_headActionPerformed(evt);
            }
        });

        jLabel4.setText("Prime-Enter n:");

        btn_tail1.setText("!");
        btn_tail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tail1ActionPerformed(evt);
            }
        });

        jLabel5.setText("head-Enter n:");

        btn_prime.setText("'");
        btn_prime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(btn_gtree, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_head)
                    .addComponent(btn_tail1)
                    .addComponent(btn_prime))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_gtree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btn_tail1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_prime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_head, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jButton1.setText("browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select File");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Web Data Management");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(103, 103, 103))))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showDialog(this, "Attach");
        File selFile = fc.getSelectedFile();
        
        jTextField1.setText(selFile.getName());
       
        
        //File content to string
        //File file = new File(selFile.getName());

        String str = "";

        if(selFile.exists())
        {
            BufferedReader reader = null;
            try 
            {
                System.out.println("jjjjjjjj"+selFile.getName());
                reader = new BufferedReader(new FileReader (selFile));
                String  line = null;
                stringBuilder = new StringBuilder();
               /// String         ls = System.getProperty("line.separator");
                
                while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                //stringBuilder.append(ls);
                 }

        //        return stringBuilder.toString();
                //System.out.println("\nhhh      "+stringBuilder.toString());
                
                
            } catch (FileNotFoundException ex) 
            {
                System.out.println("File opening error ");
            } catch (IOException ex) {
                Logger.getLogger(HyperTreeDemo1.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_gtreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gtreeActionPerformed
        // TODO add your handling code here:
        str=stringBuilder.toString();
       // System.out.println("myyy1"+str);
        gtree gt=new gtree();
        gt.set_str(str);
        gt.dis_gtree();
        //System.out.println("myyy2");
    }//GEN-LAST:event_btn_gtreeActionPerformed

    private void btn_headActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_headActionPerformed
        
        str=stringBuilder.toString();
        System.out.println("myyy1"+str);
        head gt1=new head();
        gt1.set_str(str);
        gt1.set_i(1);
        gt1.dis_gtree();

        System.out.println("myyy2");
    }//GEN-LAST:event_btn_headActionPerformed

    private void btn_tail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tail1ActionPerformed
        // TODO add your handling code here:
         str=stringBuilder.toString();
        System.out.println("myyy1"+str);
        tail gt=new tail();
        gt.set_str(str);
        gt.set_i(1);
        gt.dis_gtree();

        System.out.println("myyy2");
    }//GEN-LAST:event_btn_tail1ActionPerformed

    private void btn_primeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeActionPerformed
        // TODO add your handling code here:
        
         str=stringBuilder.toString();
        System.out.println("myyy1"+str);
        Prime gt=new Prime();
        gt.set_str(str);
        gt.set_i(1);
        gt.dis_gtree();

        System.out.println("myyy2");
    }//GEN-LAST:event_btn_primeActionPerformed

//    private String readFile(String file) throws IOException {
//    BufferedReader reader = new BufferedReader(new FileReader (file));
//    String         line = null;
//    StringBuilder  stringBuilder = new StringBuilder();
//    String         ls = System.getProperty("line.separator");
//
//    try {
//        while((line = reader.readLine()) != null) {
//            stringBuilder.append(line);
//            stringBuilder.append(ls);
//        }
//
//        return stringBuilder.toString();
//    } finally {
//        reader.close();
//    }
//}
    public static void main(String args[]) 
    {        
                new HyperTreeDemo1().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gtree;
    private javax.swing.JButton btn_head;
    private javax.swing.JButton btn_prime;
    private javax.swing.JButton btn_tail1;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}


