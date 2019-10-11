package Lab6;

/**
 * Created by pg19mec on 11/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class OddNumbers {
   public static void main(String[] args) {

      double average;
      int total = 0, noOfOdd = 0;

      for (int number = 1; number <= 50; number++){
         if (number % 2 != 0){
            System.out.println(number);
            noOfOdd++;
            total += number;
         }//if
      }//for

      average = (double) total/ noOfOdd;
      System.out.println("The total of these numbers is : " + total);
      System.out.println("The average of these numbers is: " + average);
   }//main
}//class
