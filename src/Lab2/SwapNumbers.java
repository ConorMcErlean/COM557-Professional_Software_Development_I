package Lab2;

/**
 * Created by pg19mec on 27/09/2019
 * Lets swap two numbers around as a variable demonstration
 */
public class SwapNumbers {
   public static void main(String[] args) {
      // Initialise the variables
      int number1 = 43, number2 = 34, temp;

      // Lets print our original numbers
      System.out.println("Number 1 is currently \'" + number1 +"\' while number 2"
      + " is \'" + number2 + "\', lets begin swapping!");

      //Move number1 to temp
      temp = number1;

      // moving number 2 into number one
      number1 = number2;

      // moving the original number 1 (currently stored in temp) to number 2
      number2 = temp;

      //Lets print out the new numbers
      System.out.println("Number 1 is now \'" + number1 +"\' while number 2"
            + " is \'" + number2 + "\', success!");
   }//main
}//class
