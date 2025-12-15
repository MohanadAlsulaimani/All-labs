import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner math = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = math.nextInt();
if (number % 2 == 0){
    System.out.println("The number number is odd.");
}
else{
    System.out.println("The number is even.");

}

    }
}