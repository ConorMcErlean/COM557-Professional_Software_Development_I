package Lab3;
/*
    Program created by Confu on 04/10/2019

    Reads in 3 integers representing the blast-off time of a rocket
    expressed in hours, minutes and seconds on the 24-hour clock.
    Then read another integer giving the rocket's flight time in
    seconds. Use the data to calculate the time of day at which the
    rocket will return to earth and print out.
*/

import java.util.Scanner;

public class Rocket1 {
   public static void main(String[] args) {
      // Initialise Scanner
      Scanner sc = new Scanner(System.in);

      // Declare variables
      int takeOffHours, takeOffMinutes, takeOffSeconds, flightTime, arrivalMinutes,
            arrivalSeconds, arrivalHours;

      // Input Prompt
      System.out.print("What hour (24 hour format) is the flight scheduled to depart:\t");
      takeOffHours = sc.nextInt();
      System.out.print("How many minutes past the hour is the flight scheduled to depart:\t");
      takeOffMinutes = sc.nextInt();
      System.out.print("How many seconds past the minute if the flight scheduled for:\t");
      takeOffSeconds = sc.nextInt();
      System.out.print("How long in seconds will the flight last:\t");
      flightTime = sc.nextInt();
      // Calculate
      arrivalHours = ((flightTime / 60) / 60) + takeOffHours;
      arrivalMinutes = ((flightTime / 60) % 60) + takeOffMinutes;
      arrivalSeconds = (flightTime % 60) + takeOffSeconds;

      // Print out
      System.out.println(" Take-off time: \t\t" + takeOffHours +":" +
            takeOffMinutes + ":" + takeOffSeconds);
      System.out.println("Flight time: \t\t\t" + flightTime + "seconds");
      System.out.println("Expected arrival time: \t" + arrivalHours + ":" +
            arrivalMinutes + ":" + arrivalSeconds);



   }//main
}//class
