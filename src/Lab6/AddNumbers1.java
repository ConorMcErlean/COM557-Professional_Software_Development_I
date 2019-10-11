package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 11/10/2019
 * Read 3 numbers and print their total.
 */
public class AddNumbers1 {
   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

      //int HOWMANY = 3;
      int number, howMany, total = 0;

      System.out.print("How many numbers are being added? : ");
      howMany = keyboard.nextInt();

      for (int count = 0; count < howMany; count++){
         System.out.print("Enter a number: ");
         number = keyboard.nextInt();
         total += number;
      }// for

      System.out.println("\nThe total of the numbers is " + total);
   }//main
}//class
