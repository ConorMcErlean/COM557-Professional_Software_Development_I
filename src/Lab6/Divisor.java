package Lab6;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 11/10/2019
 * prompts for astartnumber, afinishnumber (assume start < finish) and a divisor,
 * then prints out all the numbers
 * between start and finish(inclusive) which are evenly divisible by the divisor
 */
public class Divisor {
   public static void main(String[] args) {
      //Declare
      int start, finish, number, divisor, numberOfDiv=0, total=0;
      double average;
      //Scanner & DecimalFormat
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.0");

      // User Prompt
      System.out.print("What number would you like to start with? :");
      start = sc.nextInt();

      System.out.print("What number would you like to end with? :");
      finish = sc.nextInt();

      System.out.print("What would you like to use as your divisor? :");
      divisor = sc.nextInt();

      //loop

      for (; start <= finish; start++){
         if ((start % divisor)==0){
            System.out.println(start);
            numberOfDiv++;
            total +=start;
         }//if
      }//for

      // Find average
      average = (double) total/ numberOfDiv;

      System.out.println("Total number of multiples of " + divisor + " is " + numberOfDiv);
      System.out.println("The average of these " + numberOfDiv + " numbers is " +
            df.format(average));
   }//main
}//class
