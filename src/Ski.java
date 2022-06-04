
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mu96e
 */
public class Ski {

    static String name;
    static int no_ticket;
    static int ticket_price;
    static String day;

    /**
     * the constructor will read the ski information from readfile 
     */
    public Ski() {
        File f = new File("ReadFile.txt");
        Scanner s;
        try {
            s = new Scanner(f);
            String line;

            while (s.hasNext()) {
                line = s.nextLine();
                if (line.equalsIgnoreCase("ski ticket price")) {
                    this.ticket_price = s.nextInt();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("The File is not exit ");
        }
    }

    /**
     * the method will display the ski ticket interface 
     */
    public static void sendTicket() {
        ski_info i = new ski_info();
        i.setVisible(true);
    }

    /**
     * The method will set the customer name 
     * @param name
     */
    public void Enter_your_name(String name) {
        this.name = name;
    }

    /**
     *  The method will set the day that customer reserved
     * @param day
     */
    public void selectDay(String day) {
        this.day = day;
    }

    /**
     * the method will reduce the total number of ski ticket 
     * @param ticket
     */
    public static void Enter_no_of_ticket(int ticket) {
        no_ticket = ticket;
        System.out.println(main.number_of_ski_ticket);
        if (main.number_of_ski_ticket >= (ticket)) 
            main.number_of_ski_ticket -= ticket;
         else {
            JOptionPane.showMessageDialog(new Frame(), "The required number of ticket is not available\n the number of avilable ticket " + main.number_of_ski_ticket);
        }
    }

    /**
     * the method will account the total amount for ski reserve 
     * @return total_amount
     */
    public static double total_amount() {
        return no_ticket * ticket_price;
    }

    /**
     * the method will account the sold ticket 
     * @return tickets_sold
     */
    public static double Tickets_sold() {
        return (30 - main.number_of_ski_ticket);
    }
}
