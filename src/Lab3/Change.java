package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 30/09/2019
 * Read the cost of an item sold and the amount of money tendered by the customer
 *
 */
public class Change {
   public static void main(String[] args) {
      // Create objects of DecimalFormat & Scanner
      Scanner tillInput = new Scanner(System.in);
      DecimalFormat cashFormat = new DecimalFormat("0.00");

      // Declare variables
      double cost, tender, changeDue;

      // Input prompt
      System.out.print("What price is the item?:\t £");
      cost = tillInput.nextDouble();

      // Input prompt 2
      System.out.print("How much cash are you paying?:\t £");
      tender = tillInput.nextDouble();

      // Calculate
      changeDue = tender - cost;


      // Output
      System.out.println("Amount Due:\t\t£" +cashFormat.format(cost));
      System.out.println("Amount Tendered\t£"+cashFormat.format(tender));
      System.out.println("Change Due\t\t£" +cashFormat.format(changeDue));

   }//main
}//class
