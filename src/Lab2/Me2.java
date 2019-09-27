package Lab2;

import java.sql.SQLOutput;

/**
 * Created by pg19mec on 27/09/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Me2 {
   public static void main(String[] args) {

      // Declare variables
      String name = "John Brown", email = "void@voidmail.com", phone = "0000000";
      String addressLine1 ="Any building",
            addressLine2 = "Any road",
            addressLine3 = "Any town",
            addressLine4 = "Any county",
            postcode = "BTXX XXX";
      int heightFeet = 5, heightInches = 10, weightPounds = 180;

      // Output some info
      System.out.print("Name:\t" + name + "\t\t\t\t");
      System.out.println("Address:\t" + addressLine1);
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + addressLine2);
      System.out.print("Phone:\t" + phone + "\t\t\t\t\t\t\t\t");
      System.out.println(addressLine3);
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + addressLine4);
      System.out.print("Email:\t" + email + "\t\t\t\t\t");
      System.out.println(postcode +"\n");
      System.out.print("Height:\t" + heightFeet + "\'" + heightInches + "\""
            + "\t\t\t\t\t\t\t\t");
      System.out.println("Weight:\t" + weightPounds + "lbs");


   }//main
}//class
