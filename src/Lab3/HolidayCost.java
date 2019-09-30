package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 30/09/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class HolidayCost {
   public static void main(String[] args) {
   // Initialise Scanner & Decimal format
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

    // Declare & Initialise the constant
    final double VATRATE = 0.20;

    // Declare the other variables
      int passengers;
      double flightCost, transferCost, totalTransferCost, totalFlightCost, totalOverallCost;

     // First input prompt and data-read for number of passengers
      System.out.print("Good afternoon! \nHow many passengers will be travelling? \t Number of passengers:");
      passengers = sc.nextInt();
      System.out.print("\n Thank you! \n");

      // Second and third input prompt for flight cost and transfer cost
      System.out.print("What price is the flight? \t Flight price: £");
      flightCost = sc.nextDouble();
      System.out.print("What price is the transfer? \t Transfer price: £");
      transferCost = sc.nextDouble();

      System.out.println("Thank you, calculating totals now!");

      // Calculations
      totalFlightCost = flightCost * passengers * (1+VATRATE);
      totalTransferCost = transferCost * passengers * (1+VATRATE);
      totalOverallCost = totalFlightCost + totalTransferCost;

      // Print
      System.out.println("Total cost of flights is: £" + df.format(totalFlightCost));
      System.out.println("Total cost of transfers is: £" + df.format(totalTransferCost) + "\n\n");
      System.out.println("Total cost: £" + df.format(totalOverallCost));



   }//main
}//class
