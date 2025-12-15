/*
#Name:Qusay Faisal ALharbi
#ID:44712226
#group:1
*/
import java.util.Scanner;

public class QusayFaisal_lab2e1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your weight in kg: ");
        float weight = input.nextFloat();
        input.nextLine();

        System.out.print("Enter your favorite quote: ");
        String favoriteQuote = input.nextLine();

        System.out.print("Enter your city of residence: ");
        String city = input.nextLine();
        System.out.println("\n===============================");
        System.out.println("\tPERSONAL PROFILE");
        System.out.println("===============================");
        System.out.println("Name:\t" + fullName);
        System.out.println("Age:\t" + age + " years old");
        System.out.println("Weight:\t" + weight + " kg");
        System.out.println("City:\t" + city);
        System.out.println("Favorite Quote:\t\"" + favoriteQuote + "\"");
        System.out.println("===============================");

        input.close();
    }
}

