import java.util.Scanner;
public class Playing
{
    public static void main(String[] args)
    {
        System.out.println("Hello out there");
        System.out.println("I will add two numbers for you");
        System.out.println("Enter two hole numbers on a line");
        float n1,n2;
        Scanner Keybored = new Scanner(System.in);
        n1= Keybored.nextFloat();
        n2= Keybored.nextFloat();
        System.out.println("The sum of these two numbers is ");
        System.out.println(n1+n2);
        //* I'm just playing around and I want to make it unlimited, but I do not kwon how to*//
        System.out.println("enter any number you want to * with any number/s");
        double n3,n4;
        double unlimited;
        n3= Keybored.nextDouble();
        n4= Keybored.nextDouble();
        unlimited=Keybored.nextDouble();
        System.out.println(n3*n4*unlimited);



    }


}