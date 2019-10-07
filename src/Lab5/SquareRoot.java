package Lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 07/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SquareRoot {
   public static void main(String[] args) {
      // prepare scanner & decimalformat
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      // Declare variables
      double number, squareRoot;
      int read;

      // Read number
      System.out.print("Please enter a number: ");
      read = sc.nextInt();
      number = (double) read;

      // Check if number is positive
      if(number>= 0){
         // Calculate square root
         squareRoot = Math.sqrt(number);

         System.out.println("The square root of " + read + " = " +
               df.format(squareRoot));


      }//if
      // If number is negative no option to find square root
      else{
         System.out.println("Number has no square root.");
      }



   }//main
}//class
