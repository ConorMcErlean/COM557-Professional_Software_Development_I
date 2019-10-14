package Lab6;

/**
 * Created by pg19mec on 14/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FindNumber {
   public static void main(String[] args) {
      // Declare and initialise
      final int ANSWER = 7;
      int guess, tries = 0;

      // Do loop
      do{
         guess = (int) (Math.random()*10);
         System.out.println(guess);
         tries++;
      }while (guess != ANSWER);

      System.out.println("The system has got it");
      System.out.println("The system took " + tries + " tries.");

   }//main
}//class
