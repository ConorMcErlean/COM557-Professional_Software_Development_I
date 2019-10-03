package Lab3;
/*
    Program created by Confu on 03/10/2019
    Program to convert miles to km
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertMiles {
   public static void main(String[] args) {
   // Start the scanner and Decimal formatter
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      // Declare variables
      double miles, km;
      final double CONVERSION = 1.609;

      // User prompt
      System.out.print("Enter number of miles: \t");
      miles = sc.nextDouble();

      // Maths
      km = miles * CONVERSION;

      // Print
      System.out.println( df.format(miles) + " miles equals " + df.format(km) + "km.");

   }//main
}//class
