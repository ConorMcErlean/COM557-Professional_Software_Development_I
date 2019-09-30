package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 30/09/2019
 * A program to read the radius of a circle in cms and output the diameter, circumference
 * and area
 */
public class Circle2 {
   public static void main(String[] args) {
   // Initialise scanner object and Decimal Format
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

   // Declare Variables
      double radius, diameter, circumference, area;

    // Input prompt
      System.out.print("Please enter a radius: ");
      radius = sc.nextDouble();

    // Calculate
      diameter = radius * 2;
      circumference = 2 * Math.PI * radius;
      area = Math.PI * Math.pow(radius,2);

    // Output
      System.out.println("The radius is " + df.format(radius) + "cm");
      System.out.println("The diameter is " + df.format(diameter) + "cm");
      System.out.println("The circumference is " + df.format(circumference) + "cm");
      System.out.println("The area is " + df.format(area) + "cm squared");


   }//main
}//class
