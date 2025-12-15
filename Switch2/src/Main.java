import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboerd = new Scanner(System.in);

        System.out.println("Welcome!");

        int number;

        // Keep asking until we get a valid number between 1 and 7
        while (true){
            System.out.println("Enter a number from 1 to 7: ");
            if (!keyboerd.hasNextInt()) {
                // handle one integer input

                keyboerd.nextLine(); // consume the invalid token
                continue;
            }

            number = keyboerd.nextInt();
            keyboerd.nextLine(); // consume end of line

            if (number < 1 || number > 7) {
                System.out.println("Number out of range Please try again.");
            } else {
                break; // valid number, exit loop
            }
        }

        // print the corresponding day
        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");


        }
        keyboerd.close();
    }
}