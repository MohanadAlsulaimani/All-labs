/*
Mohanad Alsulaimani

Lab*
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println(" Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name " + name);


        System.out.println(" Enter your ID: ");
        String ID = sc.next();
        if(ID.length() > 0 && ID.startsWith("1")){

            System.out.println(" Your ID is " + ID);

        }
        else  {
            System.out.println(" ID number is wrong");
        }


        System.out.println(" Enter the midterm mark out of 25: ");
        double midterm = sc.nextDouble();

        System.out.println("Enter the Quiz mark out of 15:");
        double Quiz = sc.nextDouble();

        System.out.println("Enter the homewotk mark out of 10; ");
        double homework = sc.nextDouble();

        System.out.println(" Enter the Final mark out of 50: ");
        double Final = sc.nextDouble();


        System.out.println("midterm " + midterm);
        System.out.println("Quiz " + Quiz);
        System.out.println("homework "+ homework);
        System.out.println("Final " + Final);


        double Tottal = midterm + Quiz + homework + Final ;




        if (Tottal < 60) {
            System.out.println("Falled " + Tottal);
        }
        else if ( Tottal >= 60 & Tottal <= 69) {
            System.out.println(" D " + Tottal);
        } else if( Tottal >= 70 && Tottal <= 79 ) {
            System.out.println(" C " + Tottal);
        } else if ( Tottal >= 80 && Tottal <= 89){
            System.out.println(" B " + Tottal);
        } else if ( Tottal >= 90 && Tottal <= 100){
            System.out.println(" A " + Tottal);
        }




    }
}
