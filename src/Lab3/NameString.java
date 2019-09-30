package Lab3;

import javax.swing.*;
import java.util.Scanner;
/**
 * Created by pg19mec on 30/09/2019
 * Simple program taking in a string for name and outputing it
 */
public class NameString {
   public static void main(String[] args) {
      // Start a scanner object
      Scanner read = new Scanner(System.in);

      // Declare variables
      final String GREETING = "Hello ";
      String name;

      // Prompt user & read input
      System.out.print("Please enter your name:\t");
      name = read.nextLine(); //Using our scanner

      //Output
      //System.out.println("Hello" + name);

      JOptionPane.showMessageDialog(null, GREETING + name);

   }//main
}//class
