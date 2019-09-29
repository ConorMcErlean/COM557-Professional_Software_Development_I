package Lab2;

import java.text.DecimalFormat;


/*
 Create by Conor McErlean on 29/09/19
 A program to calculate the density of an object given its mass and volume
 */
public class Density {
   public static void main (String [] args){
      // Create number formatting object
      DecimalFormat df1 = new DecimalFormat("0.0");
      DecimalFormat df2 = new DecimalFormat("0.00");

      // Initialising and declaring variables
      double mass = 40.00, volume = 8.0, density;

      // Calculations
      density = mass/volume;

      // Print statements
      System.out.println("Mass = "+ df1.format(mass) + " kg");
      System.out.println("Volume = " + df1.format(volume) + "metres cubed");
      System.out.println("Density = " + df2.format(density) + "kg per metre cubed");


   } //main
} //class
