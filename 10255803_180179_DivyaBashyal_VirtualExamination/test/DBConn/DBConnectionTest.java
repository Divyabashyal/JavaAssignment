/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConn;

import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class DBConnectionTest {
    public DBConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }



    /**
     * Test of examineelogin method, of class DBConnection.
     */
    @Test
    public void testExamineelogin() {
        System.out.println("examineelogin");
        String token = "AAA";
        String epassword = "AAA";
        DBConnection instance = new DBConnection();
        ResultSet expResult = null;
        ResultSet result = instance.examineelogin(token, epassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToken method, of class DBConnection.
     */
    @Test
    public void testAddToken() {
        System.out.println("addToken");
        String token = "test";
        String password = "test";
        DBConnection instance = new DBConnection();
        int expResult = 0;
        int result = instance.addToken(token, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQues method, of class DBConnection.
     */
    @Test
    public void testAddQues() {
        System.out.println("addQues");
        String ques = "Test Question 1";
        String opt1 = "1";
        String opt2 = "2";
        String opt3 = "3";
        String opt4 = "4";
        String cor = "1";
        String sub = "Java";
        DBConnection instance = new DBConnection();
        int expResult = 0;
        int result = instance.addQues(ques, opt1, opt2, opt3, opt4, cor, sub);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
