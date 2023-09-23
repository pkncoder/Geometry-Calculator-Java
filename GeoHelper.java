import java.util.Scanner;

public class GeoHelper {
    // Initalize scanner object
    Scanner input = new Scanner(System.in);

    // Used for getting x1
    public double getXOne() {
        // Ask the user to input said x1
        System.out.print("Enter the first X coordinate: ");
        double xOne = input.nextDouble();

        // Return x1 value
        return xOne;
    }
}
