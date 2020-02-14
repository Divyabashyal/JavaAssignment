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
public class Ques3 extends javax.swing.JFrame {

    /**
     * Creates new form Ques3
     */
    
    String subject;
    String token;
    String id1, id2, id3;
    String query;
    String Question, opt1, opt2, opt3, opt4, cor, ans2, ans3, cor2;
    int finalmarks, marks1;
            
    public Ques3(String subject3,String token3,String id1,String id2,String ans2,int marks1) {
        initComponents();
        subject=subject3;
        token=token3;
        this.id1=id1;
        this.id2=id2;
        this.ans2=ans2;
        this.marks1=marks1;
        getAllQuestion();
        marks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     public String getAllQuestion(){
        
        try {
            query = "SELECT * FROM question WHERE Subject='"+subject+"'AND QuesID!='"+id1+"'AND QuesID!='"+id2+"' ORDER BY RAND() LIMIT 1";

            DBConnection dc=new DBConnection();
            PreparedStatement stmt = dc.conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Question=(rs.getString("Question"));
                id3=(rs.getString("QuesID"));
                opt1=(rs.getString("Option1"));
                opt2=(rs.getString("Option2"));
                opt3=(rs.getString("Option3"));
                opt4=(rs.getString("Option4"));
                cor=(rs.getString("Correct"));

                String[] ans1 = {opt1, opt2, opt3, opt4};
                cmb_ans.removeAllItems();
                DefaultComboBoxModel answercmb = new DefaultComboBoxModel(ans1);
                cmb_ans.setModel(answercmb);
            }
            
            
        } catch (SQLException ex) {
            
        }
        txt_ques3.setText(Question);
        return Question;
    }
     
     
     public void marks(){
         try {
            query = "SELECT * FROM question WHERE QuesID='"+id2+"'";
            //stmt.setInt(1, user.getUserId());
            DBConnection dc=new DBConnection();
            PreparedStatement stmt = dc.conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                cor2=(rs.getString("Correct"));             
            }

        } catch (SQLException ex) {
            
        }
         
        if(cor2.equals(ans2)){
            finalmarks=1+marks1;
        }
        else{
            finalmarks=0+marks1;
        }
        String fm=Integer.toString(finalmarks);
        txt_finalmarks.setText(fm);
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_ques3 = new javax.swing.JTextArea();
        btn_next3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmb_ans = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_finalmarks = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_ques3.setEditable(false);
        txt_ques3.setColumns(20);
        txt_ques3.setRows(5);
        jScrollPane1.setViewportView(txt_ques3);

        btn_next3.setText("Next");
        btn_next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose the Correct answer:");

        cmb_ans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Question3:");

        jLabel3.setText("Answer:");

        txt_finalmarks.setText(" ");

        jLabel4.setText("Your Current Marks:");

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
                            .addComponent(cmb_ans, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_finalmarks)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_next3)))
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
                    .addComponent(cmb_ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_finalmarks)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_next3)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next3ActionPerformed
        // TODO add your handling code here:
        ans3=(String) cmb_ans.getSelectedItem();
        Ques4 q4= new Ques4(subject,token,id1,id2,id3,ans3,finalmarks);
        q4.setVisible(true);
        this.dispose();
        q4.setResizable(false);

    }//GEN-LAST:event_btn_next3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ques3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ques3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ques3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ques3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String subject1=null;
                String token1=null;
                String id1=null;
                String id2=null;
                String ans2=null;
                int marks=0;
                new Ques3(subject1,token1,id1,id2,ans2,marks).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next3;
    private javax.swing.JComboBox<String> cmb_ans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_finalmarks;
    private javax.swing.JTextArea txt_ques3;
    // End of variables declaration//GEN-END:variables
}