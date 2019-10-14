package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class MultipleOfThree {
   public static void main(String[] args) {
      // Declare and initialise
      Scanner keyboard = new Scanner(System.in);
      final int TERMINATOR = -999;
      int number, noOfMultiples = 0, count = 0;

      System.out.println("Enter the first number: ");
      number = keyboard.nextInt();

      // While loop
      while (number !=TERMINATOR){
         if (number % 3 ==0){
            System.out.println(number + " is a multiple of 3");
            noOfMultiples++;
         }//if
         else {
            System.out.println(number + " is not a multiple of 3");
         }//else
         count++;
         System.out.println("Enter a number (or -999 to finish): ");
         number = keyboard.nextInt();
      }//while
      System.out.println("\n" + count + " number were entered");
      System.out.println( noOfMultiples + " numbers were multiples of 3");
   }//main
}//class
