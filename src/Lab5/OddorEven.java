package Lab5;

import java.util.Scanner;

/**
 * Created by pg19mec on 07/10/2019
 * Test if a program is odd or even
 */
public class OddorEven {
   public static void main(String[] args) {
      // Initialise a scanner
      Scanner sc = new Scanner(System.in);

      // Declare variables
      int number;

      // Read number
      System.out.print("Please enter a whole number: ");
      number = sc.nextInt();

      // If-else check
      if(number % 2 ==0){
         System.out.println("The number " + number + " is even.");

      }// if (Even numbers)
      else {
         System.out.println("The number " + number + " is odd.");
      }//else (Odd numbers)


   }//main
}//class
