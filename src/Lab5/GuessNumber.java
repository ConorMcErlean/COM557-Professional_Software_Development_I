package Lab5;

import java.util.Scanner;

/**
 * Created by pg19mec on 07/10/2019
 * An overly simple guessing game with only one chance!
 */
public class GuessNumber {
   public static void main(String[] args) {
      // Set-up scanner
      Scanner sc = new Scanner(System.in);

      // Declare & Inititalise
      int guess;
      final int NUMBER = 37;

      //User prompt
      System.out.print("Take a guess!\n Please enter a whole number: ");
      guess = sc.nextInt();

      // Did they get it?
      if (guess == NUMBER){
         System.out.println("Nice One!\tYou got it.");
      }//if
      else{
         System.out.println("Nope, nice try though!");
      }




   }//main
}//class
