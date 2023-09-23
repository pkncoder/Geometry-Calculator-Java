import java.util.Scanner;

public class main
{
    public static void sprintln(String text) {
        System.out.println(text);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        sprintln("Hello, welcome to the Jv Geo Calculator");

        int userChoice = input.nextInt();
        
    }
}