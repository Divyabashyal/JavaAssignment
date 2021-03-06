/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DBConn.DBConnection;
import static java.lang.System.exit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Divya
 */
public class Ques2 extends javax.swing.JFrame {

    /**
     * Creates new form Ques2
     */
    String query;
    String subject2;
    String token2;
    String Question,opt1,opt2,opt3,opt4,cor;
    String id1,id2;
    String ans1,cor1,ans2;
    int finalmarks=0;
    
    public Ques2(String subject, String token, String id, String ans1) {
        initComponents();
        subject2=subject;
        token2=token;
        id1=id;
        this.ans1=ans1;
        getAllQuestion();
        marks();
    }
    
    public String getAllQuestion(){
        
        try {
            query = "SELECT * FROM question WHERE Subject='"+subject2+"' AND QuesID!='"+id1+"' ORDER BY RAND() LIMIT 1";
            //stmt.setInt(1, user.getUserId());
            DBConnection dc=new DBConnection();
            PreparedStatement stmt = dc.conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Question=(rs.getString("Question"));
                id2=(rs.getString("QuesID"));
                opt1=(rs.getString("Option1"));
                opt2=(rs.getString("Option2"));
                opt3=(rs.getString("Option3"));
                opt4=(rs.getString("Option4"));
                cor=(rs.getString("Correct"));

                String[] ans1 = {opt1, opt2, opt3, opt4};
                cmb_ans2.removeAllItems();
                DefaultComboBoxModel answercmb = new DefaultComboBoxModel(ans1);
                cmb_ans2.setModel(answercmb);

            }
            
            
        } catch (SQLException ex) {
            
        }
        txt_ques2.setText(Question);
        return Question;
    }
    
    public void marks(){
         try {
            query = "SELECT * FROM question WHERE QuesID='"+id1+"'";
            //stmt.setInt(1, user.getUserId());
            DBConnection dc=new DBConnection();
            PreparedStatement stmt = dc.conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                cor1=(rs.getString("Correct"));             
            }

        } catch (SQLException ex) {
            
        }
         
        if(cor1.equals(ans1)){
            finalmarks=1;
        }
        else{
            finalmarks=0;
        }
        String fm=Integer.toString(finalmarks);
        txt_finalmarks.setText(fm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_ques2 = new javax.swing.JTextArea();
        btn_next1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmb_ans2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_finalmarks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        txt_ques2.setColumns(20);
        txt_ques2.setRows(5);
        jScrollPane1.setViewportView(txt_ques2);

        btn_next1.setText("Next");
        btn_next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose the Correct answer:");

        cmb_ans2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_ans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ans2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Question2:");

        jLabel3.setText("Answer:");

        jLabel4.setText("Your Current Marks:");

        txt_finalmarks.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_ans2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_finalmarks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_next1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_ans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btn_next1)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_finalmarks)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next1ActionPerformed
        // TODO add your handling code here:
        ans2=(String) cmb_ans2.getSelectedItem();
        
        Ques3 q3= new Ques3(subject2,token2,id1,id2,ans2,finalmarks);
        q3.setVisible(true);
        this.dispose();
        q3.setResizable(false); 
        
    }//GEN-LAST:event_btn_next1ActionPerformed

    private void cmb_ans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ans2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_ans2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ques2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ques2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ques2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ques2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String sub=null;
                String tok=null;
                String id1=null;
                String ans1=null;
                new Ques2(sub,tok,id1,ans1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next1;
    private javax.swing.JComboBox<String> cmb_ans2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_finalmarks;
    private javax.swing.JTextArea txt_ques2;
    // End of variables declaration//GEN-END:variables
}
