import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite color?");
        String color = input.nextLine();

        System.out.println("what is your favorite food?");
        String food = input.nextLine();

      System.out.println("What is your favorite hobby?");
        String hobby = input.nextLine();


        System.out.println("Favorites");
        System.out.println(" color\t " + color);
        System.out.println(" food\t  "+ food);
        System.out.println(" hobby\t "+ hobby);

    }
}