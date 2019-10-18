package Lab7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 18/10/2019
 * Program to read in two times (24 Hour Clock) then calculate and
 * output the difference in time in hours, minutes and seconds
 */
public class TimeDifference1 {

   // Objects for class
   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("00");

   // Declarations for class
   static int startHour, startMinute, startSecond,
         finishHour, finishMinute, finishSecond,
         hour, minute, second;

   // Method to read in the data
   public static void readData(){
      //Read in start time
      System.out.println("What is the start time (24-hour clock): ");
      System.out.print("Hour: ");
      startHour = keyboard.nextInt();
      System.out.print("Minutes: ");
      startMinute = keyboard.nextInt();
      System.out.print("Seconds: ");
      startSecond = keyboard.nextInt();

      //Read in the finish time
      System.out.println("What is the finish time (24-hour clock): ");
      System.out.print("Hour: ");
      finishHour = keyboard.nextInt();
      System.out.print("Minutes: ");
      finishMinute = keyboard.nextInt();
      System.out.print("Seconds: ");
      finishSecond = keyboard.nextInt();
   }//readData

   // Method to calculate the time difference
   public static void calculateDifference(){
      final int SECMINHOUR = 60;
      final int HOURSINDAY = 24;

      second = finishSecond - startSecond;
      minute = finishMinute - startMinute;
      hour = finishHour - startHour;

      if (second < 0){
         second = second + SECMINHOUR;
         minute = minute - 1;
      }//if

      if (minute<0){
         minute = minute + SECMINHOUR;
         hour = hour - 1;
      }//if

      if (hour < 0){
         hour = hour + HOURSINDAY;
      }//if
   }//CalculateDifference

   // Method to output the results
   public static void outputResults(){
      System.out.println("\nStart Time: \t\t\t" + df.format(startHour) + ":" +
            df.format(startMinute) + ":" + df.format(startSecond));
      System.out.println("\nFinish Time: \t\t\t" + df.format(finishHour) + ":" +
            df.format(finishMinute) + ":" + df.format(finishSecond));
      System.out.println("\nTime Difference: \t\t\t" + df.format(hour) + ":" +
            df.format(minute) + ":" + df.format(second));
   }//outputResults

   public static void main(String[] args) {
      readData();
      calculateDifference();
      outputResults();

   }//main
}//class
