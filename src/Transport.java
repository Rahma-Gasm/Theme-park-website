
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mu96e
 */
public class Transport {

    static int price_cartype;
    static int price_district;
    static String name_district;
    static String name_cartype;
    static int transport_cost;

    Transport() {

    }

    /**
     *This method take customer option and read the price from Readfile depending on selected district
     * @param dis
     * @throws FileNotFoundException
     */
    public void selectDistrict(String dis) throws FileNotFoundException {
        name_district = dis;
        Scanner input;
        File f = new File("ReadFile.txt");
        input = new Scanner(f);
        String line;
        while (input.hasNext()) {
            line = input.nextLine();
            if (line.equalsIgnoreCase(dis)) {
                price_district = input.nextInt();
            }
        }
    }

    /**
     *This method will take the customer option and read the price from Readfile depending on car type
     * @param type
     * @throws FileNotFoundException
     */
    public void selectCarType(String type) throws FileNotFoundException {
        name_cartype = type;
        Scanner input;
        File f = new File("ReadFile.txt");
        input = new Scanner(f);
        String line;
        while (input.hasNext()) {
            line = input.nextLine();
            if (line.equalsIgnoreCase(type)) {
                price_cartype = input.nextInt();
            }
        }
    }

    /**
     *This method will calculate the total cost of transport
     * @param car_price
     * @param district_price
     * @return Total_cost
     */
    public static int Total_cost() {
        transport_cost =  price_cartype +price_district ;
        return transport_cost;

    }

    /**
     *This method display the transport information
     * @return information
     */
    public static String information() {
        String r = "Your selected district is: " + name_district + "\nThe cost for this district is: " + price_district + "\nYour selected car is: " + name_cartype + "\nThe cost for this car is: " + price_cartype + "\n\n The total cost for transport:" + Total_cost();
        return r;

    }

}
