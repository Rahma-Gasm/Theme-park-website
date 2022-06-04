
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mu96e
 */
public class Ticket {

    static int no_adult;
    static int no_child;
    static int ticket_price_adult;
    static String day;
    static String name;
    static int ticket_price_child;
    static int discount;
    static int total_discount;


    /**
     * The constructor will read ticket information from Readfile
     */
    public Ticket() {
        File f = new File("ReadFile.txt");
        Scanner s;
        try {
            s = new Scanner(f);
            String line;
            while (s.hasNext()) {
                line = s.nextLine();
                if (line.equalsIgnoreCase("ticket price adult")) 
                    ticket_price_adult = s.nextInt();
                
                if (line.equals("ticket price child")) 
                    ticket_price_child = s.nextInt();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("The File is not exit ");
        }
    }

    /**
     * The method will display the ticket interface 
     */
    public static void sendTicket() {
        ticket_information i = new ticket_information();
        i.setVisible(true);
    }

    /**
     * The method will display the payment interface 
     */
    public static void EnterPaymentInformaton() {
        payment_interface i = new payment_interface();
        i.setVisible(true);

    }

    /**
     * The method will display the transport interface 
     */
    public void DoYouPreferBookTrsnport() {
        transport_interface i = new transport_interface();
        i.setVisible(true);
    }

    /**
     * This method will calculate the discount if the number of reserved ticket more than 5
     * @return discountofVIPuser
     */
    public static int discountOfVIPUser() {
        if ((no_child + no_adult) > 5) {
            discount = ((int) ((no_child * ticket_price_child + no_adult * ticket_price_adult) * 0.25));
            total_discount+=discount;
        }
        return discount;
    }

    /**
     * The method will set the customer name 
     * @param name
     */
    public void Enter_your_name(String name) {
        this.name = name;
    }

    /**
     * The method will set the day that customer reserved
     * @param day
     */
    public void selectDay(String day) {
        this.day = day;
    }

    /**
     *This method will reduce the total number of adult tickets and child tickets
     * @param child_ticket
     * @param adult_ticket
     */
    public void Enter_no_of_ticket(int child_ticket, int adult_ticket) {
        this.no_child = child_ticket;
        this.no_adult = adult_ticket;
        
        if (main.number_of_ticket_child>= no_child)
            main.number_of_ticket_child -= no_child ;
        else 
            JOptionPane.showMessageDialog(new Frame(), "The required number of child ticket is not available\n the number of avilable ticket " + main.number_of_ticket_child);
            
        if ( main.number_of_ticket_Adult>= no_adult)
           main.number_of_ticket_Adult -= no_adult ;
        
        else 
            JOptionPane.showMessageDialog(new Frame(), "The required number of adult ticket is not available\n the number of avilable ticket " +  main.number_of_ticket_Adult);
    }
    
    /**
     *This method will calculate the total price of sold ticket
     * @return total_price_sold_ticket
     */
    public static double total_price_sold_ticket(){
        return ((200-main.number_of_ticket_child)*45) +((300-main.number_of_ticket_Adult )*90)-total_discount;
        
    }
    
    /**
     *This method will calculate the total price that the customer should pay it in addition to apply the discount
     * @return total_amount
     */
    public static double total_amount() {
        return (no_child * ticket_price_child) + (no_adult * ticket_price_adult) - discountOfVIPUser();
    }

    /**
     * This method will calculate the total number of sold ticket
     * @return Tickets_sold
     */
    public static double Tickets_sold() {
        return (200 - main.number_of_ticket_child) + (300 - main.number_of_ticket_Adult);
    }
     
    
    
}
