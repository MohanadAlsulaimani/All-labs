import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello world");
        System.out.println("Enter your name please");


        String name = sc.nextLine();
        if(name.length()<=5) {
            System.out.println("The name is too short");

        }else if (name.length() >= 20){
            System.out.println("The name is too long");

        } else {
    System.out.println("Hello " + name);
        }
        System.out.println("Enter your age ");
        String age = sc.nextLine();
System.out.print("Your age is " + age );


    }
}