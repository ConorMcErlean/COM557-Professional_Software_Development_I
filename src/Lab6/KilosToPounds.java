package Lab6;

import java.text.DecimalFormat;

/**
 * Created by pg19mec on 11/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class KilosToPounds {
   public static void main(String[] args) {

      DecimalFormat df = new DecimalFormat("0.0");
      final double CONVERSION = 2.2;
      double pounds;

      System.out.println("Kilograms \t\tPounds");
      for (int kilo = 5; kilo <= 100; kilo += 5){
         pounds = kilo * CONVERSION;
         System.out.println(kilo + "\t\t\t\t" + df.format(pounds));
      }// for

   }//main
}//class
