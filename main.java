import java.util.Scanner;

public class main
{
    // Make an easier println statement because typeing system.out.println is to much to do so many times
    public static void sprintln(String text) {
        System.out.println(text);
    }

    // Make an easier print statement because typeing system.out.print is to much to do so many times
    public static void sprint(String text) {
        System.out.print(text);
    }

    // Main class with everything (on this file)
    public static void main(String[] args)
    {
        // Initailize scanner object
        Scanner input = new Scanner(System.in);

        GeoHelper geoHelper = new GeoHelper();

        // Print out the choices and welcome the user
        sprintln("Hello, welcome to the Jv Geo Calculator");
        sprintln("For distance calc, press 1.");
        sprintln("For midpoint calc, press 2.");
        sprintln("For endpoint finder with midpoint, press 3.");
        sprintln("For ratio deviding calc, press 4.");
        sprintln("For endpoint finder with ratios, press 5.");

        // Grab the user's choice for what calc they need
        int userChoice = input.nextInt();
        
        // Sort through the user's choices and then do what they want
        if (userChoice == 1) {
            sprintln("You chosee distance calculator.");

            // Get the coodinates
            // x1
            double xOne = geoHelper.getXOne();

            // y1
            sprint("Enter the first Y coordinate: ");
            double yOne = input.nextDouble();

            // x2
            sprint("Enter the second X coordinate: ");
            double xTwo = input.nextDouble();

            // y2
            sprint("Enter the second Y coordinate: ");
            double yTwo = input.nextDouble();

            // Make the distance object
            Funcs distanceObj = new Funcs(xOne, yOne, xTwo, yTwo);

            // Do the calculation
            distanceObj.distance();
        }
        else if (userChoice == 2) {
            sprintln("You chose midpoint calculator.");
        }
        else if (userChoice == 3) {
            sprintln("You chose endpoint finder with midpoint.");
        }
        else if (userChoice == 4) {
            sprintln("You chose ratio deviding calc.");
        }
        else if (userChoice == 5) {
            sprintln("You chose endpoint finder using ratios.");
        }
        else {
            sprintln("Run the program again, out of area.");
        }
    }
}