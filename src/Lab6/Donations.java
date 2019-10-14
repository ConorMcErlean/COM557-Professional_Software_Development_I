package Lab6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Donations {
   public static void main(String[] args) {
      // Initialise & Declare
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");
      String donorName, topDonor = "", textLine = " donor was ";
      int donationsCount = 0;
      double donation, topDonation = 0, totalDonations = 0;
      final double TARGET = 500;

      System.out.println("Beginning our campaign! This years donation target is £"
      +df.format(TARGET));
      //do...while loop
      do{
         // User Prompt
         System.out.print("Hello, Donor!\nWhat is your name? : ");
         donorName = sc.next();

         System.out.print("Please enter your donation: £");
         donation = sc.nextDouble();

         // Add to our campaign!
         totalDonations += donation;
         donationsCount++;

         // Are they the top donor?
         if (donation > topDonation){
            topDonation = donation;
            topDonor = donorName;
         }
         else if (donation == topDonation){
            topDonor = topDonor + " and " + donorName;
            textLine = " donors were ";
         }


      }while (totalDonations < TARGET);

      // Target hit!
      System.out.println("Thank you! We have hit our target of £" + df.format(TARGET) +
            " with " + donationsCount + " donations. \nOur top" + textLine +
            topDonor + " with a donation of £" + df.format(topDonation) );


   }//main
}//class
