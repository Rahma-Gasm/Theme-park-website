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
public class TicketTest {
    
    public TicketTest() {
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
     * Test of discountOfVIPUser method, of class Ticket.
     */
    @Test
    public void testDiscountOfVIPUser() {
        System.out.println("discountOfVIPUser");
        Ticket.no_child = 3;
        int expResult = 0;
        int result = Ticket.discountOfVIPUser();
        assertEquals(expResult, result);
    }


    /**
     * Test of total_price_sold_ticket method, of class Ticket.
     */
    @Test
    public void testTotal_price_sold_ticket() {
        System.out.println("total_price_sold_ticket");
        main.number_of_ticket_Adult = 298;// availble ticket
        main.number_of_ticket_child = 198;// availble ticket
        int discount = Ticket.total_discount;
        double expResult = (300 - 298) * 45 + (200 - 198) * 90 - 0;
        double result = Ticket.total_price_sold_ticket();
        assertTrue(expResult == result);

    }

    /**
     * Test of total_amount method, of class Ticket.
     */
    @Test
    public void testTotal_amount() {
        System.out.println("total_amount");
        Ticket.no_child = 2;
        Ticket.no_adult = 3;
        Ticket t = new Ticket();
        int adult = t.ticket_price_adult;
        int child = t.ticket_price_child;
        double expResult = (2 * child) + (3 * adult);
        double result = Ticket.total_amount();
        assertTrue(expResult == result);

    }

    /**
     * Test of Tickets_sold method, of class Ticket.
     */
    @Test
    public void testTickets_sold() {
        System.out.println("Tickets_sold");
        main.number_of_ticket_child=5;// availble ticket
        main.number_of_ticket_Adult=20;// availble ticket
        double expResult = (200 - 5) + (300 - 20);
        double result = Ticket.Tickets_sold();
        assertTrue(expResult== result);
        
    }
    
}
