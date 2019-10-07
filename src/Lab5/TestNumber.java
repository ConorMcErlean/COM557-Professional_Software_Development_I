package Lab5;

import java.util.Scanner;

/**
 * Created by pg19mec on 07/10/2019
 * If-else program to test in a number is greater than 20
 */
public class TestNumber {
   public static void main(String[] args) {

      //Scanner
      Scanner sc = new Scanner(System.in);

      //Variables
      int number;
      final int TESTNUMBER = 0;

      // user prompt and read
      System.out.print("Please enter a whole number: ");
      number = sc.nextInt();

      //If else block

      if(number>TESTNUMBER){
         System.out.println("The number " + number + " is greater than " + TESTNUMBER);
      }//if
      else if (number < TESTNUMBER){
         System.out.println("The number " + number + " is not greater than " + TESTNUMBER);
      }
      else{
         System.out.println("The number " + number + " is equal to " + TESTNUMBER);
      }

   }//main
}//class
