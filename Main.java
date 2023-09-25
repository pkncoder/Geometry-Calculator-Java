import java.util.Scanner;

public class Main
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
        // DISTANCE
        if (userChoice == 1) {
            sprintln("You chosee distance calculator.");

            // Get the coodinates
            // x1
            double xOne = geoHelper.getXOne();

            // y1
            double yOne = geoHelper.getYOne();

            // x2
            double xTwo = geoHelper.getXTwo();

            // y2
            double yTwo = geoHelper.getYTwo();

            // Make the distance object
            Funcs distanceObj = new Funcs(xOne, yOne, xTwo, yTwo);

            // Do the calculation
            distanceObj.distance();
        }

        // MIDPOINT
        else if (userChoice == 2) {
            sprintln("You chose midpoint calculator.");

            // Get the coodinates
            // x1
            double xOne = geoHelper.getXOne();

            // y1
            double yOne = geoHelper.getYOne();

            // x2
            double xTwo = geoHelper.getXTwo();

            // y2
            double yTwo = geoHelper.getYTwo();

            // Create the object that we will use
            Funcs midpointObj = new Funcs(xOne, yOne, xTwo, yTwo);

            // Do the function, this prints out everything also.
            midpointObj.midpoint();
        }

        // ENDPOINT WITH MIDPOINT
        else if (userChoice == 3) {
            sprintln("You chose endpoint finder with midpoint.");
        }

        // LINE RATIO DEVIDING
        else if (userChoice == 4) {
            sprintln("You chose ratio deviding calc.");
        }

        // ENDPOINT WITH RATIOS
        else if (userChoice == 5) {
            sprintln("You chose endpoint finder using ratios.");
        }

        // FINAL THING SO NO ERROR
        else {
            sprintln("Run the program again, out of area.");
        }
    }
}
