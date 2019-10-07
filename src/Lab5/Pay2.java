package Lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pg19mec on 07/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Pay2 {
   public static void main(String[] args) {
      // Scanner to read input
      Scanner sc = new Scanner(System.in);

      // Decimal Format
      DecimalFormat df = new DecimalFormat("0.00");

      // Variables
      String name;
      int hoursWorked;
      double grossPay = 0;
      final double BASICRATE = 5.95, OVERTIMERATE = 8.50;
      final int MAXBASICHOURS = 40;

      // Info prompt
      System.out.print("Please enter your full name: ");
      name = sc.nextLine();
      System.out.print("Please enter the number of hours worked this week: ");
      hoursWorked = sc.nextInt();

      // Overtime workers
      if (hoursWorked > MAXBASICHOURS){
         grossPay = (hoursWorked - MAXBASICHOURS) * OVERTIMERATE;
         grossPay += (MAXBASICHOURS * BASICRATE);

      }//if
      else{
         grossPay = hoursWorked*BASICRATE;
      }//else

      // Output
      System.out.println(name + ", your total pay for this week is: £" + df.format(grossPay));
   }//main
}//class
