package educative;

import java.util.Scanner;

//Write a program that takes a positive number (num) and finds the power of 2 nearest to that number.
// The program stores the resulting value to pwr.
//If there are two candidate values, display the smaller one. For example, 2 and 4 are both the powers
// of 2 nearest to 3. The function should display 2 because it’s smaller than 4.

public class NearestPowerOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a Number: ");
        int num = scanner.nextInt();
        int pwr = 0; // The variable to store the result calculated with the help of number.
        // You are required to calculate the value of pow as
        // The power of 2 nearest to the number.
        int i = 0;
        pwr = (int) Math.pow(2, i); // Calculating power before while loop
        int lastpower = 0;
        int diff1, diff2 ;

        while (pwr < num) // Checking the power should be less than the number
        {
            lastpower = pwr; // Assigning last power
            i++;
            pwr = (int) Math.pow(2, i); // Calculating next power
        }
        // Checking difference between the number and the both powers
        diff1 = num - lastpower;
        diff2 = pwr - num;
        // If the difference between power and number is greater than or equal to
        // the difference between last power and the number then store lastpower in pwr.
        if (diff2 >= diff1) {
            pwr = lastpower;
        }

        System.out.println("The "+ pwr + " is the power of 2 nearest to " + num + "." );
    }
}
