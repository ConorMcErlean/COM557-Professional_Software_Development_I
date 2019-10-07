package Lab5;/*
Created by: Conor McErlean
Created on: 07/10/2019

Additional Comments...
*/

import java.util.GregorianCalendar;
import java.util.Scanner;

public class DaysInMonth2 {
   public static void main(String[] args) {
      //Scanner & calendar
      Scanner sc = new Scanner(System.in);
      GregorianCalendar cal = new GregorianCalendar();

      // Variables
      int year, daysInMonth, month;
      boolean leapYear;

      //Read Year and month
      System.out.print("Enter a year: ");
      year = sc.nextInt();
      System.out.print("Enter a month as a number (eg Jan = 1) :");
      month = sc.nextInt();

      switch (month){
         case 9: case 4: case 7: case 10:
            daysInMonth = 30;
            break;
         case 2:
            if (cal.isLeapYear(year)){
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
