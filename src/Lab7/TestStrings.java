package Lab7;

import java.util.Scanner;

/**
 * Created by pg19mec on 21/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestStrings {
   public static void main(String[] args) {
      char nextLetter;
      String temporary;
      Scanner keyboard = new Scanner(System.in);


      System.out.println("Type Y/N to continue");
      temporary = keyboard.nextLine();
      temporary = temporary.toUpperCase();
      nextLetter = temporary.charAt(0);

      if (nextLetter== 'Y'){
         System.out.println("You hit yes");
      }
      else if (nextLetter == 'N'){
         System.out.println("You hit No");
      }

      else {
         System.out.println("You didn't choose one");
      }

   }//main
}//class
