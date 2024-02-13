import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        double miles, kilometers;
        final double MILES_TO_KILOMETERS_CONVERSION = 1.60935;
        Scanner scan = new Scanner(System.in);

        // Get miles from the user
        System.out.print("Enter distance in miles: ");
        miles = scan.nextDouble();

        // Convert miles to kilometers
        kilometers = miles * MILES_TO_KILOMETERS_CONVERSION;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}