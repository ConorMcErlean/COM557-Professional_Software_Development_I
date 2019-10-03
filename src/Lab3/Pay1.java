package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
    Created by Conor McE. on 03/10/19
    A program to calculate a persons pay
 */
public class Pay1 {
    public static void main (String [] args){
        // Initialise Scanner & number format
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Declare the variables we need
        String firstName, surname, middleInitialString;
        char middleInitial;
        final double RATE_OF_PAY = 5.95;
        double hoursWorked, payTotal;

        //Input Prompt, name
        System.out.print("Please enter your first name: ");
        firstName = sc.nextLine();
        System.out.print("Please enter your surname: ");
        surname = sc.nextLine();
        System.out.print("Please enter your middle intial: ");
        middleInitialString = sc.nextLine();
        middleInitial = middleInitialString.charAt(0);

        // Input Prompt, Hours worked
        System.out.println("How many hours have you worked this week?");
        hoursWorked = sc.nextDouble();

        // Calculate pay
        payTotal = hoursWorked * RATE_OF_PAY;

        // Output
        System.out.println("So for " + firstName + " " + middleInitial + " " + surname + " working "
        + hoursWorked + " hours, you will be paid £" + df.format(payTotal) +
                " this week.");

    }//main
}//class
