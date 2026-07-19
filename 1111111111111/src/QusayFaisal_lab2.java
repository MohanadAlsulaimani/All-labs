package lap1p;
import java.util.Scanner;

/**
 * Name:
 * ID:
 *
 * @author 
 */
public class QusayFaisal_lab2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter your ID number: ");
        String id = input.nextLine();

        System.out.print("Enter the midterm mark: ");
        int midterm = input.nextInt();

        System.out.print("Enter the final mark: ");
        int finalMark = input.nextInt();

        int total = midterm + finalMark;


        System.out.println("\n[ The Student information ]");
        System.out.println("stdent Name: " + name);
        System.out.println("Student ID number: " + id);
        System.out.println("Course Total Grade: " + total);
    }

}
