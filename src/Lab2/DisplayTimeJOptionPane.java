package Lab2;

import javax.swing.*;

/**
 * Created by Conor McErlean on 29/09/2019
 */
public class DisplayTimeJOptionPane {
   public static void main(String[] args) {
//Declare and initialise variables
      int time = 500, minutes, seconds;

      // Calculations
      minutes = time / 60;
      seconds = time % 60;

      // JOption statements
      JOptionPane.showMessageDialog(null, time
            + " seconds is " + minutes + " minutes and "
            + seconds + " seconds");
   }//Main
}//Class
