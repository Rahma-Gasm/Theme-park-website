/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP-PC
 */
public class website_managementTest {
    
    public website_managementTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of check_the_username method, of class website_management.
     */
    @Test
    public void testCheck_the_username() {
        System.out.println("check_the_username");
        Manger m = new Manger ();
        String username = m.name ;
        boolean expResult = true;        
        boolean result = website_management.check_the_username(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of Enter_password method, of class website_management.
     */
    @Test
    public void testEnter_password() {
        System.out.println("Enter_password");
        Manger m = new Manger ();
        String password = m.password;
        boolean expResult = true;
        boolean result = website_management.Enter_password(password);
        assertEquals(expResult, result);
    }
    
}
