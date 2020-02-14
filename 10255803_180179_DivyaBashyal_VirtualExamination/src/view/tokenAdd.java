/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DBConn.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Divya
 */
public class tokenAdd extends javax.swing.JInternalFrame {
    
String admin;
    /**
     * Creates new form tokenAdd
     */
    public tokenAdd(String user) {
        initComponents();
        admin=user;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_tokenid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tokenpw = new javax.swing.JPasswordField();
        btn_gentoken = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Token Generate");
        setToolTipText("");

        jLabel1.setText("Token ID:");

        jLabel3.setText("Password:");

        btn_gentoken.setText("Generate");
        btn_gentoken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gentokenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_gentoken)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tokenid)
                            .addComponent(txt_tokenpw, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_tokenid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tokenpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btn_gentoken)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gentokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gentokenActionPerformed
        // TODO add your handling code here:
        
        String token=txt_tokenid.getText();
        String pass=String.valueOf(txt_tokenpw.getPassword());
        String empty = "";

        if(token.equals(empty)){
            JOptionPane.showMessageDialog(this, "Token ID is empty! Please re-enter...");
        }
        else if(pass.equals(empty)){
            JOptionPane.showMessageDialog(this, "Password is empty! Please re-enter...");
        }
        else{
            try {
                DBConnection tdc= new DBConnection();
                int result=tdc.addToken(token,pass);
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Token added Successfully"); 
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to add Token");
                }    
         }
        
         catch (Exception ex) {
         
         }
        
        }     
        
    }//GEN-LAST:event_btn_gentokenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gentoken;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_tokenid;
    private javax.swing.JPasswordField txt_tokenpw;
    // End of variables declaration//GEN-END:variables
}