package Lab2;

/**
 * Created by pg19mec on 27/09/2019
 * A programme to store and output details of a box
 */
public class Box {
   public static void main(String[] args) {
   // Declare variables
      int height, width, depth; // In CM, without decimals so int will suffice

      // Uncomment and comment below to test with different box

         // Box one
            height = 2;
            width = 3;
            depth = 4;

//         // Box two
//            height = 3;
//            width = 4;
//            depth = 5;
//
//         // Box three
//            height = 4;
//            width = 4;
//            depth = 4;
//
//         // Box four
//            height = 20;
//            width = 25;
//            depth = 30;

      // Now to output the basic info!
      System.out.println("The box is " + height + "cm high, " +
            width + "cm wide and "+ depth +"cm deep");

      // What about the volume?
      System.out.println("The volume of the box is " + height*width*depth
            +"cms cubed");

      // And the pertimeter?
      System.out.println("The perimeter of the box is " +
            ((4*height)+(4*width)+(4*depth)) +" cms");
      //The above brackets aren't necessary for function, but improve readability
   }//main
}//class
