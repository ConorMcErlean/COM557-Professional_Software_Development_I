package Lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 07/10/2019
 * A program to calculate tax paid & net pay
 */
public class Tax3 {
   public static void main(String[] args) {
      // Set-up scanner & Decimal Format
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      // Declare & initialise
      final int LOWTAXLEVEL = 10000, HIGHTAXLEVEL = 40000;
      final double LOWTAXRATE = .20, HIGHTAXRATE = .4;
      double grossPay, tax = 0, netPay;

      // Prompt for gross pay
      System.out.print("Please enter your Gross pay: £");
      grossPay = keyboard.nextDouble();

      // Calculate tax & net pay
      if (grossPay > HIGHTAXLEVEL) {
         tax = ((grossPay - HIGHTAXLEVEL) * HIGHTAXRATE) +
               ((HIGHTAXLEVEL - LOWTAXLEVEL) * LOWTAXRATE);
      }// If Statement
      else {
         if (grossPay > LOWTAXLEVEL) {
            tax = (grossPay - LOWTAXLEVEL) * LOWTAXRATE;
         }//if
      }//else
      netPay = grossPay - tax;

      // Output gross pay, tax & net pay
      System.out.println("\nGrossPay:\t\t£" + df.format(grossPay));
      System.out.println("Tax:\t\t\t£" + df.format(tax));
      System.out.println("Net Pay:\t\t£" + df.format(netPay));
   }//main
}//class
