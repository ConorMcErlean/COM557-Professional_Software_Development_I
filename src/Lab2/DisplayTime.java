package Lab2;

/**
 * Created by Conor McErlean on 29/09/2019
 */
public class DisplayTime {
   public static void main(String[] args) {
      //Declare and initialise variables
      int time = 5000, minutes, seconds;

      // Calculations
      minutes = time / 60;
      seconds = time % 60;

      // Print statements
      System.out.println(time + " seconds is " + minutes + " minutes and "
      + seconds + " seconds");
   }//Main
}//Class
