
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mu96e
 */
public class Manger extends Human {

    static String password;

    /**
     * the constructor  will read the username and password from Readfile
     */
    public Manger() {
        File f = new File("ReadFile.txt");
        Scanner s;
        try {
            s = new Scanner(f);
            String line;
            while (s.hasNext()) {
                line = s.nextLine();
                if (line.equalsIgnoreCase("username")) {
                    name = s.nextLine().trim();
                }

                if (line.equals("password")) {
                    password = s.nextLine().trim();
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("The File is not exit ");
        }
    }

    /**
     * the constructor will send the username to the superclass (human)
     * @param username
     * @param password
     */
    public Manger(String username, String password) {
        super(username);
        this.password = password;
    }

}
