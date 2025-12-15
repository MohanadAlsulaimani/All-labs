import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Accepts an array of integer numbers from the user
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter " + size + " integer numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // b) Finds the largest and smallest elements in the array
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Display the results
        System.out.println("The smallest element: " + smallest);
        System.out.println("The largest element: " + largest);

        sc.close();
    }
}