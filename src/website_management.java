
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author mu96e
 */
public class website_management {

    static String finalreport = "";

    Manger m = new Manger();

    /**
     * The method will check the username by compare the one insert by the manger with the one in the file 
     * @param username
     * @return
     */
    public static boolean check_the_username(String username) {
        if (!(username.equalsIgnoreCase(Manger.name))) {
            JOptionPane.showMessageDialog(new Frame(), "The username is incorrect");
            return false;
        }
        return true;

    }

    /**
     * The method will generate report and provide it to manger 
     * @return
     */
    public static String Send_initial_report() {
        int Tickets_sold = ((int) Ticket.Tickets_sold());
        int reserved_table = (int) Resturant.reserved_table();
        int Ski_Tickets_sold = (int) Ski.Tickets_sold();
        double Ski_Tickets_sold_price = (Ski_Tickets_sold * Ski.ticket_price);

        return "Welcome Mr." + Manger.name + "\nThe number of Tickets sold: " + Tickets_sold + "\nThe total price of Tickets sold: " + Ticket.total_price_sold_ticket()
                + "\nThe number of reserved table in restaurant: " + reserved_table
                + "\nThe number of Ski Tickets sold: " + Ski_Tickets_sold + "\nThe total price of Ski Tickets sold: " + Ski_Tickets_sold_price;

    }

    /**
     *  The method will display the final report after modification in new interface 
     * @return finalreport
     */
    public static String show_massage() {
        return finalreport;
    }

    /**
     * The method will take the manger modification and add it to report
     * @param modification
     * @return finalreport
     */
    public static String Send_final_report(String modification) {
        finalreport = Send_initial_report() + "\n" + modification;
        return finalreport;

    }

    /**
     * The method will check the password  by compare the one insert by the manger with the one in the file
     * @param password
     * @return
     */
    public static boolean Enter_password(String password) {
        if (!(password.equalsIgnoreCase(Manger.password))) {
            JOptionPane.showMessageDialog(new Frame(), "The password is incorrect");
            return false;
        }
        return true;
    }

}
