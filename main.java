import java.util.Scanner;

public class main
{
    // Make an easier println statement because typeing system.out.println is to much to do so many times
    public static void sprintln(String text) {
        System.out.println(text);
    }

    // Main class with everything (on this file)
    public static void main(String[] args)
    {
        // Making the scanner liberary
        Scanner input = new Scanner(System.in);

        // Print out the choices and welcome the user
        sprintln("Hello, welcome to the Jv Geo Calculator");
        sprintln("For distance calc, press 1.");
        sprintln("For midpoint calc, press 2.");
        sprintln("For endpoint finder with midpoint, press 3.");
        sprintln("For ratio deviding calc, press 4.");
        sprintln("For endpoint finder with ratios, press 5.");

        // Grab the user's
        int userChoice = input.nextInt();
        
        // Sort through the user's choices and then do what they want
        if (userChoice == 1) {
            sprintln("You chosee distance calculator.");
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