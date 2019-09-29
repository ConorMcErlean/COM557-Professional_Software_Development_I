package Lab2;

import java.text.DecimalFormat;

/**
 * Created by pg19mec on 27/09/2019
 * Java app that prints the diameter, circumferance and area.
 */
public class Circle1 {
   public static void main(String[] args) {
      // Create decimal format object
      DecimalFormat df = new DecimalFormat("00.00");

      // Declare and initialise the radius
      double radius = 8.25;

      // Declare the other variables
      double circumference, area, diameter;

      // Calculate
      diameter = radius*2;
      circumference = Math.PI * radius * 2;
      area = Math.PI * Math.pow(radius, 2);

      // Print out

      System.out.println("For a circle with the radius of " + radius +"cm, "
      +"the diameter would be " + diameter +"cm, and the circumferance would be "
      + df.format(circumference) + "cm.\n The area of this circle would be " + df.format(area) +"cm squared.");


   }//main
}//class
