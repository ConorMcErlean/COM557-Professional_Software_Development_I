package Lab2;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Conor McErlean on 29/09/2019
 * Perform the same action as Rectangle1.java but within a JOptionPane
 */
public class Rectangle1JOptionPane {
   public static void main(String[] args) {
// Create Decimal Format object
      DecimalFormat df = new DecimalFormat("00.00");

      // Declare variables
      double length, breadth, perimeter, area;

      // Assign length and breadth
      length = 24.70;
      breadth = 25.90;

      // Calculate and store the area
      area = length * breadth;

      // Calculate and store the perimeter
      perimeter = (length + breadth) * 2.0;

      //JOption Statements
      JOptionPane.showMessageDialog(null,"Rectangle length = "
            + df.format(length) +
            "\nRectangle breadth = " + df.format(breadth)+
            "\n\nRectangle area = " +df.format(area) +
            "\nRectangle perimeter = " + df.format(perimeter));

   }//Main
}//Class
