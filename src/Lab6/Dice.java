package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 14/10/2019
 * Roll two dice and print their value
 */
public class Dice {
   public static void main(String[] args) {

      // Scanner
      Scanner keyboard = new Scanner(System.in);

      // Declare variables
      int die1, die2;
      char response;

      do{
         die1 = (int) ((Math.random() * 6) + 1);
         die2 = (int) ((Math.random() * 6) + 1);
         System.out.println("The dice numbers are " + die1 + " and " +die2);
         System.out.print("Do you want to continue (Y/N)? ");
         response = keyboard.nextLine().toUpperCase().charAt(0);
      }while (response == 'Y');

   }//main
}//class
