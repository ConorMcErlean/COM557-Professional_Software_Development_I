package LabTest1;

// Import Statements
import java.text.DecimalFormat;
import java.util.Scanner;

/*

  Created by Conor McErlean on 04/10/2019
  Created under test conditions

  An application to calculate the total group cost of tickets & parking
  for a school group going to an activity centre, using information provided
  by the user (read from keyboard) alongside constant prices.

  The program will print this information (to the terminal) once total cost
  has been calculated.

  For more information of the program design please see the Program Preparation
  Sheet uploaded alongside this program.

 */

public class ActivityCentre {
   public static void main(String[] args) {

      // Create require objects, scanner & decimalformat
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      // Declare variables required
      String firstName, surname;
      double parkingPrice, totalTicketCost, overallCost, indivCost;
      int numberOfChildren, parkLength;

      //Declare & initalise constants
      final String VENUENAME = "OutdoorFun";
      final double TICKETCOST = 5.50, PARKINGRATE = 15.00;

      // Input Prompts
         // User prompts for teachers name
      System.out.print("What is your First-name:\t");
      firstName = sc.nextLine();
      System.out.print("What is your Surname:\t");
      surname = sc.nextLine();

         // User prompts for parking
      System.out.print("How long will you need to park for in hours?:\t");
      parkLength = sc.nextInt();

         //User prompts for number of children
      System.out.print("How many children will be coming?: \t");
      numberOfChildren = sc.nextInt();

      // Calculations
         // Total parking cost
      parkingPrice = parkLength * PARKINGRATE;

         // Total cost of junior tickets
      totalTicketCost = numberOfChildren * TICKETCOST;

         // Total cost for whole party
      overallCost = totalTicketCost + parkingPrice;

         // Individual cost per child
      indivCost = overallCost/numberOfChildren;

      // Printing to console,
         // Receipt header
      System.out.println(VENUENAME + "\n\n");
      System.out.print("Bill for: " + firstName + " " + surname + "\n");

         // Total parking and ticket lines
      System.out.println("\tTotal parking hours: \t\t\t\t" + parkLength +
            "\t\tCost:\t£" + df.format(parkingPrice));
      System.out.println("\tTotal number of junior tickets:\t\t" + numberOfChildren +
            "\t\tCost:\t£" + df.format(totalTicketCost));

         // Summary Lines
      System.out.println("\tTotal cost for parking and tickets: \t\t\t\t£" +
            df.format(overallCost));
      System.out.println("\t\t\tCost per child: \t\t\t\t\t\t\t£" + df.format(indivCost));

   }//main
}//class
