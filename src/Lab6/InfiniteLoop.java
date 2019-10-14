package Lab6;

/**
 * Created by pg19mec on 14/10/2019
 * Some incorrect logic as a demonstration
 */
public class InfiniteLoop {
   public static void main(String[] args) {
      final int SIZE = 25;
      for (int i = 1; i < SIZE; i -= 2){
         System.out.println(i);
      }//for
   }//main
}//class
