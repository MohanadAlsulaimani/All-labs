import java.util.Scanner;

public class Main {

    public static void main (String [] args ){

        Scanner inport = new Scanner(System.in);

        int count , number;
        System.out.println("Enter a number");
        number = inport.nextInt();

        count = 1;
        while (count <= number ){
            System.out.println(count + ", ");
            count++;
        }
        System.out.println();
        System.out.println("Buckle my shoe.");
    }
}