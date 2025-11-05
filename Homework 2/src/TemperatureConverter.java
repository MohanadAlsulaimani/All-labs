import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a tempreature in Celsius ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Output the result, rounding to nearest whole number for Fahrenheit
        System.out.printf("%.1f Celsius is equal to %.0f Fahrenheit%n", celsius, fahrenheit);
    }
}