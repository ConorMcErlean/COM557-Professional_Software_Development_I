package Lab3;
/*
    Program created by Confu on 03/10/2019
    A simple program to find out the area of grass in a garden lawn.
    The lawn is square with a circular pond, the user can enter the length
    of the side of the garden and the radius of the pond, then the program will
    output the area of grass.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Garden {
   public static void main(String[] args) {
      // Initialise scanner and decimal format
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.00");

      // Declare variables

      double areaOfGrass, areaOfGarden, areaOfPond,
            gardenLength, pondRadius;

      // Prompt user for info
      System.out.print("What is the length of your garden in metres:\t");
      gardenLength = sc.nextDouble();
      System.out.print("What is the radius of the pond in metres: \t");
      pondRadius = sc.nextDouble();

      // Calculate area of garden
      areaOfGarden = Math.pow(gardenLength, 2);
      // Calculate area of pond
      areaOfPond = Math.PI * Math.pow(pondRadius, 2);
      // calculate grass
      areaOfGrass = areaOfGarden - areaOfPond;

      // output
      System.out.println("Garden area = " + df.format(areaOfGarden)
            + " metres squared");
      System.out.println("Pond area = " + df.format(areaOfPond)
            + " metres squared");
      System.out.println("Grass area = " + df.format(areaOfGrass)
            + " metres squared");
   }//main
}//class
