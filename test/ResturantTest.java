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
public class ResturantTest {
    
    public ResturantTest() {
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
     * Test of reserved_table method, of class Resturant.
     */
    @Test
    public void testReserved_table() {
        System.out.println("reserved_table");
        Resturant.NumberOfTableS=2;
        Resturant.NumberOfTableM=4;
        Resturant.NumberOfTableL=1;
        double expResult = (10 - 2) + ( 10 - 4) + (5 - 1);
        double result = Resturant.reserved_table();
        assertTrue(expResult==result);
        
    }
    
}
