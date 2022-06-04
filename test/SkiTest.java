/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SkiTest {
    
    public SkiTest() {
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
     * Test of total_amount method, of class Ski.
     */
    @Test
    public void testTotal_amount() {
        System.out.println("total_amount");
        Ski s = new Ski();
        int t = s.ticket_price;
        Ski.no_ticket=7;
        double expResult = t* 7;
        double result =Ski.total_amount();
        assertTrue(expResult == result);
    
    }

    /**
     * Test of Tickets_sold method, of class Ski.
     */
    @Test
    public void testTickets_sold() {
        System.out.println("Tickets_sold");
         main.number_of_ski_ticket=10; // availble ticket
        double expResult = 30 - main.number_of_ski_ticket;
        double result = Ski.Tickets_sold();
        assertTrue(expResult== result);
    }
    
}
