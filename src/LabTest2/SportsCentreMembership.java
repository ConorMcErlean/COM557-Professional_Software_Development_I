package LabTest2;

import java.util.Scanner;

/**
 * Created by pg19mec/ Conor McErlean on 25/10/2019
 * Program that will take in Information for a single client and out put a message (including their discount rate)
 * Using multiple methods to separate the functions
 * Further information is available on program preparation sheet.
 * Created under test conditions.
 */
public class SportsCentreMembership {
   // Class Variables and Imports
   static Scanner keyboard = new Scanner(System.in);
   static int numberOfSwims, numberOfGym, overallActivity;
   static String clientID;

   // Method to prompt for and return clientsID (made of initials & PIN)
   public static String enterID(){
      String initials;
      int userPIN;
      System.out.print("Please enter your initials: ");
      initials = keyboard.next();
      System.out.print("Please enter your PIN: ");
      userPIN = keyboard.nextInt();
      return initials+userPIN;
   }//enterID

   // Method to accept a string and prompt the user to enter a value representing number of Swim or
   // Gym Sessions and return the number value
   public static int enterActivityNo(String activity){
      int activityNo;
      System.out.println("Please enter the number of " + activity + " sessions: ");
      activityNo = keyboard.nextInt();
      return activityNo;

      // Original Way I was going to make this work, then realised there was a simpler method:

//      if (activity.equalsIgnoreCase("Swim")){
//         numberOfSwims += activityNo;
//         return activityNo;
//      }//if
//      else{
//         numberOfGym += activityNo;
//         return activityNo;
//      }


   }//enterActivityNo

   // Method to accept swim and gym sessions and return overall activity count
   public static int calculate(int numberOfGym, int numberOfSwims){
      return numberOfGym + numberOfSwims;
   }//calculate

   // Method to accept 3 values and return outcome message
   public static String outcomeMessage(int numberOfSwims, int numberOfGym, int overallActivity){
      // Assuming MORE THAN 10 is required and MORE THAN 50 is required,
      // to include 10 & 50 simply convert the '>' in the two below if blocks to '>='
      if (((numberOfGym > 10) && (numberOfSwims > 10)) && overallActivity > 50){
         return "- Congratulations, you get a 30% discount!";
      }//if

      else if ((numberOfGym > 10) && (numberOfSwims > 10)){
         return "- You get 10% discount.";
      }// else if

      else{
         return "- Sorry, unsuccessful, keep trying.";
      }
   }//outcomeMessage

   // Method to accept clientID and 3 values and output in a formatted structure.
   // Underneath should be discount message
   public static void outputResults(String clientID, int numberOfGym, int numberOfSwims, int overallActivity){
      System.out.println("ID No\t\tSwims\t\tGym\t\tOverall Activities");
      System.out.println(clientID + "\t\t" + numberOfSwims + "\t\t\t" + numberOfGym + "\t\t" +
            overallActivity);
      // Below we will call the outcomeMessage Method as part of this method,
      // it could be done separately but this is cleaner and simpler.
      System.out.println("Message for: " + clientID + " " + outcomeMessage(numberOfSwims,numberOfGym,overallActivity));

   }//outputResults


   public static void main(String[] args) {

      // Using the user-defined methods
      clientID = enterID();
      numberOfGym = enterActivityNo("gym");
      numberOfSwims = enterActivityNo("swim");
      overallActivity = calculate(numberOfGym, numberOfSwims);
      // Because outcome message is called as part of the outputResults method, we do not need to call it here
      outputResults(clientID, numberOfGym,numberOfSwims,overallActivity);

   }//main
}//class
