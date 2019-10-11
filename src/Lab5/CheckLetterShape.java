package Lab5;

import java.util.Scanner;

/*
 * Created by pg19mec on 07/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */


public class CheckLetterShape {
   public static void main(String[] args) {
      // Scanner
      Scanner sc = new Scanner(System.in);

      // Variables
      char letter;
      String temp;

      // Read & user-prompt
      System.out.print("Please enter a letter: ");
      temp = sc.nextLine();
      temp= temp.toUpperCase();
      letter = temp.charAt(0);

      switch(letter){
         case 'A': case 'E': case 'F': case 'H': case 'I': case 'K': case 'L':
            case 'M': case 'N': case 'T': case 'V': case 'W': case 'X': case 'Y': case 'Z':
            System.out.println("This is a Straight letter");
            break;
         case 'C': case 'O': case 'S':
            System.out.println("A curved letter");
            break;
         case 'B': case 'D': case 'G': case 'J': case 'P': case 'Q': case 'R': case 'U':
            System.out.println("A mixture letter");
            break;
         default:
            System.out.println("I don\'t think that was a letter?");
            break;

      }





   }//main
}//class
