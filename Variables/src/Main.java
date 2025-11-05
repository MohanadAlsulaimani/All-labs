import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite color?");
        System.out.println("what is your favorite food?");
      System.out.println("What is your favorite hobby");
        String color = input.nextLine();
        String food = input.nextLine();
        String hobby = input.nextLine();
        System.out.println("Favorites");
        System.out.println(" color  " + color);
        System.out.println(" food  "+ food);
        System.out.println(" hobby "+ hobby);

    }
}