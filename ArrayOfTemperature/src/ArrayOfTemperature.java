import java.util.Scanner;

public class ArrayOfTemperature{
    public static void main(String[]args) {
        Scanner keyboerd = new Scanner(System.in);
        System.out.println("How many temperatures do you have?");
        int size = keyboerd.nextInt();
        double[] temperature = new double[size];
        //Read temperature and compute their average:
        System.out.println("Enter " + temperature.length + "temperature");
        double sum = 0;
        for (int index = 0; index < temperature.length; index++) {
            temperature[index] = keyboerd.nextDouble();
            sum += temperature[index];
        }
        double average = sum / temperature.length;
        System.out.println("The average temperature is " + average);
        //Display each temperature and its relation to the average
        System.out.println("The temperature are");
        for (int index = 0; index < temperature.length; index++) {
            if (temperature[index] < average)
                System.out.println(temperature[index] + " below average");
            else if (temperature[index] > average)
                System.out.println(temperature[index] + " above average");
            else //temperature[index] == average
                System.out.println(temperature[index] + " the average");


        }
    }
}