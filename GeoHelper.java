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

    // Used for getting y1
    public double getYOne() {
        // Ask the user to input said y1
        System.out.print("Enter the first Y coordinate: ");
        double yOne = input.nextDouble();

        // Return y1 value
        return yOne;
    }

    // Used for getting x2
    public double getXTwo() {
        // Ask the user to input said x2
        System.out.print("Enter the second X coordinate: ");
        double xTwo = input.nextDouble();

        // Return x2 value
        return xTwo;
    }

    // Used for getting y2
    public double getYTwo() {
        // Ask the user to input said y2
        System.out.print("Enter the second Y coordinate: ");
        double yTwo = input.nextDouble();

        // Return x2 value
        return yTwo;
    }

    // Used for getting ratio part one
    public int getRatioTop() {
        System.out.print("Enter the top/first part of the ratio. Should be a part-part ratio: ");
        int ratioTop = input.nextInt();

        // Return ratio top
        return ratioTop;
    }

    // Used for getting ratio part two
    public int getRatioBottom() {
        System.out.print("Enter the bottom/second part of the ratio. Should be a part-part ratio: ");
        int ratioBottom = input.nextInt();

        // Return ratio top
        return ratioBottom;
    }
}
