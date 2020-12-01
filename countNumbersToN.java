
/**
 * The user inputs a number and counts every number up to that number.
 * Example for 5:  1 + 2 + 3 + 4 + 5 = 15
 *
 * @author (Ms. Schulze)
 * @version (1.0)
 */

import java.util.Scanner;

public class countNumbersToN
{
    public static void main(String[] args)
    {
        // Clear the BlueJ terminal
        System.out.println('\u000C');
        
        // Instantiate variables
        Scanner inputScanner = new Scanner(System.in);
        int n;
        int total = 0;
        
        // Welcome user and prompt user for input
        System.out.println("This program prints out all the numbers up to the nth term.");
        System.out.print("Input the value for n:  ");
        n = inputScanner.nextInt();
        
        // Calculate the sum of the numbers up to n.
        for (int i = 1; i <= n; i++)
        {
            total = total + i;
        }
        
        System.out.println("The sum of the numbers from 0 to " + n + " is " + total + ".");
    }
}
