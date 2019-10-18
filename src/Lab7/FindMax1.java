package Lab7;

import java.util.Scanner;

/**
 * Created by pg19mec on 18/10/2019
 * Program to read in 2 numbers and output the largerone
 */
public class FindMax1 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number1, number2;

      System.out.print("Please enter a number: ");
      number1 = keyboard.nextInt();
      System.out.print("Please enter a number: ");
      number2 = keyboard.nextInt();

      if (number1> number2){
         System.out.println(number1 + " is the larger number");
      }//if
      else{
         System.out.println(number2 + " is the larger number");
      }//else
   }//main
}//class
