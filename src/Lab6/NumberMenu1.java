package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class NumberMenu1 {
   public static void main(String[] args) {
      // Declare & initialise
      Scanner sc = new Scanner(System.in);
      int choice;
      double number, answer;
      boolean exit = false;
      final int TERMINATE = -9999;

      // User Prompt
      System.out.print("Enter a number");
      number = sc.nextDouble();

      //Do while
      do {
         do {
            // Print out menu
            System.out.println(
                  "1.\tTest if Zero\n" +
                        "2.\tFind square root\n" +
                        "3.\tTest if Odd or Even\n" +
                        "4.\tEnter Another number or Exit\n"
            );
            System.out.println("Enter an option");
            choice = sc.nextInt();
            // Switch block
            switch (choice) {
               case 1:
                  if (number == 0){
                     System.out.println("The number was zero.");
                  }
                  else {
                     System.out.println("The number was not zero.");
                  }
                  break;
               case 2:
                  answer = Math.sqrt(number);
                  System.out.println("Square root is " + answer);
                  break;
               case 3:
                  if (number % 2 != 0){
                     System.out.println("Number is odd");
                  }
                  else {
                     System.out.println("Number is even");
                  }
                  break;

                  default:
                     System.out.println("Not a valid option");
            }//switch

         } while (choice != 4);
         System.out.print(" Enter another number (or type -9999 to exit) : ");
         number = sc.nextDouble();
      }while ((int) number != TERMINATE);


   }//main
}//class
