import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
            if (age <13){
                System.out.println("You are a child");
            } else if (age >=13 && age <= 19){
                System.out.println("you are a teenager");
            } else if (age >19 ){
                System.out.println("You are an adult");
            }



        }
    }
