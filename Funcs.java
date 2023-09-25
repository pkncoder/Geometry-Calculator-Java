public class Funcs {
    // Initalize variables that we will need
    static double xOne;
    static double yOne;
    static double xTwo;
    static double yTwo;
    static int topRatio;
    static int bottomRatio;

    // Make the constructors for everything needed
    // The constructor for ratio ones
    public Funcs(double firstX, double firstY, double secondX, double secondY, int ratioPartOne, int ratioPartTwo) {
        xOne = firstX;
        yOne = firstY;
        xTwo = secondX;
        yTwo = secondY;
        topRatio = ratioPartOne;
        bottomRatio = ratioPartTwo;
    }

    // The constructor for the normal ones, as just the coordinates
    public Funcs(double firstX, double firstY, double secondX, double secondY) {
        xOne = firstX;
        yOne = firstY;
        xTwo = secondX;
        yTwo = secondY;
    }

    // The equation for distance, prints out self
    public void distance() {
        // Equation: sqrt((x1-x2)^2+(y1-y2)^2)
        System.out.println("The distance is: " + Math.sqrt(Math.pow((xOne - xTwo), 2) + Math.pow((yOne - yTwo), 2)));
    }

    // The equation for midpoint, prints out self
    public void midpoint() {
        // Equation: X = (x2-x1)/2; Y = (y2-y1)/2
        System.out.println("The midpoint is: (" + (xTwo - xOne) / 2 +", " + (yTwo - yOne) / 2+ ").");
    }
}
