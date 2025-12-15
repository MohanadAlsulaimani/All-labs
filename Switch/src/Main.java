import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println(" F you");

        boolean isActive = false;
        do {
    System.out.println(" Enter a number From ( 1 ) to ( 7 )");
    int number = input.nextInt();
    input.nextLine();
    
    if (number <= 1 && number >=7){
        isActive = true;
    }
} while (isActive);

        int number = input.nextInt();
        input.nextLine();

        switch(number) {
            case 1:
                System.out.println("Sunday");

            case 2:
                System.out.println("Monday");

            case 3:
                System.out.println("Tuesday");

            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");

                input.close();


        }
    }
}