package Lab7;

import java.text.DecimalFormat;
import java.util.Scanner;

import static Lab7.TestMethods1.readInteger;

/**
 * Created by pg19mec on 21/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestMethods2 {
   static Scanner sc = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("0.00");

   // Method to accept an integer value as a parameter
   // and return the  result of 3 times the value
   private static int multiplyBy3(int number){
      return number*3;
   }//multiplyBy3

   // Accept an integer and return one greater than the number
   private static int addOne(int number){
      return ++number;
   }//addOne

   // Method to accept two integer values as parameters
   // and returns the product
   private static int product(int number1, int number2){
      return number1*number2;
   }//product

   // Method to accept three double values, representing
   // length in yards, feet, inches and return length in
   // meters to two decimal places
   private static String convertToMeters(double yards, double feet, double inches){
      feet += (3*yards);
      inches += (12*feet);
      return df.format(inches/39.39);
   }//Convert to meters

   // Method to deal with convert to Meters Programme
   private static void metersProgram(){
      double yards, feet, inches;
      System.out.print("Please enter size in yards: ");
      yards = sc.nextDouble();
      System.out.print("Please enter size in feet: ");
      feet = sc.nextDouble();
      System.out.print("Please enter size in inches: ");
      inches = sc.nextDouble();
      System.out.println("Length in meters is : " + convertToMeters(yards, feet, inches) + "m");

   }//meters program

   // Method to accept an integer 0-9 and return a string stating the number
   private static String convertToWords(int number){
      switch (number){
         case 0:
            return "Zero";
         case 1:
            return "One";
         case 2:
            return "Two";
         case 3:
            return "Three";
         case 4:
            return "Four";
         case 5:
            return "Five";
         case 6:
            return "Six";
         case 7:
            return "Seven";
         case 8:
            return "Eight";
         case 9:
            return "Nine";
         default:
            return "Not a suitable option";
      }//Switch
   }//ConvertToWords

   // Menu System
   public static boolean menu(){
      int choice;
      System.out.println("\nOptions:\n" +
            "1. Multiply By Three\n" +
            "2. Add One\n" +
            "3. Find the Product\n" +
            "4. Convert to Meters\n" +
            "5. Convert to words\n" +
            "6. Exit\n");
      choice = sc.nextInt();

      switch (choice){
         case 1:
            System.out.println(multiplyBy3(readInteger()));
            return true;
         case 2:
            System.out.println(addOne(readInteger()));
            return true;
         case 3:
            System.out.println(product(readInteger(),readInteger()));
            return true;
         case 4:
            metersProgram();
            return true;
         case 5:
            System.out.println(convertToWords(readInteger()));
            return true;
         case 6:
            return false;
         default:
            System.out.println("Not a valid option");
            return true;
      }//switch
   }//menu

   public static void main(String[] args) {
      boolean cont;

      do{
         cont=menu();
      }while(cont == true);

   }//main
}//class
