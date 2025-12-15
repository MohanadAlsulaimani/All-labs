/*
Mohanad alsulaimani
148
 */
import java.util.Scanner;

public class Main {
    // Method to compute area of circle, using Math.PI
    public static double computeArea(double radius) {
        return Math.PI * (radius * radius);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to input radius
        System.out.print("Enter circle radius (cm): ");
        double radius = input.nextDouble();

        // Compute area and round using Math.round()
        double area = computeArea(radius);
        double roundedArea = Math.round(area);

        // Output the rounded area
        System.out.println("The area of the circle is: " + roundedArea + " cm^2");
    }
}