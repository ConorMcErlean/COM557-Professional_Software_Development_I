package Lab7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 18/10/2019
 * Using methods.
 */
public class Circle3 {
   static double radius;

   // Method to calculate and return the circumference
   public static double getCircumference(){
      double answer;
      answer = 2 * Math.PI * radius;
      return answer;
   }//Get circumference

   // Method to calculate and return the area
   public static double getArea(){
      return Math.PI * Math.pow(radius,2);
   }//get area

   public static void main(String[] args) {
      //Scanner & Decimal Format
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      // Declare
      double circumference, area;

      // Program
      System.out.println("Enter a radius");
      radius = keyboard.nextDouble();
      circumference = getCircumference();
      area = getArea();

      //output
      System.out.println("Circumference is : " + df.format(circumference));
      System.out.println("Area is : " + df.format(area));

   }//main


}//class
