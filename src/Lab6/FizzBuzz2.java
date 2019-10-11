package Lab6;

import java.util.Scanner;

/**
 * Created by pg19mec on 11/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FizzBuzz2 {
   public static void main(String[] args) {

      // Declare
      int start, finish, counter = 0;

      //Scanner
      Scanner sc = new Scanner(System.in);

      //User Prompts
      System.out.print("Please enter a start number:");
      start = sc.nextInt();
      System.out.print("Please enter an end number:");
      finish = sc.nextInt();

      // Loop
      for (; start <= finish; start++){
         counter++;
         if ((start%3 == 0) && (start % 7 == 0)){
            System.out.print("FIZZ BUZZ\t");
         }
         else if (start % 3 == 0){
            System.out.print("FIZZ\t\t");
         }
         else if (start % 7 == 0){
            System.out.print("BUZZ\t\t");
         }
         else {
            System.out.print(start +"  \t\t");
         }
         if (counter % 8 == 0){
            System.out.println();
         }
      }//for

   }//main
}//class
