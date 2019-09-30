package Lab2;

/**
 * Created by pg19mec on 30/09/2019
 * Demonstration of casting
 */
public class Tax {
   public static void main(String[] args) {
   // Declare and initialise cost
      double cost = 197.55;

   // Declare and initialise taxRate
      double taxRate = 0.06;

   // Declare a variable to store the amount payable
      int taxPayable;

   // Calculate tax payable
      taxPayable = (int) ((cost * taxRate) * 100) / 100;

   // Output tax payable
      System.out.println("Tax Payable = £" + taxPayable);

   }//main
}//class
