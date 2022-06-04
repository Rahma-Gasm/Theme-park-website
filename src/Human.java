

/**
 *
 * @author mu96e
 */
public class Human {

    static String name;

    /**
     * 
     */
    public Human() {

    }

    /**
     * The constructor will set  customer name
     * @param name
     */
    public Human(String name) {
        this.name = name;
    }

    /**
     * The method will check the customer choice and display appropriate interface
     * @param choice
     */
    public static void CheckChoice(int choice) {
        if (choice == 1) {
            ticket_interface i = new ticket_interface();
            i.setVisible(true);
            
        } else if (choice == 2) {
            Ski_interface i = new Ski_interface();           
            i.setVisible(true);
            
        } else if (choice == 3) {
            restaurant i = new restaurant();
            i.setVisible(true);
            
        } else {
            search_interface i = new search_interface();
            i.setVisible(true);
        }
    }

   
}
