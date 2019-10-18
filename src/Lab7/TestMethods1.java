package Lab7;

import java.util.Scanner;

/**
 * Created by pg19mec on 18/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestMethods1 {
   static Scanner kb = new Scanner(System.in);
   static int number1, number2;
   // Method to prompt the user to enter their first name and
   // return the value entered
   public static String whoAmI(){
      String name;
      System.out.print("Please enter your first name: ");
      name = kb.next();
      return name;
   }//whoAmI

   // Method prompts the user to guess an integer and
   // returns true if the entered number is 100, otherwise returns false
   public static boolean goodGuess(){
      int guess;
      System.out.print("Please guess an whole number: ");
      guess = kb.nextInt();
      if (guess == 100){
         return true;
      }//if
      else {return false;
      }//else
   }//goodGuess

   // Method prompts the user to enter two integers and
   // returns sum of the two numbers
   public static int sumOfNumbers(){
      number1 = readInteger();
      number2 = readInteger();
      return number1 + number2;
   }//sumOfNumbers

   // Method prompts the user to enter two
   // integers and returns the product of two numbers
   public static int productOfNumbers(){
      number1 = readInteger();
      number2 = readInteger();
      return number1 * number2;
   }//productOfNumbers

   // Method prompts the user to enter two integer values and returns the larger
   // of the two numbers
   public static int max(){
      number1 = readInteger();
      number2 = readInteger();

      if (number1> number2){
         return number1;
      }//if
      else{
         return number2;
      }//else
   }//max

   // Prompt the user to enter a number and return the value entered
   public static int readInteger(){
      System.out.print("Please enter a number: ");
      return kb.nextInt();
   }//readInteger

   public static boolean menu(){
      int choice;
      System.out.println("\nOptions:\n" +
            "1. Who Am I?\n" +
            "2. Good Guess\n" +
            "3. Sum of Numbers\n" +
            "4. Product of Numbers\n" +
            "5. Largest Number\n" +
            "6. Exit\n");
      choice = readInteger();

      switch (choice){
         case 1:
            System.out.println(whoAmI());
            return true;
         case 2:
            if (goodGuess() == true){
               System.out.println("You guessed correctly");
            }
            else {
               System.out.println("Try again!");
            }
            return true;
         case 3:
            System.out.println(sumOfNumbers());
            return true;
         case 4:
            System.out.println(productOfNumbers());
            return true;
         case 5:
            System.out.println(max());
            return true;
         case 6:
            return false;
         default:
            System.out.println("Not a valid option");
            return true;
      }//switch
   }//menu

   public static void main(String[] args) {
      boolean continueProgram = true;
      while (continueProgram == true){
         continueProgram = menu();
      }


   }//main
}//class
