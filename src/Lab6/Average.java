package Lab6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 11/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Average {
   public static void main(String[] args) {
      //Scanner & decimal Format
      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("0.0");

      // Initialise & Declaree
      int entries;
      double number, average, total= 0;

      // User Prompt
      System.out.print("How many nubmer will you enter? : ");
      entries = sc.nextInt();

      // Loop
      for (int count = 1; count <= entries; count++){
         System.out.print("Type number : ");
         number = sc.nextDouble();
         total += number;
      }//for

      if (entries>0){
         average = total/ entries;

         System.out.println("The average of the entered numbers is : " + df.format(average));
      }//if
      else {
         System.out.println("Cool, well then, no point in me running!");
      }//else

   }//main
}//class
