package Lab7;

import java.util.Scanner;

/**
 * Created by pg19mec on 18/10/2019
 * Program to read in 2 numbers and output the larger one
 */
public class FindMax2 {
   static Scanner keyboard = new Scanner(System.in);

   // Method to read in and return a number
   public static int getNumber(){
      System.out.print("Please enter a number: ");
      return keyboard.nextInt();
   }//getNumber

   public static void main(String[] args) {
      int number1, number2;

      number1 = getNumber();
      number2 = getNumber();

      if (number1> number2){
         System.out.println(number1 + " is the larger number");
      }//if
      else{
         System.out.println(number2 + " is the larger number");
      }//else
   }//main
}//class
