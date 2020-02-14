/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConn;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Divya
 */
public class DBConnection {

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Connection conn;
    PreparedStatement pstmt;
    
 public DBConnection(){
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","");
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
   public  ResultSet login(String username, String password) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    ResultSet result = null;
        try {
            pstmt=conn.prepareStatement("SELECT * FROM user where Username=? and Password=?");
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            result=pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
    }

   public ResultSet examineelogin(String token, String epassword) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     ResultSet eresult = null;
        try {
            pstmt=conn.prepareStatement("SELECT * FROM examine where TokenID=? and Password=?");
            pstmt.setString(1,token);
            pstmt.setString(2,epassword);
            eresult=pstmt.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return eresult;
    }
    
   
    public int addToken(String token, String password) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int result=0;
       String date=null;
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
       LocalDateTime now = LocalDateTime.now();  
       date=dtf.format(now);  
      
        try {
            pstmt=conn.prepareStatement("INSERT INTO `examine`( `TokenID`, `Password`, `Date`) VALUES(?,?,?) ");
            pstmt.setString(1,token);
            pstmt.setString(2,password);
            pstmt.setString(3,date);
           
           
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }    
            return result;
    }
    

     public int addQues(String ques, String opt1, String opt2, String opt3, String opt4, String cor, String sub) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int result=0;
       String date=null;
      
        try {
            pstmt=conn.prepareStatement("INSERT INTO `question`(`Question`, `Option1`, `Option2`, `Option3`, `Option4`, `Correct`, `Subject`) VALUES(?,?,?,?,?,?,?) ");
            pstmt.setString(1,ques);
            pstmt.setString(2,opt1);
            pstmt.setString(3,opt2);
            pstmt.setString(4,opt3);
            pstmt.setString(5,opt4);
            pstmt.setString(6,cor);
            pstmt.setString(7, sub);
            
           
            result=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }    
            return result;
    }
}    



