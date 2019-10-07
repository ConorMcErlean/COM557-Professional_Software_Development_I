package Lab5;/*
Created by: Conor McErlean
Created on: 07/10/2019

Additional Comments...
*/

import java.util.Scanner;

public class DaysInMonth1 {
   public static void main(String[] args) {
      //Scanner
      Scanner sc = new Scanner(System.in);

      // Variables
      int year, daysInMonth, month;


      //Read Year and month
      System.out.print("Enter a year: ");
      year = sc.nextInt();
      System.out.print("Enter a month as a number (eg Jan = 1) :");
      month = sc.nextInt();

      // Switch 30 days / february/ all the rest are 31
      switch (month){
         case 9: case 4: case 7: case 10:
            daysInMonth = 30;
            break;
         case 2:
            if (year % 4 == 0){
               daysInMonth = 29;
            }
            else {daysInMonth = 28;
            }
            break;
         default:
            daysInMonth = 31;
            break;
      }
      System.out.println("That month would have " + daysInMonth + " days");


   }//main
}//class
