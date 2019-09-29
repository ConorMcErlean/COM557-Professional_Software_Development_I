package Lab2;

import java.text.DecimalFormat;

/**
 * Created by pg19mec on 27/09/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Rectangle1 {
   public static void main(String[] args) {
      // Create Decimal Format object
      DecimalFormat df = new DecimalFormat("00.00");

      // Declare variables
      double length, breadth, perimeter, area;

      // Assign length and breadth
      length = 34.55;
      breadth = 23.67;
      System.out.println("Rectangle length = " + df.format(length) +
            "\nRectangle breadth = " + df.format(breadth));

      // Calculate, store and print out the area
      area = length * breadth;
      System.out.println("Rectangle area = " +df.format(area));

      // Calculate, store and print the perimeter
      perimeter = (length + breadth) * 2.0;
      System.out.println("Rectangle perimeter = " + df.format(perimeter));

   }//main
}//class
