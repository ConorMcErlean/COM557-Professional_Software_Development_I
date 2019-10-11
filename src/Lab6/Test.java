package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 11/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Test {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number;

      System.out.print("Enter a positive number: ");
      number = keyboard.nextInt();
      System.out.println("\nThe factors of " + number + " are:");
      for (int count =1; count <= number; count ++){
         if ((number % count) == 0 ){
            System.out.println("\t" + count);
         }//if
      }//for
   }//main
}//class
