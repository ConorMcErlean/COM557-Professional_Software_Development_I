package Lab1;
import javax.swing.*;
/**
 * Created by Confu on 27/09/2019
 * Converting the countdown task to print in a window
 */
public class CountdownJOptionPane {
   public static void main(String[] args) {
      /**
       * So the below commented out code section is what we previously used
       */
//      System.out.print("Three... ");
//      System.out.print("Two... ");
//      System.out.print("One... ");
//      System.out.print("Zero... ");
//      System.out.println("Liftoff!");
//      System.out.println("Houston, we have a problem!");
      JOptionPane.showMessageDialog(
            null, "Three... Two... One... Zero..." +
                  "Liftoff!\n Houston, we have a problem!", "Apollo 13",
            JOptionPane.INFORMATION_MESSAGE
      );
   }//Main
}//Class
