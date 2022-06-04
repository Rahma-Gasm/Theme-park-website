

/**
 *
 * @author mu96e
 */
public class Resturant {

    static String name;
    static String day;
    static String table_type;
    static String time;
    static int NumberOfPerson;
    static int NumberOfTableS = 10;
    static int NumberOfTableM = 10;
    static int NumberOfTableL = 5;

    /**
     * the method will set the name of customer
     * @param name
     */
    public void Enter_your_name(String name) {
        this.name = name;
    }

    /**
     * the method will set the day of customer reserve 
     * @param day
     */
    public void selectDay(String day) {
        this.day = day;
    }

    /**
     * the method will display the reserve information interface 
     */
    public void SendReserveInformation() {
        restaurant_info i = new restaurant_info();
        i.setVisible(true);
    }

    /**
     * the method will display the previous interface 
     */
    public void return_previous_page() {
        Main_interface i = new Main_interface();
        i.setVisible(true);
    }

    /**
     * the method will set the time of customer reserve  
     * @param t
     */
    public static void SelectTime(Object t ) {
        time= String.valueOf(t);
    }

    /**
     * the method will take the number of person and reduce number of appropriate table 
     * @param number
     */
    public void Enter_number_of_person(int number) {
        this.NumberOfPerson = number;
        if (NumberOfPerson < 4) {
            NumberOfTableS -= 1; //modified the number of small table 
            
        } else if (NumberOfPerson < 7) {
            NumberOfTableM -= 1;//modified the number of medium table 
            
        } else {
            NumberOfTableL -= 1; //modified the number of large table
        }
    }

    /**
     * the method will display the reserve information 
     * @return information
     */
    public static String information() {
        String information = "Name=" + name
                + "\nDay=" + day
                + "\nTime=" + time
                + "\nNumberOfPerson=" + NumberOfPerson;
        return information;
    }

    /**
     * the method will account the number of reserved table  
     * @return number_of_reserved_table
     */
    public static double reserved_table() {
        return ((10 - Resturant.NumberOfTableS) + (10 - Resturant.NumberOfTableM) + (5 - Resturant.NumberOfTableL));
    }

}
