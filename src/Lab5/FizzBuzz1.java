package Lab5;
/*
Created by: Conor McErlean
Created on: 07/10/2019

Additional Comments...
*/

import java.nio.BufferUnderflowException;
import java.util.Scanner;

public class FizzBuzz1 {
   public static void main(String[] args) {
      // Scanner
      Scanner sc= new Scanner(System.in);

      // Variables
      int number;

      // User prompt
      System.out.print("Please enter a number: ");
      number = sc.nextInt();

      // FIZZ BUZZ!
      if ((number%3 == 0) && (number%7 == 0)) {
         System.out.println("Fizz Buzz");
      }

      else if (number%3 == 0) {
         System.out.println("Fizz");
      }
      else if (number%7 == 0) {
         System.out.println("Buzz");
      }

      else {
         System.out.println(number);
      }



   }//main
}//class
