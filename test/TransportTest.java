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
public class TransportTest {
    
    public TransportTest() {
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
     * Test of Total_cost method, of class Transport.
     */
    @Test
    public void testTotal_cost() {
        System.out.println("Total_cost");
        Transport.price_cartype=200;
        Transport.price_district=50;
        int expResult = 250;
        int result = Transport.Total_cost();
        assertEquals(expResult, result);
        
    }

}
