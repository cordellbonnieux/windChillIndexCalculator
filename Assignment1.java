/**
 * CPSC 1150 - Assignment 1
 * Assignment1.java: A wind chill index calculator
 * Date: May 17, 2021
 * Author: Cordell Bonnieux 
 */
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {

        // Create a Scanner object named input.
        Scanner input = new Scanner(System.in);

        // prompts user to enter a temperature.
        System.out.println("Please enter an ambient air temperature between -50 and 5 degrees Celsius.");
        // The user enters a value, if that value passes tests in the tempChecker() method it is stored in temperature.
        int temperature = tempChecker(input.nextInt(), input);

        // prompts the user to enter a wind speed.
        System.out.println("Please enter a wind speed between 0 and 100km/h.");
        // The user enters a value, if that value passes tests in the windChecker() method it is stored in windSpeed.
        int windSpeed = windChecker(input.nextInt(), input);

        // calculates the wind chill index based on the inputed windSpeed and temperature variables, then stores it in windChillCalculation.
        double windChillCalculation = 13.112 + 0.6215 * temperature - 11.37 * Math.pow(windSpeed,0.16) + 0.3965 * temperature * Math.pow(windSpeed,0.16);

        // takes the calculated wind chill index from windChillCalculation and casts it into a integer variable named windChillIndex.
        int windChillIndex = (int)windChillCalculation;

        // windChillIndex is printed to the console.
        System.out.println("The wind chill index is " + windChillIndex);
    }   

    public static int tempChecker(int temp, Scanner input) {

        // checks if user input is NOT valid
        if (temp != (int)temp || temp > 5 || temp < -50) {

            // prompt the user to enter a new value.                   
            System.out.println("The temperature you enter must be between -50 and 5 degrees Celcius and in integer format.");

            // user enters a new value and tempChecker() restarts.
            return tempChecker(input.nextInt(), input);

        } else { 

            // the value entered by the user is returned (stored in 'temperature' in the main method).
            return temp;

        }
    }

    public static int windChecker(int speed, Scanner input) {

        // checks if user input is NOT valid.
        if (speed != (int)speed || speed > 100 || speed < 0) {

            // prompt the user to enter a new value.                   
            System.out.println("The wind speed you enter must be between 0 and 100km/h and in integer format.");

            //users enters a new value and windChecker() restarts.
            return windChecker(input.nextInt(), input);

        } else { 

            // the value entered by the user is returned (stored in 'windSpeed' in the main method).
            return speed;

        }
    }
}