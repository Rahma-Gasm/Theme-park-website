
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mu96e
 */
public class Search {

    static String contactNumber = "";
    static String workhours = "";
    static int ticket_price_adult;
    static int ticket_price_child;


    /**
     * the method will display the search interface
     */
    public static void DisplaySearchMenu() {
        new search_interface().setVisible(true);

    }

    /**
     * the method read the general information about themepark from readfile
     * @return info
     */
    public static String recevive_information() {
        String info = "";

        try {

            File f = new File("ReadFile.txt");
            Scanner s = new Scanner(f);

            String line;
            while (s.hasNext()) {
                line = s.nextLine();

                if (line.equalsIgnoreCase("ticket price adult")) {
                    ticket_price_adult = s.nextInt();
                }

                if (line.equalsIgnoreCase("ticket price child")) {
                    ticket_price_child = s.nextInt();
                }
                if (line.equalsIgnoreCase("contact number")) {
                    contactNumber = s.nextLine();

                }
                if (line.equalsIgnoreCase("work hours")) {
                    workhours = s.nextLine();
                }
            }

            info = "Ticket price:\nAdult: " + ticket_price_adult + "SR\nChild: " + ticket_price_child + "SR\n\nOpening and closing time:\n" + workhours + "\n\nContact number:\n" + contactNumber;

        } catch (FileNotFoundException ex) {
            System.out.println("File NotFound");
        }

        return info;

    }

}
