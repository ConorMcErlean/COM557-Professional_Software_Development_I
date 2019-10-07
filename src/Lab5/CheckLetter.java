package Lab5;/*
Created by: Conor McErlean
Created on: 07/10/2019

Additional Comments...
*/

import java.util.Scanner;

public class CheckLetter {
   public static void main(String[] args) {
      // Scanner
      Scanner sc = new Scanner(System.in);

      //Variables
      char letter;
      String input;

      //User Prompt
      System.out.print("Please enter a letter: ");
      input = sc.nextLine();
      letter = input.charAt(0);

      // Checks
      if ((letter >= 'a') && (letter <= 'z')){
         System.out.println("The character entered is \'" + letter + "\' which is lowercase");
      }//if
      else {
         System.out.println("The character entered is \'" + letter + "\', which is not lowercase");
      }

   }//main
}//class
