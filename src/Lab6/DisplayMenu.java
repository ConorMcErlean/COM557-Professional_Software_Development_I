package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 14/10/2019
 * Display a simple menu using loops
 */
public class DisplayMenu {
   public static void main(String[] args) {
      // Scanner initialised
      Scanner keyboard = new Scanner(System.in);

      // Intialise & Declare
      int choice;

      // Do-while loop
      do {

         System.out.println(
               "\n1. Hockey " +
               "\n2. Football" +
               "\n3. Rugby" +
               "\n4. Exit");
         System.out.print("Please enter your choice: ");
         choice = keyboard.nextInt();

         // Switch block
         switch (choice) {
                 case 1:
               System.out.println("\nYou have chosen Hockey");
               break;
            case 2:
               System.out.println("\nYou have chosen Football");
               break;
            case 3:
               System.out.println("\nYou have chosen rugby");
               break;
            case 4:
               System.out.println("\nYou have chosen to Exit the System");
               break;
            default:
               System.out.println("\nInvalid Choice");

         }//Switch
      } while (choice != 4);
   }//main
}//class
