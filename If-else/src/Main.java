import java.util.Scanner;

public class Main {
    public static final double OVERDRAWN_PENALTY = 8.00;
    public static final double INTEREST_RATE = 0.02; //2% annully
    public static void main(String[] args)
    {
        double balance;
        System.out.println("Enter your checking account balance: $");
        Scanner keyboard = new Scanner(System.in);
        balance = keyboard.nextDouble();
        System.out.println("Origianl balance $" + balance);
        if (balance >= 0)
            balance = balance + (INTEREST_RATE * OVERDRAWN_PENALTY)
        / 12;
        else
            balance = balance - OVERDRAWN_PENALTY;
        System.out.println("After adjusting for one month ");
        System.out.println("of interst and penalties, ");
        System.out.println("your new balance is $" + balance);



    }
}