import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  // User input
        System.out.println("Enter the temperature in celcius:");
        float celcius = sc.nextFloat();

        //المعادله الحسابيه لي التحويل من celcius الى fahrenheit
        float Fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + Fahrenheit );



    }
}